package source.View;

import javax.swing.*;

public class TelaInicialClienteLogado extends JFrame{
    private JPanel ClienteLogadoPanel;
    private JButton listarButton;
    private JButton enviarButton;

    public TelaInicialClienteLogado(){
        JFrame frameInicialClienteLogado = new JFrame("Inicial");
        frameInicialClienteLogado.setContentPane(ClienteLogadoPanel);
        frameInicialClienteLogado.setTitle("Tela Inicial");
        frameInicialClienteLogado.setDefaultCloseOperation((EXIT_ON_CLOSE));
        frameInicialClienteLogado.setSize(800, 600);
        frameInicialClienteLogado.setLocationRelativeTo(null);
        frameInicialClienteLogado.setVisible(true);
    }
}
