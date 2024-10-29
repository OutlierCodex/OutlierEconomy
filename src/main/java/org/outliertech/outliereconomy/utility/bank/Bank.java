package org.outliertech.outliereconomy.utility.bank;
import java.lang.reflect.Array;
import org.outliertech.outliereconomy.utility.player.Player;

public class Bank {

    /*
        bank:
            bank_id: bank_id
            bank_name: bank_name
            bank_manager: bank_manager
            bank_balance: bank_balance
            bank_payable: bank_payable
     */

    int bank_id;
    String bank_name;
    public Array[] Managers[];
    public Array[] Employees[];
    double bank_balance;
    double bank_payable;

    public Bank(int bank_id, String bank_name, Array[] Managers[], Array[] Employees[], double bank_balance, double bank_payable){
        this.bank_id = bank_id;
        this.bank_name = bank_name;
        this.Managers = Managers;
        this.Employees = Employees
        this.bank_balance = bank_balance;
        this.bank_payable = bank_payable;
    }

    public void Owner(){
        String name;
    }

    public void Ceo(){
        String name;
    }

    public void PayEmployees(){

    }

    public void PayPayable(){

    }

    public void TakeOutLoan(){

    }
}
