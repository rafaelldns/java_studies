package listas.tratamento_exececao.q2;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Questao2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean sucesso = false;

        System.out.println("Eu sei dividir!");

        while (!sucesso) {
            try {
                System.out.print("Informe o primeiro valor: ");
                int x = teclado.nextInt();

                System.out.print("Informe o segundo valor: ");
                int y = teclado.nextInt();

                double r = (x / y);
                System.out.println("O resultado da divisão é: " + r);
                sucesso = true;
            } catch (InputMismatchException e) {
                System.out.println("Erro: Por favor, insira apenas números inteiros.");
                teclado.nextLine();
            } catch (ArithmeticException e) {
                System.out.println("Erro: Não é possível dividir por zero.");
            }
        }
        teclado.close();
    }
}
