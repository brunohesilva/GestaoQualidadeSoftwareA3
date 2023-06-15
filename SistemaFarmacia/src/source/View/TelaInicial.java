package source.View;

import source.Controller.GenericController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaInicial extends JFrame {
    private JPanel JpanelInicial;
    private JButton cadastroButton;
    private JButton continuarButton;
    private JButton loginButton;
    private GenericController genericController;

    public JPanel getTelaInicial() {
        return JpanelInicial;
    }
    public TelaInicial(){
         JFrame frameInicial = new JFrame("Inicial");
         frameInicial.setContentPane(JpanelInicial);
        frameInicial.setTitle("Tela Inicial");
        frameInicial.setDefaultCloseOperation((EXIT_ON_CLOSE));
        frameInicial.setSize(800, 600);
        frameInicial.setLocationRelativeTo(null);
        frameInicial.setVisible(true);
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frameInicial.dispose();
                JFrame frameLogin = new JFrame("Login");
                frameLogin.add(new TelaLogin());
            }
        });
        cadastroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frameInicial.dispose();
                JFrame frameRegistro = new JFrame("Registrar Usuário");
                frameRegistro.add(new TelaCadastrarUsuario());
            }
        });
        continuarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frameInicial.dispose();
                JFrame frameTelaSemLogin = new JFrame("Tela Inicial");
                frameTelaSemLogin.add(new TelaInicialSemLogin());
            }
        });
    }
}
