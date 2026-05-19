package listas.excecao_personalizada;

class CampoObrigatorioException extends Exception {
    public CampoObrigatorioException(String nomeDoCampo) {
        super("Erro de Validação: O campo '" + nomeDoCampo + "' não pode ser vazio.");
    }
}

class Usuario {
    private String nome;
    private String email;
    public Usuario(String nome, String email) { this.nome = nome; this.email = email; }
    public String getNome() { return nome; }
    public String getEmail() { return email; }
}

class Validador {
    public void validarUsuario(Usuario u) throws CampoObrigatorioException {
        if (u.getNome() == null || u.getNome().trim().isEmpty()) throw new CampoObrigatorioException("Nome");
        if (u.getEmail() == null || u.getEmail().trim().isEmpty()) throw new CampoObrigatorioException("E-mail");
        System.out.println("Usuário validado com sucesso!");
    }
}
