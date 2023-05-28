package source.View;

import javax.swing.*;

public class TelaLogin extends JFrame{
    private JPanel TelaLoginPanel;
    private JButton BotaoEnviar;
    private JTextField textField1;
    private JPasswordField passwordField1;

    public TelaLogin(){
        setContentPane(TelaLoginPanel);
        setTitle("Login");
        setDefaultCloseOperation((EXIT_ON_CLOSE));
        setSize(800, 600);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
