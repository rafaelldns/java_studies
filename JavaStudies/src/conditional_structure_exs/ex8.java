package conditional_structure_exs;

import java.util.Locale;
import java.util.Scanner;

public class ex8 {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        double wage, tax;

        System.out.println("|Tax Calculator|");
        System.out.print("Insert your wage: R$");
        wage = sc.nextDouble();

        if ( wage < 0) System.out.println("Invalid Value!");
        else if ( wage <= 2000 ) {
            System.out.println("You are exempt from the tax!");
        } else if ( wage <= 3000) {
            tax = (wage/100) * 8;
            System.out.printf("Fee payable: R$%.2f", tax);
        } else if ( wage <= 4500){
            tax = (wage/100) * 16;
            System.out.printf("Fee payable: R$%.2f", tax);
        } else {
            tax = (wage/100) * 28;
            System.out.printf("Fee payable: R$%.2f", tax);
        }
    }
}
