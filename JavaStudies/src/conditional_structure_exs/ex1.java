package conditional_structure_exs;

import java.util.Scanner;

public class ex1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x;

        System.out.println("Insert a integer number: ");
        x = sc.nextInt();

        if(x < 0){
            System.out.println("This number is negative!");
        }else {
            System.out.println("This number is positive!");
        }

    }
}
