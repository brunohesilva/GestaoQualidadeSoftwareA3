package source.View;

import source.Controller.GenericController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;

public class TelaInicial extends JFrame {
    private JPanel JpanelInicial;
    private JButton cadastroButton;
    private JButton continuarButton;
    private JButton loginButton;
    private GenericController genericController;
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
    }
}
