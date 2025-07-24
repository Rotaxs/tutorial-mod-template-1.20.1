package com.rotas.tutorial.Items;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static com.rotas.tutorial.TutorialMod.MOD_ID;

public final class TutorialModItems {

    private TutorialModItems() {}

    public static final Item CUSTOM_ITEM = registerItem("custom_item", new Item(new Item.Settings()));
    public static final Item RED_BALL = registerItem("ball/red_ball", new Item(new Item.Settings().maxCount(64)));
    public static final Item BLUE_BALL = registerItem("ball/blue_ball", new Item(new Item.Settings().maxCount(64)));
    public static final Item YELLOW_STICK = registerItem("yellow_stick", new Item(new Item.Settings()));
    public static final Item GREEN_STICK = registerItem("green_stick", new Item(new Item.Settings()));

    public static  Item registerItem(String path, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(MOD_ID, path), item);
    }

    public static void registerItems() { }

}
