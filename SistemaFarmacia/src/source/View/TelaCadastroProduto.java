package source.View;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaCadastroProduto extends JFrame {
    private JPanel CadastroProdutoPanel;
    private JTextField nomeTextField;
    private JTextField descriçãoTextField;
    private JTextField marcaTextField;
    private JTextField tipoTextField;
    private JTextField quantidadeTextField;
    private JTextField pesoTextField;
    private JRadioButton necessárioReceitaRadioButton;
    private JButton enviarButton;

    public TelaCadastroProduto(){
        JFrame frameLogin = new JFrame("Login");
        frameLogin.setContentPane(CadastroProdutoPanel);
        frameLogin.setTitle("Login");
        frameLogin.setDefaultCloseOperation((EXIT_ON_CLOSE));
        frameLogin.setSize(800, 600);
        frameLogin.setLocationRelativeTo(null);
        frameLogin.setVisible(true);
        enviarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}

