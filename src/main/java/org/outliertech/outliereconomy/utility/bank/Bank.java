package org.outliertech.outliereconomy.utility.bank;

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
    String bank_manager;
    double bank_balance;
    double bank_payable;

    public Bank(int bank_id, String bank_name, String bank_manager, double bank_balance, double bank_payable){
        this.bank_id = bank_id;
        this.bank_name = bank_name;
        this.bank_manager = bank_manager;
        this.bank_balance = bank_balance;
        this.bank_payable = bank_payable;
    }
}
