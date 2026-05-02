package ex.aula2704;

import javax.swing.*;
import java.util.Scanner;

public class TwoFirstToEnd {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str, seq1, seq2, result;
        str= JOptionPane.showInputDialog("insert your str: ");
        System.out.println("Str : " + str);
        seq1= str.substring(0,2);
        System.out.println(seq1);
        String invert = new StringBuilder(str).reverse().toString();
        System.out.println("Str inverted: " + invert);
        seq2 = invert.substring(0,2);
        System.out.println(seq2);
        result = seq1+seq2;
        System.out.println("Str 2 first char and 2 end char: " + result);
    }
}
