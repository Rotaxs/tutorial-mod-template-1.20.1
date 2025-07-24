package com.rotas.tutorial.block;

import com.rotas.tutorial.TutorialMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block BLUE_BALL_BLOCK = registerBlock("blue_ball_block", new Block(AbstractBlock.Settings.copy(Blocks.DIAMOND_BLOCK)));
    public static final Block RED_BALL_BLOCK = registerBlock("red_ball_block", new Block(AbstractBlock.Settings.create().strength(0.3f, 0.2f)));
    public static final Block YELLOW_PLANK = registerBlock("yellow_plank", new Block(AbstractBlock.Settings.create().strength(0.2f, 0.2f).requiresTool()));
    public static final Block GREEN_PLANK = registerBlock("green_plank", new Block(AbstractBlock.Settings.create().strength(0.3f, 0.3f).requiresTool()));

    public static Block registerBlock(String path, Block block) {
        registerBlockItems(path, block);
        return Registry.register(Registries.BLOCK, new Identifier(TutorialMod.MOD_ID, path), block);
    }

    public static void registerBlockItems(String path, Block block) {
        Registry.register(Registries.ITEM, new Identifier(TutorialMod.MOD_ID, path), new BlockItem(block, new Item.Settings()));
    }

    public static void registerBlocks() {

    }

}
