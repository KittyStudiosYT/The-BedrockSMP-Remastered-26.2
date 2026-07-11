package net.itskittyyoutube.kitty.block;

import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.itskittyyoutube.kitty.TBS;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;

import java.util.function.Function;

public class TBSBlocks {
    //Planks
    public static final Block PLANKS_TEMPLATE = registerBlock("planks_template",
            properties -> new Block(properties.instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final Block WHITE_PLANKS = registerBlock("white_planks",
            properties -> new Block(properties.instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final Block LIGHT_GRAY_PLANKS = registerBlock("light_gray_planks",
            properties -> new Block(properties.instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final Block GRAY_PLANKS = registerBlock("gray_planks",
            properties -> new Block(properties.instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final Block BLACK_PLANKS = registerBlock("black_planks",
            properties -> new Block(properties.instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final Block BROWN_PLANKS = registerBlock("brown_planks",
            properties -> new Block(properties.instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final Block RED_PLANKS = registerBlock("red_planks",
            properties -> new Block(properties.instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final Block ORANGE_PLANKS = registerBlock("orange_planks",
            properties -> new Block(properties.instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final Block YELLOW_PLANKS = registerBlock("yellow_planks",
            properties -> new Block(properties.instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final Block LIME_PLANKS = registerBlock("lime_planks",
            properties -> new Block(properties.instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final Block GREEN_PLANKS = registerBlock("green_planks",
            properties -> new Block(properties.instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final Block CYAN_PLANKS = registerBlock("cyan_planks",
            properties -> new Block(properties.instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final Block LIGHT_BLUE_PLANKS = registerBlock("light_blue_planks",
            properties -> new Block(properties.instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final Block BLUE_PLANKS = registerBlock("blue_planks",
            properties -> new Block(properties.instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final Block PURPLE_PLANKS = registerBlock("purple_planks",
            properties -> new Block(properties.instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final Block MAGENTA_PLANKS = registerBlock("magenta_planks",
            properties -> new Block(properties.instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final Block PINK_PLANKS = registerBlock("pink_planks",
            properties -> new Block(properties.instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final Block CHERRY_BIRCH_PLANKS = registerBlock("cherry_birch_planks",
            properties -> new Block(properties.instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final Block GOLDEN_BIRCH_PLANKS = registerBlock("golden_birch_planks",
            properties -> new Block(properties.instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));

    public static final Block CRIPTION_PLANKS = registerBlock("cription_planks",
            properties -> new Block(properties.instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F).sound(SoundType.NETHER_WOOD)));

    //Doors
    public static final Block WHITE_DOOR = registerBlock("white_door",
            properties -> new DoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .noOcclusion().ignitedByLava().pushReaction(PushReaction.DESTROY).sound(SoundType.WOOD)));
    public static final Block LIGHT_GRAY_DOOR = registerBlock("light_gray_door",
            properties -> new DoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .noOcclusion().ignitedByLava().pushReaction(PushReaction.DESTROY).sound(SoundType.WOOD)));
    public static final Block GRAY_DOOR = registerBlock("gray_door",
            properties -> new DoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .noOcclusion().ignitedByLava().pushReaction(PushReaction.DESTROY).sound(SoundType.WOOD)));
    public static final Block BLACK_DOOR = registerBlock("black_door",
            properties -> new DoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .noOcclusion().ignitedByLava().pushReaction(PushReaction.DESTROY).sound(SoundType.WOOD)));
    public static final Block BROWN_DOOR = registerBlock("brown_door",
            properties -> new DoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .noOcclusion().ignitedByLava().pushReaction(PushReaction.DESTROY).sound(SoundType.WOOD)));
    public static final Block RED_DOOR = registerBlock("red_door",
            properties -> new DoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .noOcclusion().ignitedByLava().pushReaction(PushReaction.DESTROY).sound(SoundType.WOOD)));
    public static final Block ORANGE_DOOR = registerBlock("orange_door",
            properties -> new DoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .noOcclusion().ignitedByLava().pushReaction(PushReaction.DESTROY).sound(SoundType.WOOD)));
    public static final Block YELLOW_DOOR = registerBlock("yellow_door",
            properties -> new DoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .noOcclusion().ignitedByLava().pushReaction(PushReaction.DESTROY).sound(SoundType.WOOD)));
    public static final Block LIME_DOOR = registerBlock("lime_door",
            properties -> new DoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .noOcclusion().ignitedByLava().pushReaction(PushReaction.DESTROY).sound(SoundType.WOOD)));
    public static final Block GREEN_DOOR = registerBlock("green_door",
            properties -> new DoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .noOcclusion().ignitedByLava().pushReaction(PushReaction.DESTROY).sound(SoundType.WOOD)));
    public static final Block CYAN_DOOR = registerBlock("cyan_door",
            properties -> new DoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .noOcclusion().ignitedByLava().pushReaction(PushReaction.DESTROY).sound(SoundType.WOOD)));
    public static final Block LIGHT_BLUE_DOOR = registerBlock("light_blue_door",
            properties -> new DoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .noOcclusion().ignitedByLava().pushReaction(PushReaction.DESTROY).sound(SoundType.WOOD)));
    public static final Block BLUE_DOOR = registerBlock("blue_door",
            properties -> new DoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .noOcclusion().ignitedByLava().pushReaction(PushReaction.DESTROY).sound(SoundType.WOOD)));
    public static final Block PURPLE_DOOR = registerBlock("purple_door",
            properties -> new DoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .noOcclusion().ignitedByLava().pushReaction(PushReaction.DESTROY).sound(SoundType.WOOD)));
    public static final Block MAGENTA_DOOR = registerBlock("magenta_door",
            properties -> new DoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .noOcclusion().ignitedByLava().pushReaction(PushReaction.DESTROY).sound(SoundType.WOOD)));
    public static final Block PINK_DOOR = registerBlock("pink_door",
            properties -> new DoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .noOcclusion().ignitedByLava().pushReaction(PushReaction.DESTROY).sound(SoundType.WOOD)));
    public static final Block DARK_OAK_DOOR_WITH_WINDOWS = registerBlock("dark_oak_door_with_windows",
            properties -> new DoorBlock(BlockSetType.DARK_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .noOcclusion().ignitedByLava().pushReaction(PushReaction.DESTROY)));
    public static final Block STONE_DOOR = registerBlock("stone_door",
            properties -> new DoorBlock(BlockSetType.STONE, properties.mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F).pushReaction(PushReaction.DESTROY).sound(SoundType.STONE)));
    public static final Block BEDROCK_DOOR = registerBlock("bedrock_door",
            properties -> new DoorBlock(BlockSetType.STONE, properties.mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(-1.0F, 3600000.0F).pushReaction(PushReaction.DESTROY)
                    .noLootTable().isValidSpawn(Blocks::never).sound(SoundType.STONE)));
    public static final Block OBSIDIAN_DOOR = registerBlock("obsidian_door",
            properties -> new DoorBlock(BlockSetType.STONE, properties.mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().strength(50.0F, 1200.0F).pushReaction(PushReaction.DESTROY)
                    .isValidSpawn(Blocks::never).sound(SoundType.STONE)));
    public static final Block CHERRY_BIRCH_DOOR = registerBlock("cherry_birch_door",
            properties -> new DoorBlock(BlockSetType.CHERRY, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .noOcclusion().ignitedByLava().pushReaction(PushReaction.DESTROY).sound(SoundType.WOOD)));
    public static final Block GOLDEN_BIRCH_DOOR = registerBlock("golden_birch_door",
            properties -> new DoorBlock(BlockSetType.CHERRY, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .noOcclusion().ignitedByLava().pushReaction(PushReaction.DESTROY).sound(SoundType.WOOD)));

    public static final Block CRIPTION_DOOR = registerBlock("cription_door",
            properties -> new DoorBlock(BlockSetType.WARPED, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .noOcclusion().pushReaction(PushReaction.DESTROY).sound(SoundType.NETHER_WOOD)));


    //Trapdoors
    public static final Block WHITE_TRAPDOOR = registerBlock("white_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .noOcclusion().isValidSpawn(Blocks::never).ignitedByLava().sound(SoundType.WOOD)));
    public static final Block LIGHT_GRAY_TRAPDOOR = registerBlock("light_gray_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .noOcclusion().isValidSpawn(Blocks::never).ignitedByLava().sound(SoundType.WOOD)));
    public static final Block GRAY_TRAPDOOR = registerBlock("gray_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .noOcclusion().isValidSpawn(Blocks::never).ignitedByLava().sound(SoundType.WOOD)));
    public static final Block BLACK_TRAPDOOR = registerBlock("black_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .noOcclusion().isValidSpawn(Blocks::never).ignitedByLava().sound(SoundType.WOOD)));
    public static final Block BROWN_TRAPDOOR = registerBlock("brown_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .noOcclusion().isValidSpawn(Blocks::never).ignitedByLava().sound(SoundType.WOOD)));
    public static final Block RED_TRAPDOOR = registerBlock("red_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .noOcclusion().isValidSpawn(Blocks::never).ignitedByLava().sound(SoundType.WOOD)));
    public static final Block ORANGE_TRAPDOOR = registerBlock("orange_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .noOcclusion().isValidSpawn(Blocks::never).ignitedByLava().sound(SoundType.WOOD)));
    public static final Block YELLOW_TRAPDOOR = registerBlock("yellow_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .noOcclusion().isValidSpawn(Blocks::never).ignitedByLava().sound(SoundType.WOOD)));
    public static final Block LIME_TRAPDOOR = registerBlock("lime_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .noOcclusion().isValidSpawn(Blocks::never).ignitedByLava().sound(SoundType.WOOD)));
    public static final Block GREEN_TRAPDOOR = registerBlock("green_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .noOcclusion().isValidSpawn(Blocks::never).ignitedByLava().sound(SoundType.WOOD)));
    public static final Block CYAN_TRAPDOOR = registerBlock("cyan_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .noOcclusion().isValidSpawn(Blocks::never).ignitedByLava().sound(SoundType.WOOD)));
    public static final Block LIGHT_BLUE_TRAPDOOR = registerBlock("light_blue_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .noOcclusion().isValidSpawn(Blocks::never).ignitedByLava().sound(SoundType.WOOD)));
    public static final Block BLUE_TRAPDOOR = registerBlock("blue_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .noOcclusion().isValidSpawn(Blocks::never).ignitedByLava().sound(SoundType.WOOD)));
    public static final Block PURPLE_TRAPDOOR = registerBlock("purple_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .noOcclusion().isValidSpawn(Blocks::never).ignitedByLava().sound(SoundType.WOOD)));
    public static final Block MAGENTA_TRAPDOOR = registerBlock("magenta_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .noOcclusion().isValidSpawn(Blocks::never).ignitedByLava().sound(SoundType.WOOD)));
    public static final Block PINK_TRAPDOOR = registerBlock("pink_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .noOcclusion().isValidSpawn(Blocks::never).ignitedByLava().sound(SoundType.WOOD)));
    public static final Block DARK_OAK_TRAPDOOR_WITH_WINDOWS = registerBlock("dark_oak_trapdoor_with_windows",
            properties -> new TrapDoorBlock(BlockSetType.DARK_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .noOcclusion().isValidSpawn(Blocks::never).ignitedByLava()));
    public static final Block STONE_TRAPDOOR = registerBlock("stone_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.STONE, properties.mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F).isValidSpawn(Blocks::never).sound(SoundType.STONE)));
    public static final Block BEDROCK_TRAPDOOR = registerBlock("bedrock_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.STONE, properties.mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(-1.0F, 3600000.0F).noLootTable().isValidSpawn(Blocks::never).sound(SoundType.STONE)));
    public static final Block OBSIDIAN_TRAPDOOR = registerBlock("obsidian_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.STONE, properties.mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().strength(50.0F, 1200.0F).isValidSpawn(Blocks::never).sound(SoundType.STONE)));
    public static final Block CHERRY_BIRCH_TRAPDOOR = registerBlock("cherry_birch_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.CHERRY, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .noOcclusion().isValidSpawn(Blocks::never).ignitedByLava().sound(SoundType.WOOD)));
    public static final Block GOLDEN_BIRCH_TRAPDOOR = registerBlock("golden_birch_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.CHERRY, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .noOcclusion().isValidSpawn(Blocks::never).ignitedByLava().sound(SoundType.WOOD)));

    public static final Block CRIPTION_TRAPDOOR = registerBlock("cription_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.WARPED, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .noOcclusion().isValidSpawn(Blocks::never).sound(SoundType.NETHER_WOOD)));

    //Buttons
    public static final Block WHITE_BUTTON = registerBlock("white_button",
            properties -> new ButtonBlock(BlockSetType.PALE_OAK, 30, properties.strength(0.6F)
                    .noCollision().sound(SoundType.WOOD)));
    public static final Block LIGHT_GRAY_BUTTON = registerBlock("light_gray_button",
            properties -> new ButtonBlock(BlockSetType.PALE_OAK, 30, properties.strength(0.6F)
                    .noCollision().sound(SoundType.WOOD)));
    public static final Block GRAY_BUTTON = registerBlock("gray_button",
            properties -> new ButtonBlock(BlockSetType.PALE_OAK, 30, properties.strength(0.6F)
                    .noCollision().sound(SoundType.WOOD)));
    public static final Block BLACK_BUTTON = registerBlock("black_button",
            properties -> new ButtonBlock(BlockSetType.PALE_OAK, 30, properties.strength(0.6F)
                    .noCollision().sound(SoundType.WOOD)));
    public static final Block BROWN_BUTTON = registerBlock("brown_button",
            properties -> new ButtonBlock(BlockSetType.PALE_OAK, 30, properties.strength(0.6F)
                    .noCollision().sound(SoundType.WOOD)));
    public static final Block RED_BUTTON = registerBlock("red_button",
            properties -> new ButtonBlock(BlockSetType.PALE_OAK, 30, properties.strength(0.6F)
                    .noCollision().sound(SoundType.WOOD)));
    public static final Block ORANGE_BUTTON = registerBlock("orange_button",
            properties -> new ButtonBlock(BlockSetType.PALE_OAK, 30, properties.strength(0.6F)
                    .noCollision().sound(SoundType.WOOD)));
    public static final Block YELLOW_BUTTON = registerBlock("yellow_button",
            properties -> new ButtonBlock(BlockSetType.PALE_OAK, 30, properties.strength(0.6F)
                    .noCollision().sound(SoundType.WOOD)));
    public static final Block LIME_BUTTON = registerBlock("lime_button",
            properties -> new ButtonBlock(BlockSetType.PALE_OAK, 30, properties.strength(0.6F)
                    .noCollision().sound(SoundType.WOOD)));
    public static final Block GREEN_BUTTON = registerBlock("green_button",
            properties -> new ButtonBlock(BlockSetType.PALE_OAK, 30, properties.strength(0.6F)
                    .noCollision().sound(SoundType.WOOD)));
    public static final Block CYAN_BUTTON = registerBlock("cyan_button",
            properties -> new ButtonBlock(BlockSetType.PALE_OAK, 30, properties.strength(0.6F)
                    .noCollision().sound(SoundType.WOOD)));
    public static final Block LIGHT_BLUE_BUTTON = registerBlock("light_blue_button",
            properties -> new ButtonBlock(BlockSetType.PALE_OAK, 30, properties.strength(0.6F)
                    .noCollision().sound(SoundType.WOOD)));
    public static final Block BLUE_BUTTON = registerBlock("blue_button",
            properties -> new ButtonBlock(BlockSetType.PALE_OAK, 30, properties.strength(0.6F)
                    .noCollision().sound(SoundType.WOOD)));
    public static final Block PURPLE_BUTTON = registerBlock("purple_button",
            properties -> new ButtonBlock(BlockSetType.PALE_OAK, 30, properties.strength(0.6F)
                    .noCollision().sound(SoundType.WOOD)));
    public static final Block MAGENTA_BUTTON = registerBlock("magenta_button",
            properties -> new ButtonBlock(BlockSetType.PALE_OAK, 30, properties.strength(0.6F)
                    .noCollision().sound(SoundType.WOOD)));
    public static final Block PINK_BUTTON = registerBlock("pink_button",
            properties -> new ButtonBlock(BlockSetType.PALE_OAK, 30, properties.strength(0.6F)
                    .noCollision().sound(SoundType.WOOD)));
    public static final Block CHERRY_BIRCH_BUTTON = registerBlock("cherry_birch_button",
            properties -> new ButtonBlock(BlockSetType.CHERRY, 30, properties.strength(0.6F)
                    .noCollision().sound(SoundType.WOOD)));
    public static final Block GOLDEN_BIRCH_BUTTON = registerBlock("golden_birch_button",
            properties -> new ButtonBlock(BlockSetType.CHERRY, 30, properties.strength(0.6F)
                    .noCollision().sound(SoundType.WOOD)));

    public static final Block CRIPTION_BUTTON = registerBlock("cription_button",
            properties -> new ButtonBlock(BlockSetType.WARPED, 30, properties.strength(0.6F)
                    .noCollision().sound(SoundType.NETHER_WOOD)));

    //Pressure Plates
    public static final Block WHITE_PRESSURE_PLATE = registerBlock("white_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.PALE_OAK, properties.strength(0.5F)
                    .sound(SoundType.WOOD)));
    public static final Block LIGHT_GRAY_PRESSURE_PLATE = registerBlock("light_gray_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.PALE_OAK, properties.strength(0.5F)
                    .sound(SoundType.WOOD)));
    public static final Block GRAY_PRESSURE_PLATE = registerBlock("gray_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.PALE_OAK, properties.strength(0.5F)
                    .sound(SoundType.WOOD)));
    public static final Block BLACK_PRESSURE_PLATE = registerBlock("black_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.PALE_OAK, properties.strength(0.5F)
                    .sound(SoundType.WOOD)));
    public static final Block BROWN_PRESSURE_PLATE = registerBlock("brown_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.PALE_OAK, properties.strength(0.5F)
                    .sound(SoundType.WOOD)));
    public static final Block RED_PRESSURE_PLATE = registerBlock("red_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.PALE_OAK, properties.strength(0.5F)
                    .sound(SoundType.WOOD)));
    public static final Block ORANGE_PRESSURE_PLATE = registerBlock("orange_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.PALE_OAK, properties.strength(0.5F)
                    .sound(SoundType.WOOD)));
    public static final Block YELLOW_PRESSURE_PLATE = registerBlock("yellow_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.PALE_OAK, properties.strength(0.5F)
                    .sound(SoundType.WOOD)));
    public static final Block LIME_PRESSURE_PLATE = registerBlock("lime_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.PALE_OAK, properties.strength(0.5F)
                    .sound(SoundType.WOOD)));
    public static final Block GREEN_PRESSURE_PLATE = registerBlock("green_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.PALE_OAK, properties.strength(0.5F)
                    .sound(SoundType.WOOD)));
    public static final Block CYAN_PRESSURE_PLATE = registerBlock("cyan_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.PALE_OAK, properties.strength(0.5F)
                    .sound(SoundType.WOOD)));
    public static final Block LIGHT_BLUE_PRESSURE_PLATE = registerBlock("light_blue_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.PALE_OAK, properties.strength(0.5F)
                    .sound(SoundType.WOOD)));
    public static final Block BLUE_PRESSURE_PLATE = registerBlock("blue_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.PALE_OAK, properties.strength(0.5F)
                    .sound(SoundType.WOOD)));
    public static final Block PURPLE_PRESSURE_PLATE = registerBlock("purple_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.PALE_OAK, properties.strength(0.5F)
                    .sound(SoundType.WOOD)));
    public static final Block MAGENTA_PRESSURE_PLATE = registerBlock("magenta_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.PALE_OAK, properties.strength(0.5F)
                    .sound(SoundType.WOOD)));
    public static final Block PINK_PRESSURE_PLATE = registerBlock("pink_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.PALE_OAK, properties.strength(0.5F)
                    .sound(SoundType.WOOD)));
    public static final Block CHERRY_BIRCH_PRESSURE_PLATE = registerBlock("cherry_birch_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.CHERRY, properties.strength(0.5F)
                    .sound(SoundType.WOOD)));
    public static final Block GOLDEN_BIRCH_PRESSURE_PLATE = registerBlock("golden_birch_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.CHERRY, properties.strength(0.5F)
                    .sound(SoundType.WOOD)));

    public static final Block CRIPTION_PRESSURE_PLATE = registerBlock("cription_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.WARPED, properties.strength(0.5F)
                    .sound(SoundType.NETHER_WOOD)));

    //Stairs
    public static final Block WHITE_STAIRS = registerBlock("white_stairs",
            properties -> new StairBlock(TBSBlocks.WHITE_PLANKS.defaultBlockState(),
                    properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block LIGHT_GRAY_STAIRS = registerBlock("light_gray_stairs",
            properties -> new StairBlock(TBSBlocks.LIGHT_GRAY_PLANKS.defaultBlockState(),
                    properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block GRAY_STAIRS = registerBlock("gray_stairs",
            properties -> new StairBlock(TBSBlocks.GRAY_PLANKS.defaultBlockState(),
                    properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block BLACK_STAIRS = registerBlock("black_stairs",
            properties -> new StairBlock(TBSBlocks.BLACK_PLANKS.defaultBlockState(),
                    properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block BROWN_STAIRS = registerBlock("brown_stairs",
            properties -> new StairBlock(TBSBlocks.BROWN_PLANKS.defaultBlockState(),
                    properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block RED_STAIRS = registerBlock("red_stairs",
            properties -> new StairBlock(TBSBlocks.RED_PLANKS.defaultBlockState(),
                    properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block ORANGE_STAIRS = registerBlock("orange_stairs",
            properties -> new StairBlock(TBSBlocks.ORANGE_PLANKS.defaultBlockState(),
                    properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block YELLOW_STAIRS = registerBlock("yellow_stairs",
            properties -> new StairBlock(TBSBlocks.YELLOW_PLANKS.defaultBlockState(),
                    properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block LIME_STAIRS = registerBlock("lime_stairs",
            properties -> new StairBlock(TBSBlocks.LIME_PLANKS.defaultBlockState(),
                    properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block GREEN_STAIRS = registerBlock("green_stairs",
            properties -> new StairBlock(TBSBlocks.GREEN_PLANKS.defaultBlockState(),
                    properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block CYAN_STAIRS = registerBlock("cyan_stairs",
            properties -> new StairBlock(TBSBlocks.CYAN_PLANKS.defaultBlockState(),
                    properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block LIGHT_BLUE_STAIRS = registerBlock("light_blue_stairs",
            properties -> new StairBlock(TBSBlocks.LIGHT_BLUE_PLANKS.defaultBlockState(),
                    properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block BLUE_STAIRS = registerBlock("blue_stairs",
            properties -> new StairBlock(TBSBlocks.BLUE_PLANKS.defaultBlockState(),
                    properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block PURPLE_STAIRS = registerBlock("purple_stairs",
            properties -> new StairBlock(TBSBlocks.PURPLE_PLANKS.defaultBlockState(),
                    properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block MAGENTA_STAIRS = registerBlock("magenta_stairs",
            properties -> new StairBlock(TBSBlocks.MAGENTA_PLANKS.defaultBlockState(),
                    properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block PINK_STAIRS = registerBlock("pink_stairs",
            properties -> new StairBlock(TBSBlocks.PINK_PLANKS.defaultBlockState(),
                    properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block CHERRY_BIRCH_STAIRS = registerBlock("cherry_birch_stairs",
            properties -> new StairBlock(TBSBlocks.CHERRY_BIRCH_PLANKS.defaultBlockState(),
                    properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block GOLDEN_BIRCH_STAIRS = registerBlock("golden_birch_stairs",
            properties -> new StairBlock(TBSBlocks.CHERRY_BIRCH_PLANKS.defaultBlockState(),
                    properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    public static final Block CRIPTION_STAIRS = registerBlock("cription_stairs",
            properties -> new StairBlock(TBSBlocks.CRIPTION_PLANKS.defaultBlockState(),
                    properties.strength(2.0F, 3.0F).sound(SoundType.NETHER_WOOD)));

    //Slabs
    public static final Block WHITE_SLAB = registerBlock("white_slab",
            properties -> new SlabBlock(properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block LIGHT_GRAY_SLAB = registerBlock("light_gray_slab",
            properties -> new SlabBlock(properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block GRAY_SLAB = registerBlock("gray_slab",
            properties -> new SlabBlock(properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block BLACK_SLAB = registerBlock("black_slab",
            properties -> new SlabBlock(properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block BROWN_SLAB = registerBlock("brown_slab",
            properties -> new SlabBlock(properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block RED_SLAB = registerBlock("red_slab",
            properties -> new SlabBlock(properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block ORANGE_SLAB = registerBlock("orange_slab",
            properties -> new SlabBlock(properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block YELLOW_SLAB = registerBlock("yellow_slab",
            properties -> new SlabBlock(properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block LIME_SLAB = registerBlock("lime_slab",
            properties -> new SlabBlock(properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block GREEN_SLAB = registerBlock("green_slab",
            properties -> new SlabBlock(properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block CYAN_SLAB = registerBlock("cyan_slab",
            properties -> new SlabBlock(properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block LIGHT_BLUE_SLAB = registerBlock("light_blue_slab",
            properties -> new SlabBlock(properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block BLUE_SLAB = registerBlock("blue_slab",
            properties -> new SlabBlock(properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block PURPLE_SLAB = registerBlock("purple_slab",
            properties -> new SlabBlock(properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block MAGENTA_SLAB = registerBlock("magenta_slab",
            properties -> new SlabBlock(properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block PINK_SLAB = registerBlock("pink_slab",
            properties -> new SlabBlock(properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block CHERRY_BIRCH_SLAB = registerBlock("cherry_birch_slab",
            properties -> new SlabBlock(properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block GOLDEN_BIRCH_SLAB = registerBlock("golden_birch_slab",
            properties -> new SlabBlock(properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    public static final Block CRIPTION_SLAB = registerBlock("cription_slab",
            properties -> new SlabBlock(properties.strength(2.0F, 3.0F).sound(SoundType.NETHER_WOOD)));

    //Fences
    public static final Block WHITE_FENCE = registerBlock("white_fence",
            properties -> new FenceBlock(properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block LIGHT_GRAY_FENCE = registerBlock("light_gray_fence",
            properties -> new FenceBlock(properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block GRAY_FENCE = registerBlock("gray_fence",
            properties -> new FenceBlock(properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block BLACK_FENCE = registerBlock("black_fence",
            properties -> new FenceBlock(properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block BROWN_FENCE = registerBlock("brown_fence",
            properties -> new FenceBlock(properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block RED_FENCE = registerBlock("red_fence",
            properties -> new FenceBlock(properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block ORANGE_FENCE = registerBlock("orange_fence",
            properties -> new FenceBlock(properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block YELLOW_FENCE = registerBlock("yellow_fence",
            properties -> new FenceBlock(properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block LIME_FENCE = registerBlock("lime_fence",
            properties -> new FenceBlock(properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block GREEN_FENCE = registerBlock("green_fence",
            properties -> new FenceBlock(properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block CYAN_FENCE = registerBlock("cyan_fence",
            properties -> new FenceBlock(properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block LIGHT_BLUE_FENCE = registerBlock("light_blue_fence",
            properties -> new FenceBlock(properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block BLUE_FENCE = registerBlock("blue_fence",
            properties -> new FenceBlock(properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block PURPLE_FENCE = registerBlock("purple_fence",
            properties -> new FenceBlock(properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block MAGENTA_FENCE = registerBlock("magenta_fence",
            properties -> new FenceBlock(properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block PINK_FENCE = registerBlock("pink_fence",
            properties -> new FenceBlock(properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block CHERRY_BIRCH_FENCE = registerBlock("cherry_birch_fence",
            properties -> new FenceBlock(properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block GOLDEN_BIRCH_FENCE = registerBlock("golden_birch_fence",
            properties -> new FenceBlock(properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    public static final Block CRIPTION_FENCE = registerBlock("cription_fence",
            properties -> new FenceBlock(properties.strength(2.0F, 3.0F).sound(SoundType.NETHER_WOOD)));

    //Fence Gates
    public static final Block WHITE_FENCE_GATE = registerBlock("white_fence_gate",
            properties -> new FenceGateBlock(WoodType.PALE_OAK, properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block LIGHT_GRAY_FENCE_GATE = registerBlock("light_gray_fence_gate",
            properties -> new FenceGateBlock(WoodType.PALE_OAK, properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block GRAY_FENCE_GATE = registerBlock("gray_fence_gate",
            properties -> new FenceGateBlock(WoodType.PALE_OAK, properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block BLACK_FENCE_GATE = registerBlock("black_fence_gate",
            properties -> new FenceGateBlock(WoodType.PALE_OAK, properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block BROWN_FENCE_GATE = registerBlock("brown_fence_gate",
            properties -> new FenceGateBlock(WoodType.PALE_OAK, properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block RED_FENCE_GATE = registerBlock("red_fence_gate",
            properties -> new FenceGateBlock(WoodType.PALE_OAK, properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block ORANGE_FENCE_GATE = registerBlock("orange_fence_gate",
            properties -> new FenceGateBlock(WoodType.PALE_OAK, properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block YELLOW_FENCE_GATE = registerBlock("yellow_fence_gate",
            properties -> new FenceGateBlock(WoodType.PALE_OAK, properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block LIME_FENCE_GATE = registerBlock("lime_fence_gate",
            properties -> new FenceGateBlock(WoodType.PALE_OAK, properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block GREEN_FENCE_GATE = registerBlock("green_fence_gate",
            properties -> new FenceGateBlock(WoodType.PALE_OAK, properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block CYAN_FENCE_GATE = registerBlock("cyan_fence_gate",
            properties -> new FenceGateBlock(WoodType.PALE_OAK, properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block LIGHT_BLUE_FENCE_GATE = registerBlock("light_blue_fence_gate",
            properties -> new FenceGateBlock(WoodType.PALE_OAK, properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block BLUE_FENCE_GATE = registerBlock("blue_fence_gate",
            properties -> new FenceGateBlock(WoodType.PALE_OAK, properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block PURPLE_FENCE_GATE = registerBlock("purple_fence_gate",
            properties -> new FenceGateBlock(WoodType.PALE_OAK, properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block MAGENTA_FENCE_GATE = registerBlock("magenta_fence_gate",
            properties -> new FenceGateBlock(WoodType.PALE_OAK, properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block PINK_FENCE_GATE = registerBlock("pink_fence_gate",
            properties -> new FenceGateBlock(WoodType.PALE_OAK, properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block CHERRY_BIRCH_FENCE_GATE = registerBlock("cherry_birch_fence_gate",
            properties -> new FenceGateBlock(WoodType.CHERRY, properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block GOLDEN_BIRCH_FENCE_GATE = registerBlock("golden_birch_fence_gate",
            properties -> new FenceGateBlock(WoodType.CHERRY, properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    public static final Block CRIPTION_FENCE_GATE = registerBlock("cription_fence_gate",
            properties -> new FenceGateBlock(WoodType.WARPED, properties.strength(2.0F, 3.0F).sound(SoundType.NETHER_WOOD)));

    //Leaves
    //public static final Block CHERRY_BIRCH_LEAVES = registerBlock("cherry_birch_leaves",
            //properties -> new UntintedParticleLeavesBlock(0.1F, ParticleTypes.CHERRY_LEAVES, properties
                    //.mapColor(MapColor.COLOR_PINK)
                    //.strength(0.2F)
                    //.randomTicks()
                    //.sound(SoundType.CHERRY_LEAVES)
                    //.noOcclusion()
                    //.isValidSpawn(Blocks::ocelotOrParrot)
                    //.isSuffocating(Blocks::never)
                    //.isViewBlocking(Blocks::never)
                    //.ignitedByLava()
                    //.pushReaction(PushReaction.DESTROY)
                    //.isRedstoneConductor(Blocks::never)));
    //public static final Block GOLDEN_BIRCH_LEAVES = registerBlock("golden_birch_leaves",
            //properties -> new UntintedParticleLeavesBlock(0.1F, ParticleTypes.CHERRY_LEAVES, properties
                    //.mapColor(MapColor.GOLD)
                    //.strength(0.2F)
                    //.randomTicks()
                    //.sound(SoundType.CHERRY_LEAVES)
                    //.noOcclusion()
                    //.isValidSpawn(Blocks::ocelotOrParrot)
                    //.isSuffocating(Blocks::never)
                    //.isViewBlocking(Blocks::never)
                    //.ignitedByLava()
                    //.pushReaction(PushReaction.DESTROY)
                    //.isRedstoneConductor(Blocks::never)));

    //Logs
    public static final Block CHERRY_BIRCH_LOG = registerBlock("cherry_birch_log",
            logProperties -> new RotatedPillarBlock(logProperties
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .mapColor(MapColor.TERRACOTTA_GRAY)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F).sound(SoundType.CHERRY_WOOD).ignitedByLava()));
    public static final Block STRIPPED_CHERRY_BIRCH_LOG = registerBlock("stripped_cherry_birch_log",
            logProperties -> new RotatedPillarBlock(logProperties
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .mapColor(MapColor.TERRACOTTA_GRAY)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F).sound(SoundType.CHERRY_WOOD).ignitedByLava()));
    public static final Block GOLDEN_BIRCH_LOG = registerBlock("golden_birch_log",
            logProperties -> new RotatedPillarBlock(logProperties
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .mapColor(MapColor.TERRACOTTA_YELLOW)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F).sound(SoundType.CHERRY_WOOD).ignitedByLava()));
    public static final Block STRIPPED_GOLDEN_BIRCH_LOG = registerBlock("stripped_golden_birch_log",
            logProperties -> new RotatedPillarBlock(logProperties
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .mapColor(MapColor.TERRACOTTA_YELLOW)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F).sound(SoundType.CHERRY_WOOD).ignitedByLava()));

    public static final Block CRIPTION_STEM = registerBlock("cription_stem",
            netherStemProperties -> new RotatedPillarBlock(netherStemProperties
                    .mapColor(MapColor.WARPED_STEM)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F).sound(SoundType.STEM)));
    public static final Block STRIPPED_CRIPTION_STEM = registerBlock("stripped_cription_stem",
            netherStemProperties -> new RotatedPillarBlock(netherStemProperties
                    .mapColor(MapColor.WARPED_STEM)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F).sound(SoundType.STEM)));

    //Woods
    public static final Block CHERRY_BIRCH_WOOD = registerBlock("cherry_birch_wood",
            logProperties -> new RotatedPillarBlock(logProperties
                    .mapColor(MapColor.TERRACOTTA_GRAY)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F)
                    .sound(SoundType.CHERRY_WOOD)
                    .ignitedByLava()));
    public static final Block STRIPPED_CHERRY_BIRCH_WOOD = registerBlock("stripped_cherry_birch_wood",
            logProperties -> new RotatedPillarBlock(logProperties
                    .mapColor(MapColor.TERRACOTTA_GRAY)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F)
                    .sound(SoundType.CHERRY_WOOD)
                    .ignitedByLava()));
    public static final Block GOLDEN_BIRCH_WOOD = registerBlock("golden_birch_wood",
            logProperties -> new RotatedPillarBlock(logProperties
                    .mapColor(MapColor.TERRACOTTA_YELLOW)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F)
                    .sound(SoundType.CHERRY_WOOD)
                    .ignitedByLava()));
    public static final Block STRIPPED_GOLDEN_BIRCH_WOOD = registerBlock("stripped_golden_birch_wood",
            properties -> new RotatedPillarBlock(properties
                    .mapColor(MapColor.TERRACOTTA_YELLOW)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F)
                    .sound(SoundType.CHERRY_WOOD)
                    .ignitedByLava()));

    public static final Block CRIPTION_HYPHAE = registerBlock("cription_hyphae",
            netherStemProperties -> new RotatedPillarBlock(netherStemProperties
                    .mapColor(MapColor.WARPED_HYPHAE)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F)
                    .sound(SoundType.STEM)));
    public static final Block STRIPPED_CRIPTION_HYPHAE = registerBlock("stripped_cription_hyphae",
            netherStemProperties -> new RotatedPillarBlock(netherStemProperties
                    .mapColor(MapColor.WARPED_HYPHAE)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F)
                    .sound(SoundType.STEM)));

    //Saplings
    //public static final Block CHERRY_BIRCH_SAPLING = registerBlock("cherry_birch_sapling",
            //properties -> new SaplingBlock(TBSSaplingGenerators.CHERRY_BIRCH, properties.mapColor(MapColor.COLOR_PINK)
                    //.noCollision().randomTicks().instabreak()
                    //.sound(SoundType.CHERRY_SAPLING).pushReaction(PushReaction.DESTROY)));
    //public static final Block GOLDEN_BIRCH_SAPLING = registerBlock("golden_birch_sapling",
            //properties -> new SaplingBlock(TBSSaplingGenerators.GOLDEN_BIRCH, properties.mapColor(MapColor.GOLD)
                    //.noCollision().randomTicks().instabreak()
                    //.sound(SoundType.CHERRY_SAPLING).pushReaction(PushReaction.DESTROY)));

    //Shelves [NEEDS WORK]
    //public static final Block SHELFSHELF = registerBlock("shelfshelf",
            //properties -> new ShelfBlock(properties.mapColor(MapColor.BLUE).instrument(NoteBlockInstrument.BASS)
                    //.strength(2.0F, 3.0F).sound(SoundType.SHELF).ignitedByLava()));
    //public static final Block SHELFSHELF = registerBlock("shelfshelf",
            //properties -> new ShelfBlock(properties.mapColor(MapColor.BLUE)
                    //.instrument(NoteBlockInstrument.BASS).sound(SoundType.SHELF).ignitedByLava().strength(2.0F, 3.0F)));

    //public static final Block SHELFSHELF = register("shelfshelf",
            //ShelfBlock::new,
            //AbstractBlock.Settings.create()
                    //.mapColor(BLUE_PLANKS.getDefaultMapColor())
                    //.instrument(NoteBlockInstrument.BASS)
                    //.sound(SoundType.SHELF)
                    //.ignitedByLava()
                    //.strength(2.0F, 3.0F));

    public static final Block SHELFSHELF = registerShelfBlock("shelfshelf",
            key -> new ShelfBlock(BlockBehaviour.Properties.ofFullCopy(TBSBlocks.BLUE_PLANKS).sound(SoundType.NETHER_WOOD).lightLevel(state -> 2).noOcclusion().setId(key)));

    public static final Block WHITE_SHELF = registerShelfBlock("white_shelf",
            key -> new ShelfBlock(BlockBehaviour.Properties.ofFullCopy(TBSBlocks.WHITE_PLANKS).sound(SoundType.WOOD).lightLevel(state -> 2).noOcclusion().setId(key).ignitedByLava()));
    public static final Block LIGHT_GRAY_SHELF = registerShelfBlock("light_gray_shelf",
            key -> new ShelfBlock(BlockBehaviour.Properties.ofFullCopy(TBSBlocks.LIGHT_GRAY_PLANKS).sound(SoundType.WOOD).lightLevel(state -> 2).noOcclusion().setId(key).ignitedByLava()));
    public static final Block GRAY_SHELF = registerShelfBlock("gray_shelf",
            key -> new ShelfBlock(BlockBehaviour.Properties.ofFullCopy(TBSBlocks.GRAY_PLANKS).sound(SoundType.WOOD).lightLevel(state -> 2).noOcclusion().setId(key).ignitedByLava()));
    public static final Block BLACK_SHELF = registerShelfBlock("black_shelf",
            key -> new ShelfBlock(BlockBehaviour.Properties.ofFullCopy(TBSBlocks.BLACK_PLANKS).sound(SoundType.WOOD).lightLevel(state -> 2).noOcclusion().setId(key).ignitedByLava()));
    public static final Block BROWN_SHELF = registerShelfBlock("brown_shelf",
            key -> new ShelfBlock(BlockBehaviour.Properties.ofFullCopy(TBSBlocks.BROWN_PLANKS).sound(SoundType.WOOD).lightLevel(state -> 2).noOcclusion().setId(key).ignitedByLava()));
    public static final Block RED_SHELF = registerShelfBlock("red_shelf",
            key -> new ShelfBlock(BlockBehaviour.Properties.ofFullCopy(TBSBlocks.RED_PLANKS).sound(SoundType.WOOD).lightLevel(state -> 2).noOcclusion().setId(key).ignitedByLava()));
    public static final Block ORANGE_SHELF = registerShelfBlock("orange_shelf",
            key -> new ShelfBlock(BlockBehaviour.Properties.ofFullCopy(TBSBlocks.ORANGE_PLANKS).sound(SoundType.WOOD).lightLevel(state -> 2).noOcclusion().setId(key).ignitedByLava()));
    public static final Block YELLOW_SHELF = registerShelfBlock("yellow_shelf",
            key -> new ShelfBlock(BlockBehaviour.Properties.ofFullCopy(TBSBlocks.YELLOW_PLANKS).sound(SoundType.WOOD).lightLevel(state -> 2).noOcclusion().setId(key).ignitedByLava()));
    public static final Block LIME_SHELF = registerShelfBlock("lime_shelf",
            key -> new ShelfBlock(BlockBehaviour.Properties.ofFullCopy(TBSBlocks.LIME_PLANKS).sound(SoundType.WOOD).lightLevel(state -> 2).noOcclusion().setId(key).ignitedByLava()));
    public static final Block GREEN_SHELF = registerShelfBlock("green_shelf",
            key -> new ShelfBlock(BlockBehaviour.Properties.ofFullCopy(TBSBlocks.GREEN_PLANKS).sound(SoundType.WOOD).lightLevel(state -> 2).noOcclusion().setId(key).ignitedByLava()));
    public static final Block CYAN_SHELF = registerShelfBlock("cyan_shelf",
            key -> new ShelfBlock(BlockBehaviour.Properties.ofFullCopy(TBSBlocks.CYAN_PLANKS).sound(SoundType.WOOD).lightLevel(state -> 2).noOcclusion().setId(key).ignitedByLava()));
    public static final Block LIGHT_BLUE_SHELF = registerShelfBlock("light_blue_shelf",
            key -> new ShelfBlock(BlockBehaviour.Properties.ofFullCopy(TBSBlocks.LIGHT_BLUE_PLANKS).sound(SoundType.WOOD).lightLevel(state -> 2).noOcclusion().setId(key).ignitedByLava()));
    public static final Block BLUE_SHELF = registerShelfBlock("blue_shelf",
            key -> new ShelfBlock(BlockBehaviour.Properties.ofFullCopy(TBSBlocks.BLUE_PLANKS).sound(SoundType.WOOD).lightLevel(state -> 2).noOcclusion().setId(key).ignitedByLava()));
    public static final Block PURPLE_SHELF = registerShelfBlock("purple_shelf",
            key -> new ShelfBlock(BlockBehaviour.Properties.ofFullCopy(TBSBlocks.PURPLE_PLANKS).sound(SoundType.WOOD).lightLevel(state -> 2).noOcclusion().setId(key).ignitedByLava()));
    public static final Block MAGENTA_SHELF = registerShelfBlock("magenta_shelf",
            key -> new ShelfBlock(BlockBehaviour.Properties.ofFullCopy(TBSBlocks.MAGENTA_PLANKS).sound(SoundType.WOOD).lightLevel(state -> 2).noOcclusion().setId(key).ignitedByLava()));
    public static final Block PINK_SHELF = registerShelfBlock("pink_shelf",
            key -> new ShelfBlock(BlockBehaviour.Properties.ofFullCopy(TBSBlocks.PINK_PLANKS).sound(SoundType.WOOD).lightLevel(state -> 2).noOcclusion().setId(key).ignitedByLava()));

    public static final Block CHERRY_BIRCH_SHELF = registerShelfBlock("cherry_birch_shelf",
            key -> new ShelfBlock(BlockBehaviour.Properties.ofFullCopy(TBSBlocks.CHERRY_BIRCH_PLANKS).sound(SoundType.WOOD).lightLevel(state -> 2).noOcclusion().setId(key).ignitedByLava()));
    public static final Block GOLDEN_BIRCH_SHELF = registerShelfBlock("golden_birch_shelf",
            key -> new ShelfBlock(BlockBehaviour.Properties.ofFullCopy(TBSBlocks.GOLDEN_BIRCH_PLANKS).sound(SoundType.WOOD).lightLevel(state -> 2).noOcclusion().setId(key).ignitedByLava()));

    public static final Block CRIPTION_SHELF = registerShelfBlock("cription_shelf",
            key -> new ShelfBlock(BlockBehaviour.Properties.ofFullCopy(TBSBlocks.CRIPTION_PLANKS).sound(SoundType.NETHER_WOOD).lightLevel(state -> 2).noOcclusion().setId(key)));

    //Blocks
    public static final Block DIAMARITE_BLOCK = registerBlock("diamarite_block",
            properties -> new Block(properties.mapColor(MapColor.COLOR_BLACK).requiresCorrectToolForDrops()
                    .strength(50.0F, 1200.0F).sound(SoundType.NETHERITE_BLOCK)));
    public static final Block CORRUPTIONITE_BLOCK = registerBlock("corruptionite_block",
            properties -> new Block(properties.mapColor(MapColor.COLOR_BLACK).requiresCorrectToolForDrops()
                    .strength(50.0F, 1200.0F).sound(SoundType.NETHERITE_BLOCK)));
    public static final Block BYZANTIUM_BLOCK = registerBlock("byzantium_block",
            properties -> new Block(properties.mapColor(MapColor.GOLD).instrument(NoteBlockInstrument.BELL)
                    .requiresCorrectToolForDrops().strength(4.0F, 6.0F).sound(SoundType.METAL)));
    public static final Block RAW_BYZANTIUM_BLOCK = registerBlock("raw_byzantium_block",
            properties -> new Block(properties.mapColor(MapColor.GOLD).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().strength(5.0F, 6.0F)));
    public static final Block BYZANTIUM_ORE = registerBlock("byzantium_ore",
            properties -> new Block(properties.mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().strength(3.0F, 3.0F)));
    public static final Block DEEPSLATE_BYZANTIUM_ORE = registerBlock("deepslate_byzantium_ore",
            properties -> new Block(properties.mapColor(MapColor.DEEPSLATE).requiresCorrectToolForDrops()
                    .strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE)));

    public static final Block DIAMARITE_CORE = registerCoreBlock("diamarite_core",
            HeavyCoreBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.SNARE)
                    .sound(SoundType.HEAVY_CORE).strength(10.0F).pushReaction(PushReaction.NORMAL).strength(1200.0F));

    public static final Block GILDED_NETHERITE_BLOCK = registerBlock("gilded_netherite_block",
            properties -> new Block(properties.mapColor(MapColor.COLOR_BLACK).requiresCorrectToolForDrops()
                    .strength(50.0F, 1200.0F).sound(SoundType.NETHERITE_BLOCK)));

    public static final Block GOLDEN_DEBRIS = registerBlock("golden_debris",
            properties -> new Block(properties.mapColor(MapColor.GOLD).requiresCorrectToolForDrops()
                    .strength(30.0F, 1200.0F).sound(SoundType.ANCIENT_DEBRIS)));

    public static final Block ENERGY_BLOCK = registerBlock("energy_block",
            properties -> new Block(properties.mapColor(MapColor.DIAMOND).requiresCorrectToolForDrops()
                    .strength(5.0F, 6.0F).sound(SoundType.METAL)));

    //Extra
    private static Block registerBlock(String name, Function<BlockBehaviour.Properties, Block> function) {
        Block toRegister = function.apply(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(TBS.MOD_ID, name))));
        registerBlockItem(name, toRegister);
        return Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(TBS.MOD_ID, name), toRegister);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(TBS.MOD_ID, name),
                new BlockItem(block, new Item.Properties().useBlockDescriptionPrefix()
                        .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(TBS.MOD_ID, name)))));
    }

    private static Block registerShelfBlock(String name, java.util.function.Function<ResourceKey<Block>, Block> factory) {
        Identifier id = Identifier.fromNamespaceAndPath(TBS.MOD_ID, name);
        ResourceKey<Block> key = ResourceKey.create(BuiltInRegistries.BLOCK.key(), id);
        // Construct with registry key to satisfy settings that need an id during construction
        Block block = factory.apply(key);
        // Register the block
        Registry.register(BuiltInRegistries.BLOCK, id, block);
        // Register the block item so it appears in inventory and can be placed
        ResourceKey<Item> itemKey = ResourceKey.create(BuiltInRegistries.ITEM.key(), id);
        Item.Properties itemSettings = new Item.Properties().setId(itemKey);

        // Standard block item registration for shelves
        BlockItem item = new BlockItem(block, itemSettings);
        Registry.register(BuiltInRegistries.ITEM, id, item);
        // NOTE: Creative tab population moved to registerModBlocks() for manual ordering
        return block;
    }

    //private static Block register(String id,
                                  //Function<AbstractBlock.Settings, Block> factory,
                                  //AbstractBlock.Settings settings) {
        //RegistryKey<Block> key = RegistryKey.of(
                //RegistryKeys.BLOCK,
                //Identifier.of(TBS.MOD_ID, id)
        //);

        //return Registry.register(
                //Registries.BLOCK,
                //Identifier.of(TBS.MOD_ID, id),
                //factory.apply(settings.registryKey(key))
        //);
    //}

    private static Block registerCoreBlock(String name, Function<BlockBehaviour.Properties, Block> blockFactory, BlockBehaviour.Properties settings) {
        // 1. Create the unique identifier
        Identifier id = Identifier.fromNamespaceAndPath(TBS.MOD_ID, name);

        // 2. Create the registry keys
        ResourceKey<Block> blockKey = ResourceKey.create(Registries.BLOCK, id);
        ResourceKey<Item> itemKey = ResourceKey.create(Registries.ITEM, id);

        // 3. Create the block instance with the key already inside its settings
        Block block = blockFactory.apply(settings.setId(blockKey));

        // 4. Register the Block
        Registry.register(BuiltInRegistries.BLOCK, blockKey, block);

        // 5. Register the BlockItem with the item key and the block description prefix
        Registry.register(BuiltInRegistries.ITEM, itemKey,
                new BlockItem(block, new Item.Properties().setId(itemKey).useBlockDescriptionPrefix()));

        return block;
    }

    public static void registerBlocks() {
        TBS.LOGGER.info("Registering Mod Blocks for " + TBS.MOD_ID);

        //Creative Tabs
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.NATURAL_BLOCKS).register(natural -> {
            //entries.insertAfter(Blocks.BIRCH_LEAVES, TBSBlocks.CHERRY_BIRCH_LEAVES);
            //entries.accept(TBSBlocks.CHERRY_BIRCH_SAPLING);
            //entries.insertAfter(TBSBlocks.CHERRY_BIRCH_LEAVES, TBSBlocks.GOLDEN_BIRCH_LEAVES);
            //entries.accept(TBSBlocks.GOLDEN_BIRCH_SAPLING);
            natural.insertAfter(Blocks.RAW_GOLD_BLOCK, TBSBlocks.RAW_BYZANTIUM_BLOCK);
            natural.insertAfter(Blocks.DEEPSLATE_GOLD_ORE, TBSBlocks.BYZANTIUM_ORE);
            natural.insertAfter(TBSBlocks.BYZANTIUM_ORE, TBSBlocks.DEEPSLATE_BYZANTIUM_ORE);
            natural.insertAfter(TBSBlocks.DEEPSLATE_BYZANTIUM_ORE, Blocks.REDSTONE_ORE);
            natural.insertAfter(Blocks.ANCIENT_DEBRIS, TBSBlocks.GOLDEN_DEBRIS);
        });

        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.BUILDING_BLOCKS).register(building -> {
            building.insertAfter(Blocks.BIRCH_BUTTON, TBSBlocks.CHERRY_BIRCH_LOG);
            building.insertAfter(TBSBlocks.CHERRY_BIRCH_LOG, TBSBlocks.CHERRY_BIRCH_WOOD);
            building.insertAfter(TBSBlocks.CHERRY_BIRCH_WOOD, TBSBlocks.STRIPPED_CHERRY_BIRCH_LOG);
            building.insertAfter(TBSBlocks.STRIPPED_CHERRY_BIRCH_LOG, TBSBlocks.STRIPPED_CHERRY_BIRCH_WOOD);
            building.insertAfter(TBSBlocks.STRIPPED_CHERRY_BIRCH_WOOD, TBSBlocks.CHERRY_BIRCH_PLANKS);
            building.insertAfter(TBSBlocks.CHERRY_BIRCH_PLANKS, TBSBlocks.CHERRY_BIRCH_STAIRS);
            building.insertAfter(TBSBlocks.CHERRY_BIRCH_STAIRS, TBSBlocks.CHERRY_BIRCH_SLAB);
            building.insertAfter(TBSBlocks.CHERRY_BIRCH_SLAB, TBSBlocks.CHERRY_BIRCH_FENCE);
            building.insertAfter(TBSBlocks.CHERRY_BIRCH_FENCE, TBSBlocks.CHERRY_BIRCH_FENCE_GATE);
            building.insertAfter(TBSBlocks.CHERRY_BIRCH_FENCE_GATE, TBSBlocks.CHERRY_BIRCH_DOOR);
            building.insertAfter(TBSBlocks.CHERRY_BIRCH_DOOR, TBSBlocks.CHERRY_BIRCH_TRAPDOOR);
            building.insertAfter(TBSBlocks.CHERRY_BIRCH_TRAPDOOR, TBSBlocks.CHERRY_BIRCH_PRESSURE_PLATE);
            building.insertAfter(TBSBlocks.CHERRY_BIRCH_PRESSURE_PLATE, TBSBlocks.CHERRY_BIRCH_BUTTON);
            building.insertAfter(TBSBlocks.CHERRY_BIRCH_BUTTON, TBSBlocks.GOLDEN_BIRCH_LOG);
            building.insertAfter(TBSBlocks.GOLDEN_BIRCH_LOG, TBSBlocks.GOLDEN_BIRCH_WOOD);
            building.insertAfter(TBSBlocks.GOLDEN_BIRCH_WOOD, TBSBlocks.STRIPPED_GOLDEN_BIRCH_LOG);
            building.insertAfter(TBSBlocks.STRIPPED_GOLDEN_BIRCH_LOG, TBSBlocks.STRIPPED_GOLDEN_BIRCH_WOOD);
            building.insertAfter(TBSBlocks.STRIPPED_GOLDEN_BIRCH_WOOD, TBSBlocks.GOLDEN_BIRCH_PLANKS);
            building.insertAfter(TBSBlocks.GOLDEN_BIRCH_PLANKS, TBSBlocks.GOLDEN_BIRCH_STAIRS);
            building.insertAfter(TBSBlocks.GOLDEN_BIRCH_STAIRS, TBSBlocks.GOLDEN_BIRCH_SLAB);
            building.insertAfter(TBSBlocks.GOLDEN_BIRCH_SLAB, TBSBlocks.GOLDEN_BIRCH_FENCE);
            building.insertAfter(TBSBlocks.GOLDEN_BIRCH_FENCE, TBSBlocks.GOLDEN_BIRCH_FENCE_GATE);
            building.insertAfter(TBSBlocks.GOLDEN_BIRCH_FENCE_GATE, TBSBlocks.GOLDEN_BIRCH_DOOR);
            building.insertAfter(TBSBlocks.GOLDEN_BIRCH_DOOR, TBSBlocks.GOLDEN_BIRCH_TRAPDOOR);
            building.insertAfter(TBSBlocks.GOLDEN_BIRCH_TRAPDOOR, TBSBlocks.GOLDEN_BIRCH_PRESSURE_PLATE);
            building.insertAfter(TBSBlocks.GOLDEN_BIRCH_PRESSURE_PLATE, TBSBlocks.GOLDEN_BIRCH_BUTTON);
            building.insertAfter(Blocks.DARK_OAK_TRAPDOOR, TBSBlocks.DARK_OAK_DOOR_WITH_WINDOWS);
            building.insertAfter(TBSBlocks.DARK_OAK_DOOR_WITH_WINDOWS, TBSBlocks.DARK_OAK_TRAPDOOR_WITH_WINDOWS);
            building.insertAfter(Blocks.WARPED_BUTTON, TBSBlocks.CRIPTION_STEM);
            building.insertAfter(TBSBlocks.CRIPTION_STEM, TBSBlocks.STRIPPED_CRIPTION_STEM);
            building.insertAfter(TBSBlocks.STRIPPED_CRIPTION_STEM, TBSBlocks.CRIPTION_HYPHAE);
            building.insertAfter(TBSBlocks.CRIPTION_HYPHAE, TBSBlocks.STRIPPED_CRIPTION_HYPHAE);
            building.insertAfter(TBSBlocks.STRIPPED_CRIPTION_HYPHAE, TBSBlocks.CRIPTION_PLANKS);
            building.insertAfter(TBSBlocks.CRIPTION_PLANKS, TBSBlocks.CRIPTION_STAIRS);
            building.insertAfter(TBSBlocks.CRIPTION_STAIRS, TBSBlocks.CRIPTION_SLAB);
            building.insertAfter(TBSBlocks.CRIPTION_SLAB, TBSBlocks.CRIPTION_FENCE);
            building.insertAfter(TBSBlocks.CRIPTION_FENCE, TBSBlocks.CRIPTION_FENCE_GATE);
            building.insertAfter(TBSBlocks.CRIPTION_FENCE_GATE, TBSBlocks.CRIPTION_DOOR);
            building.insertAfter(TBSBlocks.CRIPTION_DOOR, TBSBlocks.CRIPTION_TRAPDOOR);
            building.insertAfter(TBSBlocks.CRIPTION_TRAPDOOR, TBSBlocks.CRIPTION_PRESSURE_PLATE);
            building.insertAfter(TBSBlocks.CRIPTION_PRESSURE_PLATE, TBSBlocks.CRIPTION_BUTTON);
            building.insertAfter(TBSBlocks.CRIPTION_BUTTON, TBSBlocks.PLANKS_TEMPLATE);
            building.insertAfter(TBSBlocks.PLANKS_TEMPLATE, TBSBlocks.WHITE_PLANKS);
            building.insertAfter(TBSBlocks.WHITE_PLANKS, TBSBlocks.WHITE_STAIRS);
            building.insertAfter(TBSBlocks.WHITE_STAIRS, TBSBlocks.WHITE_SLAB);
            building.insertAfter(TBSBlocks.WHITE_SLAB, TBSBlocks.WHITE_FENCE);
            building.insertAfter(TBSBlocks.WHITE_FENCE, TBSBlocks.WHITE_FENCE_GATE);
            building.insertAfter(TBSBlocks.WHITE_FENCE_GATE, TBSBlocks.WHITE_DOOR);
            building.insertAfter(TBSBlocks.WHITE_DOOR, TBSBlocks.WHITE_TRAPDOOR);
            building.insertAfter(TBSBlocks.WHITE_TRAPDOOR, TBSBlocks.WHITE_PRESSURE_PLATE);
            building.insertAfter(TBSBlocks.WHITE_PRESSURE_PLATE, TBSBlocks.WHITE_BUTTON);
            building.insertAfter(TBSBlocks.WHITE_BUTTON, TBSBlocks.LIGHT_GRAY_PLANKS);
            building.insertAfter(TBSBlocks.LIGHT_GRAY_PLANKS, TBSBlocks.LIGHT_GRAY_STAIRS);
            building.insertAfter(TBSBlocks.LIGHT_GRAY_STAIRS, TBSBlocks.LIGHT_GRAY_SLAB);
            building.insertAfter(TBSBlocks.LIGHT_GRAY_SLAB, TBSBlocks.LIGHT_GRAY_FENCE);
            building.insertAfter(TBSBlocks.LIGHT_GRAY_FENCE, TBSBlocks.LIGHT_GRAY_FENCE_GATE);
            building.insertAfter(TBSBlocks.LIGHT_GRAY_FENCE_GATE, TBSBlocks.LIGHT_GRAY_DOOR);
            building.insertAfter(TBSBlocks.LIGHT_GRAY_DOOR, TBSBlocks.LIGHT_GRAY_TRAPDOOR);
            building.insertAfter(TBSBlocks.LIGHT_GRAY_TRAPDOOR, TBSBlocks.LIGHT_GRAY_PRESSURE_PLATE);
            building.insertAfter(TBSBlocks.LIGHT_GRAY_PRESSURE_PLATE, TBSBlocks.LIGHT_GRAY_BUTTON);
            building.insertAfter(TBSBlocks.LIGHT_GRAY_BUTTON, TBSBlocks.GRAY_PLANKS);
            building.insertAfter(TBSBlocks.GRAY_PLANKS, TBSBlocks.GRAY_STAIRS);
            building.insertAfter(TBSBlocks.GRAY_STAIRS, TBSBlocks.GRAY_SLAB);
            building.insertAfter(TBSBlocks.GRAY_SLAB, TBSBlocks.GRAY_FENCE);
            building.insertAfter(TBSBlocks.GRAY_FENCE, TBSBlocks.GRAY_FENCE_GATE);
            building.insertAfter(TBSBlocks.GRAY_FENCE_GATE, TBSBlocks.GRAY_DOOR);
            building.insertAfter(TBSBlocks.GRAY_DOOR, TBSBlocks.GRAY_TRAPDOOR);
            building.insertAfter(TBSBlocks.GRAY_TRAPDOOR, TBSBlocks.GRAY_PRESSURE_PLATE);
            building.insertAfter(TBSBlocks.GRAY_PRESSURE_PLATE, TBSBlocks.GRAY_BUTTON);
            building.insertAfter(TBSBlocks.GRAY_BUTTON, TBSBlocks.BLACK_PLANKS);
            building.insertAfter(TBSBlocks.BLACK_PLANKS, TBSBlocks.BLACK_STAIRS);
            building.insertAfter(TBSBlocks.BLACK_STAIRS, TBSBlocks.BLACK_SLAB);
            building.insertAfter(TBSBlocks.BLACK_SLAB, TBSBlocks.BLACK_FENCE);
            building.insertAfter(TBSBlocks.BLACK_FENCE, TBSBlocks.BLACK_FENCE_GATE);
            building.insertAfter(TBSBlocks.BLACK_FENCE_GATE, TBSBlocks.BLACK_DOOR);
            building.insertAfter(TBSBlocks.BLACK_DOOR, TBSBlocks.BLACK_TRAPDOOR);
            building.insertAfter(TBSBlocks.BLACK_TRAPDOOR, TBSBlocks.BLACK_PRESSURE_PLATE);
            building.insertAfter(TBSBlocks.BLACK_PRESSURE_PLATE, TBSBlocks.BLACK_BUTTON);
            building.insertAfter(TBSBlocks.BLACK_BUTTON, TBSBlocks.BROWN_PLANKS);
            building.insertAfter(TBSBlocks.BROWN_PLANKS, TBSBlocks.BROWN_STAIRS);
            building.insertAfter(TBSBlocks.BROWN_STAIRS, TBSBlocks.BROWN_SLAB);
            building.insertAfter(TBSBlocks.BROWN_SLAB, TBSBlocks.BROWN_FENCE);
            building.insertAfter(TBSBlocks.BROWN_FENCE, TBSBlocks.BROWN_FENCE_GATE);
            building.insertAfter(TBSBlocks.BROWN_FENCE_GATE, TBSBlocks.BROWN_DOOR);
            building.insertAfter(TBSBlocks.BROWN_DOOR, TBSBlocks.BROWN_TRAPDOOR);
            building.insertAfter(TBSBlocks.BROWN_TRAPDOOR, TBSBlocks.BROWN_PRESSURE_PLATE);
            building.insertAfter(TBSBlocks.BROWN_PRESSURE_PLATE, TBSBlocks.BROWN_BUTTON);
            building.insertAfter(TBSBlocks.BROWN_BUTTON, TBSBlocks.RED_PLANKS);
            building.insertAfter(TBSBlocks.RED_PLANKS, TBSBlocks.RED_STAIRS);
            building.insertAfter(TBSBlocks.RED_STAIRS, TBSBlocks.RED_SLAB);
            building.insertAfter(TBSBlocks.RED_SLAB, TBSBlocks.RED_FENCE);
            building.insertAfter(TBSBlocks.RED_FENCE, TBSBlocks.RED_FENCE_GATE);
            building.insertAfter(TBSBlocks.RED_FENCE_GATE, TBSBlocks.RED_DOOR);
            building.insertAfter(TBSBlocks.RED_DOOR, TBSBlocks.RED_TRAPDOOR);
            building.insertAfter(TBSBlocks.RED_TRAPDOOR, TBSBlocks.RED_PRESSURE_PLATE);
            building.insertAfter(TBSBlocks.RED_PRESSURE_PLATE, TBSBlocks.RED_BUTTON);
            building.insertAfter(TBSBlocks.RED_BUTTON, TBSBlocks.ORANGE_PLANKS);
            building.insertAfter(TBSBlocks.ORANGE_PLANKS, TBSBlocks.ORANGE_STAIRS);
            building.insertAfter(TBSBlocks.ORANGE_STAIRS, TBSBlocks.ORANGE_SLAB);
            building.insertAfter(TBSBlocks.ORANGE_SLAB, TBSBlocks.ORANGE_FENCE);
            building.insertAfter(TBSBlocks.ORANGE_FENCE, TBSBlocks.ORANGE_FENCE_GATE);
            building.insertAfter(TBSBlocks.ORANGE_FENCE_GATE, TBSBlocks.ORANGE_DOOR);
            building.insertAfter(TBSBlocks.ORANGE_DOOR, TBSBlocks.ORANGE_TRAPDOOR);
            building.insertAfter(TBSBlocks.ORANGE_TRAPDOOR, TBSBlocks.ORANGE_TRAPDOOR);
            building.insertAfter(TBSBlocks.ORANGE_TRAPDOOR, TBSBlocks.ORANGE_PRESSURE_PLATE);
            building.insertAfter(TBSBlocks.ORANGE_PRESSURE_PLATE, TBSBlocks.ORANGE_BUTTON);
            building.insertAfter(TBSBlocks.ORANGE_BUTTON, TBSBlocks.YELLOW_PLANKS);
            building.insertAfter(TBSBlocks.YELLOW_PLANKS, TBSBlocks.YELLOW_STAIRS);
            building.insertAfter(TBSBlocks.YELLOW_STAIRS, TBSBlocks.YELLOW_SLAB);
            building.insertAfter(TBSBlocks.YELLOW_SLAB, TBSBlocks.YELLOW_FENCE);
            building.insertAfter(TBSBlocks.YELLOW_FENCE, TBSBlocks.YELLOW_FENCE_GATE);
            building.insertAfter(TBSBlocks.YELLOW_FENCE_GATE, TBSBlocks.YELLOW_DOOR);
            building.insertAfter(TBSBlocks.YELLOW_DOOR, TBSBlocks.YELLOW_TRAPDOOR);
            building.insertAfter(TBSBlocks.YELLOW_TRAPDOOR, TBSBlocks.YELLOW_PRESSURE_PLATE);
            building.insertAfter(TBSBlocks.YELLOW_PRESSURE_PLATE, TBSBlocks.YELLOW_BUTTON);
            building.insertAfter(TBSBlocks.YELLOW_BUTTON, TBSBlocks.LIME_PLANKS);
            building.insertAfter(TBSBlocks.LIME_PLANKS, TBSBlocks.LIME_STAIRS);
            building.insertAfter(TBSBlocks.LIME_STAIRS, TBSBlocks.LIME_SLAB);
            building.insertAfter(TBSBlocks.LIME_SLAB, TBSBlocks.LIME_FENCE);
            building.insertAfter(TBSBlocks.LIME_FENCE, TBSBlocks.LIME_FENCE_GATE);
            building.insertAfter(TBSBlocks.LIME_FENCE_GATE, TBSBlocks.LIME_DOOR);
            building.insertAfter(TBSBlocks.LIME_DOOR, TBSBlocks.LIME_TRAPDOOR);
            building.insertAfter(TBSBlocks.LIME_TRAPDOOR, TBSBlocks.LIME_PRESSURE_PLATE);
            building.insertAfter(TBSBlocks.LIME_PRESSURE_PLATE, TBSBlocks.LIME_BUTTON);
            building.insertAfter(TBSBlocks.LIME_BUTTON, TBSBlocks.GREEN_PLANKS);
            building.insertAfter(TBSBlocks.GREEN_PLANKS, TBSBlocks.GREEN_STAIRS);
            building.insertAfter(TBSBlocks.GREEN_STAIRS, TBSBlocks.GREEN_SLAB);
            building.insertAfter(TBSBlocks.GREEN_SLAB, TBSBlocks.GREEN_FENCE);
            building.insertAfter(TBSBlocks.GREEN_FENCE, TBSBlocks.GREEN_FENCE_GATE);
            building.insertAfter(TBSBlocks.GREEN_FENCE_GATE, TBSBlocks.GREEN_DOOR);
            building.insertAfter(TBSBlocks.GREEN_DOOR, TBSBlocks.GREEN_TRAPDOOR);
            building.insertAfter(TBSBlocks.GREEN_TRAPDOOR, TBSBlocks.GREEN_PRESSURE_PLATE);
            building.insertAfter(TBSBlocks.GREEN_PRESSURE_PLATE, TBSBlocks.GREEN_BUTTON);
            building.insertAfter(TBSBlocks.GREEN_BUTTON, TBSBlocks.CYAN_PLANKS);
            building.insertAfter(TBSBlocks.CYAN_PLANKS, TBSBlocks.CYAN_STAIRS);
            building.insertAfter(TBSBlocks.CYAN_STAIRS, TBSBlocks.CYAN_SLAB);
            building.insertAfter(TBSBlocks.CYAN_SLAB, TBSBlocks.CYAN_FENCE);
            building.insertAfter(TBSBlocks.CYAN_FENCE, TBSBlocks.CYAN_FENCE_GATE);
            building.insertAfter(TBSBlocks.CYAN_FENCE_GATE, TBSBlocks.CYAN_DOOR);
            building.insertAfter(TBSBlocks.CYAN_DOOR, TBSBlocks.CYAN_TRAPDOOR);
            building.insertAfter(TBSBlocks.CYAN_TRAPDOOR, TBSBlocks.CYAN_PRESSURE_PLATE);
            building.insertAfter(TBSBlocks.CYAN_PRESSURE_PLATE, TBSBlocks.CYAN_BUTTON);
            building.insertAfter(TBSBlocks.CYAN_BUTTON, TBSBlocks.LIGHT_BLUE_PLANKS);
            building.insertAfter(TBSBlocks.LIGHT_BLUE_PLANKS, TBSBlocks.LIGHT_BLUE_STAIRS);
            building.insertAfter(TBSBlocks.LIGHT_BLUE_STAIRS, TBSBlocks.LIGHT_BLUE_SLAB);
            building.insertAfter(TBSBlocks.LIGHT_BLUE_SLAB, TBSBlocks.LIGHT_BLUE_FENCE);
            building.insertAfter(TBSBlocks.LIGHT_BLUE_FENCE, TBSBlocks.LIGHT_BLUE_FENCE_GATE);
            building.insertAfter(TBSBlocks.LIGHT_BLUE_FENCE_GATE, TBSBlocks.LIGHT_BLUE_DOOR);
            building.insertAfter(TBSBlocks.LIGHT_BLUE_DOOR, TBSBlocks.LIGHT_BLUE_TRAPDOOR);
            building.insertAfter(TBSBlocks.LIGHT_BLUE_TRAPDOOR, TBSBlocks.LIGHT_BLUE_PRESSURE_PLATE);
            building.insertAfter(TBSBlocks.LIGHT_BLUE_PRESSURE_PLATE, TBSBlocks.LIGHT_BLUE_BUTTON);
            building.insertAfter(TBSBlocks.LIGHT_BLUE_BUTTON, TBSBlocks.BLUE_PLANKS);
            building.insertAfter(TBSBlocks.BLUE_PLANKS, TBSBlocks.BLUE_STAIRS);
            building.insertAfter(TBSBlocks.BLUE_STAIRS, TBSBlocks.BLUE_SLAB);
            building.insertAfter(TBSBlocks.BLUE_SLAB, TBSBlocks.BLUE_FENCE);
            building.insertAfter(TBSBlocks.BLUE_FENCE, TBSBlocks.BLUE_FENCE_GATE);
            building.insertAfter(TBSBlocks.BLUE_FENCE_GATE, TBSBlocks.BLUE_DOOR);
            building.insertAfter(TBSBlocks.BLUE_DOOR, TBSBlocks.BLUE_TRAPDOOR);
            building.insertAfter(TBSBlocks.BLUE_TRAPDOOR, TBSBlocks.BLUE_PRESSURE_PLATE);
            building.insertAfter(TBSBlocks.BLUE_PRESSURE_PLATE, TBSBlocks.BLUE_BUTTON);
            building.insertAfter(TBSBlocks.BLUE_BUTTON, TBSBlocks.PURPLE_PLANKS);
            building.insertAfter(TBSBlocks.PURPLE_PLANKS, TBSBlocks.PURPLE_STAIRS);
            building.insertAfter(TBSBlocks.PURPLE_STAIRS, TBSBlocks.PURPLE_SLAB);
            building.insertAfter(TBSBlocks.PURPLE_SLAB, TBSBlocks.PURPLE_FENCE);
            building.insertAfter(TBSBlocks.PURPLE_FENCE, TBSBlocks.PURPLE_FENCE_GATE);
            building.insertAfter(TBSBlocks.PURPLE_FENCE_GATE, TBSBlocks.PURPLE_DOOR);
            building.insertAfter(TBSBlocks.PURPLE_DOOR, TBSBlocks.PURPLE_TRAPDOOR);
            building.insertAfter(TBSBlocks.PURPLE_TRAPDOOR, TBSBlocks.PURPLE_PRESSURE_PLATE);
            building.insertAfter(TBSBlocks.PURPLE_PRESSURE_PLATE, TBSBlocks.PURPLE_BUTTON);
            building.insertAfter(TBSBlocks.PURPLE_BUTTON, TBSBlocks.MAGENTA_PLANKS);
            building.insertAfter(TBSBlocks.MAGENTA_PLANKS, TBSBlocks.MAGENTA_STAIRS);
            building.insertAfter(TBSBlocks.MAGENTA_STAIRS, TBSBlocks.MAGENTA_SLAB);
            building.insertAfter(TBSBlocks.MAGENTA_SLAB, TBSBlocks.MAGENTA_FENCE);
            building.insertAfter(TBSBlocks.MAGENTA_FENCE, TBSBlocks.MAGENTA_FENCE_GATE);
            building.insertAfter(TBSBlocks.MAGENTA_FENCE_GATE, TBSBlocks.MAGENTA_DOOR);
            building.insertAfter(TBSBlocks.MAGENTA_DOOR, TBSBlocks.MAGENTA_TRAPDOOR);
            building.insertAfter(TBSBlocks.MAGENTA_TRAPDOOR, TBSBlocks.MAGENTA_PRESSURE_PLATE);
            building.insertAfter(TBSBlocks.MAGENTA_PRESSURE_PLATE, TBSBlocks.MAGENTA_BUTTON);
            building.insertAfter(TBSBlocks.MAGENTA_BUTTON, TBSBlocks.PINK_PLANKS);
            building.insertAfter(TBSBlocks.PINK_PLANKS, TBSBlocks.PINK_STAIRS);
            building.insertAfter(TBSBlocks.PINK_STAIRS, TBSBlocks.PINK_SLAB);
            building.insertAfter(TBSBlocks.PINK_SLAB, TBSBlocks.PINK_FENCE);
            building.insertAfter(TBSBlocks.PINK_FENCE, TBSBlocks.PINK_FENCE_GATE);
            building.insertAfter(TBSBlocks.PINK_FENCE_GATE, TBSBlocks.PINK_DOOR);
            building.insertAfter(TBSBlocks.PINK_DOOR, TBSBlocks.PINK_TRAPDOOR);
            building.insertAfter(TBSBlocks.PINK_TRAPDOOR, TBSBlocks.PINK_PRESSURE_PLATE);
            building.insertAfter(TBSBlocks.PINK_PRESSURE_PLATE, TBSBlocks.PINK_BUTTON);
            building.insertAfter(Blocks.IRON_TRAPDOOR, TBSBlocks.STONE_DOOR);
            building.insertAfter(TBSBlocks.STONE_DOOR, TBSBlocks.STONE_TRAPDOOR);
            building.insertAfter(TBSBlocks.STONE_TRAPDOOR, TBSBlocks.BEDROCK_DOOR);
            building.insertAfter(TBSBlocks.BEDROCK_DOOR, TBSBlocks.BEDROCK_TRAPDOOR);
            building.insertAfter(TBSBlocks.BEDROCK_TRAPDOOR, TBSBlocks.OBSIDIAN_DOOR);
            building.insertAfter(TBSBlocks.OBSIDIAN_DOOR, TBSBlocks.OBSIDIAN_TRAPDOOR);
            building.insertAfter(Blocks.LIGHT_WEIGHTED_PRESSURE_PLATE, TBSBlocks.BYZANTIUM_BLOCK);
            building.insertAfter(Blocks.NETHERITE_BLOCK, TBSBlocks.DIAMARITE_BLOCK);
            building.insertAfter(TBSBlocks.DIAMARITE_BLOCK, TBSBlocks.CORRUPTIONITE_BLOCK);
            building.insertAfter(TBSBlocks.CORRUPTIONITE_BLOCK, TBSBlocks.GILDED_NETHERITE_BLOCK);
        });

        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.FUNCTIONAL_BLOCKS).register(functional -> {
            functional.insertAfter(Blocks.BIRCH_SHELF, TBSBlocks.CHERRY_BIRCH_SHELF);
            functional.insertAfter(TBSBlocks.CHERRY_BIRCH_SHELF, TBSBlocks.GOLDEN_BIRCH_SHELF);
            functional.insertAfter(Blocks.WARPED_SHELF, TBSBlocks.CRIPTION_SHELF);
            functional.insertAfter(TBSBlocks.CRIPTION_SHELF, TBSBlocks.WHITE_SHELF);
            functional.insertAfter(TBSBlocks.WHITE_SHELF, TBSBlocks.LIGHT_GRAY_SHELF);
            functional.insertAfter(TBSBlocks.LIGHT_GRAY_SHELF, TBSBlocks.GRAY_SHELF);
            functional.insertAfter(TBSBlocks.GRAY_SHELF, TBSBlocks.BLACK_SHELF);
            functional.insertAfter(TBSBlocks.BLACK_SHELF, TBSBlocks.BROWN_SHELF);
            functional.insertAfter(TBSBlocks.BROWN_SHELF, TBSBlocks.RED_SHELF);
            functional.insertAfter(TBSBlocks.RED_SHELF, TBSBlocks.ORANGE_SHELF);
            functional.insertAfter(TBSBlocks.ORANGE_SHELF, TBSBlocks.YELLOW_SHELF);
            functional.insertAfter(TBSBlocks.YELLOW_SHELF, TBSBlocks.LIME_SHELF);
            functional.insertAfter(TBSBlocks.LIME_SHELF, TBSBlocks.GREEN_SHELF);
            functional.insertAfter(TBSBlocks.GREEN_SHELF, TBSBlocks.CYAN_SHELF);
            functional.insertAfter(TBSBlocks.CYAN_SHELF, TBSBlocks.LIGHT_BLUE_SHELF);
            functional.insertAfter(TBSBlocks.LIGHT_BLUE_SHELF, TBSBlocks.BLUE_SHELF);
            functional.insertAfter(TBSBlocks.BLUE_SHELF, TBSBlocks.PURPLE_SHELF);
            functional.insertAfter(TBSBlocks.PURPLE_SHELF, TBSBlocks.MAGENTA_SHELF);
            functional.insertAfter(TBSBlocks.MAGENTA_SHELF, TBSBlocks.PINK_SHELF);
            functional.insertAfter(TBSBlocks.PINK_SHELF, TBSBlocks.SHELFSHELF);
        });

        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.INGREDIENTS).register(ingredients -> {
            ingredients.insertAfter(Blocks.HEAVY_CORE, TBSBlocks.DIAMARITE_CORE);
        });
    }
}
