package conditional_structure;

import java.util.Locale;
import java.util.Scanner;

public class ex5 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        int code, quant;
        double total;


        System.out.println("=================================");
        System.out.println("||CODE | SPECIFICATION | PRICE ||");
        System.out.println("|| 01  |  Hot Dog      |U$4.00 ||");
        System.out.println("|| 02  |  X-Salad      |U$4.50 ||");
        System.out.println("|| 03  |  X-Bacon      |U$5.00 ||");
        System.out.println("|| 04  |  Simple toast |U$2.00 ||");
        System.out.println("|| 05  |  Soda         |U$1.50 ||");
        System.out.println("=================================");

        System.out.println("Enter the code and quantity: ");
        code = sc.nextInt();
        quant = sc.nextInt();

        if(code == 1){
            total = quant * 4.00;
            System.out.printf("Total payable: U$%.2f", total);
        } else if (code == 2) {
            total = quant * 4.50;
            System.out.printf("Total payable: U$%.2f", total);
        }else if (code == 3){
            total = quant * 5.00;
            System.out.printf("Total payable: U$%.2f", total);
        } else if (code == 4) {
            total = quant * 2.00;
            System.out.printf("Total payable: U$%.2f", total);
        }else if (code == 5){
            total = quant * 1.50;
            System.out.printf("Total payable: U$%.2f", total);
        }else {
            System.out.println("Invalid value!");
        }
    }
}
