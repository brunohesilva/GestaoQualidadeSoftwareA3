package source.View;

import source.Controller.UsuarioController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import source.Model.Usuario;

public class TelaCadastroFuncionario extends JFrame{
    private static List<Usuario> usuarioList = new ArrayList<>();
    private JPanel CadastroFuncionarioPanel;
    private JButton voltarButton;
    private JTextField NomeTextField;
    private JTextField CpfTextField;
    private JTextField EmailTextField;
    private JTextField SenhaTextField;
    private JTextField HorarioTextField;
    private JTextField FuncaoTextField;
    private JButton enviarButton;
    private JTextField IdTextField;
    private JRadioButton funcionarioRadioButton;
    private JRadioButton administradorRadioButton2;

    public TelaCadastroFuncionario(){
        JFrame frameCadastroFuncionario = new JFrame("Cadastrar Funcionário");
        frameCadastroFuncionario.setContentPane(CadastroFuncionarioPanel);
        frameCadastroFuncionario.setTitle("Cadastrar Funcionário");
        frameCadastroFuncionario.setDefaultCloseOperation((EXIT_ON_CLOSE));
        frameCadastroFuncionario.setSize(800, 600);
        frameCadastroFuncionario.setLocationRelativeTo(null);
        frameCadastroFuncionario.setVisible(true);

        enviarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                var trueOrFalseFuncionario = 0;
                if (funcionarioRadioButton.isSelected())
                    trueOrFalseFuncionario = 1;
                else
                    trueOrFalseFuncionario = 0;

                var trueOrFalseAdm = 0;
                if (administradorRadioButton2.isSelected())
                    trueOrFalseAdm = 1;
                else
                    trueOrFalseAdm = 0;

                UsuarioController usuarioController = new UsuarioController();
                usuarioController.CadastrarUsuario(Integer.parseInt(IdTextField.getText()), NomeTextField.getText(), CpfTextField.getText(), EmailTextField.getText(), SenhaTextField.getText(), trueOrFalseFuncionario, trueOrFalseAdm, HorarioTextField.getText(), FuncaoTextField.getText());

                frameCadastroFuncionario.dispose();
                JFrame TelaAdmin = new JFrame("Tela Inicial");
                TelaAdmin.add(new TelaAdmin());
            }
        });
        voltarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frameCadastroFuncionario.dispose();
                JFrame TelaAdmin = new JFrame("Tela Inicial");
                TelaAdmin.add(new TelaAdmin());
            }
        });
    }
}

