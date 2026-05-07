package conditional_structure_exs;

import java.util.Scanner;

public class ex2 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int x, c;

        System.out.println("insert a integer number: ");
        x = sc.nextInt();

        c = x%2;

        if(c == 0){
            System.out.println("This number is even!");
        }else{
            System.out.println("This number is odd!");
        }
    }
}
