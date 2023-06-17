package source.Controller;

import source.Model.Produto;
import source.View.TelaListarProdutos;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class ProdutoController {

    private static List<Produto> produtoList = new ArrayList<>();

    public static void CadastrarProduto(int idRemedio, String nome,String descricao, String marca, int necessarioReceita, int quantidade) {
        try {
            Produto produto = new Produto(idRemedio, nome, descricao, marca, necessarioReceita, quantidade);
            produtoList.add(produto);
            JOptionPane.showMessageDialog(null, "Produto criado com sucesso!");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ops, Algo deu errado!");
        }
    };
    public static void ListagemProdutos(){
        TelaListarProdutos ui = new TelaListarProdutos();

        JPanel root = ui.getListarProdutosPanel();

        JFrame frame = new JFrame();

        frame.setDefaultCloseOperation (JFrame.DISPOSE_ON_CLOSE) ;
        frame.setContentPane(root);

        frame.pack();

        frame.setTitle("Cadastrar Produtos");
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }


    
    public static List<Produto> GetProdutos(){ return produtoList;
    }

}
