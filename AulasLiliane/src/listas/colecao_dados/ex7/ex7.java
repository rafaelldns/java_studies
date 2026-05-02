package listas.colecao_dados.ex7;

import java.util.ArrayList;
import java.util.Scanner;

public class ex7 {

    static ArrayList<Integer> list;

    public static void criaLista(int tamanho) {
        Scanner scanner = new Scanner(System.in);
        list = new ArrayList<>();

        System.out.println("Digite " + tamanho + " números inteiros:");

        for (int i = 0; i < tamanho; i++) {
            System.out.print("Valor [" + i + "]: ");
            int num = scanner.nextInt();
            list.add(num);
        }
    }

    public static void somatorio() {
        int suma = 0;
        for (int num : list) {
            suma += num;
        }
        System.out.println("Somatório: " + suma);
    }

    public static void media() {
        int suma = 0;
        for (int num : list) {
            suma += num;
        }
        double media = (double) suma / list.size();
        System.out.println("Média: " + media);
    }

    public static int obtemElementoLista(int posicao) {
        return list.get(posicao);
    }

    public static void insereElementoLista(int posicao, int valor) {
        list.add(posicao, valor);
    }

    public static void substituiImparPorZero() {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 != 0) {
                list.set(i, 0);
            }
        }
    }

    public static void maiorElemento() {
        int maior = list.get(0);
        for (int num : list) {
            if (num > maior) {
                maior = num;
            }
        }
        System.out.println("Maior elemento: " + maior);
    }

    public static void menorElemento() {
        int menor = list.get(0);
        for (int num : list) {
            if (num < menor) {
                menor = num;
            }
        }
        System.out.println("Menor elemento: " + menor);
    }

    public static void imprimeLista() {
        System.out.println("Lista: " + list);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o tamanho da list: ");
        int tamanho = scanner.nextInt();
        criaLista(tamanho);

        imprimeLista();

        somatorio();
        media();

        System.out.print("\nDigite a posição para obter elemento: ");
        int pos = scanner.nextInt();
        System.out.println("Elemento na posição " + pos + ": " + obtemElementoLista(pos));

        System.out.print("\nDigite a posição para inserir: ");
        int posIns = scanner.nextInt();
        System.out.print("Digite o valor a inserir: ");
        int valor = scanner.nextInt();
        insereElementoLista(posIns, valor);

        imprimeLista();

        substituiImparPorZero();
        System.out.println("\nApós substituir ímpares por zero:");
        imprimeLista();

        maiorElemento();
        menorElemento();

        scanner.close();
    }
}
