package org.outliertech.outliereconomy.utility.company;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.util.Date;
import java.util.Map;
import org.yaml.snakeyaml.Yaml;

public class ReadCompanyYaml {

    public static void main(String[] args) {

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

        try {
            InputStream inputStream = new FileInputStream("companydata.yml");
            Yaml yaml = new Yaml();
            Map<String, Object> data = yaml.load(inputStream);

            // Access data from the YAML file
            int company_id = (int) data.get("company_id");
            System.out.println("Company ID: " + company_id);

            String company_name = (String) data.get("company_name");
            System.out.println("Company Name: " + company_name);

            Date date_founded = (Date) data.get("date_founded");
            System.out.println("Date Founded: " + date_founded);

            String owner = (String) data.get("owner");
            System.out.println("Owner: " + owner);

            String ceo = (String) data.get("ceo");
            System.out.println("CEO: " + ceo);

            Array[] managers = (Array[]) data.get("managers");
            System.out.println("Managers: " + managers);

            Array[] members = (Array[]) data.get("members");
            System.out.println("Members: " + members);

            double company_balance = (double) data.get("company_balance");
            System.out.println("Company Balance: " + company_balance);

            double company_payable = (double) data.get("company_payable");
            System.out.println("Company Payable: " + company_payable);

            String organization_history = (String) data.get("organization_history");
            System.out.println("Organization History: " + organization_history);

            boolean is_top_company = (boolean) data.get("is_top_company");
            System.out.println("Is Top Company: " + is_top_company);

            //Company company = new Company(company_id, "company_name", "date_founded", "owner", "ceo", managers[], members[], company_balance, company_payable, organization_history, is_top_company);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}