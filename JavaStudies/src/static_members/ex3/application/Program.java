package static_members.ex3.application;

import static_members.ex3.entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();
        System.out.print("Name: ");
        student.name = sc.nextLine();

        System.out.print("First note(0.0/30.0): ");
        student.a = sc.nextDouble();
        System.out.print("Second note(0.0/30.0): ");
        student.b = sc.nextDouble();
        System.out.print("Third note(0.0/35.0): ");
        student.c = sc.nextDouble();

        System.out.println("QUARTERLY AVERAGE: \n" + student);

    }
}
