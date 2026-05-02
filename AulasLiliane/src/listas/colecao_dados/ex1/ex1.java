package listas.colecao_dados.ex1;

import java.util.Scanner;
import java.util.ArrayList;

public class ex1 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list1 = new ArrayList<>();

        System.out.println("Insert 10 positive integers: ");
        for (int i =0 ; i < 10; i++){
            int num;
            do {
                System.out.println("Number " + ( i + 1 ) + " : ");
                num = scanner.nextInt();

                if (num <= 0){
                    System.out.println("Enter only positive numbers!");
                }
            }while (num <= 0);
            list1.add(num);
        }

        ArrayList<Integer> list2 = new ArrayList<>();

        list2.addAll(list1);


    }
}
