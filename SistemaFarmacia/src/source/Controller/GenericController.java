package source.Controller;

import source.View.TelaInicial;
import source.View.TelaListarFuncionarios;
import source.View.TelaLogin;

import javax.swing.*;
import java.awt.event.ActionListener;

public class GenericController {
    private TelaInicial telaInicial;
    public GenericController(ActionListener telaInicial){
    }
    public GenericController(){

    }

    public static void TelaInicial(JPanel panel){
        TelaInicial ui = new TelaInicial();
        JPanel root = ui.getTelaInicial();
        JFrame frame = new JFrame();
        frame.pack();
        frame.setVisible(true);

    }

}
