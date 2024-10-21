package org.outliertech.outliereconomy.utility;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import org.yaml.snakeyaml.DumperOptions;
import org.yaml.snakeyaml.Yaml;

public class WriteBankYaml {

    public static void main(String[] args) {
        try {
            // Create a map to represent the YAML data
            // Left is YAML right is Value
            Map<String, Object> data = new LinkedHashMap<>();
            data.put("name", "John Doe");
            data.put("age", 30);
            data.put("city", "New York");

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