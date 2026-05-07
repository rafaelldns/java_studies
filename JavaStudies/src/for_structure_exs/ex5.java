package for_structure_exs;

import java.util.Scanner;

public class ex5 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       int n;
       System.out.println("Insert number to factor: ");
       n = sc.nextInt();

       long fact = 1;

       for (int i = 1 ; i <= n ; i++){
           fact *= i;
       }
        System.out.println("Factorial :" + fact);
    }
}
