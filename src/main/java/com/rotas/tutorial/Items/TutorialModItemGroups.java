package com.rotas.tutorial.Items;

import com.rotas.tutorial.TutorialMod;
import com.rotas.tutorial.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class TutorialModItemGroups {

    public static final RegistryKey<ItemGroup> TUTORIAL_GROUP = register("tutorial_group");

    private static RegistryKey<ItemGroup> register(String id) {
        return RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(TutorialMod.MOD_ID, id));
    }

    public static void registerItemGroups() {
        Registry.register(
                Registries.ITEM_GROUP,
                TUTORIAL_GROUP,
                ItemGroup.create(ItemGroup.Row.TOP, 7)
                         .displayName(Text.translatable("itemGroup.tutorial_group"))
                         .icon(() -> new ItemStack(TutorialModItems.CUSTOM_ITEM))
                         .entries((displayContext, entries) -> {
                             entries.add(TutorialModItems.BLUE_BALL);
                             entries.add(TutorialModItems.RED_BALL);
                             entries.add(TutorialModItems.YELLOW_STICK);
                             entries.add(TutorialModItems.GREEN_STICK);
                             entries.add(ModBlocks.BLUE_BALL_BLOCK);
                             entries.add(ModBlocks.RED_BALL_BLOCK);
                             entries.add(ModBlocks.YELLOW_PLANK);
                             entries.add(ModBlocks.GREEN_PLANK);
                         }).build()
        );
    }




}
