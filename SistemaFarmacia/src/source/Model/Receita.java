package source.Model;

import java.util.Date;

public class Receita {

    private int idReceita;
    private String nomePaciente;
    private String nomeMedico;
    private String dataValidade;
    private String nomeRemedio;
    private String descricaoUso;
    private int crm;

    public Receita(int idReceita, String nomePaciente, String nomeMedico, String dataValidade, String nomeRemedio, String descricaoUso, int crm) {
        this.idReceita = idReceita;
        this.nomePaciente = nomePaciente;
        this.nomeMedico = nomeMedico;
        this.dataValidade = dataValidade;
        this.nomeRemedio = nomeRemedio;
        this.descricaoUso = descricaoUso;
        this.crm = crm;
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
    public String getDescricaoUso() {
        return this.descricaoUso;
    }
    public int getCrm() {
        return this.crm;
    }

}
