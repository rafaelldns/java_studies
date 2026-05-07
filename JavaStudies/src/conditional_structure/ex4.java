package conditional_structure;

import java.util.Scanner;

public class ex4 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ih, fh, th;

        System.out.println("Insert start time: ");
        ih = sc.nextInt();
        System.out.println("Insert end time: ");
        fh = sc.nextInt();

        if (ih >= fh){
            th = (24 - ih) + fh;
            System.out.printf("The game lasted %d hours", th);
        }else{
            th = fh - ih;
            System.out.printf("The game lasted %d hours", th);
        }
    }
}
