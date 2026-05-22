package listas.contrucao_interface_grafica;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class EditorComImagem extends JFrame {

    private JTextArea areaTexto;
    private JLabel labelImagem;

    public EditorComImagem() {
        setTitle("Editor de Texto com Imagem");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        areaTexto = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(areaTexto);
        add(scrollPane, BorderLayout.CENTER);

        labelImagem = new JLabel("", SwingConstants.CENTER);
        add(labelImagem, BorderLayout.SOUTH);

        JMenuBar menuBar = new JMenuBar();

        JMenu menuArquivo = new JMenu("Arquivo");
        JMenuItem itemLimpar = new JMenuItem("Limpar");
        JMenuItem itemSair = new JMenuItem("Sair");

        itemLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                areaTexto.setText("");
            }
        });

        itemSair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        menuArquivo.add(itemLimpar);
        menuArquivo.addSeparator();
        menuArquivo.add(itemSair);

        JMenu menuFormatar = new JMenu("Formatar");
        JMenuItem itemAzul = new JMenuItem("Texto Azul");
        JMenuItem itemVermelho = new JMenuItem("Texto Vermelho");
        JMenuItem itemPreto = new JMenuItem("Texto Preto");

        itemAzul.addActionListener(e -> areaTexto.setForeground(Color.BLUE));
        itemVermelho.addActionListener(e -> areaTexto.setForeground(Color.RED));
        itemPreto.addActionListener(e -> areaTexto.setForeground(Color.BLACK));

        menuFormatar.add(itemAzul);
        menuFormatar.add(itemVermelho);
        menuFormatar.add(itemPreto);

        JMenu menuImagem = new JMenu("Imagem");
        JMenuItem itemCarregar = new JMenuItem("Carregar Imagem...");

        itemCarregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                carregarImagem();
            }
        });

        menuImagem.add(itemCarregar);

        menuBar.add(menuArquivo);
        menuBar.add(menuFormatar);
        menuBar.add(menuImagem);

        setJMenuBar(menuBar);
    }

    private void carregarImagem() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Selecione uma Imagem");

        int resultado = fileChooser.showOpenDialog(this);

        if (resultado == JFileChooser.APPROVE_OPTION) {
            File arquivoSelecionado = fileChooser.getSelectedFile();

            ImageIcon iconeOriginal = new ImageIcon(arquivoSelecionado.getAbsolutePath());

            Image imagemRedimensionada = iconeOriginal.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);

            labelImagem.setIcon(new ImageIcon(imagemRedimensionada));

            revalidate();
            repaint();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                EditorComImagem app = new EditorComImagem();
                app.setVisible(true);
            }
        });
    }
}