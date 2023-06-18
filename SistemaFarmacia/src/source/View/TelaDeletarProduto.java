package source.View;

import source.Controller.ProdutoController;
import source.Model.Produto;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaDeletarProduto extends JFrame{
    private JTextField IdTextField;
    private JButton deletarButton;
    private JButton voltarButton;
    private JPanel DeletarProdutoPanel;


    public TelaDeletarProduto(){
        JFrame frameDeletarProduto = new JFrame("Deletar Produto");
        frameDeletarProduto.setContentPane(DeletarProdutoPanel);
        frameDeletarProduto.setTitle("Deletar Produto");
        frameDeletarProduto.setDefaultCloseOperation((EXIT_ON_CLOSE));
        frameDeletarProduto.setSize(800, 600);
        frameDeletarProduto.setLocationRelativeTo(null);
        frameDeletarProduto.setVisible(true);
        deletarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ProdutoController produtoController = new ProdutoController();
                var lista = produtoController.GetProdutos();
                for(Produto produto : lista){
                    if(Integer.parseInt(IdTextField.getText()) == produto.getIdProduto()){
                        produtoController.DeletarProduto(produto.getIdProduto());
                        frameDeletarProduto.dispose();
                        JFrame telaInicialFuncionario = new JFrame("Tela Inicial Funcionário");
                        telaInicialFuncionario.add(new TelaInicialFuncionario());
                    }
                }
            }
        });
        voltarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frameDeletarProduto.dispose();
                JFrame telaInicialFuncionario = new JFrame("Tela Inicial Funcionário");
                telaInicialFuncionario.add(new TelaInicialFuncionario());
            }
        });
    }
}
