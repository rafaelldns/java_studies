package listas.manip_notas;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Aluno {
    String nome;
    double nota1;
    double nota2;
    double media;
    String situacao;

    public Aluno(String nome, double nota1, double nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;

        this.media = (nota1 + nota2) / 2;

        if (media >= 7) {
            situacao = "Aprovado";
        } else if (media >= 5) {
            situacao = "Recuperação";
        } else {
            situacao = "Reprovado";
        }
    }
}

public class Main {

    public static void main(String[] args) {

        ArrayList<Aluno> alunos = new ArrayList<>();

        try {
            File arquivo = new File("C:/Users/Cliente/Desktop/Estudos/classes/notas_alunos.csv");
            Scanner leitor = new Scanner(arquivo);

            boolean primeiraLinha = true;

            while (leitor.hasNextLine()) {

                String linha = leitor.nextLine();

                if (primeiraLinha) {
                    primeiraLinha = false;
                    continue;
                }
                if (linha.trim().isEmpty()) {
                    continue;
                }

                String[] dados = linha.split(";");

                String nome = dados[0];

                double nota1 = Double.parseDouble(dados[1].trim());
                double nota2 = Double.parseDouble(dados[2].trim());

                alunos.add(new Aluno(nome, nota1, nota2));
            }

            leitor.close();

        } catch (FileNotFoundException e) {
            System.out.println("Arquivo notas_alunos.csv não encontrado.");
            return;
        }

        System.out.println("a) Total de alunos: " + alunos.size());

        int aprovados = 0;
        int recuperacao = 0;
        int reprovados = 0;

        Aluno melhorAluno = alunos.get(0);

        for (Aluno a : alunos) {

            if (a.situacao.equals("Aprovado")) {
                aprovados++;
            }

            else if (a.situacao.equals("Recuperação")) {
                recuperacao++;
            }

            else {
                reprovados++;
            }

            if (a.media > melhorAluno.media) {
                melhorAluno = a;
            }
        }

        System.out.println("b) Total de alunos aprovados: " + aprovados);
        System.out.println("c) Total de alunos em recuperação: " + recuperacao);
        System.out.println("d) Total de alunos reprovados: " + reprovados);

        System.out.println("e) Aluno com maior média: "
                + melhorAluno.nome
                + " | Média: "
                + melhorAluno.media);

        System.out.println("\nf) Alunos em Recuperação:");

        for (Aluno a : alunos) {
            if (a.situacao.equals("Recuperação")) {
                System.out.println(a.nome + " | Média: " + a.media);
            }
        }

        System.out.println("\ng) Alunos com Nota 1 menor que 3.0:");

        for (Aluno a : alunos) {
            if (a.nota1 < 3.0) {
                System.out.println(a.nome + " | Nota 1: " + a.nota1);
            }
        }

        Collections.sort(alunos, Comparator.comparing(aluno -> aluno.nome));

        System.out.println("\nh) Lista de alunos em ordem A-Z:");

        for (Aluno a : alunos) {
            System.out.println(a.nome);
        }
    }
}
