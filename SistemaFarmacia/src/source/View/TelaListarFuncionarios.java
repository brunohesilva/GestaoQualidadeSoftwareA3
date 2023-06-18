package source.View;

import source.Controller.GenericController;
import source.Controller.UsuarioController;
import source.Model.Usuario;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import static javax.swing.UIManager.getUI;

public class TelaListarFuncionarios extends JFrame{
    private JPanel ListarFuncionariosPanel;
    private JTable FuncionariosTable;
    private JScrollPane JSCrollPane;

        public TelaListarFuncionarios() { createTable(); }

    public JPanel getListarFuncionariosPanel() {
        return ListarFuncionariosPanel;
    }

    public void createTable(){
        UsuarioController usuarioController = new UsuarioController();

        var lista = usuarioController.GetUsuarios();

        FuncionariosTable.setModel(new AbstractTableModel() {

            private final String[] COLUMNS = {"Id", "Nome", "CPF", "Horário", "Função", "ADM"};
            private List<Usuario> usuarios = lista;

            @Override
            public int getRowCount() {
                return usuarios.size();
            }

            @Override
            public int getColumnCount() {
                return COLUMNS.length;
            }

            @Override
            public Object getValueAt(int rowIndex, int columnIndex) {
                return switch(columnIndex) {
                    case 0 -> usuarios.get(rowIndex).getIdUsuario();
                    case 1 -> usuarios.get(rowIndex).getNome();
                    case 2 -> usuarios.get(rowIndex).getCpf();
                    case 3 -> usuarios.get(rowIndex).getHorario();
                    case 4 -> usuarios.get(rowIndex).getFuncao();
                    case 5 -> usuarios.get(rowIndex).getADM();
                    default -> "-";
                };
            }
            @Override
            public String getColumnName(int column){
                return COLUMNS[column];
            }
            @Override
            public Class<?> getColumnClass(int columnIndex){
                if(getValueAt(0, columnIndex) != null){
                    return getValueAt(0, columnIndex).getClass();
                } else{
                    return Object.class;
                }
            }
        });
    }
}

