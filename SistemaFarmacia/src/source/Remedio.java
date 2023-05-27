package source;

public class Remedio {

    private int idRemedio;
    private String nome;
    private String descricao;
    private String marca;

    public  Remedio(int idRemedio, String nome,String descricao, String marca) {
        this.idRemedio = idRemedio;
        this.nome = nome;
        this.descricao = descricao;
        this.marca = marca;
    }

    public int getidRemedio() {
        return this.idRemedio;
    }
    public String getNome() {
        return this.nome;
    }
    public String getDescricao() {
        return this.descricao;
    }
    public String getMarca() {
        return this.marca;
    }

}