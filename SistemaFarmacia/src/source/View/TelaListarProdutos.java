package source.View;

import source.Controller.ProdutoController;
import source.Controller.UsuarioController;
import source.Model.Produto;
import source.Model.Usuario;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import java.util.List;

public class TelaListarProdutos extends JFrame{
    private JPanel ListarProdutosPanel;
    private JTable ProdutosTable;

//    public TelaListarProdutos(){
//        JFrame frameListarProdutos = new JFrame("Listar Produtos");
//        frameListarProdutos.setContentPane(ListarProdutosPanel);
//        frameListarProdutos.setTitle("Listar Produtos");
//        frameListarProdutos.setDefaultCloseOperation((EXIT_ON_CLOSE));
//        frameListarProdutos.setSize(800, 600);
//        frameListarProdutos.setLocationRelativeTo(null);
//        frameListarProdutos.setVisible(true);
//    }
    public TelaListarProdutos() {
        createTable();
    }

    public JPanel getListarProdutosPanel() {
        return ListarProdutosPanel;
    }

    public void createTable(){
        ProdutoController produtoController = new ProdutoController();

        var lista = produtoController.GetProdutos();

        ProdutosTable.setModel(new AbstractTableModel() {

            private final String[] COLUMNS = {"Id", "Nome", "Descrição", "Marca", "Necessário Receita", "Quantidade"};
            private List<Produto> produtos = lista;

            @Override
            public int getRowCount() {
                return produtos.size();
            }

            @Override
            public int getColumnCount() {
                return COLUMNS.length;
            }

            @Override
            public Object getValueAt(int rowIndex, int columnIndex) {
                return switch(columnIndex) {
                    case 0 -> produtos.get(rowIndex).getIdProduto();
                    case 1 -> produtos.get(rowIndex).getNome();
                    case 2 -> produtos.get(rowIndex).getDescricao();
                    case 3 -> produtos.get(rowIndex).getMarca();
                    case 4 -> produtos.get(rowIndex).getNecessarioReceita();
                    case 5 -> produtos.get(rowIndex).getQuantidade();
                    default -> "-";
                };
            }
            @Override
            public String getColumnName(int column){
                return COLUMNS[column];
            }
            @Override
            public Class<?> getColumnClass(int columnIndex){
                if(getValueAt(0, columnIndex) != null){
                    return getValueAt(0, columnIndex).getClass();
                } else{
                    return Object.class;
                }
            }
        });
    }
}
