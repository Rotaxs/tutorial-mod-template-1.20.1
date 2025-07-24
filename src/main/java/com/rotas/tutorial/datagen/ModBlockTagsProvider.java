package com.rotas.tutorial.datagen;

import com.rotas.tutorial.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.rmi.registry.Registry;
import java.time.Year;
import java.util.concurrent.CompletableFuture;

public class ModBlockTagsProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagsProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.BLUE_BALL_BLOCK)
                .add(ModBlocks.RED_BALL_BLOCK)
                .add(ModBlocks.GREEN_PLANK)
                .add(ModBlocks.YELLOW_PLANK);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.YELLOW_PLANK)
                .add(ModBlocks.GREEN_PLANK);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.BLUE_BALL_BLOCK)
                .add(ModBlocks.RED_BALL_BLOCK);

    }
}
