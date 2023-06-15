package source.View;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.net.PasswordAuthentication;

public class TelaCadastrarUsuario extends JFrame{
    private JTextField IdTextField;
    private JTextField NomeTextField;
    private JTextField CpfTextField;
    private JTextField EmailTextField;
    private JTextField SenhaTextField;
    private JButton enviarButton;
    private JButton voltarButton;
    private JPanel CadastrarUsuario;

    public TelaCadastrarUsuario() {
        JFrame frameCadastroUsuario = new JFrame("Cadastrar Cliente");
        frameCadastroUsuario.setContentPane(CadastrarUsuario);
        frameCadastroUsuario.setTitle("Cadastrar Funcionário");
        frameCadastroUsuario.setDefaultCloseOperation((EXIT_ON_CLOSE));
        frameCadastroUsuario.setSize(800, 600);
        frameCadastroUsuario.setLocationRelativeTo(null);
        frameCadastroUsuario.setVisible(true);

        enviarButton.addActionListener(new ActionListener() {
            @Override
        public void actionPerformed(ActionEvent e) {
                if (!IdTextField.getText().equals("") && !NomeTextField.getText().equals("") && !CpfTextField.getText().equals("") && !EmailTextField.getText().equals("") && !SenhaTextField.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");
                    frameCadastroUsuario.dispose();
                    JFrame telaInicial = new JFrame("Tela Inicial");
                    telaInicial.add(new TelaInicial());
                }
                else
                    JOptionPane.showMessageDialog(null, "Preencha todos os campos!");


        }
    });
        voltarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frameCadastroUsuario.dispose();
                JFrame TelaInicial = new JFrame("Tela Inicial");
                TelaInicial.add(new TelaInicial());
            }
        });
    }
}
