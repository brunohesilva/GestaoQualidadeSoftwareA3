package source.Model;

public class Usuario {

    private int idUsuario;
    private String nome;
    private int cpf;
    private String email;
    private String senha;
    private int funcionario = 0;
    private int admin = 0;
    private String horario;
    private String funcao;

    public Usuario(int idUsuario, String nome, int cpf, String email, String senha, int funcionario) {
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;
        this.funcionario = funcionario;
    }

    public Usuario(int idUsuario, String nome, int cpf, String email, String senha, int funcionario, String horario, String funcao, int admin) {
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;
        this.funcionario = funcionario;
        this.horario = horario;
        this.funcao = funcao;
        this.admin = admin;
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
    public String getFuncao() {
        return funcao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setFuncionario(int funcionario) {
        this.funcionario = funcionario;
    }

    public void setAdmin(int admin) {
        this.admin = admin;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public boolean isFuncionario(){
        this.funcionario = 1;
        return true;
    }
    public boolean isAdmin() {
        this.admin = 1;
        return true;
    }

    public boolean cadastroUsuario(Usuario usuario) {
        return true;
    }

    @Override
    public String toString() {
        return "Usuário [idUsuario=" + idUsuario + ", nome=" + nome + ", cpf=" + cpf + ", email=" + email + ", senha=" + senha + ", funcionario=" + funcionario + ", horario=" + horario + ", funcao=" + funcao + ", admin=" + admin + "]";
    }

}
