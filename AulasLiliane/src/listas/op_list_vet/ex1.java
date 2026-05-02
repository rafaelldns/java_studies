package listas.op_list_vet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ex1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter 10 numbers: ");
        for (int i = 0; i < 10; i++){
            list.add(sc.nextInt());
        }

        System.out.println("Initial List: " + list);

       //A)
        list.add(2, 1000);
        System.out.println("List Modified: " + list);

       //B)
        System.out.println("Retrieve element by index: ");
        int index = sc.nextInt();
        if(index >= 0 && index < list.size()){
            System.out.println("Element index: " + index + ":" + list.get(index));
        }else {
            System.out.println("Invalid index!");
        }

       //C)
        if(list.size() > 4){
            list.remove(4);
            System.out.println("Before remove fifth element : " +list);
        }

       //D)
        System.out.println("Insert a new value for a second element : ");
        int newValue = sc.nextInt();
        if(list.size()>1){
            list.set(1,newValue);
            System.out.println("List before adding second element: " + list);
        }

       //E)
        System.out.println("Insert a number to search: ");
        int search = sc.nextInt();
        if(list.contains(search)){
            System.out.println("Number found!");
        }else{System.out.println("Number NOT found!");}

       //F)
        Collections.sort(list);
        System.out.println("List before ascending order: " + list);

        Collections.reverse(list);
        System.out.println("List before descending order: " + list);

        //G)
        ArrayList<Integer> copy = new ArrayList<>(list);
        System.out.println("List copy : " + copy);

       //H)
        list.clear();
        System.out.println("List before cleared list: " + list);

       //I)
        if(list.isEmpty()){
            System.out.println("List is empty");
        }else{System.out.println("List isn't empty");}

    }
}
