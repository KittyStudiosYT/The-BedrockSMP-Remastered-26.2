package net.itskittyyoutube.kitty;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.itskittyyoutube.kitty.block.TBSBlockEntities;
import net.itskittyyoutube.kitty.block.TBSBlocks;
import net.itskittyyoutube.kitty.command.TBSBedrockMayFlyCommand;
import net.itskittyyoutube.kitty.command.TBSGMCommand;
import net.itskittyyoutube.kitty.command.TBSGMKittyCommand;
import net.itskittyyoutube.kitty.config.TBSCompat;
import net.itskittyyoutube.kitty.config.TBSConfigs;
import net.itskittyyoutube.kitty.group.TBSGroup;
import net.itskittyyoutube.kitty.group.TBSGroupVisibilityToggle;
import net.itskittyyoutube.kitty.group.TBSRawGroup;
import net.itskittyyoutube.kitty.item.TBSItems;
import net.itskittyyoutube.kitty.sounds.TBSSoundEvents;
import net.itskittyyoutube.kitty.tab.TBSCreativeTabs;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TBS implements ModInitializer {
	public static final String MOD_ID = "kitty";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
        public static final boolean DEBUG_MODE = false;

        public static ArrayList<TBSGroup> groups = new ArrayList<>();
        public static ArrayList<TBSRawGroup> rawDefaultGroups = new ArrayList<>();
        public static CreativeModeTab selectedTab;
        public static TBSGroupVisibilityToggle itemsChanged = new TBSGroupVisibilityToggle();
        public static ArrayList<ItemStack> tempItemStacks = new ArrayList<>();

        public static ArrayList<TBSGroup> groupsOnSelectedTab(CreativeModeTab selectedTab) {
                ArrayList<TBSGroup> groupsOnSelectedTab = new ArrayList<>();
                groups.forEach(group -> {
                        if (selectedTab.equals(group.getTab()))
                                groupsOnSelectedTab.add(group);
                });
                return groupsOnSelectedTab;
        }

        public static TBSGroup findGroupByIndex(int index) {
                for (TBSGroup group : groups)
                        for (HashMap<ItemStack, Integer> itemStacksMap : group.getItemsWithIndexes())
                                if (itemStacksMap.containsValue(index) || group.getIconIndex() == index)
                                        return group;
                return null;
        }

        public static void setIndexes() {
                ArrayList<TBSGroup> groupsOnSelectedTab = groupsOnSelectedTab(selectedTab);
                ArrayList<ItemStack> newStack = new ArrayList<>(tempItemStacks);

                for (TBSGroup group : groupsOnSelectedTab) {
                        boolean setIcon = false;
                        for (ItemStack itemStack : group.getItems()) {
                                int firstIndex = newStack.indexOf(itemStack);
                                int lastIndex = newStack.lastIndexOf(itemStack);
                                if (newStack.contains(itemStack)) {
                                        if (group.isVisibility()) {
                                                if (firstIndex != lastIndex && !setIcon) {
                                                        group.setIconIndex(firstIndex);
                                                        group.setItemWithIndex(itemStack, lastIndex);
                                                        setIcon = true;
                                                } else
                                                        group.setItemWithIndex(itemStack, firstIndex);
                                        } else {
                                                group.setIconIndex(firstIndex);
                                                group.getItems().forEach(item1 ->
                                                        group.setItemWithIndex(item1, -1));
                                        }
                                }
                        }
                }
        }

        private static void addDefaultItems(String groupName, List<String> containedItems) {
                addItems(groupName, containedItems, List.of(), List.of(), true);
        }

        private static void addDefaultItems(String groupName, List<String> containedItems, List<String> nonContainedItems) {
                addItems(groupName, containedItems, nonContainedItems, List.of(), true);
        }

        private static void addConfigItems(String groupName, List<String> containedItems, List<String> equivalentItems, boolean hasTranslation) {
                addItems(groupName, containedItems, List.of(), equivalentItems, hasTranslation);
        }

        private static void addItems(String groupName, List<String> containedItems, List<String> nonContainedItems, List<String> equivalentItems, boolean hasTranslation) {
                rawDefaultGroups.add(new TBSRawGroup());
                TBSRawGroup rawGroup = rawDefaultGroups.get(rawDefaultGroups.size()-1);
                if (nonContainedItems.isEmpty()) nonContainedItems = List.of("1111111");

                for (ItemStack itemStack : selectedTab.getDisplayItems()) {
                        String itemName = itemStack.getItem().toString();
                        String itemNameWithoutNamespace = itemName.contains(":") ? itemName.split(":")[1] : itemName;
                        boolean flag = false;

                        for (String containedItem : containedItems) {
                                for (String nonContainedItem : nonContainedItems) {
                                        if (itemName.contains(containedItem) && !itemName.contains(nonContainedItem)) {
                                                addRawGroup(rawGroup, groupName, itemStack, hasTranslation);
                                                flag = true;
                                                break;
                                        }
                                }
                                if (flag) break;
                        }

                        for (String equivalentItem : equivalentItems) {
                                if (equivalentItem.equals(itemNameWithoutNamespace)) {
                                        addRawGroup(rawGroup, groupName, itemStack, hasTranslation);
                                        break;
                                }
                        }
                }
        }

        private static void addRawGroup(TBSRawGroup rawGroup, String groupName, ItemStack itemStack, boolean hasTranslation) {
                rawGroup.items.add(itemStack);
                rawGroup.name = groupName;
                rawGroup.hasTranslation = hasTranslation;
        }

        public static void createGroups() {
                rawDefaultGroups.clear();
                groups.clear();

                if (TBSCompat.isClothConfigLoaded() && TBSConfigs.getConfig().addGroupsOverOld
                        || !TBSCompat.isClothConfigLoaded()) createDefaultGroups();

                if (TBSCompat.isClothConfigLoaded()) {
                        for (TBSConfigs.ItemGroup group : TBSConfigs.getConfig().groups) {
                                List<String> tempListOfItems = group.containedItems.stream().map(Object::toString).toList();
                                List<String> tempListOfItemIds = group.equivalentItems.stream().map(Object::toString).toList();
                                if (convertComponentToId(selectedTab.getDisplayName().getContents().toString()).equals(group.tabName))
                                        addConfigItems(group.groupName, tempListOfItems, tempListOfItemIds, TBSConfigs.getConfig().translateGroups);
                        }
                }

                rawDefaultGroups.forEach(rawGroup -> groups.add(new TBSGroup(getGroupTranslate(rawGroup), selectedTab, rawGroup.items)));
                validateGroups();

                if (CreativeModeTabs.allTabs().isEmpty()) {
                        System.out.println("Warning: Attempted to create groups before tabs were registered!");
                }
        }

        public static void createDefaultGroups() {
                String selectedTabId = convertComponentToId(selectedTab.getDisplayName().getContents().toString());
                if (selectedTabId.equals("buildingBlocks")) {
                        addDefaultItems("logs", List.of("log", "stem", "bamboo_block"), List.of("stripped"));
                        addDefaultItems("woods", List.of("wood", "hyphae"), List.of("stripped"));
                        addDefaultItems("stripped_logs", List.of("log", "stem", "bamboo_block"));
                        addDefaultItems("stripped_woods", List.of("wood", "hyphae"));
                        addDefaultItems("stairs", List.of("stair"));
                        addDefaultItems("slabs", List.of("slab"));
                        addDefaultItems("planks", List.of("planks", "mosaic", "planksplanks"));
                        addDefaultItems("fence_gates", List.of("fence_gate"));
                        addDefaultItems("fences", List.of("fence"));
                        addDefaultItems("trapdoors", List.of("trapdoor"));
                        addDefaultItems("doors", List.of("door"));
                        addDefaultItems("pressure_plates", List.of("pressure_plate"));
                        addDefaultItems("buttons", List.of("button"));
                        addDefaultItems("bars", List.of("bar"), List.of("cinnabar"));
                        addDefaultItems("chains", List.of("chain"));
                        addDefaultItems("copper", List.of("copper"));
                        addDefaultItems("walls", List.of("wall"));
                        addDefaultItems("decorative_stone", List.of("bricks", "chiseled", "tiles", "polished"));
                        addDefaultItems("sandstone", List.of("sandstone"));
                        addDefaultItems("blocks_of_minerals", List.of("_block"));
                }
                if (selectedTabId.equals("coloredBlocks")) {
                        addDefaultItems("wool", List.of("wool"));
                        addDefaultItems("carpets", List.of("carpet"));
                        addDefaultItems("glazed_terracotta", List.of("glazed_terracotta"));
                        addDefaultItems("terracotta", List.of("terracotta"));
                        addDefaultItems("concrete_powder", List.of("concrete_powder"));
                        addDefaultItems("concrete", List.of("concrete"));
                        addDefaultItems("glass_panes", List.of("glass_pane"));
                        addDefaultItems("glass", List.of("glass"));
                        addDefaultItems("shulker_boxes", List.of("shulker_box"));
                        addDefaultItems("candles", List.of("candle"));
                        addDefaultItems("banners", List.of("banner"));
                        addDefaultItems("beds", List.of("bed"));
                }
                if (selectedTabId.equals("natural")) {
                        addDefaultItems("ores", List.of("_ore", "debris", "raw_"));
                        addDefaultItems("mushrooms", List.of("mushroom", "fungus"));
                        addDefaultItems("saplings", List.of("sapling", "propagule"));
                        addDefaultItems("ground_cover", List.of("fern", "_grass", "bush", "_sprouts", "hanging_moss", "_vines"), List.of("_bush"));
                        addDefaultItems("seeds", List.of("seeds", "_pod"));
                        addDefaultItems("flowers", List.of("dandelion", "poppy", "orchid", "allium", "tulip", "daisy", "cornflower", "torchflower", "azure_bluet", "valley", "cactus_flower", "eyeblossom", "rose", "petals", "wildflower", "crimson_roots", "warped_roots", "sunflower", "peony", "lilac", "pitcher_plant"));
                        addDefaultItems("leaves", List.of("leaves"));
                        addDefaultItems("coral_blocks", List.of("coral_block"));
                        addDefaultItems("coral_decorations", List.of("coral"));
                        addDefaultItems("stone", List.of(":stone", "diorite", "andesite", "granite", "tuff", "basalt", "blackstone", "deepslate"));
                        addDefaultItems("logs", List.of("log", "stem"));
                }
                if (selectedTabId.equals("functional")) {
                        addDefaultItems("lanterns", List.of("lantern"), List.of("sea"));
                        addDefaultItems("chains", List.of("chain"));
                        addDefaultItems("bulbs", List.of("bulb"));
                        addDefaultItems("anvils", List.of("anvil"));
                        addDefaultItems("lightning_rods", List.of("lightning_rod"));
                        addDefaultItems("shelves", List.of("_shelf", "shelfshelf"));
                        addDefaultItems("hanging_signs", List.of("hanging_sign"));
                        addDefaultItems("signs", List.of("sign"));
                        addDefaultItems("chests", List.of("chest"));
                        addDefaultItems("shulker_boxes", List.of("shulker_box"));
                        addDefaultItems("beds", List.of("_bed"));
                        addDefaultItems("candles", List.of("candle"));
                        addDefaultItems("banners", List.of("banner"));
                        addDefaultItems("skulls", List.of("head", "skull"));
                        addDefaultItems("golem_statues", List.of("golem_statue"));
                        addDefaultItems("infested_stone", List.of("infested"));
                        addDefaultItems("paintings", List.of("painting"));
                }
                if (selectedTabId.equals("redstone")) {
                        addDefaultItems("bulbs", List.of("bulb"));
                        addDefaultItems("pressure_plates", List.of("pressure_plate"));
                        addDefaultItems("transport", List.of("minecart", "boat", "_raft"));
                        addDefaultItems("chests", List.of("chest"));
                        addDefaultItems("rails", List.of("rail"));
                }
                if (selectedTabId.equals("tools")) {
                        addDefaultItems("shovels", List.of("shovel"));
                        addDefaultItems("pickaxes", List.of("pickaxe"));
                        addDefaultItems("axes", List.of("axe"));
                        addDefaultItems("hoes", List.of("hoe"));
                        addDefaultItems("bundles", List.of("bundle"));
                        addDefaultItems("harnesses", List.of("harness"));
                        addDefaultItems("chest_boats", List.of("chest_boat", "chest_raft"));
                        addDefaultItems("boats", List.of("boat", "_raft"));
                        addDefaultItems("rails", List.of("rail"));
                        addDefaultItems("minecarts", List.of("minecart"));
                        addDefaultItems("discs", List.of("disc", "pancake", "waffle"));
                        addDefaultItems("goat_horns", List.of("goat_horn"));
                        addDefaultItems("creature_buckets", List.of("cod_bucket", "salmon_bucket", "tropical_fish_bucket", "pufferfish_bucket", "axolotl_bucket", "tadpole_bucket", "sulfur_cube_bucket"));
                        addDefaultItems("firework_rockets", List.of("firework_rocket"));
                }
                if (selectedTabId.equals("combat")) {
                        addDefaultItems("swords", List.of("sword"));
                        addDefaultItems("katanas", List.of("katana"));
                        addDefaultItems("sickles", List.of("sickle"));
                        addDefaultItems("scythes", List.of("scythe"));
                        addDefaultItems("daggers", List.of("dagger"));
                        addDefaultItems("spears", List.of("spear"));
                        addDefaultItems("axes", List.of("axe"));
                        addDefaultItems("maces", List.of("mace"));
                        addDefaultItems("helmets", List.of("helmet"));
                        addDefaultItems("chestplates", List.of("chestplate"));
                        addDefaultItems("leggings", List.of("leggings"));
                        addDefaultItems("boots", List.of("boots"));
                        addDefaultItems("horse_armor", List.of("horse_armor"));
                        addDefaultItems("nautilus_armor", List.of("nautilus_armor"));
                        addDefaultItems("eggs", List.of("egg"));
                        addDefaultItems("tipped_arrows", List.of("tipped_arrow"));
                        addDefaultItems("firework_rockets", List.of("firework_rocket"));
                }
                if (selectedTabId.equals("foodAndDrink")) {
                        addDefaultItems("suspicious_stews", List.of("suspicious_stew"));
                        addDefaultItems("ominous_bottles", List.of("ominous_bottle"));
                        addDefaultItems("splash_potions", List.of("splash_potion"));
                        addDefaultItems("lingering_potions", List.of("lingering_potion"));
                        addDefaultItems("potions", List.of("potion"));
                        addDefaultItems("cooked_food", List.of("cooked"));
                        addDefaultItems("raw_food", List.of("beef", "porkchop", "mutton", "chicken", "rabbit", ":cod", "salmon"), List.of("rabbit_"));
                }
                if (selectedTabId.equals("ingredients")) {
                        addDefaultItems("nuggets", List.of("nugget"));
                        addDefaultItems("ingots", List.of("ingot"));
                        addDefaultItems("rods", List.of("rod"));
                        addDefaultItems("handles", List.of("handle"));
                        addDefaultItems("dyes", List.of("dye"));
                        addDefaultItems("banner_patterns", List.of("banner_pattern"));
                        addDefaultItems("pottery_sherds", List.of("pottery_sherd"));
                        addDefaultItems("smithing_templates", List.of("smithing_template"));
                        addDefaultItems("play_buttons", List.of("play_button", "youtube"));
                        addDefaultItems("enchanted_books", List.of("enchanted_book"));
                }
                if (selectedTabId.equals("bedrocksmp")) {
                        addDefaultItems("discs", List.of("disc", "pancake", "waffle"));
                        addDefaultItems("ingots", List.of("ingot"));
                        addDefaultItems("rods", List.of("rod"));
                        addDefaultItems("play_buttons", List.of("play_button", "youtube"));
                        addDefaultItems("handles", List.of("handle"));
                        addDefaultItems("helmets", List.of("helmet"));
                        addDefaultItems("chestplates", List.of("chestplate"));
                        addDefaultItems("leggings", List.of("leggings"));
                        addDefaultItems("boots", List.of("boots"));
                        addDefaultItems("swords", List.of("sword"));
                        addDefaultItems("katanas", List.of("katana"));
                        addDefaultItems("sickles", List.of("sickle"));
                        addDefaultItems("scythes", List.of("scythe"));
                        addDefaultItems("daggers", List.of("dagger"));
                        addDefaultItems("spears", List.of("spear"));
                        addDefaultItems("shovels", List.of("shovel"));
                        addDefaultItems("pickaxes", List.of("pickaxe"));
                        addDefaultItems("axes", List.of("axe"));
                        addDefaultItems("hoes", List.of("hoe"));
                        addDefaultItems("stairs", List.of("stair"));
                        addDefaultItems("slabs", List.of("slab"));
                        addDefaultItems("logs", List.of("log", "stem", "bamboo_block"), List.of("stripped"));
                        addDefaultItems("woods", List.of("wood", "hyphae"), List.of("stripped"));
                        addDefaultItems("stripped_logs", List.of("log", "stem", "bamboo_block"));
                        addDefaultItems("stripped_woods", List.of("wood", "hyphae"));
                        addDefaultItems("planks", List.of("planks", "mosaic", "planksplanks"));
                        addDefaultItems("fence_gates", List.of("fence_gate"));
                        addDefaultItems("fences", List.of("fence"));
                        addDefaultItems("trapdoors", List.of("trapdoor"));
                        addDefaultItems("doors", List.of("door"));
                        addDefaultItems("pressure_plates", List.of("pressure_plate"));
                        addDefaultItems("buttons", List.of("button"));
                        addDefaultItems("blocks_of_minerals", List.of("_block"));
                        addDefaultItems("shelves", List.of("_shelf", "shelfshelf"));
                }
                if (selectedTabId.equals("wood")) {
                        addDefaultItems("logs", List.of("log", "stem", "bamboo_block"), List.of("stripped"));
                        addDefaultItems("woods", List.of("wood", "hyphae"), List.of("stripped"));
                        addDefaultItems("stripped_logs", List.of("log", "stem", "bamboo_block"));
                        addDefaultItems("stripped_woods", List.of("wood", "hyphae"));
                        addDefaultItems("stairs", List.of("stair"));
                        addDefaultItems("slabs", List.of("slab"));
                        addDefaultItems("planks", List.of("planks", "mosaic", "planksplanks"));
                        addDefaultItems("fence_gates", List.of("fence_gate"));
                        addDefaultItems("fences", List.of("fence"));
                        addDefaultItems("trapdoors", List.of("trapdoor"));
                        addDefaultItems("doors", List.of("door"));
                        addDefaultItems("pressure_plates", List.of("pressure_plate"));
                        addDefaultItems("buttons", List.of("button"));
                        addDefaultItems("shelves", List.of("_shelf", "shelfshelf"));
                }
                if (selectedTabId.equals("op")) {
                        addDefaultItems("command_blocks", List.of("command_block"));
                        addDefaultItems("test_blocks", List.of("test"));
                        addDefaultItems("lights", List.of("light"));
                        addDefaultItems("paintings", List.of("painting"));
                }
        }

        private static void validateGroups() {
                groups.removeIf(group -> group.getItems().isEmpty());
                groups.removeIf(group -> group.getItems().size() < 3);
        }

        public static String convertComponentToId(String tabId) {
                int firstIndex = tabId.indexOf("'");
                if (tabId.startsWith("key=", firstIndex - 4)) {
                        tabId = tabId.substring(firstIndex + 1);
                        tabId = tabId.substring(0, tabId.indexOf("'"));
                        tabId = tabId.substring(tabId.lastIndexOf(".") + 1);
                }
                return tabId;
        }

        public static Component getGroupTranslate(TBSRawGroup rawGroup) {
                if (rawGroup.name == null) rawGroup.name = "name";

                return (TBSCompat.isClothConfigLoaded() && TBSConfigs.getConfig().translateGroups) || rawGroup.hasTranslation
                        ? Component.translatable("group_name.kitty." + rawGroup.name)
                        : Component.literal(rawGroup.name);
        }

@Override
	public void onInitialize() {
        TBSItems.registerItems();
        TBSSoundEvents.registerSoundEvents();
        TBSCreativeTabs.registerTabs();
        TBSBlocks.registerBlocks();

        TBSBlockEntities.register();
        TBSBlockEntities.registerSignBlockEntities();

        StrippableBlockRegistry.register(TBSBlocks.CHERRY_BIRCH_LOG, TBSBlocks.STRIPPED_CHERRY_BIRCH_LOG);
        StrippableBlockRegistry.register(TBSBlocks.CHERRY_BIRCH_WOOD, TBSBlocks.STRIPPED_CHERRY_BIRCH_WOOD);
        StrippableBlockRegistry.register(TBSBlocks.GOLDEN_BIRCH_LOG, TBSBlocks.STRIPPED_GOLDEN_BIRCH_LOG);
        StrippableBlockRegistry.register(TBSBlocks.GOLDEN_BIRCH_WOOD, TBSBlocks.STRIPPED_GOLDEN_BIRCH_WOOD);

        StrippableBlockRegistry.register(TBSBlocks.CRIPTION_STEM, TBSBlocks.STRIPPED_CRIPTION_STEM);
        StrippableBlockRegistry.register(TBSBlocks.CRIPTION_HYPHAE, TBSBlocks.STRIPPED_CRIPTION_HYPHAE);

        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.PLANKS_TEMPLATE, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.WHITE_PLANKS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.LIGHT_GRAY_PLANKS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.GRAY_PLANKS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.BLACK_PLANKS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.BROWN_PLANKS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.RED_PLANKS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.ORANGE_PLANKS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.YELLOW_PLANKS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.LIME_PLANKS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.GREEN_PLANKS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.CYAN_PLANKS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.LIGHT_BLUE_PLANKS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.BLUE_PLANKS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.PURPLE_PLANKS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.MAGENTA_PLANKS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.PINK_PLANKS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.WHITE_SLAB, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.LIGHT_GRAY_SLAB, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.GRAY_SLAB, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.BLACK_SLAB, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.BROWN_SLAB, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.RED_SLAB, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.ORANGE_SLAB, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.YELLOW_SLAB, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.LIME_SLAB, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.GREEN_SLAB, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.CYAN_SLAB, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.LIGHT_BLUE_SLAB, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.BLUE_SLAB, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.PURPLE_SLAB, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.MAGENTA_SLAB, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.PINK_SLAB, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.WHITE_FENCE_GATE, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.LIGHT_GRAY_FENCE_GATE, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.GRAY_FENCE_GATE, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.BLACK_FENCE_GATE, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.BROWN_FENCE_GATE, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.RED_FENCE_GATE, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.ORANGE_FENCE_GATE, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.YELLOW_FENCE_GATE, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.LIME_FENCE_GATE, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.GREEN_FENCE_GATE, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.CYAN_FENCE_GATE, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.LIGHT_BLUE_FENCE_GATE, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.BLUE_FENCE_GATE, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.PURPLE_FENCE_GATE, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.MAGENTA_FENCE_GATE, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.PINK_FENCE_GATE, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.WHITE_FENCE, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.LIGHT_GRAY_FENCE, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.GRAY_FENCE, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.BLACK_FENCE, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.BROWN_FENCE, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.RED_FENCE, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.ORANGE_FENCE, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.YELLOW_FENCE, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.LIME_FENCE, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.GREEN_FENCE, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.CYAN_FENCE, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.LIGHT_BLUE_FENCE, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.BLUE_FENCE, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.PURPLE_FENCE, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.MAGENTA_FENCE, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.PINK_FENCE, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.WHITE_STAIRS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.LIGHT_GRAY_STAIRS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.GRAY_STAIRS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.BLACK_STAIRS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.BROWN_STAIRS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.RED_STAIRS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.ORANGE_STAIRS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.YELLOW_STAIRS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.LIME_STAIRS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.GREEN_STAIRS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.CYAN_STAIRS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.LIGHT_BLUE_STAIRS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.BLUE_STAIRS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.PURPLE_STAIRS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.MAGENTA_STAIRS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.PINK_STAIRS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.CHERRY_BIRCH_LOG, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.CHERRY_BIRCH_WOOD, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.STRIPPED_CHERRY_BIRCH_LOG, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.STRIPPED_CHERRY_BIRCH_WOOD, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.CHERRY_BIRCH_PLANKS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.CHERRY_BIRCH_SLAB, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.CHERRY_BIRCH_FENCE_GATE, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.CHERRY_BIRCH_FENCE, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.CHERRY_BIRCH_STAIRS, 5, 20);
        //FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.CHERRY_BIRCH_LEAVES, 30, 60);
        //FlammableBlockRegistry.getDefaultInstance().add(TheBedrockSMPBlocks.SHELFSHELF, 30, 20);
        //FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.SHELFSHELF, 30, 20);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.GOLDEN_BIRCH_LOG, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.GOLDEN_BIRCH_WOOD, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.STRIPPED_GOLDEN_BIRCH_LOG, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.STRIPPED_GOLDEN_BIRCH_WOOD, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.GOLDEN_BIRCH_PLANKS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.GOLDEN_BIRCH_SLAB, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.GOLDEN_BIRCH_FENCE_GATE, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.GOLDEN_BIRCH_FENCE, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.GOLDEN_BIRCH_STAIRS, 5, 20);
        //FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.GOLDEN_BIRCH_LEAVES, 30, 60);

        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.WHITE_SHELF, 30, 20);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.LIGHT_GRAY_SHELF, 30, 20);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.GRAY_SHELF, 30, 20);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.BLACK_SHELF, 30, 20);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.BROWN_SHELF, 30, 20);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.RED_SHELF, 30, 20);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.ORANGE_SHELF, 30, 20);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.YELLOW_SHELF, 30, 20);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.LIME_SHELF, 30, 20);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.GREEN_SHELF, 30, 20);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.CYAN_SHELF, 30, 20);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.LIGHT_BLUE_SHELF, 30, 20);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.BLUE_SHELF, 30, 20);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.PURPLE_SHELF, 30, 20);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.MAGENTA_SHELF, 30, 20);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.PINK_SHELF, 30, 20);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.CHERRY_BIRCH_SHELF, 30, 20);
        FlammableBlockRegistry.getDefaultInstance().add(TBSBlocks.GOLDEN_BIRCH_SHELF, 30, 20);

        CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) -> TBSGMCommand.register(dispatcher));
        CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) -> TBSBedrockMayFlyCommand.register(dispatcher));
        CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) -> TBSGMKittyCommand.register(dispatcher));
    }
}
