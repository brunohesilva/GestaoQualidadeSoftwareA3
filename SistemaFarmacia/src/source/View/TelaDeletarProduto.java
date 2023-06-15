package source.View;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaDeletarProduto extends JFrame{
    private JTextField idTextField;
    private JButton deletarButton;
    private JButton voltarButton;
    private JPanel DeletarProdutoPanel;


    public TelaDeletarProduto(){
        JFrame frameCadastroProduto = new JFrame("Deletar Produto");
        frameCadastroProduto.setContentPane(DeletarProdutoPanel);
        frameCadastroProduto.setTitle("Deletar Produto");
        frameCadastroProduto.setDefaultCloseOperation((EXIT_ON_CLOSE));
        frameCadastroProduto.setSize(800, 600);
        frameCadastroProduto.setLocationRelativeTo(null);
        frameCadastroProduto.setVisible(true);
        deletarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        voltarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
