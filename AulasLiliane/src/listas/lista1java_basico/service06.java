package listas.lista1java_basico;

import java.util.Scanner;

public class service06 {
    Scanner input = new Scanner(System.in);
    int an, n, sn;

    public service06(){
        this.read();
    }

    public void read (){
        System.out.println("Enter the number to find out " +
                "its predecessor and sucessor: ");
        this.n = input.nextInt();
        this.calc_pr_su();
    }

    public void calc_pr_su(){
        this.an = this.n - 1;
        this.sn = this.n + 1;
        System.out.println("Predecessor : " + this.an);
        System.out.println("Sucessor : " + this.sn);
    }




}
