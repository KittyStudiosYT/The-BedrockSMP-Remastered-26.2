package net.itskittyyoutube.kitty.data;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.itskittyyoutube.kitty.block.TBSBlocks;
import net.itskittyyoutube.kitty.item.TBSItems;
import net.itskittyyoutube.kitty.material.TBSArmorMaterials;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.client.data.models.model.TexturedModel;

public class TBSModelProvider extends FabricModelProvider {
    public TBSModelProvider(FabricPackOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModelGenerators) {
        blockModelGenerators.createDoor(TBSBlocks.STONE_DOOR);
        blockModelGenerators.createDoor(TBSBlocks.BEDROCK_DOOR);
        blockModelGenerators.createDoor(TBSBlocks.OBSIDIAN_DOOR);
        blockModelGenerators.createOrientableTrapdoor(TBSBlocks.STONE_TRAPDOOR);
        blockModelGenerators.createOrientableTrapdoor(TBSBlocks.BEDROCK_TRAPDOOR);
        blockModelGenerators.createOrientableTrapdoor(TBSBlocks.OBSIDIAN_TRAPDOOR);
        blockModelGenerators.createTrivialCube(TBSBlocks.PLANKS_TEMPLATE);
        blockModelGenerators.family(TBSBlocks.WHITE_PLANKS)
                .stairs(TBSBlocks.WHITE_STAIRS)
                .slab(TBSBlocks.WHITE_SLAB)
                .button(TBSBlocks.WHITE_BUTTON)
                .pressurePlate(TBSBlocks.WHITE_PRESSURE_PLATE)
                .fence(TBSBlocks.WHITE_FENCE)
                .fenceGate(TBSBlocks.WHITE_FENCE_GATE);
        blockModelGenerators.createDoor(TBSBlocks.WHITE_DOOR);
        blockModelGenerators.createOrientableTrapdoor(TBSBlocks.WHITE_TRAPDOOR);
        blockModelGenerators.family(TBSBlocks.LIGHT_GRAY_PLANKS)
                .stairs(TBSBlocks.LIGHT_GRAY_STAIRS)
                .slab(TBSBlocks.LIGHT_GRAY_SLAB)
                .button(TBSBlocks.LIGHT_GRAY_BUTTON)
                .pressurePlate(TBSBlocks.LIGHT_GRAY_PRESSURE_PLATE)
                .fence(TBSBlocks.LIGHT_GRAY_FENCE)
                .fenceGate(TBSBlocks.LIGHT_GRAY_FENCE_GATE);
        blockModelGenerators.createDoor(TBSBlocks.LIGHT_GRAY_DOOR);
        blockModelGenerators.createOrientableTrapdoor(TBSBlocks.LIGHT_GRAY_TRAPDOOR);
        blockModelGenerators.family(TBSBlocks.GRAY_PLANKS)
                .stairs(TBSBlocks.GRAY_STAIRS)
                .slab(TBSBlocks.GRAY_SLAB)
                .button(TBSBlocks.GRAY_BUTTON)
                .pressurePlate(TBSBlocks.GRAY_PRESSURE_PLATE)
                .fence(TBSBlocks.GRAY_FENCE)
                .fenceGate(TBSBlocks.GRAY_FENCE_GATE);
        blockModelGenerators.createDoor(TBSBlocks.GRAY_DOOR);
        blockModelGenerators.createOrientableTrapdoor(TBSBlocks.GRAY_TRAPDOOR);
        blockModelGenerators.family(TBSBlocks.BLACK_PLANKS)
                .stairs(TBSBlocks.BLACK_STAIRS)
                .slab(TBSBlocks.BLACK_SLAB)
                .button(TBSBlocks.BLACK_BUTTON)
                .pressurePlate(TBSBlocks.BLACK_PRESSURE_PLATE)
                .fence(TBSBlocks.BLACK_FENCE)
                .fenceGate(TBSBlocks.BLACK_FENCE_GATE);
        blockModelGenerators.createDoor(TBSBlocks.BLACK_DOOR);
        blockModelGenerators.createOrientableTrapdoor(TBSBlocks.BLACK_TRAPDOOR);
        blockModelGenerators.family(TBSBlocks.BROWN_PLANKS)
                .stairs(TBSBlocks.BROWN_STAIRS)
                .slab(TBSBlocks.BROWN_SLAB)
                .button(TBSBlocks.BROWN_BUTTON)
                .pressurePlate(TBSBlocks.BROWN_PRESSURE_PLATE)
                .fence(TBSBlocks.BROWN_FENCE)
                .fenceGate(TBSBlocks.BROWN_FENCE_GATE);
        blockModelGenerators.createDoor(TBSBlocks.BROWN_DOOR);
        blockModelGenerators.createOrientableTrapdoor(TBSBlocks.BROWN_TRAPDOOR);
        blockModelGenerators.family(TBSBlocks.RED_PLANKS)
                .stairs(TBSBlocks.RED_STAIRS)
                .slab(TBSBlocks.RED_SLAB)
                .button(TBSBlocks.RED_BUTTON)
                .pressurePlate(TBSBlocks.RED_PRESSURE_PLATE)
                .fence(TBSBlocks.RED_FENCE)
                .fenceGate(TBSBlocks.RED_FENCE_GATE);
        blockModelGenerators.createDoor(TBSBlocks.RED_DOOR);
        blockModelGenerators.createOrientableTrapdoor(TBSBlocks.RED_TRAPDOOR);
        blockModelGenerators.family(TBSBlocks.ORANGE_PLANKS)
                .stairs(TBSBlocks.ORANGE_STAIRS)
                .slab(TBSBlocks.ORANGE_SLAB)
                .button(TBSBlocks.ORANGE_BUTTON)
                .pressurePlate(TBSBlocks.ORANGE_PRESSURE_PLATE)
                .fence(TBSBlocks.ORANGE_FENCE)
                .fenceGate(TBSBlocks.ORANGE_FENCE_GATE);
        blockModelGenerators.createDoor(TBSBlocks.ORANGE_DOOR);
        blockModelGenerators.createOrientableTrapdoor(TBSBlocks.ORANGE_TRAPDOOR);
        blockModelGenerators.family(TBSBlocks.YELLOW_PLANKS)
                .stairs(TBSBlocks.YELLOW_STAIRS)
                .slab(TBSBlocks.YELLOW_SLAB)
                .button(TBSBlocks.YELLOW_BUTTON)
                .pressurePlate(TBSBlocks.YELLOW_PRESSURE_PLATE)
                .fence(TBSBlocks.YELLOW_FENCE)
                .fenceGate(TBSBlocks.YELLOW_FENCE_GATE);
        blockModelGenerators.createDoor(TBSBlocks.YELLOW_DOOR);
        blockModelGenerators.createOrientableTrapdoor(TBSBlocks.YELLOW_TRAPDOOR);
        blockModelGenerators.family(TBSBlocks.LIME_PLANKS)
                .stairs(TBSBlocks.LIME_STAIRS)
                .slab(TBSBlocks.LIME_SLAB)
                .button(TBSBlocks.LIME_BUTTON)
                .pressurePlate(TBSBlocks.LIME_PRESSURE_PLATE)
                .fence(TBSBlocks.LIME_FENCE)
                .fenceGate(TBSBlocks.LIME_FENCE_GATE);
        blockModelGenerators.createDoor(TBSBlocks.LIME_DOOR);
        blockModelGenerators.createOrientableTrapdoor(TBSBlocks.LIME_TRAPDOOR);
        blockModelGenerators.family(TBSBlocks.GREEN_PLANKS)
                .stairs(TBSBlocks.GREEN_STAIRS)
                .slab(TBSBlocks.GREEN_SLAB)
                .button(TBSBlocks.GREEN_BUTTON)
                .pressurePlate(TBSBlocks.GREEN_PRESSURE_PLATE)
                .fence(TBSBlocks.GREEN_FENCE)
                .fenceGate(TBSBlocks.GREEN_FENCE_GATE);
        blockModelGenerators.createDoor(TBSBlocks.GREEN_DOOR);
        blockModelGenerators.createOrientableTrapdoor(TBSBlocks.GREEN_TRAPDOOR);
        blockModelGenerators.family(TBSBlocks.CYAN_PLANKS)
                .stairs(TBSBlocks.CYAN_STAIRS)
                .slab(TBSBlocks.CYAN_SLAB)
                .button(TBSBlocks.CYAN_BUTTON)
                .pressurePlate(TBSBlocks.CYAN_PRESSURE_PLATE)
                .fence(TBSBlocks.CYAN_FENCE)
                .fenceGate(TBSBlocks.CYAN_FENCE_GATE);
        blockModelGenerators.createDoor(TBSBlocks.CYAN_DOOR);
        blockModelGenerators.createOrientableTrapdoor(TBSBlocks.CYAN_TRAPDOOR);
        blockModelGenerators.family(TBSBlocks.LIGHT_BLUE_PLANKS)
                .stairs(TBSBlocks.LIGHT_BLUE_STAIRS)
                .slab(TBSBlocks.LIGHT_BLUE_SLAB)
                .button(TBSBlocks.LIGHT_BLUE_BUTTON)
                .pressurePlate(TBSBlocks.LIGHT_BLUE_PRESSURE_PLATE)
                .fence(TBSBlocks.LIGHT_BLUE_FENCE)
                .fenceGate(TBSBlocks.LIGHT_BLUE_FENCE_GATE);
        blockModelGenerators.createDoor(TBSBlocks.LIGHT_BLUE_DOOR);
        blockModelGenerators.createOrientableTrapdoor(TBSBlocks.LIGHT_BLUE_TRAPDOOR);
        blockModelGenerators.family(TBSBlocks.BLUE_PLANKS)
                .stairs(TBSBlocks.BLUE_STAIRS)
                .slab(TBSBlocks.BLUE_SLAB)
                .button(TBSBlocks.BLUE_BUTTON)
                .pressurePlate(TBSBlocks.BLUE_PRESSURE_PLATE)
                .fence(TBSBlocks.BLUE_FENCE)
                .fenceGate(TBSBlocks.BLUE_FENCE_GATE);
        blockModelGenerators.createDoor(TBSBlocks.BLUE_DOOR);
        blockModelGenerators.createOrientableTrapdoor(TBSBlocks.BLUE_TRAPDOOR);
        blockModelGenerators.family(TBSBlocks.PURPLE_PLANKS)
                .stairs(TBSBlocks.PURPLE_STAIRS)
                .slab(TBSBlocks.PURPLE_SLAB)
                .button(TBSBlocks.PURPLE_BUTTON)
                .pressurePlate(TBSBlocks.PURPLE_PRESSURE_PLATE)
                .fence(TBSBlocks.PURPLE_FENCE)
                .fenceGate(TBSBlocks.PURPLE_FENCE_GATE);
        blockModelGenerators.createDoor(TBSBlocks.PURPLE_DOOR);
        blockModelGenerators.createOrientableTrapdoor(TBSBlocks.PURPLE_TRAPDOOR);
        blockModelGenerators.family(TBSBlocks.MAGENTA_PLANKS)
                .stairs(TBSBlocks.MAGENTA_STAIRS)
                .slab(TBSBlocks.MAGENTA_SLAB)
                .button(TBSBlocks.MAGENTA_BUTTON)
                .pressurePlate(TBSBlocks.MAGENTA_PRESSURE_PLATE)
                .fence(TBSBlocks.MAGENTA_FENCE)
                .fenceGate(TBSBlocks.MAGENTA_FENCE_GATE);
        blockModelGenerators.createDoor(TBSBlocks.MAGENTA_DOOR);
        blockModelGenerators.createOrientableTrapdoor(TBSBlocks.MAGENTA_TRAPDOOR);
        blockModelGenerators.family(TBSBlocks.PINK_PLANKS)
                .stairs(TBSBlocks.PINK_STAIRS)
                .slab(TBSBlocks.PINK_SLAB)
                .button(TBSBlocks.PINK_BUTTON)
                .pressurePlate(TBSBlocks.PINK_PRESSURE_PLATE)
                .fence(TBSBlocks.PINK_FENCE)
                .fenceGate(TBSBlocks.PINK_FENCE_GATE);
        blockModelGenerators.createDoor(TBSBlocks.PINK_DOOR);
        blockModelGenerators.createOrientableTrapdoor(TBSBlocks.PINK_TRAPDOOR);
        blockModelGenerators.createDoor(TBSBlocks.DARK_OAK_DOOR_WITH_WINDOWS);
        blockModelGenerators.createOrientableTrapdoor(TBSBlocks.DARK_OAK_TRAPDOOR_WITH_WINDOWS);
        blockModelGenerators.family(TBSBlocks.CHERRY_BIRCH_PLANKS)
                .stairs(TBSBlocks.CHERRY_BIRCH_STAIRS)
                .slab(TBSBlocks.CHERRY_BIRCH_SLAB)
                .button(TBSBlocks.CHERRY_BIRCH_BUTTON)
                .pressurePlate(TBSBlocks.CHERRY_BIRCH_PRESSURE_PLATE)
                .fence(TBSBlocks.CHERRY_BIRCH_FENCE)
                .fenceGate(TBSBlocks.CHERRY_BIRCH_FENCE_GATE);
        blockModelGenerators.createDoor(TBSBlocks.CHERRY_BIRCH_DOOR);
        blockModelGenerators.createOrientableTrapdoor(TBSBlocks.CHERRY_BIRCH_TRAPDOOR);
        blockModelGenerators.family(TBSBlocks.GOLDEN_BIRCH_PLANKS)
                .stairs(TBSBlocks.GOLDEN_BIRCH_STAIRS)
                .slab(TBSBlocks.GOLDEN_BIRCH_SLAB)
                .button(TBSBlocks.GOLDEN_BIRCH_BUTTON)
                .pressurePlate(TBSBlocks.GOLDEN_BIRCH_PRESSURE_PLATE)
                .fence(TBSBlocks.GOLDEN_BIRCH_FENCE)
                .fenceGate(TBSBlocks.GOLDEN_BIRCH_FENCE_GATE);
        blockModelGenerators.createDoor(TBSBlocks.GOLDEN_BIRCH_DOOR);
        blockModelGenerators.createOrientableTrapdoor(TBSBlocks.GOLDEN_BIRCH_TRAPDOOR);

        blockModelGenerators.woodProvider(TBSBlocks.CHERRY_BIRCH_LOG).logUVLocked(TBSBlocks.CHERRY_BIRCH_LOG).wood(TBSBlocks.CHERRY_BIRCH_WOOD);
        blockModelGenerators.woodProvider(TBSBlocks.STRIPPED_CHERRY_BIRCH_LOG).logUVLocked(TBSBlocks.STRIPPED_CHERRY_BIRCH_LOG).wood(TBSBlocks.STRIPPED_CHERRY_BIRCH_WOOD);
        blockModelGenerators.woodProvider(TBSBlocks.GOLDEN_BIRCH_LOG).logUVLocked(TBSBlocks.GOLDEN_BIRCH_LOG).wood(TBSBlocks.GOLDEN_BIRCH_WOOD);
        blockModelGenerators.woodProvider(TBSBlocks.STRIPPED_GOLDEN_BIRCH_LOG).logUVLocked(TBSBlocks.STRIPPED_GOLDEN_BIRCH_LOG).wood(TBSBlocks.STRIPPED_GOLDEN_BIRCH_WOOD);

        //blockModelGenerators.createTrivialBlock(TBSBlocks.CHERRY_BIRCH_LEAVES, TexturedModel.LEAVES);
        //blockModelGenerators.createPlantWithDefaultItem(TBSBlocks.CHERRY_BIRCH_SAPLING, null, BlockModelGenerators.PlantType.NOT_TINTED);
        //blockModelGenerators.createTrivialBlock(TBSBlocks.GOLDEN_BIRCH_LEAVES, TexturedModel.LEAVES);
        //blockModelGenerators.createPlantWithDefaultItem(TBSBlocks.GOLDEN_BIRCH_SAPLING, null, BlockModelGenerators.PlantType.NOT_TINTED);

        //blockModelGenerators.registerShelf(TheBedrockSMPBlocks.SHELFSHELF, TheBedrockSMPBlocks.BLUE_PLANKS);

        blockModelGenerators.createTrivialCube(TBSBlocks.DIAMARITE_BLOCK);
        blockModelGenerators.createTrivialCube(TBSBlocks.CORRUPTIONITE_BLOCK);

        blockModelGenerators.createTrivialCube(TBSBlocks.BYZANTIUM_BLOCK);
        blockModelGenerators.createTrivialCube(TBSBlocks.RAW_BYZANTIUM_BLOCK);

        blockModelGenerators.createTrivialCube(TBSBlocks.BYZANTIUM_ORE);
        blockModelGenerators.createTrivialCube(TBSBlocks.DEEPSLATE_BYZANTIUM_ORE);

        blockModelGenerators.createTrivialCube(TBSBlocks.GILDED_NETHERITE_BLOCK);

        blockModelGenerators.createTrivialBlock(TBSBlocks.GOLDEN_DEBRIS, TexturedModel.COLUMN);

        //blockModelGenerators.registerShelf(TBSBlocks.SHELFSHELF, TBSBlocks.BLUE_PLANKS);

        blockModelGenerators.createShelf(TBSBlocks.SHELFSHELF, TBSBlocks.BLUE_PLANKS);

        blockModelGenerators.createShelf(TBSBlocks.WHITE_SHELF, TBSBlocks.WHITE_PLANKS);
        blockModelGenerators.createShelf(TBSBlocks.LIGHT_GRAY_SHELF, TBSBlocks.LIGHT_GRAY_PLANKS);
        blockModelGenerators.createShelf(TBSBlocks.GRAY_SHELF, TBSBlocks.GRAY_PLANKS);
        blockModelGenerators.createShelf(TBSBlocks.BLACK_SHELF, TBSBlocks.BLACK_PLANKS);
        blockModelGenerators.createShelf(TBSBlocks.BROWN_SHELF, TBSBlocks.BROWN_PLANKS);
        blockModelGenerators.createShelf(TBSBlocks.RED_SHELF, TBSBlocks.RED_PLANKS);
        blockModelGenerators.createShelf(TBSBlocks.ORANGE_SHELF, TBSBlocks.ORANGE_PLANKS);
        blockModelGenerators.createShelf(TBSBlocks.YELLOW_SHELF, TBSBlocks.YELLOW_PLANKS);
        blockModelGenerators.createShelf(TBSBlocks.LIME_SHELF, TBSBlocks.LIME_PLANKS);
        blockModelGenerators.createShelf(TBSBlocks.GREEN_SHELF, TBSBlocks.GREEN_PLANKS);
        blockModelGenerators.createShelf(TBSBlocks.CYAN_SHELF, TBSBlocks.CYAN_PLANKS);
        blockModelGenerators.createShelf(TBSBlocks.LIGHT_BLUE_SHELF, TBSBlocks.LIGHT_BLUE_PLANKS);
        blockModelGenerators.createShelf(TBSBlocks.BLUE_SHELF, TBSBlocks.BLUE_PLANKS);
        blockModelGenerators.createShelf(TBSBlocks.PURPLE_SHELF, TBSBlocks.PURPLE_PLANKS);
        blockModelGenerators.createShelf(TBSBlocks.MAGENTA_SHELF, TBSBlocks.MAGENTA_PLANKS);
        blockModelGenerators.createShelf(TBSBlocks.PINK_SHELF, TBSBlocks.PINK_PLANKS);

        blockModelGenerators.createShelf(TBSBlocks.CHERRY_BIRCH_SHELF, TBSBlocks.STRIPPED_CHERRY_BIRCH_LOG);
        blockModelGenerators.createShelf(TBSBlocks.GOLDEN_BIRCH_SHELF, TBSBlocks.STRIPPED_GOLDEN_BIRCH_LOG);

        blockModelGenerators.family(TBSBlocks.CRIPTION_PLANKS)
                .stairs(TBSBlocks.CRIPTION_STAIRS)
                .slab(TBSBlocks.CRIPTION_SLAB)
                .button(TBSBlocks.CRIPTION_BUTTON)
                .pressurePlate(TBSBlocks.CRIPTION_PRESSURE_PLATE)
                .fence(TBSBlocks.CRIPTION_FENCE)
                .fenceGate(TBSBlocks.CRIPTION_FENCE_GATE);
        blockModelGenerators.createDoor(TBSBlocks.CRIPTION_DOOR);
        blockModelGenerators.createOrientableTrapdoor(TBSBlocks.CRIPTION_TRAPDOOR);

        blockModelGenerators.woodProvider(TBSBlocks.CRIPTION_STEM).logUVLocked(TBSBlocks.CRIPTION_STEM).wood(TBSBlocks.CRIPTION_HYPHAE);
        blockModelGenerators.woodProvider(TBSBlocks.STRIPPED_CRIPTION_STEM).logUVLocked(TBSBlocks.STRIPPED_CRIPTION_STEM).wood(TBSBlocks.STRIPPED_CRIPTION_HYPHAE);

        blockModelGenerators.createShelf(TBSBlocks.CRIPTION_SHELF, TBSBlocks.STRIPPED_CRIPTION_STEM);
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {
        itemModelGenerators.generateFlatItem(TBSItems.MUSIC_DISC_TEMPLATE, ModelTemplates.FLAT_ITEM);

        itemModelGenerators.generateFlatItem(TBSItems.MUSIC_DISC_THE_TALE_OF_TOOTHLESS, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.MUSIC_DISC_THE_BYE_JUSTIN_HI_JUSTIN_RAP, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.MUSIC_DISC_STEVE_LAVA_CHICKEN, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.MUSIC_DISC_LAVA_TEARSSTEP, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.MUSIC_DISC_TERRIFYING_TEARS, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.MUSIC_DISC_BETTERSIDE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.MUSIC_DISC_12, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.MUSIC_DISC_THE_BYE_JUSTIN_HI_JUSTIN_RAP_REMASTERED, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.MUSIC_DISC_EXPLORER, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.ALREADY_AHEAD, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.DARK_INSIDE, ModelTemplates.FLAT_ITEM);

        itemModelGenerators.generateFlatItem(TBSItems.MUSIC_DISC_REVERSED_THE_TALE_OF_TOOTHLESS, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.MUSIC_DISC_REVERSED_THE_BYE_JUSTIN_HI_JUSTIN_RAP, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.MUSIC_DISC_REVERSED_STEVE_LAVA_CHICKEN, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.MUSIC_DISC_REVERSED_LAVA_TEARSSTEP, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.MUSIC_DISC_REVERSED_TERRIFYING_TEARS, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.MUSIC_DISC_REVERSED_BETTERSIDE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.MUSIC_DISC_REVERSED_12, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.MUSIC_DISC_REVERSED_THE_BYE_JUSTIN_HI_JUSTIN_RAP_REMASTERED, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.MUSIC_DISC_REVERSED_EXPLORER, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.REVERSED_ALREADY_AHEAD, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.REVERSED_DARK_INSIDE, ModelTemplates.FLAT_ITEM);

        itemModelGenerators.generateFlatItem(TBSItems.PANCAKE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.WAFFLE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.REVERSED_PANCAKE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.REVERSED_WAFFLE, ModelTemplates.FLAT_ITEM);

        itemModelGenerators.generateFlatItem(TBSItems.BEDROCKSMP_ICON, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.CURSED_EMERALD, ModelTemplates.FLAT_ITEM);

        //itemModelGenerators.generateFlatItem(TBSBlocks.CHERRY_BIRCH_SAPLING.asItem(), ModelTemplates.FLAT_ITEM);
        //itemModelGenerators.generateFlatItem(TBSBlocks.GOLDEN_BIRCH_SAPLING.asItem(), ModelTemplates.FLAT_ITEM);

        itemModelGenerators.generateFlatItem(TBSItems.STEEL_INGOT, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.STEEL_ROD, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.REINFORCED_PAPER, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.MONEY, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.YOUTUBE_LOGO, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.SILVER_PLAY_BUTTON, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.GOLDEN_PLAY_BUTTON, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.DIAMOND_PLAY_BUTTON, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.NETHERITE_ROD, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.DIAMARITE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.DIAMARITE_INGOT, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.CORRUPTIONITE_INGOT, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.DIAMOND_INGOT, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.AMETHYST_INGOT, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.CHARD_INGOT, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.BURNT_INGOT, ModelTemplates.FLAT_ITEM);

        itemModelGenerators.generateFlatItem(TBSItems.BYZANTIUM_INGOT, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.BYZANTIUM_NUGGET, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.RAW_BYZANTIUM, ModelTemplates.FLAT_ITEM);

        itemModelGenerators.generateFlatItem(TBSItems.GILDED_NETHERITE_INGOT, ModelTemplates.FLAT_ITEM);

        itemModelGenerators.generateFlatItem(TBSItems.GOLDEN_SCRAP, ModelTemplates.FLAT_ITEM);

        itemModelGenerators.generateFlatItem(TBSItems.DUCT_TAPE, ModelTemplates.FLAT_ITEM);

        itemModelGenerators.generateFlatItem(TBSItems.ENERGY_NUGGET, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.ENERGY_GEM, ModelTemplates.FLAT_ITEM);

        itemModelGenerators.generateFlatItem(TBSItems.DREADITE_GEM, ModelTemplates.FLAT_ITEM);

        itemModelGenerators.generateFlatItem(TBSItems.STEEL_SWORD, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.STEEL_SHOVEL, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.STEEL_PICKAXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.STEEL_AXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.STEEL_HOE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.KATARA_KNIFE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.DIAMARITE_SWORD, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.DIAMARITE_SHOVEL, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.DIAMARITE_PICKAXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.DIAMARITE_AXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.DIAMARITE_HOE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.CORRUPTIONITE_SWORD, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.CORRUPTIONITE_SHOVEL, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.CORRUPTIONITE_PICKAXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.CORRUPTIONITE_AXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.CORRUPTIONITE_HOE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.BYZANTIUM_SWORD, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.BYZANTIUM_SHOVEL, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.BYZANTIUM_PICKAXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.BYZANTIUM_AXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.BYZANTIUM_HOE, ModelTemplates.FLAT_HANDHELD_ITEM);

        itemModelGenerators.generateFlatItem(TBSItems.WOODEN_DAGGER, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.COPPER_DAGGER, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.STONE_DAGGER, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.GOLDEN_DAGGER, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.BYZANTIUM_DAGGER, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.IRON_DAGGER, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.STEEL_DAGGER, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.DIAMOND_DAGGER, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.NETHERITE_DAGGER, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.DIAMARITE_DAGGER, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.CORRUPTIONITE_DAGGER, ModelTemplates.FLAT_HANDHELD_ITEM);

        itemModelGenerators.generateFlatItem(TBSItems.HANDLE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.NETHERITE_HANDLE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.STEEL_HANDLE, ModelTemplates.FLAT_HANDHELD_ITEM);

        itemModelGenerators.generateFlatItem(TBSItems.ENERGY_ROD, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.ENERGY_HANDLE, ModelTemplates.FLAT_HANDHELD_ITEM);

        itemModelGenerators.generateFlatItem(TBSItems.WOODEN_SICKLE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.COPPER_SICKLE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.STONE_SICKLE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.GOLDEN_SICKLE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.BYZANTIUM_SICKLE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.IRON_SICKLE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.STEEL_SICKLE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.DIAMOND_SICKLE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.NETHERITE_SICKLE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.DIAMARITE_SICKLE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.CORRUPTIONITE_SICKLE, ModelTemplates.FLAT_HANDHELD_ITEM);

        itemModelGenerators.generateFlatItem(TBSItems.WOODEN_KATANA, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.COPPER_KATANA, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.STONE_KATANA, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.GOLDEN_KATANA, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.BYZANTIUM_KATANA, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.IRON_KATANA, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.STEEL_KATANA, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.DIAMOND_KATANA, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.NETHERITE_KATANA, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.DIAMARITE_KATANA, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.CORRUPTIONITE_KATANA, ModelTemplates.FLAT_HANDHELD_ITEM);

        itemModelGenerators.generateFlatItem(TBSItems.WOODEN_SCYTHE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.COPPER_SCYTHE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.STONE_SCYTHE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.GOLDEN_SCYTHE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.BYZANTIUM_SCYTHE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.IRON_SCYTHE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.STEEL_SCYTHE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.DIAMOND_SCYTHE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.NETHERITE_SCYTHE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.DIAMARITE_SCYTHE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.CORRUPTIONITE_SCYTHE, ModelTemplates.FLAT_HANDHELD_ITEM);

        itemModelGenerators.generateFlatItem(TBSItems.DIAMARITE_MACE, ModelTemplates.FLAT_HANDHELD_MACE_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.DOUBLED_MACE, ModelTemplates.FLAT_HANDHELD_MACE_ITEM);

        itemModelGenerators.generateFlatItem(TBSItems.GILDED_NETHERITE_SWORD, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.GILDED_NETHERITE_SHOVEL, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.GILDED_NETHERITE_PICKAXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.GILDED_NETHERITE_AXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.GILDED_NETHERITE_HOE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.GILDED_NETHERITE_DAGGER, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.GILDED_NETHERITE_SICKLE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.GILDED_NETHERITE_KATANA, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.GILDED_NETHERITE_SCYTHE, ModelTemplates.FLAT_HANDHELD_ITEM);

        itemModelGenerators.generateSpear(TBSItems.STEEL_SPEAR);
        itemModelGenerators.generateSpear(TBSItems.BYZANTIUM_SPEAR);
        itemModelGenerators.generateSpear(TBSItems.GILDED_NETHERITE_SPEAR);
        itemModelGenerators.generateSpear(TBSItems.DIAMARITE_SPEAR);
        itemModelGenerators.generateSpear(TBSItems.CORRUPTIONITE_SPEAR);

        itemModelGenerators.generateFlatItem(TBSItems.ENERGY_SWORD, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.ENERGY_SHOVEL, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.ENERGY_PICKAXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.ENERGY_AXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.ENERGY_HOE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.ENERGY_DAGGER, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateSpear(TBSItems.ENERGY_SPEAR);
        itemModelGenerators.generateFlatItem(TBSItems.ENERGY_SICKLE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.ENERGY_KATANA, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(TBSItems.ENERGY_SCYTHE, ModelTemplates.FLAT_HANDHELD_ITEM);

        itemModelGenerators.generateTrimmableItem(TBSItems.DIAMARITE_HELMET, TBSArmorMaterials.DIAMARITE_KEY, ItemModelGenerators.TRIM_PREFIX_HELMET, false);
        itemModelGenerators.generateTrimmableItem(TBSItems.DIAMARITE_CHESTPLATE, TBSArmorMaterials.DIAMARITE_KEY, ItemModelGenerators.TRIM_PREFIX_CHESTPLATE, false);
        itemModelGenerators.generateTrimmableItem(TBSItems.DIAMARITE_LEGGINGS, TBSArmorMaterials.DIAMARITE_KEY, ItemModelGenerators.TRIM_PREFIX_LEGGINGS, false);
        itemModelGenerators.generateTrimmableItem(TBSItems.DIAMARITE_BOOTS, TBSArmorMaterials.DIAMARITE_KEY, ItemModelGenerators.TRIM_PREFIX_BOOTS, false);
        itemModelGenerators.generateTrimmableItem(TBSItems.CORRUPTIONITE_HELMET, TBSArmorMaterials.CORRUPTIONITE_KEY, ItemModelGenerators.TRIM_PREFIX_HELMET, false);
        itemModelGenerators.generateTrimmableItem(TBSItems.CORRUPTIONITE_CHESTPLATE, TBSArmorMaterials.CORRUPTIONITE_KEY, ItemModelGenerators.TRIM_PREFIX_CHESTPLATE, false);
        itemModelGenerators.generateTrimmableItem(TBSItems.CORRUPTIONITE_LEGGINGS, TBSArmorMaterials.CORRUPTIONITE_KEY, ItemModelGenerators.TRIM_PREFIX_LEGGINGS, false);
        itemModelGenerators.generateTrimmableItem(TBSItems.CORRUPTIONITE_BOOTS, TBSArmorMaterials.CORRUPTIONITE_KEY, ItemModelGenerators.TRIM_PREFIX_BOOTS, false);
        itemModelGenerators.generateTrimmableItem(TBSItems.BYZANTIUM_HELMET, TBSArmorMaterials.BYZANTIUM_KEY, ItemModelGenerators.TRIM_PREFIX_HELMET, false);
        itemModelGenerators.generateTrimmableItem(TBSItems.BYZANTIUM_CHESTPLATE, TBSArmorMaterials.BYZANTIUM_KEY, ItemModelGenerators.TRIM_PREFIX_CHESTPLATE, false);
        itemModelGenerators.generateTrimmableItem(TBSItems.BYZANTIUM_LEGGINGS, TBSArmorMaterials.BYZANTIUM_KEY, ItemModelGenerators.TRIM_PREFIX_LEGGINGS, false);
        itemModelGenerators.generateTrimmableItem(TBSItems.BYZANTIUM_BOOTS, TBSArmorMaterials.BYZANTIUM_KEY, ItemModelGenerators.TRIM_PREFIX_BOOTS, false);

        itemModelGenerators.generateTrimmableItem(TBSItems.GILDED_NETHERITE_HELMET, TBSArmorMaterials.GILDED_NETHERITE_KEY, ItemModelGenerators.TRIM_PREFIX_HELMET, false);
        itemModelGenerators.generateTrimmableItem(TBSItems.GILDED_NETHERITE_CHESTPLATE, TBSArmorMaterials.GILDED_NETHERITE_KEY, ItemModelGenerators.TRIM_PREFIX_CHESTPLATE, false);
        itemModelGenerators.generateTrimmableItem(TBSItems.GILDED_NETHERITE_LEGGINGS, TBSArmorMaterials.GILDED_NETHERITE_KEY, ItemModelGenerators.TRIM_PREFIX_LEGGINGS, false);
        itemModelGenerators.generateTrimmableItem(TBSItems.GILDED_NETHERITE_BOOTS, TBSArmorMaterials.GILDED_NETHERITE_KEY, ItemModelGenerators.TRIM_PREFIX_BOOTS, false);

        itemModelGenerators.generateTrimmableItem(TBSItems.ENERGY_HELMET, TBSArmorMaterials.ENERGY_KEY, ItemModelGenerators.TRIM_PREFIX_HELMET, false);
        itemModelGenerators.generateTrimmableItem(TBSItems.ENERGY_CHESTPLATE, TBSArmorMaterials.ENERGY_KEY, ItemModelGenerators.TRIM_PREFIX_CHESTPLATE, false);
        itemModelGenerators.generateTrimmableItem(TBSItems.ENERGY_LEGGINGS, TBSArmorMaterials.ENERGY_KEY, ItemModelGenerators.TRIM_PREFIX_LEGGINGS, false);
        itemModelGenerators.generateTrimmableItem(TBSItems.ENERGY_BOOTS, TBSArmorMaterials.ENERGY_KEY, ItemModelGenerators.TRIM_PREFIX_BOOTS, false);

        itemModelGenerators.generateTrimmableItem(TBSItems.DREADITE_HELMET, TBSArmorMaterials.DREADITE_KEY, ItemModelGenerators.TRIM_PREFIX_HELMET, false);
        itemModelGenerators.generateTrimmableItem(TBSItems.DREADITE_CHESTPLATE, TBSArmorMaterials.DREADITE_KEY, ItemModelGenerators.TRIM_PREFIX_CHESTPLATE, false);
        itemModelGenerators.generateTrimmableItem(TBSItems.DREADITE_LEGGINGS, TBSArmorMaterials.DREADITE_KEY, ItemModelGenerators.TRIM_PREFIX_LEGGINGS, false);
        itemModelGenerators.generateTrimmableItem(TBSItems.DREADITE_BOOTS, TBSArmorMaterials.DREADITE_KEY, ItemModelGenerators.TRIM_PREFIX_BOOTS, false);
    }
}
