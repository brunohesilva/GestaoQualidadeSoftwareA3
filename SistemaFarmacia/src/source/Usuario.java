package source;

public class Usuario {

    private int idUsuario;
    private String nome;

    public Usuario(int idUsuario, String nome) {
        this.idUsuario = idUsuario;
        this.nome = nome;
    }

    public int getIdUsuario() {
        return this.idUsuario;
    }
    public String getNome() {
        return this.nome;
    }

}
