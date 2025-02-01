package org.outliertech.outliereconomy;
import com.mojang.brigadier.Command;
import com.mojang.brigadier.arguments.DoubleArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.text.Text;

public class CommandRegistry {

    public static void registerCommands() {
        CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) -> {

            // Register /bal Command
            dispatcher.register(CommandManager.literal("bal")
                    .executes(context -> {
                        ServerCommandSource source = context.getSource();
                        String uuid = source.getPlayer().getUuidAsString();

                        PlayerData playerData = PlayerDataManager.getPlayerData(uuid);

                        if (playerData == null) {
                            source.sendError(Text.of("Failed to retrieve your data."));
                            return -1;
                        }

                        source.sendFeedback(() -> Text.of("Balance: $" + playerData.getPlayerBalance()), false);
                        return Command.SINGLE_SUCCESS;
                    }));

            // Register /pay Command
            dispatcher.register(CommandManager.literal("pay")
                    .then(CommandManager.argument("target", StringArgumentType.string())
                            .then(CommandManager.argument("amount", DoubleArgumentType.doubleArg(0))
                                    .executes(context -> {
                                        ServerCommandSource source = context.getSource();
                                        String senderUuid = source.getPlayer().getUuidAsString();
                                        String targetName = StringArgumentType.getString(context, "target");
                                        double amount = DoubleArgumentType.getDouble(context, "amount");

                                        PlayerData senderData = PlayerDataManager.getPlayerData(senderUuid);
                                        PlayerData targetData = PlayerDataManager.getPlayerData(targetName);

                                        if (senderData == null || targetData == null) {
                                            source.sendError(Text.of("Failed to retrieve player data."));
                                            return -1;
                                        }

                                        if (senderData.getPlayerBalance() < amount) {
                                            source.sendError(Text.of("You don't have enough money to send."));
                                            return -1;
                                        }

                                        // Perform the transaction
                                        senderData.setPlayerBalance(senderData.getPlayerBalance() - amount);
                                        targetData.setPlayerBalance(targetData.getPlayerBalance() + amount);

                                        // Update and save data
                                        PlayerDataManager.updatePlayerData(senderUuid, senderData);
                                        PlayerDataManager.savePlayerData(senderUuid, senderData);
                                        PlayerDataManager.updatePlayerData(targetName, targetData);
                                        PlayerDataManager.savePlayerData(targetName, targetData);

                                        source.sendFeedback(() -> Text.of("You paid $" + amount + " to " + targetName), false);
                                        return Command.SINGLE_SUCCESS;
                                    }))));
        });
    }
}
