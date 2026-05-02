package listas.lista1java_basico;

import java.util.Scanner;

public class service03 {

    float balance, r_balance;
    Scanner input = new Scanner(System.in);

    public service03(){
        this.read();
    }

    public void read (){
        System.out.println("Enter the balance for adjustment: ");
        this.balance = input.nextFloat();
        this.calc_adjustment();
    }

    public void calc_adjustment(){
        System.out.println("The balance before the adjustment: " + this.balance);
        this.r_balance = ((this.balance/100)*1) + this.balance;
        System.out.println("The balance after the adjustment: " + this.r_balance);
    }
}
