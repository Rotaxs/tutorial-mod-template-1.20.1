package com.rotas.tutorial.datagen;

import com.rotas.tutorial.Items.TutorialModItemGroups;
import com.rotas.tutorial.Items.TutorialModItems;
import com.rotas.tutorial.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;

public class ModEnUsLangProvider extends FabricLanguageProvider {
    public ModEnUsLangProvider(FabricDataOutput dataOutput) {
        super(dataOutput, "en_us");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add(TutorialModItems.BLUE_BALL, "blue ball");
        translationBuilder.add(TutorialModItems.RED_BALL, "red ball");
        translationBuilder.add(TutorialModItems.GREEN_STICK, "green stick");
        translationBuilder.add(TutorialModItems.YELLOW_STICK, "yellow stick");

        translationBuilder.add(ModBlocks.BLUE_BALL_BLOCK, "blue ball block");
        translationBuilder.add(ModBlocks.RED_BALL_BLOCK, "red ball block");
        translationBuilder.add(ModBlocks.YELLOW_PLANK, "yellow plank");
        translationBuilder.add(ModBlocks.GREEN_PLANK, "green plank");

        translationBuilder.add(TutorialModItemGroups.TUTORIAL_GROUP, "tutorial items");

    }
}
