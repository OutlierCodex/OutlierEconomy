package org.outliertech.outliereconomy.utility.bank;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import org.yaml.snakeyaml.DumperOptions;
import org.yaml.snakeyaml.Yaml;

public class WriteBankYaml {

    public static void main(String[] args)
    {
        try {
            // Create a map to represent the YAML data
            // Left is YAML right is Value
            Map<String, Object> data = new LinkedHashMap<>();
            data.put("bank_id", "bank_id");
            data.put("bank_name", "bank_name");
            data.put("bank_manager", "bank_manager");
            data.put("bank_balance", "bank_balance");
            data.put("bank_payable", "bank_payable");
            // Create a YAML object with options
            DumperOptions options = new DumperOptions();
            options.setDefaultFlowStyle(DumperOptions.FlowStyle.BLOCK);
            Yaml yaml = new Yaml(options);

            // Write the YAML data to a file
            FileWriter writer = new FileWriter("bankdata.yml");
            yaml.dump(data, writer);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}