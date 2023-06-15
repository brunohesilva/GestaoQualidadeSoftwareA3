package source.View;

import source.Controller.UsuarioController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaAtualizarFuncionario extends JFrame{
    private JTextField NomeTextField;
    private JTextField CpfTextField;
    private JTextField HorarioTextField;
    private JTextField FuncaoTextField;
    private JPanel AtualizarFuncionarioPanel;
    private JButton enviarButton;
    private JButton voltarButton;
    private JTextField IdTextField;

    public TelaAtualizarFuncionario() {
    JFrame frameAtualizarFuncionario = new JFrame("Atualizar Funcionário");
    frameAtualizarFuncionario.setContentPane(AtualizarFuncionarioPanel);
    frameAtualizarFuncionario.setTitle("Atualizar Funcionário");
    frameAtualizarFuncionario.setDefaultCloseOperation((EXIT_ON_CLOSE));
    frameAtualizarFuncionario.setSize(800, 600);
    frameAtualizarFuncionario.setLocationRelativeTo(null);
    frameAtualizarFuncionario.setVisible(true);
    voltarButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            frameAtualizarFuncionario.dispose();
            JFrame TelaInicial = new JFrame("Tela Inicial");
            TelaInicial.add(new TelaInicial());
        }
    });
    enviarButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            UsuarioController usuarioController = new UsuarioController();
            usuarioController.AtualizarUsuario(Integer.parseInt(IdTextField.getText()), NomeTextField.getText(), CpfTextField.getText(), HorarioTextField.getText(), FuncaoTextField.getText());

            frameAtualizarFuncionario.dispose();
            JFrame telaAdmin = new JFrame("Tela Inicial");
            telaAdmin.add(new TelaAdmin());
        }
    });
}
}
