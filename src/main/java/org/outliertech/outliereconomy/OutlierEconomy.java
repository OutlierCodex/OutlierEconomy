package org.outliertech.outliereconomy;

import net.fabricmc.api.ModInitializer;

import org.outliertech.outliereconomy.block.ModBlocks;
import org.outliertech.outliereconomy.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// Test Comment
public class OutlierEconomy implements ModInitializer {
	public static final String MOD_ID = "outlier-economy";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registeredModItems();
		ModBlocks.registerModBlocks();
	}
}