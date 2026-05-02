package listas.colecao_dados.ex2;

import java.util.ArrayList;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        System.out.println("Enter 5 positive integers for List 1: ");
        for (int i = 0; i < 5; i++) {
            int num;
            do {
                System.out.print("List 1 [" + i + "]: ");
                num = scanner.nextInt();
                if (num <= 0) {
                    System.out.println("Enter only positive numbers!");
                }
            } while (num <= 0);
            list1.add(num);
        }

        System.out.println("\nEnter 5 positive integers for List 2: ");
        for (int i = 0; i < 5; i++) {
            int num;
            do {
                System.out.print("List 2 [" + i + "]: ");
                num = scanner.nextInt();
                if (num <= 0) {
                    System.out.println("Enter only positive numbers!");
                }
            } while (num <= 0);
            list2.add(num);
        }

        for (int i = 0; i < 5; i++) {
            int soma = list1.get(i) + list2.get(i);
            list3.add(soma);
        }

        System.out.println("\nList 1: " + list1);
        System.out.println("List 2: " + list2);
        System.out.println("List 3(sum of list 1 and list 2) : " + list3);

        scanner.close();
    }
}
