package listas.colecao_dados.ex6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter 10  positive integers:");
        for (int i = 0; i < 10; i++) {
            int num;
            do {
                System.out.print("Value [" + i + "]: ");
                num = scanner.nextInt();

                if (num <= 0) {
                    System.out.println("Enter only positive numbers!");
                }
            } while (num <= 0);

            list.add(num);
        }

        Collections.reverse(list);

        System.out.println("\nList in reverse order:");
        System.out.println(list);

        scanner.close();
    }
}
