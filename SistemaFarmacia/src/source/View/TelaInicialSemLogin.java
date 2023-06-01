package source.View;

import javax.swing.*;

public class TelaInicialSemLogin extends JFrame{
    private JPanel SemLoginPanel;
    private JButton listarButton;

    public TelaInicialSemLogin(){
        JFrame frameInicialSemLogin = new JFrame("Tela Inicial");
        frameInicialSemLogin.setContentPane(SemLoginPanel);
        frameInicialSemLogin.setTitle("Tela Inicial");
        frameInicialSemLogin.setDefaultCloseOperation((EXIT_ON_CLOSE));
        frameInicialSemLogin.setSize(800, 600);
        frameInicialSemLogin.setLocationRelativeTo(null);
        frameInicialSemLogin.setVisible(true);
    }
}
