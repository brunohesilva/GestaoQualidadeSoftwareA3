package source;

public class Usuario {

    private int idUsuario;
    private String nome;
    private int cpf;
    private String email;
    private String senha;
    private int funcionario = 0;
    private String horario;

    public Usuario(int idUsuario, String nome, int cpf, String email, String senha, int funcionario) {
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;
        this.funcionario = funcionario;
    }

    public Usuario(int idUsuario, String nome, int cpf, String email, String senha, int funcionario, String horario) {
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;
        this.funcionario = funcionario;
        this.horario = horario;

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
    public String getHorario() {
        return this.horario;
    }
    public boolean isFuncionario(){
        this.funcionario = 1;
        return true;
    }

}
