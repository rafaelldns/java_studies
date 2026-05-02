import java.util.Scanner;

void main() {

    Scanner scanner = new Scanner(System.in);
    System.out.print("What is your name? ");
    String nome = scanner.nextLine();
    System.out.println("Hello "+ nome +"!");

}