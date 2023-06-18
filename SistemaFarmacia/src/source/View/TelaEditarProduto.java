package source.View;

import source.Controller.ProdutoController;
import source.Controller.UsuarioController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaEditarProduto extends JFrame{
    private JPanel EditarProdutoPanel;
    private JTextField NomeTextField;
    private JTextField DescricaoTextField;
    private JTextField MarcaTextField;
    private JTextField TipoTextField;
    private JTextField QuantidadeTextField;
    private JButton voltarButton;
    private JRadioButton necessárioReceitaRadioButton;
    private JButton enviarButton;
    private JTextField IdTextField;

    public TelaEditarProduto() {
        JFrame frameTelaEditarProduto = new JFrame("Editar Produto");
        frameTelaEditarProduto.setContentPane(EditarProdutoPanel);
        frameTelaEditarProduto.setTitle("Editar Produto");
        frameTelaEditarProduto.setDefaultCloseOperation((EXIT_ON_CLOSE));
        frameTelaEditarProduto.setSize(800, 600);
        frameTelaEditarProduto.setLocationRelativeTo(null);
        frameTelaEditarProduto.setVisible(true);
        voltarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frameTelaEditarProduto.dispose();
                JFrame telaInicialFuncionario = new JFrame("Tela Inicial Funcionário");
                telaInicialFuncionario.add(new TelaInicialFuncionario());
            }
        });
        enviarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                var trueOrFalseNecessarioReceita = 0;
                if (necessárioReceitaRadioButton.isSelected())
                    trueOrFalseNecessarioReceita = 1;
                else
                    trueOrFalseNecessarioReceita = 0;
                ProdutoController produtoController = new ProdutoController();
                produtoController.EditarProduto(Integer.parseInt(IdTextField.getText()), NomeTextField.getText(), DescricaoTextField.getText(), MarcaTextField.getText(), trueOrFalseNecessarioReceita, Integer.parseInt(QuantidadeTextField.getText()));

                frameTelaEditarProduto.dispose();
                JFrame telaInicialFuncionario = new JFrame("Tela Inicial Funcionário");
                telaInicialFuncionario.add(new TelaInicialFuncionario());
            }
        });
    }
}
