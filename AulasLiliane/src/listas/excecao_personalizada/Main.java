package listas.excecao_personalizada;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- TESTANDO EXERCÍCIO 1 ---");
        ContaBancaria conta = new ContaBancaria(100.0);
        try {
            conta.sacar(150.0);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Exceção capturada: " + e.getMessage());
        }

        System.out.println("\n--- TESTANDO EXERCÍCIO 2 ---");
        Validador validador = new Validador();
        Usuario usuarioInvalido = new Usuario("", "teste@email.com");
        try {
            validador.validarUsuario(usuarioInvalido);
        } catch (CampoObrigatorioException e) {
            System.out.println("Exceção capturada: " + e.getMessage());
        }

        System.out.println("\n--- TESTANDO EXERCÍCIO 3 ---");
        ControleEstoque estoque = new ControleEstoque(0);

        try {
            estoque.adicionarEstoque(-5);
        } catch (QuantidadeInvalidaException e) {
            System.out.println("Exceção Unchecked capturada: " + e.getMessage());
        }

        try {
            estoque.comprar();
        } catch (ProdutoEsgotadoException e) {
            System.out.println("Exceção Checked capturada: " + e.getMessage());
        }
    }
}
