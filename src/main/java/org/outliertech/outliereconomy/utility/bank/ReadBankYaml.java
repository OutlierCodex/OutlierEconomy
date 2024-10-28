package org.outliertech.outliereconomy.utility.bank;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Map;
import org.yaml.snakeyaml.Yaml;

public class ReadBankYaml {

    public static void main(String[] args) {
        try {

            /*
                bank:
                    bank_id: bank_id
                    bank_name: bank_name
                    bank_manager: bank_manager
                    bank_balance: bank_balance
                    bank_payable: bank_payable
            */

            InputStream inputStream = new FileInputStream("bankdata.yml");
            Yaml yaml = new Yaml();
            Map<String, Object> data = yaml.load(inputStream);

            // Access data from the YAML file
            int bank_id = (int) data.get("bank_id");
            System.out.println("Bank ID: " + bank_id);

            int bank_name = (int) data.get("bank_name");
            System.out.println("Bank Name: " + bank_name);

            String bank_manager = (String) data.get("bank_manager");
            System.out.println("Bank Manager: " + bank_manager);

            double bank_balance = (double) data.get("bank_balance");
            System.out.println("Bank Balance: " + bank_balance);

            double bank_payable = (double) data.get("bank_payable");
            System.out.println("Bank Payable: " +  bank_payable);

            //Bank bank = new Bank(bank_id, "bank_name", "bank_manager", bank_balance, bank_payable);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}