package conditional_structure_exs;

import java.util.Scanner;

public class ex3 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, m1, m2;

        System.out.println("Insert first integer: ");
        a = sc.nextInt();
        System.out.println("Insert a second integer: ");
        b = sc.nextInt();

        if (a > b){
            m1 = a%b;
            if (m1 == 0) {
                System.out.println("There are multiples!");
            }else{
                System.out.println("They are not multiplies!");
            }
        }else{
            m1 = b%a;
            if (m1 == 0){
                System.out.println("There are multiples!");
            }else{
                System.out.println("They are not multiples!");
            }
        }

    }
}
