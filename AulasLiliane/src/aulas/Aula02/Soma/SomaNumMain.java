package aulas.Aula02.Soma;

import java.util.Scanner;

public class SomaNumMain {

    public static void main(){

        int n1, n2, n3;

        Scanner nums = new Scanner(System.in);

        System.out.print("Insert first number: ");
        n1 = nums.nextInt();

        System.out.print("\nInsert second number: ");
        n2 = nums.nextInt();

        System.out.print("\nInsert a third number: ");
        n3 = nums.nextInt();

        SomaNum soma = new SomaNum(n1, n2, n3);

        soma.printdois();
        soma.printtres();
    }

}
