package listas.interface_swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GerenciadorEstoque extends JFrame {

    private JTextField txtNome;
    private JTextField txtPreco;
    private JComboBox<String> cbCategoria;
    private JRadioButton rbIsento;
    private JRadioButton rbNacional;
    private JRadioButton rbImportado;
    private ButtonGroup grupoTributacao;
    private JButton btnCadastrar;
    private JLabel lblStatus;

    public GerenciadorEstoque() {
        setTitle("Gerenciador de Estoque - Cadastro");
        setSize(450, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        gbc.gridx = 0; gbc.gridy = 0;
        add(new JLabel("Nome do Produto:"), gbc);

        txtNome = new JTextField(20);
        gbc.gridx = 1; gbc.gridy = 0;
        add(txtNome, gbc);

        gbc.gridx = 0; gbc.gridy = 1;
        add(new JLabel("Preço (R$):"), gbc);

        txtPreco = new JTextField(20);
        gbc.gridx = 1; gbc.gridy = 1;
        add(txtPreco, gbc);

        gbc.gridx = 0; gbc.gridy = 2;
        add(new JLabel("Categoria:"), gbc);

        String[] categorias = {"Eletrônicos", "Vestuário", "Alimentos"};
        cbCategoria = new JComboBox<>(categorias);
        gbc.gridx = 1; gbc.gridy = 2;
        add(cbCategoria, gbc);

        gbc.gridx = 0; gbc.gridy = 3;
        add(new JLabel("Tributação:"), gbc);

        JPanel painelRadio = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        rbIsento = new JRadioButton("Isento");
        rbNacional = new JRadioButton("Nacional (10%)");
        rbImportado = new JRadioButton("Importado (60%)");

        grupoTributacao = new ButtonGroup();
        grupoTributacao.add(rbIsento);
        grupoTributacao.add(rbNacional);
        grupoTributacao.add(rbImportado);

        painelRadio.add(rbIsento);
        painelRadio.add(rbNacional);
        painelRadio.add(rbImportado);

        gbc.gridx = 1; gbc.gridy = 3;
        add(painelRadio, gbc);

        btnCadastrar = new JButton("Cadastrar Produto");
        gbc.gridx = 0; gbc.gridy = 4;
        gbc.gridwidth = 2;
        add(btnCadastrar, gbc);

        lblStatus = new JLabel("");
        gbc.gridx = 0; gbc.gridy = 5;
        gbc.gridwidth = 2;
        lblStatus.setHorizontalAlignment(SwingConstants.CENTER);
        add(lblStatus, gbc);

        btnCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                validarECadastrar();
            }
        });
    }

    private void validarECadastrar() {
        String nome = txtNome.getText().trim();
        String preco = txtPreco.getText().trim();
        String categoria = (String) cbCategoria.getSelectedItem();

        String tributacaoSelecionada = "";
        if (rbIsento.isSelected()) {
            tributacaoSelecionada = "Isento";
        } else if (rbNacional.isSelected()) {
            tributacaoSelecionada = "Nacional (10%)";
        } else if (rbImportado.isSelected()) {
            tributacaoSelecionada = "Importado (60%)";
        }

        if (nome.isEmpty() || preco.isEmpty() || tributacaoSelecionada.isEmpty()) {
            lblStatus.setForeground(Color.RED);
            lblStatus.setText("Erro: Todos os campos devem ser preenchidos e uma tributação deve ser selecionada!");
        } else {
            lblStatus.setForeground(new Color(0, 128, 0));
            lblStatus.setText("Produto " + nome + " (" + categoria + ") - Tributo: " + tributacaoSelecionada + " cadastrado com sucesso!");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GerenciadorEstoque().setVisible(true);
            }
        });
    }
}
