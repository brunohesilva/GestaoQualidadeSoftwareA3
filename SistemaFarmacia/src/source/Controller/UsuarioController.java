package source.Controller;
import source.Model.Usuario;
import source.View.TelaListarFuncionarios;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UsuarioController {
    private static List<Usuario> usuarioList = new ArrayList<>();

    public static void CadastrarUsuario(int idUsuario, String nome, String cpf, String email, String senha, int funcionario, int admin, String horario, String funcao) {
        try {
            Usuario usuario = new Usuario(idUsuario, nome, cpf, email, senha, funcionario, horario, funcao, admin);
            usuarioList.add(usuario);
            JOptionPane.showMessageDialog(null, "Usuário criado com sucesso!");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ops, Algo deu errado!");
        }
    };
    public static void AtualizarUsuario(int id, String nome, String cpf, String horario, String funcao) {
        try {
            for(Usuario usuario : usuarioList){
                if(id == usuario.getIdUsuario()){
                    if(!nome.equals(""))
                    usuario.setNome(nome);
                    if(!cpf.equals(""))
                    usuario.setCpf(cpf);
                    if(!horario.equals(""))
                    usuario.setHorario(horario);
                    if(!funcao.equals(""))
                    usuario.setFuncao(funcao);
                }
            }
            JOptionPane.showMessageDialog(null, "Usuário atualizado com sucesso!");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ops, Algo deu errado!");
        }
    };
    public static void DeletarUsuario(int id) {
        try {
            for(Usuario usuario : usuarioList){
                if(id == usuario.getIdUsuario()){
                    usuarioList.remove(usuario);
                }
            }
            JOptionPane.showMessageDialog(null, "Usuário removido com sucesso!");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ops, Algo deu errado!");
        }
    };
    public static void ListagemFuncionarios(){
        TelaListarFuncionarios ui = new TelaListarFuncionarios();

        JPanel root = ui.getListarFuncionariosPanel();

        JFrame frame = new JFrame();



        frame.setDefaultCloseOperation (JFrame.DISPOSE_ON_CLOSE) ;
        frame.setContentPane(root);

        frame.pack();

        frame.setTitle("Cadastrar Funcionário");
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static List<Usuario> GetUsuarios(){
      return usuarioList;
    }
}
