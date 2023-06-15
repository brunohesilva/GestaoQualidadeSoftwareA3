package source.View;

import source.Controller.UsuarioController;
import source.Model.Usuario;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class TelaLogin extends JFrame{
    private JPanel TelaLoginPanel;
    private JButton BotaoEnviar;
    private JTextField EmailTextField;
    private JPasswordField passwordField1;
    private JButton voltarButton;
    private static List<Usuario> usuarioList = new ArrayList<>();


    public JPanel getTelaLoginPanel(){
        return TelaLoginPanel;
    }

    public TelaLogin(){
        JFrame frameLogin = new JFrame("Login");
        frameLogin.setContentPane(TelaLoginPanel);
        frameLogin.setTitle("Login");
        frameLogin.setDefaultCloseOperation((EXIT_ON_CLOSE));
        frameLogin.setSize(800, 600);
        frameLogin.setLocationRelativeTo(null);
        frameLogin.setVisible(true);

        BotaoEnviar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                UsuarioController usuarioController = new UsuarioController();

                var lista = usuarioController.GetUsuarios();

                    for(int i = 0; i < lista.size(); i++){
                        if ((lista.get(i).getEmail().equals(EmailTextField.getText()) && lista.get(i).getSenha().equals(new String(passwordField1.getPassword()))) && lista.get(i).getADM() == 1) {
                        frameLogin.dispose();
                        JFrame frameAdmin = new JFrame("Tela Inicial");
                        frameAdmin.add(new TelaAdmin());
                        break;
                    }
                    else if ((lista.get(i).getEmail().equals(EmailTextField.getText()) && lista.get(i).getSenha().equals(new String(passwordField1.getPassword()))) && lista.get(i).getADM() == 0) {
                        frameLogin.dispose();
                        JFrame frameFuncionario= new JFrame("Tela Inicial");
                        frameFuncionario.add(new TelaInicialFuncionario());
                        break;
                        }
                        if (lista.size() == i + 1) {
                            if (!(lista.get(i).getEmail().equals(EmailTextField.getText()) && lista.get(i).getSenha().equals(new String(passwordField1.getPassword())))) {
                                JOptionPane.showMessageDialog(frameLogin,
                                        "Combinação Inválida!");
                            }
                        }
                    }
                if(lista.isEmpty()){
                    JOptionPane.showMessageDialog(frameLogin,
                            "Combinação Inválida!");
                }
            }
        });
        voltarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frameLogin.dispose();
                JFrame frameInicio = new JFrame("Login");
                frameInicio.add(new TelaInicial());
            }
        });
    }
}
