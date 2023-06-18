package source.View;

import source.Controller.ProdutoController;
import source.Controller.UsuarioController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaInicialFuncionario extends JFrame{
    private JPanel TelaInicialFuncionarioPanel;
    private JButton editarButton;
    private JButton cadastrarButton1;
    private JButton listarButton;
    private JButton excluirButton;
    private JButton voltarButton;


    public TelaInicialFuncionario(){
        JFrame frameInicialFuncionario = new JFrame("Tela Inicial");
        frameInicialFuncionario.setContentPane(TelaInicialFuncionarioPanel);
        frameInicialFuncionario.setTitle("Tela Inicial");
        frameInicialFuncionario.setDefaultCloseOperation((EXIT_ON_CLOSE));
        frameInicialFuncionario.setSize(800, 600);
        frameInicialFuncionario.setLocationRelativeTo(null);
        frameInicialFuncionario.setVisible(true);
        voltarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frameInicialFuncionario.dispose();
                JFrame frameTelaInicial = new JFrame("Tela Inicial");
                frameTelaInicial.add(new TelaInicial());
            }
        });
        cadastrarButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frameInicialFuncionario.dispose();
                JFrame frameTelaCadastroFuncionario = new JFrame("Cadastro Funcionário");
                frameTelaCadastroFuncionario.add(new TelaCadastroProduto());
            }
        });
        listarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ProdutoController produtoController = new ProdutoController();
                produtoController.ListagemProdutos();
            }
        });
        editarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frameInicialFuncionario.dispose();
                JFrame frameEditarProduto = new JFrame("Editar Produto");
                frameEditarProduto.add(new TelaEditarProduto());
            }
        });
        excluirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frameInicialFuncionario.dispose();
                JFrame frameExcluirProduto = new JFrame("Excluir Produto");
                frameExcluirProduto.add(new TelaDeletarProduto());
            }
        });
    }
}
