package aulas.Aula02.CalcArea;

import java.util.Scanner;

public class CalcAreaFig {

    static Scanner read = new Scanner(System.in);

    public static void menu(){
        int op;
        do{
            System.out.println("\n===== AREA MENU =====");
            System.out.println("1 - Square Area");
            System.out.println("2 - Retangle Area");
            System.out.println("3 - Sair");
            System.out.print("Enter a option: ");
            op = read.nextInt();

            switch (op){
                case 1 :
                    CalcAreaFig.arq();
                    break;
                case 2 :
                    CalcAreaFig.arr();
                    break;
                case 3 :
                    System.out.println("\nExiting...");
                    break;
                default :
                    System.out.println("Invalid Option!");
            }



        }while (op != 3);

    }

    public static void arq(){
        float l, aq;

        System.out.print("Enter the side lenght of the square: ");
        l = read.nextFloat();

        aq = l*l;

        System.out.print("The square area is: " + aq);
    }

    public static void arr(){
        float b, h, ar;

        System.out.print("Enter the retangle base: ");
        b = read.nextFloat();

        System.out.print("Enter the retangle height: ");
        h = read.nextFloat();

        ar = b*h;

        System.out.println("The retangle area is: " + ar);
    }

}
