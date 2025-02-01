package org.outliertech.outliereconomy;

import org.yaml.snakeyaml.DumperOptions;
import org.yaml.snakeyaml.Yaml;
import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class PlayerDataManager {
    private static final Map<String, PlayerData> playerDataCache = new HashMap<>();

    // Load PlayerData from file
    public static PlayerData getPlayerData(String uuid) {
        if (playerDataCache.containsKey(uuid)) {
            return playerDataCache.get(uuid);
        }

        // Create new file if the player doesn't have one
        File file = new File("playerdata/" + uuid + ".yml");
        if (!file.exists()) {
            PlayerData newPlayer = new PlayerData(uuid, 0.00, 0.00);
            savePlayerData(uuid, newPlayer);
            return newPlayer;
        }

        // Get player data values or assign 0 if none
        try (InputStream inputStream = new FileInputStream(file)) {
            Yaml yaml = new Yaml();
            Map<String, Object> data = yaml.load(inputStream);

            PlayerData playerData = new PlayerData(
                    uuid,
                    (Double) data.getOrDefault("player_balance", 0.00),
                    (Double) data.getOrDefault("player_bank_balance", 0.00)
            );

            playerDataCache.put(uuid, playerData);
            return playerData;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    // Save PlayerData to file
    public static void savePlayerData(String uuid, PlayerData playerData) {
        File directory = new File("playerdata");
        if (!directory.exists()) {
            directory.mkdirs();
        }

        File file = new File(directory, uuid + ".yml");

        try (Writer writer = new FileWriter(file)) {
            Yaml yaml = new Yaml(new DumperOptions());
            Map<String, Object> data = new HashMap<>();
            data.put("player_balance", playerData.getPlayerBalance());
            data.put("player_bank_balance", playerData.getPlayerBankBalance());

            yaml.dump(data, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Update PlayerData
    public static void updatePlayerData(String uuid, PlayerData playerData) {
        playerDataCache.put(uuid, playerData);
    }
}
