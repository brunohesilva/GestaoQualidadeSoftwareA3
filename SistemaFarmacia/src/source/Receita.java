package source;

public class Receita {

    private int idReceita;
    private String nomePaciente;
    private String nomeMedico;

    public Receita(int idReceita, String nomePaciente, String nomeMedico) {
        this.idReceita = idReceita;
        this.nomePaciente = nomePaciente;
        this.nomeMedico = nomeMedico;
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

}
