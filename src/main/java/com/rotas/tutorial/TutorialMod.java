package com.rotas.tutorial;

import com.rotas.tutorial.Items.TutorialModItemGroups;
import com.rotas.tutorial.Items.TutorialModItems;
import com.rotas.tutorial.block.ModBlocks;
import net.fabricmc.api.ModInitializer;

public class TutorialMod implements ModInitializer {

	public static final String MOD_ID = "tutorial-mod";

	@Override
	public void onInitialize() {
		TutorialModItems.registerItems();
		TutorialModItemGroups.registerItemGroups();
		ModBlocks.registerBlocks();
	}
}