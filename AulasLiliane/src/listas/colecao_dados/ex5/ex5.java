package listas.colecao_dados.ex5;

import java.util.ArrayList;
import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Float> list = new ArrayList<>();

        System.out.println("Enter 10 numbers (float):");
        for (int i = 0; i < 10; i++) {
            System.out.print("Value [" + i + "]: ");
            float num = scanner.nextFloat();
            list.add(num);
        }

        float greater = list.get(0);
        float lowest = list.get(0);

        for (float num : list) {
            if (num > greater) {
                greater = num;
            }
            if (num < lowest) {
                lowest = num;
            }
        }

        System.out.println("\nList: " + list);
        System.out.println("Greater value: " + greater);
        System.out.println("Lowest value: " + lowest);

        scanner.close();
    }
}
