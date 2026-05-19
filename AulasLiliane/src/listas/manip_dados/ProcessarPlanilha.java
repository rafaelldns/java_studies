package listas.manip_dados;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProcessarPlanilha {

    public static void main(String[] args) {
        String caminhoArquivo = "access-code-password-recovery-code.csv";
        String linha;
        String divisor = ";";

        List<String[]> dados = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {

            System.out.println("--- Todas as Linhas da Planilha ---");
            while ((linha = br.readLine()) != null) {
                String[] colunas = linha.split(divisor);
                dados.add(colunas);
                System.out.println(String.join(" | ", colunas));
            }

            System.out.println("\n--- Usuários em London ---");
            for (int i = 1; i < dados.size(); i++) {
                String[] fila = dados.get(i);
                if (fila[6].equalsIgnoreCase("London")) {
                    System.out.println(fila[3] + " " + fila[4]);
                }
            }

            System.out.println("\n--- Código de Acesso de Rachel ---");
            for (int i = 1; i < dados.size(); i++) {
                String[] fila = dados.get(i);
                if (fila[3].equalsIgnoreCase("Rachel")) {
                    System.out.println("O código de acesso é: " + fila[1]);
                }
            }

        } catch (IOException e) {
            System.err.println("Erro ao ler o ficheiro: " + e.getMessage());
        }
    }
}
