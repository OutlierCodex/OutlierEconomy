package org.outliertech.outliereconomy.utility.company;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import org.yaml.snakeyaml.DumperOptions;
import org.yaml.snakeyaml.Yaml;

public class WriteCompanyYaml {

    public static void main(String[] args) {
        try {

            /*
                company:
                    company_id: company_id
                    company_name: company_name
                    date_founded: date_founded
                    owner: owner
                    ceo: ceo
                    managers: [manager]
                    members: [member]
                    company_balance: company_balance
                    company_payable: company_payable # members * salary
                    organization_history: >
                    Random text here just as placer text for the time being. The arrow makes each line connect when compiled.
                    is_top_company: is_top_company
            */

            // Create a map to represent the YAML data
            // Left is YAML right is Value
            Map<String, Object> data = new LinkedHashMap<>();
            data.put("company_name", "company_name");
            data.put("date_founded", "date_founded");
            data.put("owner", "owner");
            data.put("ceo", "ceo");
            data.put("managers", "managers");
            data.put("members", "members");
            data.put("company_balance", "company_balance");
            data.put("company_payable", "company_payable");
            data.put("organization_history", "organization_history");
            data.put("is_top_company", "is_top_company");

            // Create a YAML object with options
            DumperOptions options = new DumperOptions();
            options.setDefaultFlowStyle(DumperOptions.FlowStyle.BLOCK);
            Yaml yaml = new Yaml(options);

            // Write the YAML data to a file
            FileWriter writer = new FileWriter("companydata.yml");
            yaml.dump(data, writer);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}