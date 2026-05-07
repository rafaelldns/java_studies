package for_structure_exs;

import java.util.Scanner;

public class ex3 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int q;
        double n1, n2, n3, m;

        System.out.println("Insert number of medias:");
        q = sc.nextInt();

        for (int i = 0 ; i < q ; i++){
            System.out.println("\nInsert n1, n2, n3!");
            n1 = sc.nextDouble();
            n2 = sc.nextDouble();
            n3 = sc.nextDouble();

            m = ((n1*2)+(n2*3)+(n3*5))/10;
            System.out.printf("The media of this number is %.1f", m);
        }
    }
}
