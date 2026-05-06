package fiction_ex;

import java.util.Locale;

public class output {
    static void main(String[] args) {
        String prod1 = "Computer";
        String prod2 = "Monitor";

        int age = 23;
        int code = 0001;
        char gender = 'M';

        double price1 = 4299.99;
        double price2 = 1249.99;
        double measure = 42.93841012;

        System.out.println("Products: ");
        System.out.printf("%s, which price is $%.2f%n", prod1, price1);
        System.out.printf("%s, which price is $%.2f%n", prod2, price2);

        System.out.printf("\nRecord: %d years old, code %d and gender: %c\n", age, code, gender);

        System.out.printf("\nMeasure with eight decimal places: %f", measure);
        System.out.printf("\nRouded(three decimal places): %.3f\n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("With US decimal point: %.3f", measure);

    }
}
