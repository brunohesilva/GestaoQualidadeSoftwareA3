package source.View;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaCadastroProduto extends JFrame {
    private JPanel CadastroProdutoPanel;
    private JTextField DescricaoTextField;
    private JTextField MarcaTextField;
    private JTextField TipoTextField;
    private JTextField QuantidadeTextField;
    private JRadioButton necessárioReceitaRadioButton;
    private JButton enviarButton;
    private JButton voltarButton;
    private JTextField NomeTextField;

    public TelaCadastroProduto(){
        JFrame frameCadastroProduto = new JFrame("Login");
        frameCadastroProduto.setContentPane(CadastroProdutoPanel);
        frameCadastroProduto.setTitle("Cadastrar Produto");
        frameCadastroProduto.setDefaultCloseOperation((EXIT_ON_CLOSE));
        frameCadastroProduto.setSize(800, 600);
        frameCadastroProduto.setLocationRelativeTo(null);
        frameCadastroProduto.setVisible(true);
        enviarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        voltarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frameCadastroProduto.dispose();
                JFrame frameLogin = new JFrame("Login");
                frameLogin.add(new TelaLogin());
            }
        });
        enviarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}

