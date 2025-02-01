package org.outliertech.outliereconomy;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import org.outliertech.outliereconomy.block.ModBlocks;
import org.outliertech.outliereconomy.item.ModItemGroups;
import org.outliertech.outliereconomy.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OutlierEconomy implements ModInitializer {

	public static final String MOD_ID = "outliereconomy";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	// Custom Data
	public static final Identifier PLAYER_BALANCE = Identifier.of(MOD_ID, "player_balance");

	@Override
	public void onInitialize() {
		ModItemGroups.initialize();
		ModBlocks.registerModBlocks();
		ModItems.registerModItems();
		CommandRegistry.registerCommands();
		System.out.println("Outlier Economy Mod Initialized!");
	}
}