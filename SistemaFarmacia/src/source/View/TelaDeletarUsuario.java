package source.View;

import source.Controller.UsuarioController;
import source.Model.Usuario;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaDeletarUsuario extends JFrame{
    private JPanel DeletarFuncionarioPanel;
    private JButton deletarButton;
    private JTextField IdTextField;
    private JButton voltarButton;

    public TelaDeletarUsuario() {
    JFrame frameDeletarUsuario = new JFrame("Deletar Usuário");
    frameDeletarUsuario.setContentPane(DeletarFuncionarioPanel);
    frameDeletarUsuario.setTitle("Cadastrar Receita");
    frameDeletarUsuario.setDefaultCloseOperation((EXIT_ON_CLOSE));
    frameDeletarUsuario.setSize(800, 600);
    frameDeletarUsuario.setLocationRelativeTo(null);
    frameDeletarUsuario.setVisible(true);
    deletarButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            UsuarioController usuarioController = new UsuarioController();
            var lista = usuarioController.GetUsuarios();
            for(Usuario usuario : lista){
                if(Integer.parseInt(IdTextField.getText()) == usuario.getIdUsuario()){
                    usuarioController.DeletarUsuario(Integer.parseInt(IdTextField.getText()));
                    frameDeletarUsuario.dispose();
                    JFrame telaAdm = new JFrame("Tela Inicial");
                    telaAdm.add(new TelaAdmin());
                }
            }
        }
    });
        voltarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frameDeletarUsuario.dispose();
                JFrame telaAdm = new JFrame("Tela Inicial");
                telaAdm.add(new TelaAdmin());
            }
        });
    }
}
