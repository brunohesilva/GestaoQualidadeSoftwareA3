package source.View;

import javax.swing.*;

public class TelaAdmin extends JFrame{
    private JPanel TelaAdminPanel;
    private JButton cadastrarButton;
    private JButton excluirButton;
    private JButton listarButton;
    private JButton editarButton;

    public TelaAdmin(){
        setContentPane(TelaAdminPanel);
        setTitle("Admin");
        setDefaultCloseOperation((EXIT_ON_CLOSE));
        setSize(800, 600);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}

