package listas.lista1java_basico;

import java.util.Scanner;

public class service05 {
    Scanner input = new Scanner(System.in);
    float mw, w, cw;

    public service05() {
        this.read();
    }

    public void read (){
        System.out.println("Enter the minimun wage: ");
        mw = input.nextFloat();
        System.out.println("Enter your wage: ");
        this.w = input.nextFloat();
        this.calc_wage();
    }

    public void calc_wage(){
        this.cw = this.w/this.mw;
        System.out.println("Your wage is equal a " + this.cw +" minimun wage.");
    }
}
