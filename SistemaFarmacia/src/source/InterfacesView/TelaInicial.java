package source.InterfacesView;

import javax.swing.*;

public class TelaInicial extends JFrame {
    private JPanel PainelJ;

    public TelaInicial() {
        setContentPane(PainelJ);
        setTitle("Tela Inicial");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(700, 550);
        setLocationRelativeTo(null);
        setVisible(true);

    }

}
