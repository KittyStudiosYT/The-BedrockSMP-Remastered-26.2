package net.itskittyyoutube.kitty.data;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootSubProvider;
import net.itskittyyoutube.kitty.block.TBSBlocks;
import net.itskittyyoutube.kitty.item.TBSItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

import java.util.concurrent.CompletableFuture;

public class TBSLootTableProvider extends FabricBlockLootSubProvider {
    public TBSLootTableProvider(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(packOutput, registriesFuture);
    }

    @Override
    public void generate() {
        dropSelf(TBSBlocks.PLANKS_TEMPLATE);
        dropSelf(TBSBlocks.WHITE_PLANKS);
        dropSelf(TBSBlocks.WHITE_STAIRS);
        add(TBSBlocks.WHITE_SLAB, this::createSlabItemTable);
        dropSelf(TBSBlocks.WHITE_FENCE);
        dropSelf(TBSBlocks.WHITE_FENCE_GATE);
        add(TBSBlocks.WHITE_DOOR, this::createDoorTable);
        dropSelf(TBSBlocks.WHITE_TRAPDOOR);
        dropSelf(TBSBlocks.WHITE_PRESSURE_PLATE);
        dropSelf(TBSBlocks.WHITE_BUTTON);
        dropSelf(TBSBlocks.LIGHT_GRAY_PLANKS);
        dropSelf(TBSBlocks.LIGHT_GRAY_STAIRS);
        add(TBSBlocks.LIGHT_GRAY_SLAB, this::createSlabItemTable);
        dropSelf(TBSBlocks.LIGHT_GRAY_FENCE);
        dropSelf(TBSBlocks.LIGHT_GRAY_FENCE_GATE);
        add(TBSBlocks.LIGHT_GRAY_DOOR, this::createDoorTable);
        dropSelf(TBSBlocks.LIGHT_GRAY_TRAPDOOR);
        dropSelf(TBSBlocks.LIGHT_GRAY_PRESSURE_PLATE);
        dropSelf(TBSBlocks.LIGHT_GRAY_BUTTON);
        dropSelf(TBSBlocks.GRAY_PLANKS);
        dropSelf(TBSBlocks.GRAY_STAIRS);
        add(TBSBlocks.GRAY_SLAB, this::createSlabItemTable);
        dropSelf(TBSBlocks.GRAY_FENCE);
        dropSelf(TBSBlocks.GRAY_FENCE_GATE);
        add(TBSBlocks.GRAY_DOOR, this::createDoorTable);
        dropSelf(TBSBlocks.GRAY_TRAPDOOR);
        dropSelf(TBSBlocks.GRAY_PRESSURE_PLATE);
        dropSelf(TBSBlocks.GRAY_BUTTON);
        dropSelf(TBSBlocks.BLACK_PLANKS);
        dropSelf(TBSBlocks.BLACK_STAIRS);
        add(TBSBlocks.BLACK_SLAB, this::createSlabItemTable);
        dropSelf(TBSBlocks.BLACK_FENCE);
        dropSelf(TBSBlocks.BLACK_FENCE_GATE);
        add(TBSBlocks.BLACK_DOOR, this::createDoorTable);
        dropSelf(TBSBlocks.BLACK_TRAPDOOR);
        dropSelf(TBSBlocks.BLACK_PRESSURE_PLATE);
        dropSelf(TBSBlocks.BLACK_BUTTON);
        dropSelf(TBSBlocks.BROWN_PLANKS);
        dropSelf(TBSBlocks.BROWN_STAIRS);
        add(TBSBlocks.BROWN_SLAB, this::createSlabItemTable);
        dropSelf(TBSBlocks.BROWN_FENCE);
        dropSelf(TBSBlocks.BROWN_FENCE_GATE);
        add(TBSBlocks.BROWN_DOOR, this::createDoorTable);
        dropSelf(TBSBlocks.BROWN_TRAPDOOR);
        dropSelf(TBSBlocks.BROWN_PRESSURE_PLATE);
        dropSelf(TBSBlocks.BROWN_BUTTON);
        dropSelf(TBSBlocks.RED_PLANKS);
        dropSelf(TBSBlocks.RED_STAIRS);
        add(TBSBlocks.RED_SLAB, this::createSlabItemTable);
        dropSelf(TBSBlocks.RED_FENCE);
        dropSelf(TBSBlocks.RED_FENCE_GATE);
        add(TBSBlocks.RED_DOOR, this::createDoorTable);
        dropSelf(TBSBlocks.RED_TRAPDOOR);
        dropSelf(TBSBlocks.RED_PRESSURE_PLATE);
        dropSelf(TBSBlocks.RED_BUTTON);
        dropSelf(TBSBlocks.ORANGE_PLANKS);
        dropSelf(TBSBlocks.ORANGE_STAIRS);
        add(TBSBlocks.ORANGE_SLAB, this::createSlabItemTable);
        dropSelf(TBSBlocks.ORANGE_FENCE);
        dropSelf(TBSBlocks.ORANGE_FENCE_GATE);
        add(TBSBlocks.ORANGE_DOOR, this::createDoorTable);
        dropSelf(TBSBlocks.ORANGE_TRAPDOOR);
        dropSelf(TBSBlocks.ORANGE_PRESSURE_PLATE);
        dropSelf(TBSBlocks.ORANGE_BUTTON);
        dropSelf(TBSBlocks.YELLOW_PLANKS);
        dropSelf(TBSBlocks.YELLOW_STAIRS);
        add(TBSBlocks.YELLOW_SLAB, this::createSlabItemTable);
        dropSelf(TBSBlocks.YELLOW_FENCE);
        dropSelf(TBSBlocks.YELLOW_FENCE_GATE);
        add(TBSBlocks.YELLOW_DOOR, this::createDoorTable);
        dropSelf(TBSBlocks.YELLOW_TRAPDOOR);
        dropSelf(TBSBlocks.YELLOW_PRESSURE_PLATE);
        dropSelf(TBSBlocks.YELLOW_BUTTON);
        dropSelf(TBSBlocks.LIME_PLANKS);
        dropSelf(TBSBlocks.LIME_STAIRS);
        add(TBSBlocks.LIME_SLAB, this::createSlabItemTable);
        dropSelf(TBSBlocks.LIME_FENCE);
        dropSelf(TBSBlocks.LIME_FENCE_GATE);
        add(TBSBlocks.LIME_DOOR, this::createDoorTable);
        dropSelf(TBSBlocks.LIME_TRAPDOOR);
        dropSelf(TBSBlocks.LIME_PRESSURE_PLATE);
        dropSelf(TBSBlocks.LIME_BUTTON);
        dropSelf(TBSBlocks.GREEN_PLANKS);
        dropSelf(TBSBlocks.GREEN_STAIRS);
        add(TBSBlocks.GREEN_SLAB, this::createSlabItemTable);
        dropSelf(TBSBlocks.GREEN_FENCE);
        dropSelf(TBSBlocks.GREEN_FENCE_GATE);
        add(TBSBlocks.GREEN_DOOR, this::createDoorTable);
        dropSelf(TBSBlocks.GREEN_TRAPDOOR);
        dropSelf(TBSBlocks.GREEN_PRESSURE_PLATE);
        dropSelf(TBSBlocks.GREEN_BUTTON);
        dropSelf(TBSBlocks.CYAN_PLANKS);
        dropSelf(TBSBlocks.CYAN_STAIRS);
        add(TBSBlocks.CYAN_SLAB, this::createSlabItemTable);
        dropSelf(TBSBlocks.CYAN_FENCE);
        dropSelf(TBSBlocks.CYAN_FENCE_GATE);
        add(TBSBlocks.CYAN_DOOR, this::createDoorTable);
        dropSelf(TBSBlocks.CYAN_TRAPDOOR);
        dropSelf(TBSBlocks.CYAN_PRESSURE_PLATE);
        dropSelf(TBSBlocks.CYAN_BUTTON);
        dropSelf(TBSBlocks.LIGHT_BLUE_PLANKS);
        dropSelf(TBSBlocks.LIGHT_BLUE_STAIRS);
        add(TBSBlocks.LIGHT_BLUE_SLAB, this::createSlabItemTable);
        dropSelf(TBSBlocks.LIGHT_BLUE_FENCE);
        dropSelf(TBSBlocks.LIGHT_BLUE_FENCE_GATE);
        add(TBSBlocks.LIGHT_BLUE_DOOR, this::createDoorTable);
        dropSelf(TBSBlocks.LIGHT_BLUE_TRAPDOOR);
        dropSelf(TBSBlocks.LIGHT_BLUE_PRESSURE_PLATE);
        dropSelf(TBSBlocks.LIGHT_BLUE_BUTTON);
        dropSelf(TBSBlocks.BLUE_PLANKS);
        dropSelf(TBSBlocks.BLUE_STAIRS);
        add(TBSBlocks.BLUE_SLAB, this::createSlabItemTable);
        dropSelf(TBSBlocks.BLUE_FENCE);
        dropSelf(TBSBlocks.BLUE_FENCE_GATE);
        add(TBSBlocks.BLUE_DOOR, this::createDoorTable);
        dropSelf(TBSBlocks.BLUE_TRAPDOOR);
        dropSelf(TBSBlocks.BLUE_PRESSURE_PLATE);
        dropSelf(TBSBlocks.BLUE_BUTTON);
        dropSelf(TBSBlocks.PURPLE_PLANKS);
        dropSelf(TBSBlocks.PURPLE_STAIRS);
        add(TBSBlocks.PURPLE_SLAB, this::createSlabItemTable);
        dropSelf(TBSBlocks.PURPLE_FENCE);
        dropSelf(TBSBlocks.PURPLE_FENCE_GATE);
        add(TBSBlocks.PURPLE_DOOR, this::createDoorTable);
        dropSelf(TBSBlocks.PURPLE_TRAPDOOR);
        dropSelf(TBSBlocks.PURPLE_PRESSURE_PLATE);
        dropSelf(TBSBlocks.PURPLE_BUTTON);
        dropSelf(TBSBlocks.MAGENTA_PLANKS);
        dropSelf(TBSBlocks.MAGENTA_STAIRS);
        add(TBSBlocks.MAGENTA_SLAB, this::createSlabItemTable);
        dropSelf(TBSBlocks.MAGENTA_FENCE);
        dropSelf(TBSBlocks.MAGENTA_FENCE_GATE);
        add(TBSBlocks.MAGENTA_DOOR, this::createDoorTable);
        dropSelf(TBSBlocks.MAGENTA_TRAPDOOR);
        dropSelf(TBSBlocks.MAGENTA_PRESSURE_PLATE);
        dropSelf(TBSBlocks.MAGENTA_BUTTON);
        dropSelf(TBSBlocks.PINK_PLANKS);
        dropSelf(TBSBlocks.PINK_STAIRS);
        add(TBSBlocks.PINK_SLAB, this::createSlabItemTable);
        dropSelf(TBSBlocks.PINK_FENCE);
        dropSelf(TBSBlocks.PINK_FENCE_GATE);
        add(TBSBlocks.PINK_DOOR, this::createDoorTable);
        dropSelf(TBSBlocks.PINK_TRAPDOOR);
        dropSelf(TBSBlocks.PINK_PRESSURE_PLATE);
        dropSelf(TBSBlocks.PINK_BUTTON);

        add(TBSBlocks.DARK_OAK_DOOR_WITH_WINDOWS, this::createDoorTable);
        dropSelf(TBSBlocks.DARK_OAK_TRAPDOOR_WITH_WINDOWS);

        dropSelf(TBSBlocks.CHERRY_BIRCH_STAIRS);
        add(TBSBlocks.CHERRY_BIRCH_SLAB, this::createSlabItemTable);
        dropSelf(TBSBlocks.GOLDEN_BIRCH_STAIRS);
        add(TBSBlocks.GOLDEN_BIRCH_SLAB, this::createSlabItemTable);

        dropSelf(TBSBlocks.CHERRY_BIRCH_BUTTON);
        dropSelf(TBSBlocks.CHERRY_BIRCH_PRESSURE_PLATE);
        dropSelf(TBSBlocks.GOLDEN_BIRCH_BUTTON);
        dropSelf(TBSBlocks.GOLDEN_BIRCH_PRESSURE_PLATE);

        dropSelf(TBSBlocks.CHERRY_BIRCH_FENCE);
        dropSelf(TBSBlocks.CHERRY_BIRCH_FENCE_GATE);
        dropSelf(TBSBlocks.GOLDEN_BIRCH_FENCE);
        dropSelf(TBSBlocks.GOLDEN_BIRCH_FENCE_GATE);

        add(TBSBlocks.CHERRY_BIRCH_DOOR, this::createDoorTable);
        add(TBSBlocks.GOLDEN_BIRCH_DOOR, this::createDoorTable);
        add(TBSBlocks.STONE_DOOR, this::createDoorTable);
        add(TBSBlocks.OBSIDIAN_DOOR, this::createDoorTable);
        dropSelf(TBSBlocks.CHERRY_BIRCH_TRAPDOOR);
        dropSelf(TBSBlocks.GOLDEN_BIRCH_TRAPDOOR);
        dropSelf(TBSBlocks.STONE_TRAPDOOR);
        dropSelf(TBSBlocks.OBSIDIAN_TRAPDOOR);

        dropSelf(TBSBlocks.CHERRY_BIRCH_LOG);
        dropSelf(TBSBlocks.CHERRY_BIRCH_WOOD);
        dropSelf(TBSBlocks.STRIPPED_CHERRY_BIRCH_LOG);
        dropSelf(TBSBlocks.STRIPPED_CHERRY_BIRCH_WOOD);
        dropSelf(TBSBlocks.CHERRY_BIRCH_PLANKS);
        //dropSelf(TBSBlocks.CHERRY_BIRCH_SAPLING);
        dropSelf(TBSBlocks.GOLDEN_BIRCH_LOG);
        dropSelf(TBSBlocks.GOLDEN_BIRCH_WOOD);
        dropSelf(TBSBlocks.STRIPPED_GOLDEN_BIRCH_LOG);
        dropSelf(TBSBlocks.STRIPPED_GOLDEN_BIRCH_WOOD);
        dropSelf(TBSBlocks.GOLDEN_BIRCH_PLANKS);
        //dropSelf(TBSBlocks.GOLDEN_BIRCH_SAPLING);

        //add(TBSBlocks.CHERRY_BIRCH_LEAVES, createLeavesDrops(TBSBlocks.CHERRY_BIRCH_LEAVES,
                //Blocks.CHERRY_SAPLING, 0.005F, 0.0055555557F, 0.00625F, 0.008333334F, 0.025F));
        //add(TBSBlocks.GOLDEN_BIRCH_LEAVES, createLeavesDrops(TBSBlocks.GOLDEN_BIRCH_LEAVES,
                //Blocks.CHERRY_SAPLING, 0.005F, 0.0055555557F, 0.00625F, 0.008333334F, 0.025F));

        //add(TheBedrockSMPBlocks.SHELFSHELF);

        dropSelf(TBSBlocks.SHELFSHELF);

        dropSelf(TBSBlocks.DIAMARITE_BLOCK);
        dropSelf(TBSBlocks.CORRUPTIONITE_BLOCK);

        dropSelf(TBSBlocks.BYZANTIUM_BLOCK);
        dropSelf(TBSBlocks.RAW_BYZANTIUM_BLOCK);

        add(TBSBlocks.BYZANTIUM_ORE, createMultipleOreDrops(TBSBlocks.BYZANTIUM_ORE, TBSItems.RAW_BYZANTIUM, 3, 6));
        add(TBSBlocks.DEEPSLATE_BYZANTIUM_ORE, createMultipleOreDrops(TBSBlocks.DEEPSLATE_BYZANTIUM_ORE, TBSItems.RAW_BYZANTIUM, 3, 6));

        dropSelf(TBSBlocks.DIAMARITE_CORE);

        dropSelf(TBSBlocks.GILDED_NETHERITE_BLOCK);

        dropSelf(TBSBlocks.ENERGY_BLOCK);

        dropSelf(TBSBlocks.GOLDEN_DEBRIS);

        dropSelf(TBSBlocks.WHITE_SHELF);
        dropSelf(TBSBlocks.LIGHT_GRAY_SHELF);
        dropSelf(TBSBlocks.GRAY_SHELF);
        dropSelf(TBSBlocks.BLACK_SHELF);
        dropSelf(TBSBlocks.BROWN_SHELF);
        dropSelf(TBSBlocks.RED_SHELF);
        dropSelf(TBSBlocks.ORANGE_SHELF);
        dropSelf(TBSBlocks.YELLOW_SHELF);
        dropSelf(TBSBlocks.LIME_SHELF);
        dropSelf(TBSBlocks.GREEN_SHELF);
        dropSelf(TBSBlocks.CYAN_SHELF);
        dropSelf(TBSBlocks.LIGHT_BLUE_SHELF);
        dropSelf(TBSBlocks.BLUE_SHELF);
        dropSelf(TBSBlocks.PURPLE_SHELF);
        dropSelf(TBSBlocks.MAGENTA_SHELF);
        dropSelf(TBSBlocks.PINK_SHELF);

        dropSelf(TBSBlocks.CHERRY_BIRCH_SHELF);
        dropSelf(TBSBlocks.GOLDEN_BIRCH_SHELF);

        dropSelf(TBSBlocks.CRIPTION_PLANKS);
        dropSelf(TBSBlocks.CRIPTION_STAIRS);
        add(TBSBlocks.CRIPTION_SLAB, this::createSlabItemTable);
        dropSelf(TBSBlocks.CRIPTION_FENCE);
        dropSelf(TBSBlocks.CRIPTION_FENCE_GATE);
        add(TBSBlocks.CRIPTION_DOOR, this::createDoorTable);
        dropSelf(TBSBlocks.CRIPTION_TRAPDOOR);
        dropSelf(TBSBlocks.CRIPTION_PRESSURE_PLATE);
        dropSelf(TBSBlocks.CRIPTION_BUTTON);

        dropSelf(TBSBlocks.CRIPTION_STEM);
        dropSelf(TBSBlocks.CRIPTION_HYPHAE);
        dropSelf(TBSBlocks.STRIPPED_CRIPTION_STEM);
        dropSelf(TBSBlocks.STRIPPED_CRIPTION_HYPHAE);

        dropSelf(TBSBlocks.CRIPTION_SHELF);
    }

    public LootTable.Builder createMultipleOreDrops(final Block block, Item item, float minDrops, float maxDrops) {
        HolderLookup.RegistryLookup<Enchantment> enchantments = this.registries.lookupOrThrow(Registries.ENCHANTMENT);

        return this.createSilkTouchDispatchTable(block, this.applyExplosionDecay(
                block, LootItem.lootTableItem(item)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(minDrops, maxDrops)))
                        .apply(ApplyBonusCount.addOreBonusCount(enchantments.getOrThrow(Enchantments.FORTUNE)))));
    }
}
