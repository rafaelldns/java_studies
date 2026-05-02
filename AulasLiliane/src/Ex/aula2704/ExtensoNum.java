package Ex.aula2704;

import java.util.Scanner;

public class ExtensoNum {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] names = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        System.out.println("Insert a number: ");
        String number = input.nextLine();

        for(int i = 0; i < number.length(); i++){
            char c = number.charAt(i);

            if(Character.isDigit(c)){
                int digit = c - '0';
                System.out.println(names[digit] + " ");
            } else {
                System.out.println("Invalid!");
            }
        }

        input.close();
    }
}
