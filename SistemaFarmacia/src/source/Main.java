package source;

import source.InterfacesView.TelaInicialCliente;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new TelaInicialCliente();
        });    }

}