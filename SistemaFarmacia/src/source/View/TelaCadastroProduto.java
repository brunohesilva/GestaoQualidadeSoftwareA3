package source.View;

import source.Controller.ProdutoController;
import source.Controller.UsuarioController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaCadastroProduto extends JFrame {
    private JPanel CadastroProdutoPanel;
    private JTextField DescricaoTextField;
    private JTextField MarcaTextField;
    private JTextField TipoTextField;
    private JTextField QuantidadeTextField;
    private JRadioButton necessarioReceitaRadioButton;
    private JTextField IdTextField;
    private JButton enviarButton;
    private JButton voltarButton;
    private JTextField NomeTextField;

    public TelaCadastroProduto(){
        JFrame frameCadastroProduto = new JFrame("Login");
        frameCadastroProduto.setContentPane(CadastroProdutoPanel);
        frameCadastroProduto.setTitle("Cadastrar Produto");
        frameCadastroProduto.setDefaultCloseOperation((EXIT_ON_CLOSE));
        frameCadastroProduto.setSize(800, 600);
        frameCadastroProduto.setLocationRelativeTo(null);
        frameCadastroProduto.setVisible(true);
        enviarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                var trueOrFalseNecessarioReceita = 0;
                if (necessarioReceitaRadioButton.isSelected())
                    trueOrFalseNecessarioReceita = 1;
                else
                    trueOrFalseNecessarioReceita = 0;

                ProdutoController produtoController = new ProdutoController();
                produtoController.CadastrarProduto(Integer.parseInt(IdTextField.getText()), NomeTextField.getText(), DescricaoTextField.getText(), MarcaTextField.getText(), trueOrFalseNecessarioReceita, Integer.parseInt(QuantidadeTextField.getText()));
                frameCadastroProduto.dispose();
                JFrame TelaAdmin = new JFrame("Tela Inicial");
                TelaAdmin.add(new TelaAdmin());
            }
        });
        voltarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frameCadastroProduto.dispose();
                JFrame frameLogin = new JFrame("Login");
                frameLogin.add(new TelaLogin());
            }
        });
        enviarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}

