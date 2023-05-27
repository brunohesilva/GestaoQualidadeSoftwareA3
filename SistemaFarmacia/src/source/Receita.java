package source;

public class Receita {

    private int idReceita;
    private String nomePaciente;

    public Receita(int idReceita, String nomePaciente) {
        this.idReceita = idReceita;
        this.nomePaciente = nomePaciente;
    }

    public int getIdReceita() {
        return this.idReceita;
    }
    public String getNomePaciente() {
        return this.nomePaciente;
    }

}
