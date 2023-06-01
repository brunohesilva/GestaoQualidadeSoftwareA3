package source.View;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaLogin extends JFrame{
    private JPanel TelaLoginPanel;
    private JButton BotaoEnviar;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton voltarButton;

    public TelaLogin(){
        JFrame frameLogin = new JFrame("Login");
        frameLogin.setContentPane(TelaLoginPanel);
        frameLogin.setTitle("Login");
        frameLogin.setDefaultCloseOperation((EXIT_ON_CLOSE));
        frameLogin.setSize(800, 600);
        frameLogin.setLocationRelativeTo(null);
        frameLogin.setVisible(true);
        BotaoEnviar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frameLogin.dispose();
                JFrame frameAdmin = new JFrame("Login");
                frameAdmin.add(new TelaCadastroProduto());
            }
        });
        voltarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frameLogin.dispose();
                JFrame frameInicio = new JFrame("Login");
                frameInicio.add(new TelaInicial());
            }
        });
    }
}
