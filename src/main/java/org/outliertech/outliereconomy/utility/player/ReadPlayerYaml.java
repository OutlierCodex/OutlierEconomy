package org.outliertech.outliereconomy.utility.player;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.util.Map;
import org.yaml.snakeyaml.Yaml;

public class ReadPlayerYaml {

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

            InputStream inputStream = new FileInputStream("playerdata.yml");
            Yaml yaml = new Yaml();
            Map<String, Object> data = yaml.load(inputStream);

            // Access data from the YAML file
            int player_id = (int) data.get("player_id");
            System.out.println("Player ID: " + player_id);

            int employee_id = (int) data.get("employee_id");
            System.out.println("Employee ID: " + employee_id);

            double balance = (double) data.get("balance");
            System.out.println("Balance: " + balance);

            double debt = (double) data.get("debt");
            System.out.println("Debt: " + debt);

            double credit_remaining = (double) data.get("credit_remaining");
            System.out.println("Credit Remaining: " + credit_remaining);

            String background = (String) data.get("background");
            System.out.println("Background: " + background);

            boolean is_current_champion = (boolean) data.get("is_current_champion");
            System.out.println("Is Current Champion: " + is_current_champion);

            Array[] homes = (Array[]) data.get("homes");
            System.out.println("Homes" + homes);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}