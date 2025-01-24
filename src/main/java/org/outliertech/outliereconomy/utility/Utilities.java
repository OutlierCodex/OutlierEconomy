package org.outliertech.outliereconomy.utility;
import java.io.*;
import java.util.HashMap;
import java.util.Map;
import org.outliertech.outliereconomy.PlayerData;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

// Contains Reusable Utility Methods (e.g., string manipulation, common tasks)

public class Utilities {

    // Read .yml File
    public static void readYaml() {
        try(InputStream inputStream = new FileInputStream(new File("playerdata.yml"))) {
            Yaml yaml = new Yaml(new Constructor(PlayerData.class));
            PlayerData data = yaml.load(inputStream);
            System.out.println(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Write to .yml File
    public static void writeYaml() {
        Yaml yaml = new Yaml();
        try(FileWriter writer = new FileWriter(new File("playerdata.yml"))) {
            Map<String, Object> data = new HashMap<>();
            data.put("uuid", "uuid");
            data.put("player_balance", player_balance);
            yaml.dump(data,writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
