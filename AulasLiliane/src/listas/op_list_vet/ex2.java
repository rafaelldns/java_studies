package listas.op_list_vet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ex2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vet = new int[10];

        System.out.println("Insert 10 numbers : ");
        for(int i = 0; i < vet.length; i++){
            vet[i] = sc.nextInt();
        }

        System.out.println("Initial vector : " + Arrays.toString(vet));

       //A)
        int[] newVet = new int[vet.length + 1];
        for(int i = 0, j = 0; i < vet.length; i++ ){
            if( i ==2 ){
                newVet[i] = 1000;
            }else {
                newVet[i] = vet[j++];
            }
        }
        vet = newVet;
        System.out.println("Before insert 1000: " +Arrays.toString(vet));

       //B)
        System.out.println("Enter an index: ");
        int index = sc.nextInt();
        if(index >= 0 && index < vet.length){
            System.out.println("Element: " + vet[index]);
        }else{System.out.println("Invalid Index!");}

       //C)
        if(vet.length > 4){
            int[] temp = new int[vet.length -1];
            for (int i = 0, j = 0; i < vet.length; i++){
                if (i != 4){
                    temp[j++] = vet[i];
                }
            }
            vet = temp;
            System.out.println("Before remove fifth element: " + Arrays.toString(vet));
        }

        //D)
        System.out.print("New value to second element: ");
        int newValue = sc.nextInt();
        if (vet.length > 1) {
            vet[1] = newValue;
            System.out.println("Before substituition: " + Arrays.toString(vet));
        }

        //E)
        System.out.print("Insert a number to search: ");
        int search = sc.nextInt();
        boolean found = false;
        for (int num : vet) {
            if (num == search) {
                found = true;
                break;
            }
        }
        System.out.println(found ? "Number found!" : "Number NOT found.");

        //F)
        Arrays.sort(vet);
        System.out.println("Ascending Order: " + Arrays.toString(vet));

        for (int i = 0; i < vet.length / 2; i++) {
            int temp = vet[i];
            vet[i] = vet[vet.length - 1 - i];
            vet[vet.length - 1 - i] = temp;
        }
        System.out.println("Descending Order: " + Arrays.toString(vet));

        //G)
        int[] copy = Arrays.copyOf(vet, vet.length);
        System.out.println("Vector copy: " + Arrays.toString(copy));

        //H)
        vet = new int[0];
        System.out.println("Vector before clean: " + Arrays.toString(vet));

        //I)
        if (vet.length == 0) {
            System.out.println("Vector is empty.");
        } else {
            System.out.println("Vector is NOT empty.");
        }

        sc.close();
    }
}

