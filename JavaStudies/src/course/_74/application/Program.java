package course._74.application;

import course._74.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();
        System.out.println("Enter product data:");
        System.out.print("Name: ");
        product.name = sc.nextLine();
        System.out.print("Price: ");
        product.price = sc.nextDouble();
        System.out.print("Quantity: ");
        product.quantity = sc.nextInt();

        System.out.println("\nProduct data: " + product);

        System.out.print("\nEnter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        product.addProduct(quantity);

        System.out.println("\nUpdate data: " + product);

        System.out.print("\nEnter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        product.removeProduct(quantity);

        System.out.println("\nUpdate data: " + product);
    }
}
