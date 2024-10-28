package org.outliertech.outliereconomy.utility;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import org.yaml.snakeyaml.DumperOptions;
import org.yaml.snakeyaml.Yaml;

public class WritePlayerYaml {

    public static void main(String[] args) {
        try {

            /*

                player:
                    player_id: player_id
                    employee_id: employee_id
                    balance: balance
                    debt: debt
                    credit_remaining: credit_remaining
                    background: >
                    Random text here just as placer text for the time being.  The arrow makes each line connect when compiled.
                    is_current_champion: false
                    homes: [home]

            */

            // Create a map to represent the YAML data
            // Left is YAML right is Value
            Map<String, Object> data = new LinkedHashMap<>();
            data.put("player_id", "player_id");
            data.put("employee_id", "employee_id");
            data.put("balance", "balance");
            data.put("debt", "debt");
            data.put("credit_remaining", "credit_remaining");
            data.put("background", "background");
            data.put("is_current_champion", "is_current_champion");
            data.put("homes", "homes");

            // Create a YAML object with options
            DumperOptions options = new DumperOptions();
            options.setDefaultFlowStyle(DumperOptions.FlowStyle.BLOCK);
            Yaml yaml = new Yaml(options);

            // Write the YAML data to a file
            FileWriter writer = new FileWriter("playerdata.yml");
            yaml.dump(data, writer);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}