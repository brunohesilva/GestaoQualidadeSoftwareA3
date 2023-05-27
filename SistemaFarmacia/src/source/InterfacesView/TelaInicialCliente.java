package source.InterfacesView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaInicialCliente extends JFrame {
    private JPanel PainelJ;
    private JLabel Titulo;
    private JButton loginButton;
    private JButton cadastrarSeButton;
    private JButton continuarButton;

    public TelaInicialCliente() {
        setContentPane(PainelJ);
        setTitle("Tela Inicial");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(700, 550);
        setLocationRelativeTo(null);
        setVisible(true);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

}
