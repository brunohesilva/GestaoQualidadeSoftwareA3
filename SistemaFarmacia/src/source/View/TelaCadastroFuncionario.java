package source.View;

import javax.swing.*;

public class TelaCadastroFuncionario extends JFrame{
    private JPanel CadastroFuncionarioPanel;
    private JButton voltarButton;
    private JTextField NomeTextField;
    private JTextField CpfTextField;
    private JTextField EmailTextField;
    private JTextField SenhaTextField;
    private JTextField HorarioTextField;
    private JTextField FuncaoTextField;
    private JButton enviarButton;

    public TelaCadastroFuncionario(){
        JFrame frameCadastroFuncionario = new JFrame("Cadastrar Funcionário");
        frameCadastroFuncionario.setContentPane(CadastroFuncionarioPanel);
        frameCadastroFuncionario.setTitle("Cadastrar Funcionário");
        frameCadastroFuncionario.setDefaultCloseOperation((EXIT_ON_CLOSE));
        frameCadastroFuncionario.setSize(800, 600);
        frameCadastroFuncionario.setLocationRelativeTo(null);
        frameCadastroFuncionario.setVisible(true);
    }
}

