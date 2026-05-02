package ex.aula2704;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class ManipulaString {
    public static void main(String[] args) {
        String valor;
        int num1, num2, soma;
        Scanner dados=new Scanner(System.in);
        System.out.println("digite uma palavra:\n");
        valor=dados.nextLine();
        //letra a
        System.out.println("tamanho da string:\n"+valor.length());
        //letra b
        System.out.println("string em maiusculo:\n"+valor.toUpperCase());
        //letra c
        System.out.println("se começa com UNI:\n"+valor.toUpperCase().startsWith("UNI"));
        //letra d
        System.out.println("se termina com RIO:\n"+valor.toUpperCase().endsWith("RIO"));

        //faz substiuicoes
        String teste="paroxitona";
        System.out.println("substitui o pelo numero 0:\n"+teste.replaceAll("o", "0"));
        System.out.println("substitui a por A:\n"+teste.replace('a', 'A'));


        num1=Integer.parseInt(JOptionPane.showInputDialog("digite um numero"));
        //Double.parseDouble
        num2=Integer.parseInt(JOptionPane.showInputDialog("digite o segundo numero"));
        soma=num1+num2;
        JOptionPane.showMessageDialog(null, "resultado da soma:\n"+soma);
    }

}