package net.itskittyyoutube.kitty.item;

import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.itskittyyoutube.kitty.TBS;
import net.itskittyyoutube.kitty.block.TBSBlocks;
import net.itskittyyoutube.kitty.material.TBSArmorMaterials;
import net.itskittyyoutube.kitty.material.TBSToolMaterials;
import net.itskittyyoutube.kitty.sounds.TBSJukeboxSongs;
import net.minecraft.core.Registry;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.references.BlockItemId;
import net.minecraft.references.BlockItemIds;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.Unit;
import net.minecraft.world.item.*;
import net.minecraft.world.item.component.*;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class TBSItems {
    //Music Discs
    public static final Item MUSIC_DISC_TEMPLATE = registerItem("music_disc_template",
            setting -> new Item(setting.jukeboxPlayable(TBSJukeboxSongs.TEMPLATE).stacksTo(4)));
    public static final Item MUSIC_DISC_THE_TALE_OF_TOOTHLESS = registerItem("music_disc_the_tale_of_toothless",
            setting -> new Item(setting.jukeboxPlayable(TBSJukeboxSongs.TOOTHLESS).stacksTo(1)));
    public static final Item MUSIC_DISC_THE_BYE_JUSTIN_HI_JUSTIN_RAP = registerItem("music_disc_bye_justin_hi_justin",
            setting -> new Item(setting.jukeboxPlayable(TBSJukeboxSongs.JUSTIN).stacksTo(1)));
    public static final Item MUSIC_DISC_STEVE_LAVA_CHICKEN = registerItem("music_disc_steve_lava_chicken",
            setting -> new Item(setting.jukeboxPlayable(TBSJukeboxSongs.STEVE).stacksTo(1)));
    public static final Item MUSIC_DISC_LAVA_TEARSSTEP = registerItem("music_disc_lava_tearsstep",
            setting -> new Item(setting.jukeboxPlayable(TBSJukeboxSongs.TEARSSTEP).stacksTo(1)));
    public static final Item MUSIC_DISC_TERRIFYING_TEARS = registerItem("music_disc_terrifying_tears",
            setting -> new Item(setting.jukeboxPlayable(TBSJukeboxSongs.TERRIFYING).stacksTo(1)));
    public static final Item MUSIC_DISC_BETTERSIDE = registerItem("music_disc_betterside",
            setting -> new Item(setting.jukeboxPlayable(TBSJukeboxSongs.BETTERSIDE).stacksTo(1)));
    public static final Item MUSIC_DISC_12 = registerItem("music_disc_12",
            setting -> new Item(setting.jukeboxPlayable(TBSJukeboxSongs.TWELVE).stacksTo(1)));
    public static final Item MUSIC_DISC_THE_BYE_JUSTIN_HI_JUSTIN_RAP_REMASTERED = registerItem("music_disc_bye_justin_hi_justin_remastered",
            setting -> new Item(setting.jukeboxPlayable(TBSJukeboxSongs.REMASTERED).stacksTo(1)));
    public static final Item MUSIC_DISC_EXPLORER = registerItem("music_disc_explorer",
            setting -> new Item(setting.jukeboxPlayable(TBSJukeboxSongs.EXPLORER).stacksTo(1)));
    public static final Item ALREADY_AHEAD = registerItem("music_disc_already_ahead",
            setting -> new Item(setting.jukeboxPlayable(TBSJukeboxSongs.ALREADY).stacksTo(1)));
    public static final Item DARK_INSIDE = registerItem("music_disc_dark_inside",
            setting -> new Item(setting.jukeboxPlayable(TBSJukeboxSongs.DARK).stacksTo(1)));

    //REVERSED
    public static final Item MUSIC_DISC_REVERSED_THE_TALE_OF_TOOTHLESS = registerItem("music_disc_reversed_the_tale_of_toothless",
            setting -> new Item(setting.jukeboxPlayable(TBSJukeboxSongs.TOOTHLESS2).stacksTo(1)));
    public static final Item MUSIC_DISC_REVERSED_THE_BYE_JUSTIN_HI_JUSTIN_RAP = registerItem("music_disc_reversed_bye_justin_hi_justin",
            setting -> new Item(setting.jukeboxPlayable(TBSJukeboxSongs.JUSTIN2).stacksTo(1)));
    public static final Item MUSIC_DISC_REVERSED_STEVE_LAVA_CHICKEN = registerItem("music_disc_reversed_steve_lava_chicken",
            setting -> new Item(setting.jukeboxPlayable(TBSJukeboxSongs.STEVE2).stacksTo(1)));
    public static final Item MUSIC_DISC_REVERSED_LAVA_TEARSSTEP = registerItem("music_disc_reversed_lava_tearsstep",
            setting -> new Item(setting.jukeboxPlayable(TBSJukeboxSongs.TEARSSTEP2).stacksTo(1)));
    public static final Item MUSIC_DISC_REVERSED_TERRIFYING_TEARS = registerItem("music_disc_reversed_terrifying_tears",
            setting -> new Item(setting.jukeboxPlayable(TBSJukeboxSongs.TERRIFYING2).stacksTo(1)));
    public static final Item MUSIC_DISC_REVERSED_BETTERSIDE = registerItem("music_disc_reversed_betterside",
            setting -> new Item(setting.jukeboxPlayable(TBSJukeboxSongs.BETTERSIDE2).stacksTo(1)));
    public static final Item MUSIC_DISC_REVERSED_12 = registerItem("music_disc_reversed_12",
            setting -> new Item(setting.jukeboxPlayable(TBSJukeboxSongs.TWELVE2).stacksTo(1)));
    public static final Item MUSIC_DISC_REVERSED_THE_BYE_JUSTIN_HI_JUSTIN_RAP_REMASTERED = registerItem("music_disc_reversed_bye_justin_hi_justin_remastered",
            setting -> new Item(setting.jukeboxPlayable(TBSJukeboxSongs.REMASTERED2).stacksTo(1)));
    public static final Item MUSIC_DISC_REVERSED_EXPLORER = registerItem("music_disc_reversed_explorer",
            setting -> new Item(setting.jukeboxPlayable(TBSJukeboxSongs.EXPLORER2).stacksTo(1)));
    public static final Item REVERSED_ALREADY_AHEAD = registerItem("music_disc_reversed_already_ahead",
            setting -> new Item(setting.jukeboxPlayable(TBSJukeboxSongs.ALREADY2).stacksTo(1)));
    public static final Item REVERSED_DARK_INSIDE = registerItem("music_disc_reversed_dark_inside",
            setting -> new Item(setting.jukeboxPlayable(TBSJukeboxSongs.DARK2).stacksTo(1)));

    //PANCAKES
    public static final Item PANCAKE = registerItem("pancake",
            setting -> new Item(setting.jukeboxPlayable(TBSJukeboxSongs.PANCAKE).stacksTo(64).rarity(Rarity.EPIC)));
    public static final Item WAFFLE = registerItem("waffle",
            setting -> new Item(setting.jukeboxPlayable(TBSJukeboxSongs.WAFFLE).stacksTo(64).rarity(Rarity.EPIC)));
    public static final Item REVERSED_PANCAKE = registerItem("reversed_pancake",
            setting -> new Item(setting.jukeboxPlayable(TBSJukeboxSongs.PANCAKE2).stacksTo(64).rarity(Rarity.EPIC)));
    public static final Item REVERSED_WAFFLE = registerItem("reversed_waffle",
            setting -> new Item(setting.jukeboxPlayable(TBSJukeboxSongs.WAFFLE2).stacksTo(64).rarity(Rarity.EPIC)));

    //Items
    public static final Item BEDROCKSMP_ICON = registerItem("bedrocksmp_icon",
            settings -> new Item(settings.rarity(Rarity.EPIC).stacksTo(64).fireResistant()));
    public static final Item BIG_STICK = registerItem("big_stick",
            setting -> new Item(setting.spear(TBSToolMaterials.STICK,
                    1.15F, 1.2F, 0.4F, 2.5F,
                    7.0F, 5.5F, 5.1F, 8.75F, 4.6F)
                    .stacksTo(1).attributes(ItemAttributeModifiers.builder().build()).component(DataComponents.MAX_DAMAGE, 0).component(DataComponents.UNBREAKABLE, Unit.INSTANCE)
                    .component(DataComponents.TOOLTIP_DISPLAY, new TooltipDisplay(false, new LinkedHashSet<>(List.of(DataComponents.UNBREAKABLE))))
                    .component(DataComponents.PIERCING_WEAPON, new PiercingWeapon(true, false, Optional.empty(), Optional.empty()))
                    .component(DataComponents.KINETIC_WEAPON, new KineticWeapon(10, Math.round(0.75F * 20.0F), KineticWeapon.Condition.ofAttackerSpeed(Math.round(5.0F * 20.0F), 14.0F),
                            KineticWeapon.Condition.ofAttackerSpeed(Math.round(10.0F * 20.0F), 10.0F), KineticWeapon.Condition.ofRelativeSpeed(Math.round(15.0F * 20.0F), 4.6F),
                            0.38F, 0.7F, Optional.empty(), Optional.empty()))));
    public static final Item CURSED_EMERALD = registerItem("cursed_emerald",
            settings -> new Item(settings.rarity(Rarity.EPIC).stacksTo(1)));
    public static final Item YOUTUBE_LOGO = registerItem("youtube",
            settings -> new Item(settings.stacksTo(64)));
    public static final Item SILVER_PLAY_BUTTON = registerItem("silver_play_button",
            settings -> new Item(settings.stacksTo(64)));
    public static final Item GOLDEN_PLAY_BUTTON = registerItem("golden_play_button",
            settings -> new Item(settings.stacksTo(64)));
    public static final Item DIAMOND_PLAY_BUTTON = registerItem("diamond_play_button",
            settings -> new Item(settings.stacksTo(64)));
    public static final Item STEEL_INGOT = registerItem("steel_ingot",
            settings -> new Item(settings.stacksTo(64)));
    public static final Item STEEL_ROD = registerItem("steel_rod",
            settings -> new Item(settings.stacksTo(64)));
    public static final Item REINFORCED_PAPER = registerItem("reinforced_paper",
            settings -> new Item(settings.stacksTo(64).fireResistant()));
    public static final Item MONEY = registerItem("money",
            settings -> new Item(settings.stacksTo(64)));
    public static final Item NETHERITE_ROD = registerItem("netherite_rod",
            settings -> new Item(settings.stacksTo(64).fireResistant()));
    public static final Item DIAMARITE_INGOT = registerItem("diamarite_ingot",
            settings -> new Item(settings.stacksTo(64).fireResistant()));
    public static final Item CORRUPTIONITE_INGOT = registerItem("corruptionite_ingot",
            settings -> new Item(settings.stacksTo(64).fireResistant()));
    public static final Item DIAMOND_INGOT = registerItem("diamond_ingot",
            settings -> new Item(settings.stacksTo(64)));
    public static final Item AMETHYST_INGOT = registerItem("amethyst_ingot",
            settings -> new Item(settings.stacksTo(64)));
    public static final Item CHARD_INGOT = registerItem("chard_ingot",
            settings -> new Item(settings.stacksTo(64)));
    public static final Item DIAMARITE = registerItem("diamarite",
            settings -> new Item(settings.stacksTo(64).fireResistant()));
    public static final Item BURNT_INGOT = registerItem("burnt_ingot",
            settings -> new Item(settings.stacksTo(64)));
    public static final Item BYZANTIUM_INGOT = registerItem("byzantium_ingot",
            settings -> new Item(settings.stacksTo(64).rarity(Rarity.EPIC)));
    public static final Item BYZANTIUM_NUGGET = registerItem("byzantium_nugget",
            settings -> new Item(settings.stacksTo(64).rarity(Rarity.EPIC)));
    public static final Item RAW_BYZANTIUM = registerItem("raw_byzantium",
            settings -> new Item(settings.stacksTo(64).rarity(Rarity.EPIC)));

    public static final Item HANDLE = registerItem("handle",
            settings -> new Item(settings.stacksTo(64)));
    public static final Item NETHERITE_HANDLE = registerItem("netherite_handle",
            settings -> new Item(settings.stacksTo(64).fireResistant()));
    public static final Item STEEL_HANDLE = registerItem("steel_handle",
            settings -> new Item(settings.stacksTo(64)));

    public static final Item GILDED_NETHERITE_INGOT = registerItem("gilded_netherite_ingot",
            settings -> new Item(settings.stacksTo(64).fireResistant()));

    public static final Item GOLDEN_SCRAP = registerItem("golden_scrap",
            settings -> new Item(settings.stacksTo(64).fireResistant()));

    public static final Item DUCT_TAPE = registerItem("duct_tape",
            settings -> new Item(settings.stacksTo(64)));

    public static final Item ENERGY_NUGGET = registerItem("energy_nugget",
            settings -> new Item(settings.stacksTo(64).rarity(Rarity.EPIC)));
    public static final Item ENERGY_GEM = registerItem("energy_gem",
            settings -> new Item(settings.stacksTo(64).rarity(Rarity.EPIC)));

    public static final Item ENERGY_ROD = registerItem("energy_rod",
            settings -> new Item(settings.stacksTo(64).rarity(Rarity.EPIC)));
    public static final Item ENERGY_HANDLE = registerItem("energy_handle",
            settings -> new Item(settings.stacksTo(64).rarity(Rarity.EPIC)));

    public static final Item DREADITE_GEM = registerItem("dreadite_gem",
            settings -> new Item(settings.stacksTo(64)));

    //Tools
    public static final Item STEEL_SWORD = registerItem("steel_sword",
            setting -> new Item(setting.sword(TBSToolMaterials.STEEL, 3.0F, -2.4F)));
    public static final Item STEEL_SHOVEL = registerItem("steel_shovel",
            setting -> new ShovelItem(TBSToolMaterials.STEEL, 1.5F, -3.0F, setting));
    public static final Item STEEL_PICKAXE = registerItem("steel_pickaxe",
            setting -> new Item(setting.pickaxe(TBSToolMaterials.STEEL, 1.0F, -2.8F)));
    public static final Item STEEL_AXE = registerItem("steel_axe",
            setting -> new AxeItem(TBSToolMaterials.STEEL, 6.0F, -3.1F, setting));
    public static final Item STEEL_HOE = registerItem("steel_hoe",
            setting -> new HoeItem(TBSToolMaterials.STEEL, -2.0F, -1.0F, setting));
    public static final Item KATARA_KNIFE = registerItem("katara_knife",
            setting -> new Item(setting.sword(TBSToolMaterials.STEEL, 2.0F, -2.4F)));
    public static final Item DIAMARITE_SWORD = registerItem("diamarite_sword",
            setting -> new Item(setting.sword(TBSToolMaterials.NETHERITE2, 3.0F, -2.4F).fireResistant()));
    public static final Item DIAMARITE_SHOVEL = registerItem("diamarite_shovel",
            setting -> new ShovelItem(TBSToolMaterials.NETHERITE2, 1.5F, -3.0F, setting.fireResistant()));
    public static final Item DIAMARITE_PICKAXE = registerItem("diamarite_pickaxe",
            setting -> new Item(setting.pickaxe(TBSToolMaterials.NETHERITE2, 1.0F, -2.8F).fireResistant()));
    public static final Item DIAMARITE_AXE = registerItem("diamarite_axe",
            setting -> new AxeItem(TBSToolMaterials.NETHERITE2, 5.0F, -3.0F, setting.fireResistant()));
    public static final Item DIAMARITE_HOE = registerItem("diamarite_hoe",
            setting -> new HoeItem(TBSToolMaterials.NETHERITE2, -4.0F, 0.0F, setting.fireResistant()));
    public static final Item CORRUPTIONITE_SWORD = registerItem("corruptionite_sword",
            setting -> new Item(setting.sword(TBSToolMaterials.NETHERITE2, 3.0F, -2.4F).fireResistant()));
    public static final Item CORRUPTIONITE_SHOVEL = registerItem("corruptionite_shovel",
            setting -> new ShovelItem(TBSToolMaterials.NETHERITE2, 1.5F, -3.0F, setting.fireResistant()));
    public static final Item CORRUPTIONITE_PICKAXE = registerItem("corruptionite_pickaxe",
            setting -> new Item(setting.pickaxe(TBSToolMaterials.NETHERITE2, 1.0F, -2.8F).fireResistant()));
    public static final Item CORRUPTIONITE_AXE = registerItem("corruptionite_axe",
            setting -> new AxeItem(TBSToolMaterials.NETHERITE2, 5.0F, -3.0F, setting.fireResistant()));
    public static final Item CORRUPTIONITE_HOE = registerItem("corruptionite_hoe",
            setting -> new HoeItem(TBSToolMaterials.NETHERITE2, -4.0F, 0.0F, setting.fireResistant()));
    public static final Item BYZANTIUM_SWORD = registerItem("byzantium_sword",
            setting -> new Item(setting.sword(TBSToolMaterials.BYZANTIUM, 3.0F, -2.4F)));
    public static final Item BYZANTIUM_SHOVEL = registerItem("byzantium_shovel",
            setting -> new ShovelItem(TBSToolMaterials.BYZANTIUM, 1.5F, -3.0F, setting));
    public static final Item BYZANTIUM_PICKAXE = registerItem("byzantium_pickaxe",
            setting -> new Item(setting.pickaxe(TBSToolMaterials.BYZANTIUM, 1.0F, -2.8F)));
    public static final Item BYZANTIUM_AXE = registerItem("byzantium_axe",
            setting -> new AxeItem(TBSToolMaterials.BYZANTIUM, 6.0F, -3.1F, setting));
    public static final Item BYZANTIUM_HOE = registerItem("byzantium_hoe",
            setting -> new HoeItem(TBSToolMaterials.BYZANTIUM, -2.0F, -1.0F, setting));
    public static final Item GILDED_NETHERITE_SWORD = registerItem("gilded_netherite_sword",
            setting -> new Item(setting.sword(TBSToolMaterials.NETHERITE2, 3.0F, -2.4F).fireResistant()));
    public static final Item GILDED_NETHERITE_SHOVEL = registerItem("gilded_netherite_shovel",
            setting -> new ShovelItem(TBSToolMaterials.NETHERITE2, 1.5F, -3.0F, setting.fireResistant()));
    public static final Item GILDED_NETHERITE_PICKAXE = registerItem("gilded_netherite_pickaxe",
            setting -> new Item(setting.pickaxe(TBSToolMaterials.NETHERITE2, 1.0F, -2.8F).fireResistant()));
    public static final Item GILDED_NETHERITE_AXE = registerItem("gilded_netherite_axe",
            setting -> new AxeItem(TBSToolMaterials.NETHERITE2, 5.0F, -3.0F, setting.fireResistant()));
    public static final Item GILDED_NETHERITE_HOE = registerItem("gilded_netherite_hoe",
            setting -> new HoeItem(TBSToolMaterials.NETHERITE2, -4.0F, 0.0F, setting.fireResistant()));

    public static final Item ENERGY_SWORD = registerItem("energy_sword",
            setting -> new Item(setting.sword(TBSToolMaterials.ENERGY, 3.0F, -2.4F)));
    public static final Item ENERGY_SHOVEL = registerItem("energy_shovel",
            setting -> new ShovelItem(TBSToolMaterials.ENERGY, 1.5F, -3.0F, setting));
    public static final Item ENERGY_PICKAXE = registerItem("energy_pickaxe",
            setting -> new Item(setting.pickaxe(TBSToolMaterials.ENERGY, 1.0F, -2.8F)));
    public static final Item ENERGY_AXE = registerItem("energy_axe",
            setting -> new AxeItem(TBSToolMaterials.ENERGY, 5.0F, -3.0F, setting));
    public static final Item ENERGY_HOE = registerItem("energy_hoe",
            setting -> new HoeItem(TBSToolMaterials.ENERGY, -3.0F, 0.0F, setting));

    //Armour
    public static final Item DIAMARITE_HELMET = registerItem("diamarite_helmet",
            setting -> new Item(setting.humanoidArmor(TBSArmorMaterials.DIAMARITE, ArmorType.HELMET).fireResistant()));
    public static final Item DIAMARITE_CHESTPLATE = registerItem("diamarite_chestplate",
            setting -> new Item(setting.humanoidArmor(TBSArmorMaterials.DIAMARITE, ArmorType.CHESTPLATE).fireResistant()));
    public static final Item DIAMARITE_LEGGINGS = registerItem("diamarite_leggings",
            setting -> new Item(setting.humanoidArmor(TBSArmorMaterials.DIAMARITE, ArmorType.LEGGINGS).fireResistant()));
    public static final Item DIAMARITE_BOOTS = registerItem("diamarite_boots",
            setting -> new Item(setting.humanoidArmor(TBSArmorMaterials.DIAMARITE, ArmorType.BOOTS).fireResistant()));
    public static final Item CORRUPTIONITE_HELMET = registerItem("corruptionite_helmet",
            setting -> new Item(setting.humanoidArmor(TBSArmorMaterials.CORRUPTIONITE, ArmorType.HELMET).fireResistant()));
    public static final Item CORRUPTIONITE_CHESTPLATE = registerItem("corruptionite_chestplate",
            setting -> new Item(setting.humanoidArmor(TBSArmorMaterials.CORRUPTIONITE, ArmorType.CHESTPLATE).fireResistant()));
    public static final Item CORRUPTIONITE_LEGGINGS = registerItem("corruptionite_leggings",
            setting -> new Item(setting.humanoidArmor(TBSArmorMaterials.CORRUPTIONITE, ArmorType.LEGGINGS).fireResistant()));
    public static final Item CORRUPTIONITE_BOOTS = registerItem("corruptionite_boots",
            setting -> new Item(setting.humanoidArmor(TBSArmorMaterials.CORRUPTIONITE, ArmorType.BOOTS).fireResistant()));
    public static final Item BYZANTIUM_HELMET = registerItem("byzantium_helmet",
            setting -> new Item(setting.humanoidArmor(TBSArmorMaterials.BYZANTIUM, ArmorType.HELMET)));
    public static final Item BYZANTIUM_CHESTPLATE = registerItem("byzantium_chestplate",
            setting -> new Item(setting.humanoidArmor(TBSArmorMaterials.BYZANTIUM, ArmorType.CHESTPLATE)));
    public static final Item BYZANTIUM_LEGGINGS = registerItem("byzantium_leggings",
            setting -> new Item(setting.humanoidArmor(TBSArmorMaterials.BYZANTIUM, ArmorType.LEGGINGS)));
    public static final Item BYZANTIUM_BOOTS = registerItem("byzantium_boots",
            setting -> new Item(setting.humanoidArmor(TBSArmorMaterials.BYZANTIUM, ArmorType.BOOTS)));
    public static final Item GILDED_NETHERITE_HELMET = registerItem("gilded_netherite_helmet",
            setting -> new Item(setting.humanoidArmor(TBSArmorMaterials.GILDED_NETHERITE, ArmorType.HELMET).fireResistant()));
    public static final Item GILDED_NETHERITE_CHESTPLATE = registerItem("gilded_netherite_chestplate",
            setting -> new Item(setting.humanoidArmor(TBSArmorMaterials.GILDED_NETHERITE, ArmorType.CHESTPLATE).fireResistant()));
    public static final Item GILDED_NETHERITE_LEGGINGS = registerItem("gilded_netherite_leggings",
            setting -> new Item(setting.humanoidArmor(TBSArmorMaterials.GILDED_NETHERITE, ArmorType.LEGGINGS).fireResistant()));
    public static final Item GILDED_NETHERITE_BOOTS = registerItem("gilded_netherite_boots",
            setting -> new Item(setting.humanoidArmor(TBSArmorMaterials.GILDED_NETHERITE, ArmorType.BOOTS).fireResistant()));

    public static final Item ENERGY_HELMET = registerItem("energy_helmet",
            setting -> new Item(setting.humanoidArmor(TBSArmorMaterials.ENERGY, ArmorType.HELMET)));
    public static final Item ENERGY_CHESTPLATE = registerItem("energy_chestplate",
            setting -> new Item(setting.humanoidArmor(TBSArmorMaterials.ENERGY, ArmorType.CHESTPLATE)));
    public static final Item ENERGY_LEGGINGS = registerItem("energy_leggings",
            setting -> new Item(setting.humanoidArmor(TBSArmorMaterials.ENERGY, ArmorType.LEGGINGS)));
    public static final Item ENERGY_BOOTS = registerItem("energy_boots",
            setting -> new Item(setting.humanoidArmor(TBSArmorMaterials.ENERGY, ArmorType.BOOTS)));

    public static final Item DREADITE_HELMET = registerItem("dreadite_helmet",
            setting -> new Item(setting.humanoidArmor(TBSArmorMaterials.DREADITE, ArmorType.HELMET).fireResistant()));
    public static final Item DREADITE_CHESTPLATE = registerItem("dreadite_chestplate",
            setting -> new Item(setting.humanoidArmor(TBSArmorMaterials.DREADITE, ArmorType.CHESTPLATE).fireResistant()));
    public static final Item DREADITE_LEGGINGS = registerItem("dreadite_leggings",
            setting -> new Item(setting.humanoidArmor(TBSArmorMaterials.DREADITE, ArmorType.LEGGINGS).fireResistant()));
    public static final Item DREADITE_BOOTS = registerItem("dreadite_boots",
            setting -> new Item(setting.humanoidArmor(TBSArmorMaterials.DREADITE, ArmorType.BOOTS).fireResistant()));

    //Dagger
    public static final Item WOODEN_DAGGER = registerItem("wooden_dagger",
            setting -> new Item(setting.sword(ToolMaterial.WOOD, 2.0F, -2.4F)));
    public static final Item COPPER_DAGGER = registerItem("copper_dagger",
            setting -> new Item(setting.sword(ToolMaterial.COPPER, 2.0F, -2.4F)));
    public static final Item STONE_DAGGER = registerItem("stone_dagger",
            setting -> new Item(setting.sword(ToolMaterial.STONE, 2.0F, -2.4F)));
    public static final Item GOLDEN_DAGGER = registerItem("golden_dagger",
            setting -> new Item(setting.sword(ToolMaterial.GOLD, 2.0F, -2.4F)));
    public static final Item BYZANTIUM_DAGGER = registerItem("byzantium_dagger",
            setting -> new Item(setting.sword(TBSToolMaterials.BYZANTIUM, 2.0F, -2.4F)));
    public static final Item IRON_DAGGER = registerItem("iron_dagger",
            setting -> new Item(setting.sword(ToolMaterial.IRON, 2.0F, -2.4F)));
    public static final Item STEEL_DAGGER = registerItem("steel_dagger",
            setting -> new Item(setting.sword(TBSToolMaterials.STEEL, 2.0F, -2.4F)));
    public static final Item DIAMOND_DAGGER = registerItem("diamond_dagger",
            setting -> new Item(setting.sword(ToolMaterial.DIAMOND, 2.0F, -2.4F)));
    public static final Item NETHERITE_DAGGER = registerItem("netherite_dagger",
            setting -> new Item(setting.sword(ToolMaterial.NETHERITE, 2.0F, -2.4F).fireResistant()));
    public static final Item DIAMARITE_DAGGER = registerItem("diamarite_dagger",
            setting -> new Item(setting.sword(TBSToolMaterials.NETHERITE2, 2.0F, -2.4F).fireResistant()));
    public static final Item CORRUPTIONITE_DAGGER = registerItem("corruptionite_dagger",
            setting -> new Item(setting.sword(TBSToolMaterials.NETHERITE2, 2.0F, -2.4F).fireResistant()));
    public static final Item GILDED_NETHERITE_DAGGER = registerItem("gilded_netherite_dagger",
            setting -> new Item(setting.sword(TBSToolMaterials.NETHERITE2, 2.0F, -2.4F).fireResistant()));

    public static final Item ENERGY_DAGGER = registerItem("energy_dagger",
            setting -> new Item(setting.sword(TBSToolMaterials.ENERGY, 2.0F, -2.4F)));


    //public static final Item CORRUPTIONITE_DAGGER = registerItem("corruptionite_dagger",
            //setting -> new TridentItem(setting.maxDamage(250).attributeModifiers(TridentItem.createAttributeModifiers())
                    //.component(DataComponentTypes.TOOL, TridentItem.createToolComponent())
                    //.enchantable(1).component(DataComponentTypes.WEAPON, new WeaponComponent(1)).sword(TBSToolMaterials.NETHERITE_EQUIPMENT,
                            //2.0F, -2.4F)));

    //Sickle
    public static final Item WOODEN_SICKLE = registerItem("wooden_sickle",
            setting -> new Item(setting.sword(ToolMaterial.WOOD, 1.65F, -1.5F)));
    public static final Item COPPER_SICKLE = registerItem("copper_sickle",
            setting -> new Item(setting.sword(ToolMaterial.COPPER, 2.5F, -1.5F)));
    public static final Item STONE_SICKLE = registerItem("stone_sickle",
            setting -> new Item(setting.sword(ToolMaterial.STONE, 2.25F, -1.5F)));
    public static final Item GOLDEN_SICKLE = registerItem("golden_sickle",
            setting -> new Item(setting.sword(ToolMaterial.GOLD, 1.65F, -1.5F)));
    public static final Item BYZANTIUM_SICKLE = registerItem("byzantium_sickle",
            setting -> new Item(setting.sword(TBSToolMaterials.BYZANTIUM, 2.85F, -1.5F)));
    public static final Item IRON_SICKLE = registerItem("iron_sickle",
            setting -> new Item(setting.sword(ToolMaterial.IRON, 2.85F, -1.5F)));
    public static final Item STEEL_SICKLE = registerItem("steel_sickle",
            setting -> new Item(setting.sword(TBSToolMaterials.STEEL, 2.85F, -1.5F)));
    public static final Item DIAMOND_SICKLE = registerItem("diamond_sickle",
            setting -> new Item(setting.sword(ToolMaterial.DIAMOND, 3.45F, -1.5F)));
    public static final Item NETHERITE_SICKLE = registerItem("netherite_sickle",
            setting -> new Item(setting.sword(ToolMaterial.NETHERITE, 4.0F, -1.5F).fireResistant()));
    public static final Item DIAMARITE_SICKLE = registerItem("diamarite_sickle",
            setting -> new Item(setting.sword(TBSToolMaterials.NETHERITE2, 4.0F, -1.5F).fireResistant()));
    public static final Item CORRUPTIONITE_SICKLE = registerItem("corruptionite_sickle",
            setting -> new Item(setting.sword(TBSToolMaterials.NETHERITE2, 4.0F, -1.5F).fireResistant()));
    public static final Item GILDED_NETHERITE_SICKLE = registerItem("gilded_netherite_sickle",
            setting -> new Item(setting.sword(TBSToolMaterials.NETHERITE2, 4.0F, -1.5F).fireResistant()));

    public static final Item ENERGY_SICKLE = registerItem("energy_sickle",
            setting -> new Item(setting.sword(TBSToolMaterials.ENERGY, 3.45F, -1.5F)));

    //Katana
    public static final Item WOODEN_KATANA = registerItem("wooden_katana",
            setting -> new Item(setting.sword(ToolMaterial.WOOD, 3.15F, -2.0F)));
    public static final Item COPPER_KATANA = registerItem("copper_katana",
            setting -> new Item(setting.sword(ToolMaterial.COPPER, 4.75F, -2.0F)));
    public static final Item STONE_KATANA = registerItem("stone_katana",
            setting -> new Item(setting.sword(ToolMaterial.STONE, 4.2F, -2.0F)));
    public static final Item GOLDEN_KATANA = registerItem("golden_katana",
            setting -> new Item(setting.sword(ToolMaterial.GOLD, 3.15F, -2.0F)));
    public static final Item BYZANTIUM_KATANA = registerItem("byzantium_katana",
            setting -> new Item(setting.sword(TBSToolMaterials.BYZANTIUM, 5.25F, -2.0F)));
    public static final Item IRON_KATANA = registerItem("iron_katana",
            setting -> new Item(setting.sword(ToolMaterial.IRON, 5.25F, -2.0F)));
    public static final Item STEEL_KATANA = registerItem("steel_katana",
            setting -> new Item(setting.sword(TBSToolMaterials.STEEL, 5.25F, -2.0F)));
    public static final Item DIAMOND_KATANA = registerItem("diamond_katana",
            setting -> new Item(setting.sword(ToolMaterial.DIAMOND, 6.3F, -2.0F)));
    public static final Item NETHERITE_KATANA = registerItem("netherite_katana",
            setting -> new Item(setting.sword(ToolMaterial.NETHERITE, 7.35F, -2.0F).fireResistant()));
    public static final Item DIAMARITE_KATANA = registerItem("diamarite_katana",
            setting -> new Item(setting.sword(TBSToolMaterials.NETHERITE2, 7.35F, -2.0F).fireResistant()));
    public static final Item CORRUPTIONITE_KATANA = registerItem("corruptionite_katana",
            setting -> new Item(setting.sword(TBSToolMaterials.NETHERITE2, 7.35F, -2.0F).fireResistant()));
    public static final Item GILDED_NETHERITE_KATANA = registerItem("gilded_netherite_katana",
            setting -> new Item(setting.sword(TBSToolMaterials.NETHERITE2, 7.35F, -2.0F).fireResistant()));

    public static final Item ENERGY_KATANA = registerItem("energy_katana",
            setting -> new Item(setting.sword(TBSToolMaterials.ENERGY, 6.3F, -2.0F)));

    //Scythe
    public static final Item WOODEN_SCYTHE = registerItem("wooden_scythe",
            setting -> new Item(setting.sword(ToolMaterial.WOOD, 11.0F, -3.3F)));
    public static final Item COPPER_SCYTHE = registerItem("copper_scythe",
            setting -> new Item(setting.sword(ToolMaterial.COPPER, 15.5F, -3.3F)));
    public static final Item STONE_SCYTHE = registerItem("stone_scythe",
            setting -> new Item(setting.sword(ToolMaterial.STONE, 14.0F, -3.3F)));
    public static final Item GOLDEN_SCYTHE = registerItem("golden_scythe",
            setting -> new Item(setting.sword(ToolMaterial.GOLD, 11.0F, -3.3F)));
    public static final Item BYZANTIUM_SCYTHE = registerItem("byzantium_scythe",
            setting -> new Item(setting.sword(TBSToolMaterials.BYZANTIUM, 17.0F, -3.3F)));
    public static final Item IRON_SCYTHE = registerItem("iron_scythe",
            setting -> new Item(setting.sword(ToolMaterial.IRON, 17.0F, -3.3F)));
    public static final Item STEEL_SCYTHE = registerItem("steel_scythe",
            setting -> new Item(setting.sword(TBSToolMaterials.STEEL, 17.0F, -3.3F)));
    public static final Item DIAMOND_SCYTHE = registerItem("diamond_scythe",
            setting -> new Item(setting.sword(ToolMaterial.DIAMOND, 20.0F, -3.3F)));
    public static final Item NETHERITE_SCYTHE = registerItem("netherite_scythe",
            setting -> new Item(setting.sword(ToolMaterial.NETHERITE, 23.0F, -3.3F).fireResistant()));
    public static final Item DIAMARITE_SCYTHE = registerItem("diamarite_scythe",
            setting -> new Item(setting.sword(TBSToolMaterials.NETHERITE2, 23.0F, -3.3F).fireResistant()));
    public static final Item CORRUPTIONITE_SCYTHE = registerItem("corruptionite_scythe",
            setting -> new Item(setting.sword(TBSToolMaterials.NETHERITE2, 23.0F, -3.3F).fireResistant()));
    public static final Item GILDED_NETHERITE_SCYTHE = registerItem("gilded_netherite_scythe",
            setting -> new Item(setting.sword(TBSToolMaterials.NETHERITE2, 23.0F, -3.3F).fireResistant()));

    public static final Item ENERGY_SCYTHE = registerItem("energy_scythe",
            setting -> new Item(setting.sword(TBSToolMaterials.ENERGY, 20.0F, -3.3F)));

    //Spear
    public static final Item STEEL_SPEAR = registerItem("steel_spear",
            setting -> new Item(setting.spear(TBSToolMaterials.STEEL,
                    0.95F, 0.95F, 0.6F, 2.5F,
                    8.0F, 6.75F, 5.1F, 11.25F, 4.6F)));
    public static final Item BYZANTIUM_SPEAR = registerItem("byzantium_spear",
            setting -> new Item(setting.spear(TBSToolMaterials.BYZANTIUM,
                    0.95F, 0.95F, 0.6F, 2.5F,
                    8.0F, 6.75F, 5.1F, 11.25F, 4.6F)));
    public static final Item DIAMARITE_SPEAR = registerItem("diamarite_spear",
            setting -> new Item(setting.spear(TBSToolMaterials.NETHERITE2,
                    1.15F, 1.2F, 0.4F, 2.5F,
                    7.0F, 5.5F, 5.1F, 8.75F, 4.6F).fireResistant()));
    public static final Item CORRUPTIONITE_SPEAR = registerItem("corruptionite_spear",
            setting -> new Item(setting.spear(TBSToolMaterials.NETHERITE2,
                    1.15F, 1.2F, 0.4F, 2.5F,
                    7.0F, 5.5F, 5.1F, 8.75F, 4.6F).fireResistant()));
    public static final Item GILDED_NETHERITE_SPEAR = registerItem("gilded_netherite_spear",
            setting -> new Item(setting.spear(TBSToolMaterials.NETHERITE2,
                    1.15F, 1.2F, 0.4F, 2.5F,
                    7.0F, 5.5F, 5.1F, 8.75F, 4.6F).fireResistant()));

    public static final Item ENERGY_SPEAR = registerItem("energy_spear",
            setting -> new Item(setting.spear(TBSToolMaterials.ENERGY,
                    1.05F, 1.075F, 0.5F, 3.0F,
                    7.5F, 6.5F, 5.1F, 10.0F, 4.6F).fireResistant()));

    //Mace
    public static final Item DIAMARITE_MACE = registerItem("diamarite_mace",
            setting -> new MaceItem(setting.rarity(Rarity.EPIC).durability(500)
                    .component(DataComponents.TOOL, MaceItem.createToolProperties()).repairable(DIAMARITE)
                    .attributes(MaceItem.createAttributes()).enchantable(15).component(DataComponents.WEAPON, new Weapon(1))));

    public static final Item DOUBLED_MACE = registerItem("doubled_mace",
            setting -> new MaceItem(setting.rarity(Rarity.EPIC).durability(500)
                    .component(DataComponents.TOOL, MaceItem.createToolProperties()).repairable(DIAMARITE_MACE)
                    .attributes(MaceItem.createAttributes()).enchantable(15).component(DataComponents.WEAPON, new Weapon(1))));

    //Shelves
    //public static final Item SHELFSHELF = register(
            //TBSBlocks.SHELFSHELF, (UnaryOperator<Item.Settings>)(settings -> settings.component(DataComponentTypes.CONTAINER, ContainerComponent.DEFAULT)));

    //Core
        public static Item DIAMARITE_CORE; // Just the declaration

        public static void initialize() {
            // Only called once by your ModInitializer
            DIAMARITE_CORE = registerCoreBlockItem(TBSBlocks.DIAMARITE_CORE, new Item.Properties().rarity(Rarity.EPIC));
        }

    //EXTRA
    private static Item registerItem(String name, Function<Item.Properties, Item> function) {
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(TBS.MOD_ID, name),
                function.apply(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(TBS.MOD_ID, name)))));
    }

    //public static Item register(Block block, UnaryOperator<Item.Settings> settingsOperator) {
        //Identifier blockId = Registries.BLOCK.getId(block);
        //Identifier itemId = Identifier.of(TBS.MOD_ID, blockId.getPath());

        //RegistryKey<Item> itemKey = RegistryKey.of(
                //RegistryKeys.ITEM,
                //itemId
        //);

        //Item item = new BlockItem(
                //block,
                //settingsOperator.apply(
                        //new Item.Settings().registryKey(itemKey)
                //)
        //);

        //return Registry.register(Registries.ITEM, itemId, item);
    //}

    public static Item registerCoreBlockItem(Block block, Item.Properties settings) {
        // Retrieve the ResourceKey that was ALREADY assigned to the block during its creation
        ResourceKey<Block> blockKey = BuiltInRegistries.BLOCK.getResourceKey(block)
                .orElseThrow(() -> new IllegalStateException("Block is not registered: " + block));

        // Create the Item key using the exact same location as the block
        ResourceKey<Item> itemKey = ResourceKey.create(Registries.ITEM, blockKey.identifier());

        // Use the block's ID and force the block description prefix
        return Registry.register(BuiltInRegistries.ITEM, itemKey,
                new BlockItem(block, settings.setId(itemKey).useBlockDescriptionPrefix()));
    }

    public static void registerItems() {
        TBS.LOGGER.info("Registering Items for " + TBS.MOD_ID);

        //Creative Tabs
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.TOOLS_AND_UTILITIES).register(utilities -> {
            utilities.insertBefore(Items.MUSIC_DISC_13, TBSItems.MUSIC_DISC_TEMPLATE);
            utilities.insertAfter(Items.MUSIC_DISC_BOUNCE, TBSItems.MUSIC_DISC_THE_TALE_OF_TOOTHLESS);
            utilities.insertAfter(TBSItems.MUSIC_DISC_THE_TALE_OF_TOOTHLESS, TBSItems.MUSIC_DISC_THE_BYE_JUSTIN_HI_JUSTIN_RAP);
            utilities.insertAfter(TBSItems.MUSIC_DISC_THE_BYE_JUSTIN_HI_JUSTIN_RAP, TBSItems.MUSIC_DISC_STEVE_LAVA_CHICKEN);
            utilities.insertAfter(TBSItems.MUSIC_DISC_STEVE_LAVA_CHICKEN, TBSItems.MUSIC_DISC_LAVA_TEARSSTEP);
            utilities.insertAfter(TBSItems.MUSIC_DISC_LAVA_TEARSSTEP, TBSItems.MUSIC_DISC_TERRIFYING_TEARS);
            utilities.insertAfter(TBSItems.MUSIC_DISC_TERRIFYING_TEARS, TBSItems.MUSIC_DISC_BETTERSIDE);
            utilities.insertAfter(TBSItems.MUSIC_DISC_BETTERSIDE, TBSItems.MUSIC_DISC_12);
            utilities.insertAfter(TBSItems.MUSIC_DISC_12, TBSItems.MUSIC_DISC_THE_BYE_JUSTIN_HI_JUSTIN_RAP_REMASTERED);
            utilities.insertAfter(TBSItems.MUSIC_DISC_THE_BYE_JUSTIN_HI_JUSTIN_RAP_REMASTERED, TBSItems.MUSIC_DISC_EXPLORER);
            utilities.insertAfter(TBSItems.MUSIC_DISC_EXPLORER, TBSItems.ALREADY_AHEAD);
            utilities.insertAfter(TBSItems.ALREADY_AHEAD, TBSItems.DARK_INSIDE);
            utilities.insertAfter(TBSItems.DARK_INSIDE, TBSItems.MUSIC_DISC_REVERSED_THE_TALE_OF_TOOTHLESS);
            utilities.insertAfter(TBSItems.MUSIC_DISC_REVERSED_THE_TALE_OF_TOOTHLESS, TBSItems.MUSIC_DISC_REVERSED_THE_BYE_JUSTIN_HI_JUSTIN_RAP);
            utilities.insertAfter(TBSItems.MUSIC_DISC_REVERSED_THE_BYE_JUSTIN_HI_JUSTIN_RAP, TBSItems.MUSIC_DISC_REVERSED_STEVE_LAVA_CHICKEN);
            utilities.insertAfter(TBSItems.MUSIC_DISC_REVERSED_STEVE_LAVA_CHICKEN, TBSItems.MUSIC_DISC_REVERSED_LAVA_TEARSSTEP);
            utilities.insertAfter(TBSItems.MUSIC_DISC_REVERSED_LAVA_TEARSSTEP, TBSItems.MUSIC_DISC_REVERSED_TERRIFYING_TEARS);
            utilities.insertAfter(TBSItems.MUSIC_DISC_REVERSED_TERRIFYING_TEARS, TBSItems.MUSIC_DISC_REVERSED_BETTERSIDE);
            utilities.insertAfter(TBSItems.MUSIC_DISC_REVERSED_BETTERSIDE, TBSItems.MUSIC_DISC_REVERSED_12);
            utilities.insertAfter(TBSItems.MUSIC_DISC_REVERSED_12, TBSItems.MUSIC_DISC_REVERSED_THE_BYE_JUSTIN_HI_JUSTIN_RAP_REMASTERED);
            utilities.insertAfter(TBSItems.MUSIC_DISC_REVERSED_THE_BYE_JUSTIN_HI_JUSTIN_RAP_REMASTERED, TBSItems.MUSIC_DISC_REVERSED_EXPLORER);
            utilities.insertAfter(TBSItems.MUSIC_DISC_REVERSED_EXPLORER, TBSItems.REVERSED_ALREADY_AHEAD);
            utilities.insertAfter(TBSItems.REVERSED_ALREADY_AHEAD, TBSItems.REVERSED_DARK_INSIDE);
            utilities.insertAfter(TBSItems.REVERSED_DARK_INSIDE, TBSItems.PANCAKE);
            utilities.insertAfter(TBSItems.PANCAKE, TBSItems.WAFFLE);
            utilities.insertAfter(TBSItems.WAFFLE, TBSItems.REVERSED_PANCAKE);
            utilities.insertAfter(TBSItems.REVERSED_PANCAKE, TBSItems.REVERSED_WAFFLE);
            utilities.insertAfter(Items.IRON_HOE, TBSItems.STEEL_SHOVEL);
            utilities.insertAfter(TBSItems.STEEL_SHOVEL, TBSItems.STEEL_PICKAXE);
            utilities.insertAfter(TBSItems.STEEL_PICKAXE, TBSItems.STEEL_AXE);
            utilities.insertAfter(TBSItems.STEEL_AXE, TBSItems.STEEL_HOE);
            utilities.insertAfter(Items.GOLDEN_HOE, TBSItems.BYZANTIUM_SHOVEL);
            utilities.insertAfter(TBSItems.BYZANTIUM_SHOVEL, TBSItems.BYZANTIUM_PICKAXE);
            utilities.insertAfter(TBSItems.BYZANTIUM_PICKAXE, TBSItems.BYZANTIUM_AXE);
            utilities.insertAfter(TBSItems.BYZANTIUM_AXE, TBSItems.BYZANTIUM_HOE);
            utilities.insertAfter(Items.DIAMOND_HOE, TBSItems.ENERGY_SHOVEL);
            utilities.insertAfter(TBSItems.ENERGY_SHOVEL, TBSItems.ENERGY_PICKAXE);
            utilities.insertAfter(TBSItems.ENERGY_PICKAXE, TBSItems.ENERGY_AXE);
            utilities.insertAfter(TBSItems.ENERGY_AXE, TBSItems.ENERGY_HOE);
            utilities.insertAfter(TBSItems.ENERGY_HOE, Items.NETHERITE_SHOVEL);
            utilities.insertAfter(Items.NETHERITE_HOE, TBSItems.GILDED_NETHERITE_SHOVEL);
            utilities.insertAfter(TBSItems.GILDED_NETHERITE_SHOVEL, TBSItems.GILDED_NETHERITE_PICKAXE);
            utilities.insertAfter(TBSItems.GILDED_NETHERITE_PICKAXE, TBSItems.GILDED_NETHERITE_AXE);
            utilities.insertAfter(TBSItems.GILDED_NETHERITE_AXE, TBSItems.GILDED_NETHERITE_HOE);
            utilities.insertAfter(TBSItems.GILDED_NETHERITE_HOE, TBSItems.DIAMARITE_SHOVEL);
            utilities.insertAfter(TBSItems.DIAMARITE_SHOVEL, TBSItems.DIAMARITE_PICKAXE);
            utilities.insertAfter(TBSItems.DIAMARITE_PICKAXE, TBSItems.DIAMARITE_AXE);
            utilities.insertAfter(TBSItems.DIAMARITE_AXE, TBSItems.DIAMARITE_HOE);
            utilities.insertAfter(TBSItems.DIAMARITE_HOE, TBSItems.CORRUPTIONITE_SHOVEL);
            utilities.insertAfter(TBSItems.CORRUPTIONITE_SHOVEL, TBSItems.CORRUPTIONITE_PICKAXE);
            utilities.insertAfter(TBSItems.CORRUPTIONITE_PICKAXE, TBSItems.CORRUPTIONITE_AXE);
            utilities.insertAfter(TBSItems.CORRUPTIONITE_AXE, TBSItems.CORRUPTIONITE_HOE);
            utilities.insertAfter(Items.MAP, TBSItems.MONEY);
        });

        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.INGREDIENTS).register(ingredients -> {
            ingredients.insertAfter(Items.STICK, TBSItems.HANDLE);
            ingredients.insertAfter(TBSItems.HANDLE, TBSItems.STEEL_HANDLE);
            ingredients.insertAfter(TBSItems.STEEL_HANDLE, TBSItems.NETHERITE_HANDLE);
            ingredients.insertAfter(TBSItems.NETHERITE_HANDLE, TBSItems.ENERGY_HANDLE);
            ingredients.insertAfter(TBSItems.ENERGY_HANDLE, TBSItems.BIG_STICK);
            ingredients.insertAfter(TBSItems.BIG_STICK, TBSItems.STEEL_ROD);
            ingredients.insertAfter(TBSItems.STEEL_ROD, TBSItems.NETHERITE_ROD);
            ingredients.insertAfter(TBSItems.NETHERITE_ROD, TBSItems.ENERGY_ROD);
            ingredients.insertAfter(Items.EMERALD, TBSItems.CURSED_EMERALD);
            ingredients.insertAfter(Items.IRON_INGOT, TBSItems.STEEL_INGOT);
            ingredients.insertAfter(Items.NETHERITE_INGOT, TBSItems.GILDED_NETHERITE_INGOT);
            ingredients.insertAfter(TBSItems.GILDED_NETHERITE_INGOT, TBSItems.DIAMARITE_INGOT);
            ingredients.insertAfter(TBSItems.DIAMARITE_INGOT, TBSItems.CORRUPTIONITE_INGOT);
            ingredients.insertAfter(Items.DIAMOND, TBSItems.ENERGY_GEM);
            ingredients.insertAfter(TBSItems.ENERGY_GEM, TBSItems.DIAMARITE);
            ingredients.insertAfter(TBSItems.DIAMARITE, TBSItems.DREADITE_GEM);
            ingredients.insertAfter(Items.GOLD_INGOT, TBSItems.BYZANTIUM_INGOT);
            ingredients.insertAfter(TBSItems.BYZANTIUM_INGOT, TBSItems.DIAMOND_INGOT);
            ingredients.insertAfter(Items.COPPER_INGOT, TBSItems.AMETHYST_INGOT);
            ingredients.insertAfter(Items.PAPER, TBSItems.REINFORCED_PAPER);
            ingredients.insertAfter(TBSItems.REINFORCED_PAPER, TBSItems.DUCT_TAPE);
            ingredients.insertAfter(Items.NETHERITE_SCRAP, TBSItems.GOLDEN_SCRAP);
            ingredients.insertAfter(Items.GOLD_NUGGET, TBSItems.BYZANTIUM_NUGGET);
            ingredients.insertAfter(TBSItems.BYZANTIUM_NUGGET, TBSItems.ENERGY_NUGGET);
            ingredients.insertAfter(TBSItems.ENERGY_NUGGET, TBSItems.BURNT_INGOT);
            ingredients.insertAfter(TBSItems.BURNT_INGOT, TBSItems.CHARD_INGOT);
            ingredients.insertAfter(TBSItems.CHARD_INGOT, Items.COPPER_INGOT);
            ingredients.insertAfter(Items.RAW_GOLD, TBSItems.RAW_BYZANTIUM);
            ingredients.insertAfter(Items.OMINOUS_TRIAL_KEY, TBSItems.YOUTUBE_LOGO);
            ingredients.insertAfter(TBSItems.YOUTUBE_LOGO, TBSItems.SILVER_PLAY_BUTTON);
            ingredients.insertAfter(TBSItems.SILVER_PLAY_BUTTON, TBSItems.GOLDEN_PLAY_BUTTON);
            ingredients.insertAfter(TBSItems.GOLDEN_PLAY_BUTTON, TBSItems.DIAMOND_PLAY_BUTTON);
        });

        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.COMBAT).register(combat -> {
            combat.insertAfter(Items.WOODEN_SWORD, TBSItems.WOODEN_KATANA);
            combat.insertAfter(TBSItems.WOODEN_KATANA, TBSItems.WOODEN_SICKLE);
            combat.insertAfter(TBSItems.WOODEN_SICKLE, TBSItems.WOODEN_SCYTHE);
            combat.insertAfter(TBSItems.WOODEN_SCYTHE, TBSItems.WOODEN_DAGGER);
            combat.insertAfter(Items.STONE_SWORD, TBSItems.STONE_KATANA);
            combat.insertAfter(TBSItems.STONE_KATANA, TBSItems.STONE_SICKLE);
            combat.insertAfter(TBSItems.STONE_SICKLE, TBSItems.STONE_SCYTHE);
            combat.insertAfter(TBSItems.STONE_SCYTHE, TBSItems.STONE_DAGGER);
            combat.insertAfter(Items.COPPER_SWORD, TBSItems.COPPER_KATANA);
            combat.insertAfter(TBSItems.COPPER_KATANA, TBSItems.COPPER_SICKLE);
            combat.insertAfter(TBSItems.COPPER_SICKLE, TBSItems.COPPER_SCYTHE);
            combat.insertAfter(TBSItems.COPPER_SCYTHE, TBSItems.COPPER_DAGGER);
            combat.insertAfter(Items.IRON_SWORD, TBSItems.IRON_KATANA);
            combat.insertAfter(TBSItems.IRON_KATANA, TBSItems.IRON_SICKLE);
            combat.insertAfter(TBSItems.IRON_SICKLE, TBSItems.IRON_SCYTHE);
            combat.insertAfter(TBSItems.IRON_SCYTHE, TBSItems.IRON_DAGGER);
            combat.insertAfter(TBSItems.IRON_DAGGER, TBSItems.STEEL_SWORD);
            combat.insertAfter(TBSItems.STEEL_SWORD, TBSItems.STEEL_KATANA);
            combat.insertAfter(TBSItems.STEEL_KATANA, TBSItems.STEEL_SICKLE);
            combat.insertAfter(TBSItems.STEEL_SICKLE, TBSItems.STEEL_SCYTHE);
            combat.insertAfter(TBSItems.STEEL_SCYTHE, TBSItems.STEEL_DAGGER);
            combat.insertAfter(TBSItems.STEEL_DAGGER, TBSItems.KATARA_KNIFE);
            combat.insertAfter(Items.GOLDEN_SWORD, TBSItems.GOLDEN_KATANA);
            combat.insertAfter(TBSItems.GOLDEN_KATANA, TBSItems.GOLDEN_SICKLE);
            combat.insertAfter(TBSItems.GOLDEN_SICKLE, TBSItems.GOLDEN_SCYTHE);
            combat.insertAfter(TBSItems.GOLDEN_SCYTHE, TBSItems.GOLDEN_DAGGER);
            combat.insertAfter(TBSItems.GOLDEN_DAGGER, TBSItems.BYZANTIUM_SWORD);
            combat.insertAfter(TBSItems.BYZANTIUM_SWORD, TBSItems.BYZANTIUM_KATANA);
            combat.insertAfter(TBSItems.BYZANTIUM_KATANA, TBSItems.BYZANTIUM_SICKLE);
            combat.insertAfter(TBSItems.BYZANTIUM_SICKLE, TBSItems.BYZANTIUM_SCYTHE);
            combat.insertAfter(TBSItems.BYZANTIUM_SCYTHE, TBSItems.BYZANTIUM_DAGGER);
            combat.insertAfter(Items.DIAMOND_SWORD, TBSItems.DIAMOND_KATANA);
            combat.insertAfter(TBSItems.DIAMOND_KATANA, TBSItems.DIAMOND_SICKLE);
            combat.insertAfter(TBSItems.DIAMOND_SICKLE, TBSItems.DIAMOND_SCYTHE);
            combat.insertAfter(TBSItems.DIAMOND_SCYTHE, TBSItems.DIAMOND_DAGGER);
            combat.insertAfter(TBSItems.DIAMOND_DAGGER, TBSItems.ENERGY_SWORD);
            combat.insertAfter(TBSItems.ENERGY_SWORD, TBSItems.ENERGY_KATANA);
            combat.insertAfter(TBSItems.ENERGY_KATANA, TBSItems.ENERGY_SICKLE);
            combat.insertAfter(TBSItems.ENERGY_SICKLE, TBSItems.ENERGY_SCYTHE);
            combat.insertAfter(TBSItems.ENERGY_SCYTHE, TBSItems.ENERGY_DAGGER);
            combat.insertAfter(TBSItems.ENERGY_DAGGER, Items.NETHERITE_SWORD);
            combat.insertAfter(Items.NETHERITE_SWORD, TBSItems.NETHERITE_KATANA);
            combat.insertAfter(TBSItems.NETHERITE_KATANA, TBSItems.NETHERITE_SICKLE);
            combat.insertAfter(TBSItems.NETHERITE_SICKLE, TBSItems.NETHERITE_SCYTHE);
            combat.insertAfter(TBSItems.NETHERITE_SCYTHE, TBSItems.NETHERITE_DAGGER);
            combat.insertAfter(TBSItems.NETHERITE_DAGGER, TBSItems.GILDED_NETHERITE_SWORD);
            combat.insertAfter(TBSItems.GILDED_NETHERITE_SWORD, TBSItems.GILDED_NETHERITE_KATANA);
            combat.insertAfter(TBSItems.GILDED_NETHERITE_KATANA, TBSItems.GILDED_NETHERITE_SICKLE);
            combat.insertAfter(TBSItems.GILDED_NETHERITE_SICKLE, TBSItems.GILDED_NETHERITE_SCYTHE);
            combat.insertAfter(TBSItems.GILDED_NETHERITE_SCYTHE, TBSItems.GILDED_NETHERITE_DAGGER);
            combat.insertAfter(TBSItems.GILDED_NETHERITE_DAGGER, TBSItems.DIAMARITE_SWORD);
            combat.insertAfter(TBSItems.DIAMARITE_SWORD, TBSItems.DIAMARITE_KATANA);
            combat.insertAfter(TBSItems.DIAMARITE_KATANA, TBSItems.DIAMARITE_SICKLE);
            combat.insertAfter(TBSItems.DIAMARITE_SICKLE, TBSItems.DIAMARITE_SCYTHE);
            combat.insertAfter(TBSItems.DIAMARITE_SCYTHE, TBSItems.DIAMARITE_DAGGER);
            combat.insertAfter(TBSItems.DIAMARITE_DAGGER, TBSItems.CORRUPTIONITE_SWORD);
            combat.insertAfter(TBSItems.CORRUPTIONITE_SWORD, TBSItems.CORRUPTIONITE_KATANA);
            combat.insertAfter(TBSItems.CORRUPTIONITE_KATANA, TBSItems.CORRUPTIONITE_SICKLE);
            combat.insertAfter(TBSItems.CORRUPTIONITE_SICKLE, TBSItems.CORRUPTIONITE_SCYTHE);
            combat.insertAfter(TBSItems.CORRUPTIONITE_SCYTHE, TBSItems.CORRUPTIONITE_DAGGER);
            combat.insertAfter(Items.IRON_AXE, TBSItems.STEEL_AXE);
            combat.insertAfter(Items.GOLDEN_AXE, TBSItems.BYZANTIUM_AXE);
            combat.insertAfter(Items.DIAMOND_AXE, TBSItems.ENERGY_AXE);
            combat.insertAfter(TBSItems.ENERGY_AXE, Items.NETHERITE_AXE);
            combat.insertAfter(Items.NETHERITE_AXE, TBSItems.GILDED_NETHERITE_AXE);
            combat.insertAfter(TBSItems.GILDED_NETHERITE_AXE, TBSItems.DIAMARITE_AXE);
            combat.insertAfter(TBSItems.DIAMARITE_AXE, TBSItems.CORRUPTIONITE_AXE);
            combat.insertAfter(Items.IRON_SPEAR, TBSItems.STEEL_SPEAR);
            combat.insertAfter(Items.GOLDEN_SPEAR, TBSItems.BYZANTIUM_SPEAR);
            combat.insertAfter(Items.DIAMOND_SPEAR, TBSItems.ENERGY_SPEAR);
            combat.insertAfter(TBSItems.ENERGY_SPEAR, Items.NETHERITE_SPEAR);
            combat.insertAfter(Items.NETHERITE_SPEAR, TBSItems.GILDED_NETHERITE_SPEAR);
            combat.insertAfter(TBSItems.GILDED_NETHERITE_SPEAR, TBSItems.DIAMARITE_SPEAR);
            combat.insertAfter(TBSItems.DIAMARITE_SPEAR, TBSItems.CORRUPTIONITE_SPEAR);
            combat.insertAfter(Items.GOLDEN_BOOTS, TBSItems.BYZANTIUM_HELMET);
            combat.insertAfter(TBSItems.BYZANTIUM_HELMET, TBSItems.BYZANTIUM_CHESTPLATE);
            combat.insertAfter(TBSItems.BYZANTIUM_CHESTPLATE, TBSItems.BYZANTIUM_LEGGINGS);
            combat.insertAfter(TBSItems.BYZANTIUM_LEGGINGS, TBSItems.BYZANTIUM_BOOTS);
            combat.insertAfter(Items.DIAMOND_BOOTS, TBSItems.ENERGY_HELMET);
            combat.insertAfter(TBSItems.ENERGY_HELMET, TBSItems.ENERGY_CHESTPLATE);
            combat.insertAfter(TBSItems.ENERGY_CHESTPLATE, TBSItems.ENERGY_LEGGINGS);
            combat.insertAfter(TBSItems.ENERGY_LEGGINGS, TBSItems.ENERGY_BOOTS);
            combat.insertAfter(TBSItems.ENERGY_BOOTS, Items.NETHERITE_HELMET);
            combat.insertAfter(Items.NETHERITE_BOOTS, TBSItems.GILDED_NETHERITE_HELMET);
            combat.insertAfter(TBSItems.GILDED_NETHERITE_HELMET, TBSItems.GILDED_NETHERITE_CHESTPLATE);
            combat.insertAfter(TBSItems.GILDED_NETHERITE_CHESTPLATE, TBSItems.GILDED_NETHERITE_LEGGINGS);
            combat.insertAfter(TBSItems.GILDED_NETHERITE_LEGGINGS, TBSItems.GILDED_NETHERITE_BOOTS);
            combat.insertAfter(TBSItems.GILDED_NETHERITE_BOOTS, TBSItems.DIAMARITE_HELMET);
            combat.insertAfter(TBSItems.DIAMARITE_HELMET, TBSItems.DIAMARITE_CHESTPLATE);
            combat.insertAfter(TBSItems.DIAMARITE_CHESTPLATE, TBSItems.DIAMARITE_LEGGINGS);
            combat.insertAfter(TBSItems.DIAMARITE_LEGGINGS, TBSItems.DIAMARITE_BOOTS);
            combat.insertAfter(TBSItems.DIAMARITE_BOOTS, TBSItems.CORRUPTIONITE_HELMET);
            combat.insertAfter(TBSItems.CORRUPTIONITE_HELMET, TBSItems.CORRUPTIONITE_CHESTPLATE);
            combat.insertAfter(TBSItems.CORRUPTIONITE_CHESTPLATE, TBSItems.CORRUPTIONITE_LEGGINGS);
            combat.insertAfter(TBSItems.CORRUPTIONITE_LEGGINGS, TBSItems.CORRUPTIONITE_BOOTS);
            combat.insertAfter(TBSItems.CORRUPTIONITE_BOOTS, TBSItems.DREADITE_HELMET);
            combat.insertAfter(TBSItems.DREADITE_HELMET, TBSItems.DREADITE_CHESTPLATE);
            combat.insertAfter(TBSItems.DREADITE_CHESTPLATE, TBSItems.DREADITE_LEGGINGS);
            combat.insertAfter(TBSItems.DREADITE_LEGGINGS, TBSItems.DREADITE_BOOTS);
            combat.insertAfter(Items.MACE, TBSItems.DIAMARITE_MACE);
            combat.insertAfter(TBSItems.DIAMARITE_MACE, TBSItems.DOUBLED_MACE);
        });
    }
}
