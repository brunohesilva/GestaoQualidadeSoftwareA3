package source;

import java.util.Date;

public class Receita {

    private int idReceita;
    private String nomePaciente;
    private String nomeMedico;
    private String dataValidade;

    public Receita(int idReceita, String nomePaciente, String nomeMedico, String dataValidade) {
        this.idReceita = idReceita;
        this.nomePaciente = nomePaciente;
        this.nomeMedico = nomeMedico;
        this.dataValidade = dataValidade;
    }

    public int getIdReceita() {
        return this.idReceita;
    }
    public String getNomePaciente() {
        return this.nomePaciente;
    }
    public String getNomeMedico(){
        return this.nomeMedico;
    }
    public String getDataValidade() {
        return this.dataValidade;
    }

}
