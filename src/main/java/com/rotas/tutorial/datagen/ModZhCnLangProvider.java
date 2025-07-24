package com.rotas.tutorial.datagen;

import com.rotas.tutorial.Items.TutorialModItemGroups;
import com.rotas.tutorial.Items.TutorialModItems;
import com.rotas.tutorial.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class ModZhCnLangProvider extends FabricLanguageProvider {
    public ModZhCnLangProvider(FabricDataOutput dataOutput) {
        super(dataOutput, "zh_cn");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add(TutorialModItems.BLUE_BALL, "蓝球");
        translationBuilder.add(TutorialModItems.RED_BALL, "红球");
        translationBuilder.add(TutorialModItems.GREEN_STICK, "绿色木棍");
        translationBuilder.add(TutorialModItems.YELLOW_STICK, "黄色木棍");

        translationBuilder.add(ModBlocks.BLUE_BALL_BLOCK, "蓝球方块");
        translationBuilder.add(ModBlocks.RED_BALL_BLOCK, "红球方块");
        translationBuilder.add(ModBlocks.YELLOW_PLANK, "黄色木板");
        translationBuilder.add(ModBlocks.GREEN_PLANK, "绿色木板");

        translationBuilder.add(TutorialModItemGroups.TUTORIAL_GROUP, "样例物品");

    }
}
