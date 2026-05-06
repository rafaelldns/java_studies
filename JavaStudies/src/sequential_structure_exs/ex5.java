package sequential_structure_exs;

import java.util.Scanner;

public class ex5 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int code1, amount1, code2, amount2;
        double  uvalue1, tvalue1, uvalue2, tvalue2, tv;

        System.out.println("First product code: ");
        code1 = sc.nextInt();
        System.out.println("Product 1 amount: ");
        amount1 = sc.nextInt();
        System.out.println("Product unit value: ");
        uvalue1 = sc.nextDouble();
        tvalue1 = amount1 * uvalue1;

        System.out.println("Second product code: ");
        code2 = sc.nextInt();
        System.out.println("Product 2 amount: ");
        amount2 = sc.nextInt();
        System.out.println("Product 2 unit value: ");
        uvalue2 = sc.nextDouble();
        tvalue2 = amount2 * uvalue2;

        tv = tvalue1 + tvalue2;

        System.out.printf("Product 1:\nCode: %d\nTotal value: U$%.2f\n", code1, tvalue1);
        System.out.printf("Product 2:\nCode: %d\nTotal value: U$%.2f\n", code2, tvalue2);
        System.out.printf("Total value of products: U$%.2f", tv);

    }
}
