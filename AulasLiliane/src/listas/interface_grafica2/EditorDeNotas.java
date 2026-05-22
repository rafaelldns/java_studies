package listas.interface_grafica2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EditorDeNotas extends JFrame {

    private JTextArea areaDeTexto;
    private JToolBar barraDeFerramentas;

    public EditorDeNotas() {
        setTitle("Editor de Notas Minimalista");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        areaDeTexto = new JTextArea();
        areaDeTexto.setFont(new Font("SansSerif", Font.PLAIN, 14));

        JScrollPane scrollPane = new JScrollPane(areaDeTexto);
        add(scrollPane, BorderLayout.CENTER);

        barraDeFerramentas = new JToolBar();

        barraDeFerramentas.setFloatable(false);

        JButton btnLimpar = new JButton("Limpar");
        JButton btnAumentar = new JButton("Aumentar Fonte");
        JButton btnDiminuir = new JButton("Diminuir Fonte");


        btnLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                areaDeTexto.setText("");
            }
        });

        btnAumentar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Font fonteAtual = areaDeTexto.getFont();
                int novoTamanho = fonteAtual.getSize() + 2;
                areaDeTexto.setFont(new Font(fonteAtual.getName(), fonteAtual.getStyle(), novoTamanho));
            }
        });

        btnDiminuir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Font fonteAtual = areaDeTexto.getFont();
                int novoTamanho = Math.max(2, fonteAtual.getSize() - 2);
                areaDeTexto.setFont(new Font(fonteAtual.getName(), fonteAtual.getStyle(), novoTamanho));
            }
        });

        barraDeFerramentas.add(btnLimpar);
        barraDeFerramentas.addSeparator();
        barraDeFerramentas.add(btnAumentar);
        barraDeFerramentas.add(btnDiminuir);

        add(barraDeFerramentas, BorderLayout.NORTH);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                EditorDeNotas editor = new EditorDeNotas();
                editor.setVisible(true);
            }
        });
    }
}
