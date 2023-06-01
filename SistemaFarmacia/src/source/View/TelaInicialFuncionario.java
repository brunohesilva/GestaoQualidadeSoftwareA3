package source.View;

import javax.swing.*;

public class TelaInicialFuncionario extends JFrame{
    private JPanel TelaInicialFuncionarioPanel;
    private JButton editarButton;
    private JButton cadastrarButton1;
    private JButton listarButton;
    private JButton excluirButton;

    public TelaInicialFuncionario(){
        JFrame frameInicialFuncionario = new JFrame("Tela Inicial");
        frameInicialFuncionario.setContentPane(TelaInicialFuncionarioPanel);
        frameInicialFuncionario.setTitle("Tela Inicial");
        frameInicialFuncionario.setDefaultCloseOperation((EXIT_ON_CLOSE));
        frameInicialFuncionario.setSize(800, 600);
        frameInicialFuncionario.setLocationRelativeTo(null);
        frameInicialFuncionario.setVisible(true);
    }
}
