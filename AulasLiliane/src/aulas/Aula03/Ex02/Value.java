package aulas.Aula03.Ex02;

import java.util.Locale;
import java.util.Scanner;

public class Value {

    int ip1, ip2, qt1, qt2;
    float val1, val2, nv1, nv2, ipi, tv, ntv;

    Scanner input = new Scanner(System.in).useLocale(Locale.US);

    public Value(){
        this.read_peace();
    }

    public void read_peace(){
        System.out.println("Enter first product ip: ");
        this.ip1 = input.nextInt();
        System.out.println("Enter first product value: ");
        this.val1 = input.nextFloat();
        System.out.println("Enter first product amount: ");
        this.qt1 = input.nextInt();
        System.out.println("Enter second product ip: ");
        this.ip2 = input.nextInt();
        System.out.println("Enter second product value: ");
        this.val2 = input.nextFloat();
        System.out.println("Enter second product amount: ");
        this.qt2 = input.nextInt();
        System.out.println("Enter the percentage readjustment: ");
        this.ipi = input.nextInt();

        this.peaceReadjustment();
    }

    public void peaceReadjustment(){
        this.tv = (val1 * qt1) + (val2 * qt2);
        this.nv1 = val1 * (ipi/100 + 1);
        this.nv2 = val2 * (ipi/100 + 1);
        this.ntv = (nv1 * qt1) + (nv2 * qt2);

        System.out.println("These old values are: " +
                "\nFirst product " + ip1 + " value: " + val1 +
                "\nSecond product " + ip2 +" value: " + val2 +
                "\nTotal value: " + tv);
        System.out.println("These new values are: " +
                "\nNew first product " + ip1 + " value: " + nv1 +
                "\nNew second product " + ip2 + " value: " + nv2 +
                "\nNew total value: " + ntv);
    }
}
