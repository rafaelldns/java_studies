package for_structure_exs;

import java.util.Scanner;

public class ex6 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Find divisors of:");
        n = sc.nextInt();

        System.out.println("There divisors: ");
        for( int i = 1 ; i <= n ; i++ ){
            if ( n%i == 0 ){
                System.out.println(i);
            }
        }
    }
}
