package aulas.Aula03.Ex01;

import java.util.Scanner;

public class Convert {
    int year, months, days, age;
    public Convert(){
        this.read();
    }

    public void read(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age in years: ");
        this.year = input.nextInt();

        do {
            System.out.print("\nEnter your age in months: ");
            this.months = input.nextInt();
            //System.out.print("\nError, please enter a valid value!");
        }while(months < 0 || months >= 12);

        do {
            System.out.print("\nEnter your age in days: ");
            this.days = input.nextInt();
            //System.out.print("\nError, please enter a valid value!");
        }while(days < 0 || days >= 30);

        this.convert();
    }

    public void convert(){
        this.age = (this.year*365) + (this.months*30) + (this.days);
        System.out.println("The age converted in days is: "
                + this.age + "days.");
    }

}
