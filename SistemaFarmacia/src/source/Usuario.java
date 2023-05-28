package source;

public class Usuario {

    private int idUsuario;
    private String nome;
    private int cpf;
    private String email;
    private String senha;

    public Usuario(int idUsuario, String nome, int cpf, String email, String senha) {
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;
    }

    public int getIdUsuario() {
        return this.idUsuario;
    }
    public String getNome() {
        return this.nome;
    }
    public int getCpf() {
        return this.cpf;
    }
    public String getSenha() {
        return this.senha;
    }

    public String getEmail() {
        return this.email;
    }

}
