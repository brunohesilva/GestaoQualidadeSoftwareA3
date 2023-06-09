package source.View;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaCadastrarReceita  extends JFrame{
    private JTextField NomeRemedioTextField;
    private JTextField UsoTextField;
    private JButton enviarButton;
    private JButton voltarButton;
    private JTextField CRMTextField;
    private JTextField NomePacienteTextField;
    private JPanel CadastroReceitaPanel;
    private JTextField NomeMedicoTextField;
    private JTextField DataTextField;

    public TelaCadastrarReceita(){
        JFrame frameCadastroReceita = new JFrame("Cadastrar Receita");
        frameCadastroReceita.setContentPane(CadastroReceitaPanel);
        frameCadastroReceita.setTitle("Cadastrar Receita");
        frameCadastroReceita.setDefaultCloseOperation((EXIT_ON_CLOSE));
        frameCadastroReceita.setSize(800, 600);
        frameCadastroReceita.setLocationRelativeTo(null);
        frameCadastroReceita.setVisible(true);
        voltarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frameCadastroReceita.dispose();
                JFrame TelaInicial = new JFrame("Tela Inicial");
                TelaInicial.add(new TelaInicial());
            }
        });
        enviarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!NomeMedicoTextField.getText().equals("") && !NomePacienteTextField.getText().equals("") && !DataTextField.getText().equals("") && !NomeRemedioTextField.getText().equals("") && !UsoTextField.getText().equals("") &&  !CRMTextField.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Receita cadastrada com sucesso!");
                    frameCadastroReceita.dispose();
                    JFrame telaInicialSemLogin = new JFrame("Tela Inicial");
                    telaInicialSemLogin.add(new TelaInicialSemLogin());
                }
                else
                    JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
            }
        });
    }
}
