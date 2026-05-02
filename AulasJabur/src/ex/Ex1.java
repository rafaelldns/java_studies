package ex;

// na propria classe principal instancie 4 variaveis e associe quatro valores inteiros
// 1-Descubra o maior e mostre na tela; 2-Descubra o menor e mostre na tela
// 3-Faça a soma e mostre na tela; 4-Calcule a media e mostre na tela.
// 5-Coloque seu nome em uma variavel e transforme ele em letras maiusculas.
// 6-Faça um for while que mostre números pares de 30 a 50

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {

        float n1, n2, n3, n4, larg, smal, sum, media;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        n1 = input.nextInt();

        System.out.print("Enter second number: ");
        n2 = input.nextInt();

        System.out.print("Enter third number: ");
        n3 = input.nextInt();

        System.out.print("Enter fourth number: ");
        n4 = input.nextInt();

        input.nextLine();

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        larg = n1;
        if (n2 > larg) larg = n2;
        if (n3 > larg) larg = n3;
        if (n4 > larg) larg = n4;

        smal = n1;
        if (n2 < smal) smal = n2;
        if (n3 < smal) smal = n3;
        if (n4 < smal) smal = n4;

        sum = n1+n2+n3+n4;
        media = (n1+n2+n3+n4)/4;

        System.out.printf("The largest number is : " + larg);
        System.out.printf("\nThe smallest number is : " + smal);
        System.out.printf("\nThe sum is : " + sum);
        System.out.printf("\nThe media is : " + media);
        System.out.printf("\nName uppercase : " + name.toUpperCase());
        System.out.printf("\nEven numbers for 30 at 50 : ");
        for (int i = 30; i<= 50; i++){
            if (i % 2 == 0){
                System.out.printf("\n" + i + " ");
            }
        }
    }
}
