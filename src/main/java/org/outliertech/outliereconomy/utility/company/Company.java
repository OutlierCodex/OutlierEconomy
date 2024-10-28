package org.outliertech.outliereconomy.utility.company;
import java.lang.reflect.Array;
import java.util.Date;

public class Company {

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

    int company_id;
    String company_name;
    Date date_fonded;
    String owner;
    String ceo;
    Array[] managers;
    Array[] members;
    double company_balance;
    double company_payable;
    String organization_history;
    boolean is_top_company;

    public Company(int company_id, String company_name, Date date_fonded, String owner, String ceo, Array[] managers, Array[] members, double company_balance, double company_payable, String organization_history, boolean is_top_company){
        this.company_id = company_id;
        this.company_name = company_name;
        this.date_fonded = date_fonded;
        this.owner = owner;
        this.ceo = ceo;
        this.managers = managers;
        this.members = members;
        this.company_balance = company_balance;
        this.company_payable = company_payable;
        this.organization_history = organization_history;
        this.is_top_company = is_top_company;
    }
}
