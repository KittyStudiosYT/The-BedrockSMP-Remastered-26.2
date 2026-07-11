package net.itskittyyoutube.kitty.block;

import net.itskittyyoutube.kitty.TBS;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.BlockEntityTypes;
import net.minecraft.world.level.block.entity.ShelfBlockEntity;

import java.lang.reflect.Field;

public class TBSBlockEntities {
    public static BlockEntityType<ShelfBlockEntity> SHELFSHELF;

    public static BlockEntityType<ShelfBlockEntity> WHITE_SHELF;
    public static BlockEntityType<ShelfBlockEntity> LIGHT_GRAY_SHELF;
    public static BlockEntityType<ShelfBlockEntity> GRAY_SHELF;
    public static BlockEntityType<ShelfBlockEntity> BLACK_SHELF;
    public static BlockEntityType<ShelfBlockEntity> BROWN_SHELF;
    public static BlockEntityType<ShelfBlockEntity> RED_SHELF;
    public static BlockEntityType<ShelfBlockEntity> ORANGE_SHELF;
    public static BlockEntityType<ShelfBlockEntity> YELLOW_SHELF;
    public static BlockEntityType<ShelfBlockEntity> LIME_SHELF;
    public static BlockEntityType<ShelfBlockEntity> GREEN_SHELF;
    public static BlockEntityType<ShelfBlockEntity> CYAN_SHELF;
    public static BlockEntityType<ShelfBlockEntity> LIGHT_BLUE_SHELF;
    public static BlockEntityType<ShelfBlockEntity> BLUE_SHELF;
    public static BlockEntityType<ShelfBlockEntity> PURPLE_SHELF;
    public static BlockEntityType<ShelfBlockEntity> MAGENTA_SHELF;
    public static BlockEntityType<ShelfBlockEntity> PINK_SHELF;

    public static BlockEntityType<ShelfBlockEntity> CHERRY_BIRCH_SHELF;
    public static BlockEntityType<ShelfBlockEntity> GOLDEN_BIRCH_SHELF;

    public static BlockEntityType<ShelfBlockEntity> CRIPTION_SHELF;

    public static void register() {}

