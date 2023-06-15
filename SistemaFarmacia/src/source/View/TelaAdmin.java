package source.View;

import source.Controller.GenericController;
import source.Controller.UsuarioController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaAdmin extends JFrame{
    private JPanel TelaAdminPanel;
    private JButton cadastrarButton;
    private JButton listarButton;
    private JButton editarButton;
    private JButton voltarButton;
    private JButton excluirButton;

    public TelaAdmin(){
        JFrame frameAdmin = new JFrame("Tela Admin");
        frameAdmin.setContentPane(TelaAdminPanel);
        frameAdmin.setTitle("Admin");
        frameAdmin.setDefaultCloseOperation((EXIT_ON_CLOSE));
        frameAdmin.setSize(800, 600);
        frameAdmin. setLocationRelativeTo(null);
        frameAdmin.setVisible(true);
        listarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                frameAdmin.dispose();
                UsuarioController usuarioController = new UsuarioController();
                usuarioController.ListagemFuncionarios();
            }
        });
        cadastrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frameAdmin.dispose();
//                frameInicial.dispose();
                JFrame frameRegistro = new JFrame("Registrar Funcionário");
                frameRegistro.add(new TelaCadastroUsuario());
            }
        });
        voltarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frameAdmin.dispose();
                JFrame frameTelaInicial = new JFrame("Tela Inicial");
                frameTelaInicial.add(new TelaInicial());
            }
        });
        editarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frameAdmin.dispose();
                JFrame frameAtualizarFun = new JFrame("Atualizar Funcionário");
                frameAtualizarFun.add(new TelaAtualizarFuncionario());
            }
        });
        excluirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frameAdmin.dispose();
                JFrame frameDeletarFuncionario = new JFrame("Deletar Funcionário");
                frameDeletarFuncionario.add(new TelaDeletarUsuario());
            }
        });
    }
}

