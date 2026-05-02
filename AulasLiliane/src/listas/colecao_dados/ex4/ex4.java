package listas.colecao_dados.ex4;

import java.util.ArrayList;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter 20 positive integers:");
        for (int i = 0; i < 20; i++) {
            int num;
            do {
                System.out.print("Position [" + i + "]: ");
                num = scanner.nextInt();
                if (num <= 0) {
                    System.out.println("Enter only positive numbers!");
                }
            } while (num <= 0);

            list.add(num);
        }

        System.out.println("\nOriginal list:");
        System.out.println(list);

        int tam = list.size();
        for (int i = 0; i < tam / 2; i++) {
            int temp = list.get(i);
            list.set(i, list.get(tam - 1 - i));
            list.set(tam - 1 - i, temp);
        }

        System.out.println("\nReorganized list:");
        System.out.println(list);

        scanner.close();
    }
}
