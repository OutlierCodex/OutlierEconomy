package org.outliertech.outliereconomy;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.minecraft.server.command.CommandManager;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.outliertech.outliereconomy.block.ModBlocks;
import org.outliertech.outliereconomy.item.ModItemGroups;
import org.outliertech.outliereconomy.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.yaml.snakeyaml.Yaml;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;

public class OutlierEconomy implements ModInitializer {

	public static final String MOD_ID = "outliereconomy";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	// Custom Data
	public static final Identifier PLAYER_BALANCE = Identifier.of(MOD_ID, "player_balance");

	@Override
	public void onInitialize() {
		ModItemGroups.initialize();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) -> {
			dispatcher.register(CommandManager.literal("bal").executes(context -> {
				context.getSource().sendFeedback(() -> Text.literal("Balance: " + PLAYER_BALANCE), false);
				return 1;
			}));
		});

	}
}