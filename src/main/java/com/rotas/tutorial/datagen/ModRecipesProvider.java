package com.rotas.tutorial.datagen;

import com.rotas.tutorial.Items.TutorialModItems;
import com.rotas.tutorial.TutorialMod;
import com.rotas.tutorial.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.ShapedRecipe;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipesProvider extends FabricRecipeProvider {
    public ModRecipesProvider(FabricDataOutput output) {
        super(output);
    }


    public static final List<ItemConvertible> YELLOW_STICKS = List.of(ModBlocks.YELLOW_PLANK);

    @Override
    public void generate(Consumer<RecipeJsonProvider> consumer) {
        offerReversibleCompactingRecipes(consumer, RecipeCategory.MISC, TutorialModItems.RED_BALL,
                RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_BALL_BLOCK);
        offerSmelting(consumer, YELLOW_STICKS, RecipeCategory.MISC, TutorialModItems.YELLOW_STICK, 1.0f, 100, "yellow_stick_from_yellow_planks");
        offerBlasting(consumer, YELLOW_STICKS, RecipeCategory.MISC, TutorialModItems.YELLOW_STICK, 1.0f, 50, "yellow_stick_from_yellow_planks_blasting");

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.RED_BALL_BLOCK, 1)
                .input(TutorialModItems.RED_BALL)
                .input(Items.STONE)
                .criterion(hasItem(TutorialModItems.RED_BALL), conditionsFromItem(TutorialModItems.RED_BALL))
                .offerTo(consumer, new Identifier(TutorialMod.MOD_ID, "red_ball_block_from_red_ball"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, TutorialModItems.GREEN_STICK, 4)
                .pattern("S")
                .pattern("S")
                .input('S', ModBlocks.GREEN_PLANK)
                .criterion(hasItem(ModBlocks.GREEN_PLANK), conditionsFromItem(ModBlocks.GREEN_PLANK))
                .offerTo(consumer, new Identifier(TutorialMod.MOD_ID, "green_stick"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, TutorialModItems.YELLOW_STICK, 4)
                .pattern("S")
                .pattern("S")
                .input('S', ModBlocks.YELLOW_PLANK)
                .criterion(hasItem(ModBlocks.YELLOW_PLANK), conditionsFromItem(ModBlocks.YELLOW_PLANK))
                .offerTo(consumer, new Identifier(TutorialMod.MOD_ID, "yellow_stick"));
    }
}
