package source;

import java.util.Date;

public class Receita {

    private int idReceita;
    private String nomePaciente;
    private String nomeMedico;
    private String dataValidade;
    private String nomeRemedio;

    public Receita(int idReceita, String nomePaciente, String nomeMedico, String dataValidade, String nomeRemedio) {
        this.idReceita = idReceita;
        this.nomePaciente = nomePaciente;
        this.nomeMedico = nomeMedico;
        this.dataValidade = dataValidade;
        this.nomeRemedio = nomeRemedio;
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
    public String getNomeRemedio() {
        return this.nomeRemedio;
    }

}
