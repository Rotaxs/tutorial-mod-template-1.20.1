package com.rotas.tutorial.datagen;

import com.rotas.tutorial.Items.TutorialModItems;
import com.rotas.tutorial.TutorialMod;
import com.rotas.tutorial.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelsProvider extends FabricModelProvider {
    public ModModelsProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLUE_BALL_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_BALL_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.YELLOW_PLANK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GREEN_PLANK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(TutorialModItems.BLUE_BALL, Models.GENERATED);
        itemModelGenerator.register(TutorialModItems.RED_BALL, Models.GENERATED);
        itemModelGenerator.register(TutorialModItems.YELLOW_STICK, Models.GENERATED);
        itemModelGenerator.register(TutorialModItems.GREEN_STICK, Models.GENERATED);

    }
}
