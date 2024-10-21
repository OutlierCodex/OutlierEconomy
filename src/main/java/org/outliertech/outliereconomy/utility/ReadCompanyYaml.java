package org.outliertech.outliereconomy.utility;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Map;
import org.yaml.snakeyaml.Yaml;

public class ReadCompanyYaml {

    public static void main(String[] args) {
        try {
            InputStream inputStream = new FileInputStream("companydata.yml");
            Yaml yaml = new Yaml();
            Map<String, Object> data = yaml.load(inputStream);

            // Access data from the YAML file
            System.out.println(data.get("database"));
            System.out.println(data.get("server"));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}