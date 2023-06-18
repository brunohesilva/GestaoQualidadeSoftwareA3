package source.View;

import source.Controller.ProdutoController;
import source.Controller.UsuarioController;
import source.Model.Produto;
import source.Model.Usuario;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaInicialSemLogin extends JFrame{
    private JPanel SemLoginPanel;
    private JButton listarButton;
    private JButton cadastrarReceitaButton;
    private JButton voltarButton;

    public TelaInicialSemLogin(){
        JFrame frameInicialSemLogin = new JFrame("Tela Inicial");
        frameInicialSemLogin.setContentPane(SemLoginPanel);
        frameInicialSemLogin.setTitle("Tela Inicial");
        frameInicialSemLogin.setDefaultCloseOperation((EXIT_ON_CLOSE));
        frameInicialSemLogin.setSize(800, 600);
        frameInicialSemLogin.setLocationRelativeTo(null);
        frameInicialSemLogin.setVisible(true);
        cadastrarReceitaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frameInicialSemLogin.dispose();
                JFrame frameRegistroReceita = new JFrame("Registrar Receita");
                frameRegistroReceita.add(new TelaCadastrarReceita());
            }
        });
        voltarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frameInicialSemLogin.dispose();
                JFrame frameTelaInicial = new JFrame("Tela Inicial");
                frameTelaInicial.add(new TelaInicial());
            }
        });
        listarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ProdutoController produtoController = new ProdutoController();
                produtoController.ListagemProdutos();
            }
        });
    }
}
