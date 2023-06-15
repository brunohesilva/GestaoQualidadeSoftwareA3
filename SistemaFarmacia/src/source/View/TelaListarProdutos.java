package source.View;

import javax.swing.*;

public class TelaListarProdutos extends JFrame{
    private JPanel ListarProdutosPanel;
    private JTable ProdutosTable;

    public TelaListarProdutos(){
        JFrame frameListarProdutos = new JFrame("Listar Produtos");
        frameListarProdutos.setContentPane(ListarProdutosPanel);
        frameListarProdutos.setTitle("Listar Produtos");
        frameListarProdutos.setDefaultCloseOperation((EXIT_ON_CLOSE));
        frameListarProdutos.setSize(800, 600);
        frameListarProdutos.setLocationRelativeTo(null);
        frameListarProdutos.setVisible(true);
    }
}