    // This will be called AFTER ModBlocks.registerModBlocks() to add our blocks to VANILLA block entity types
    public static void registerSignBlockEntities() {
        // Find the 'blocks' field by its type (Set<Block>) instead of by name
        // This works in both dev and production without needing to know the exact field name
        try {
            Field blocksField = null;
            for (Field field : BlockEntityType.class.getDeclaredFields()) {
                // Look for a Set field that's not static and not final
                // The blocks field is an instance field that we can modify
                if (java.util.Set.class.isAssignableFrom(field.getType()) &&
                        !java.lang.reflect.Modifier.isStatic(field.getModifiers())) {
                    field.setAccessible(true);
                    // Verify it contains blocks by checking if we can get it from a known BlockEntityType
                    try {
                        Object value = field.get(BlockEntityTypes.SIGN);
                        if (value instanceof java.util.Set) {
                            blocksField = field;
                            break;
                        }
                    } catch (Exception ignored) {
                        // Not the right field, keep looking
                    }
                }
            }

            if (blocksField == null) {
                throw new RuntimeException("Could not find blocks field in BlockEntityType");
            }

            if (TBS.DEBUG_MODE) {
                TBS.LOGGER.info("Found blocks field: {}", blocksField.getName());
            }

            // The blocks Set is immutable, so we need to create a new mutable Set with our blocks added
            @SuppressWarnings("unchecked")
            java.util.Set<net.minecraft.world.level.block.Block> originalSignBlocks =
                    (java.util.Set<net.minecraft.world.level.block.Block>) blocksField.get(BlockEntityTypes.SIGN);
            java.util.Set<net.minecraft.world.level.block.Block> newSignBlocks = new java.util.HashSet<>(originalSignBlocks);
            blocksField.set(BlockEntityTypes.SIGN, newSignBlocks);

            @SuppressWarnings("unchecked")
            java.util.Set<net.minecraft.world.level.block.Block> originalHangingSignBlocks =
                    (java.util.Set<net.minecraft.world.level.block.Block>) blocksField.get(BlockEntityTypes.HANGING_SIGN);
            java.util.Set<net.minecraft.world.level.block.Block> newHangingSignBlocks = new java.util.HashSet<>(originalHangingSignBlocks);
            blocksField.set(BlockEntityTypes.HANGING_SIGN, newHangingSignBlocks);

            @SuppressWarnings("unchecked")
            java.util.Set<net.minecraft.world.level.block.Block> originalShelfBlocks =
                    (java.util.Set<net.minecraft.world.level.block.Block>) blocksField.get(BlockEntityTypes.SHELF);
            java.util.Set<net.minecraft.world.level.block.Block> newShelfBlocks = new java.util.HashSet<>(originalShelfBlocks);
            newShelfBlocks.add(TBSBlocks.SHELFSHELF);

            newShelfBlocks.add(TBSBlocks.WHITE_SHELF);
            newShelfBlocks.add(TBSBlocks.LIGHT_GRAY_SHELF);
            newShelfBlocks.add(TBSBlocks.GRAY_SHELF);
            newShelfBlocks.add(TBSBlocks.BLACK_SHELF);
            newShelfBlocks.add(TBSBlocks.BROWN_SHELF);
            newShelfBlocks.add(TBSBlocks.RED_SHELF);
            newShelfBlocks.add(TBSBlocks.ORANGE_SHELF);
            newShelfBlocks.add(TBSBlocks.YELLOW_SHELF);
            newShelfBlocks.add(TBSBlocks.LIME_SHELF);
            newShelfBlocks.add(TBSBlocks.GREEN_SHELF);
            newShelfBlocks.add(TBSBlocks.CYAN_SHELF);
            newShelfBlocks.add(TBSBlocks.LIGHT_BLUE_SHELF);
            newShelfBlocks.add(TBSBlocks.BLUE_SHELF);
            newShelfBlocks.add(TBSBlocks.PURPLE_SHELF);
            newShelfBlocks.add(TBSBlocks.MAGENTA_SHELF);
            newShelfBlocks.add(TBSBlocks.PINK_SHELF);

            newShelfBlocks.add(TBSBlocks.CHERRY_BIRCH_SHELF);
            newShelfBlocks.add(TBSBlocks.GOLDEN_BIRCH_SHELF);

            newShelfBlocks.add(TBSBlocks.CRIPTION_SHELF);
            blocksField.set(BlockEntityTypes.SHELF, newShelfBlocks);

            if (TBS.DEBUG_MODE) {
                TBS.LOGGER.info("Successfully added custom sign and shelf blocks to vanilla block entity types");
            }
        } catch (Exception e) {
            throw new RuntimeException("Failed to add custom sign and shelf blocks to vanilla block entity types", e);
        }

        // Store references to vanilla types for convenience (used by renderers on client)
        SHELFSHELF = BlockEntityTypes.SHELF;

        WHITE_SHELF = BlockEntityTypes.SHELF;
        LIGHT_GRAY_SHELF = BlockEntityTypes.SHELF;
        GRAY_SHELF = BlockEntityTypes.SHELF;
        BLACK_SHELF = BlockEntityTypes.SHELF;
        BROWN_SHELF = BlockEntityTypes.SHELF;
        RED_SHELF = BlockEntityTypes.SHELF;
        ORANGE_SHELF = BlockEntityTypes.SHELF;
        YELLOW_SHELF = BlockEntityTypes.SHELF;
        LIME_SHELF = BlockEntityTypes.SHELF;
        GREEN_SHELF = BlockEntityTypes.SHELF;
        CYAN_SHELF = BlockEntityTypes.SHELF;
        LIGHT_BLUE_SHELF = BlockEntityTypes.SHELF;
        BLUE_SHELF = BlockEntityTypes.SHELF;
        PURPLE_SHELF = BlockEntityTypes.SHELF;
        MAGENTA_SHELF = BlockEntityTypes.SHELF;
        PINK_SHELF = BlockEntityTypes.SHELF;

        CHERRY_BIRCH_SHELF = BlockEntityTypes.SHELF;
        GOLDEN_BIRCH_SHELF = BlockEntityTypes.SHELF;

        CRIPTION_SHELF = BlockEntityTypes.SHELF;
    }
}