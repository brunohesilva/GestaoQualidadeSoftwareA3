package source;

public class Remedio {

    private int idRemedio;
    private String nome;
    private String descricao;
    private String marca;
    private String tipo;
    private boolean necessarioReceita;

    public  Remedio(int idRemedio, String nome,String descricao, String marca, String tipo) {
        this.idRemedio = idRemedio;
        this.nome = nome;
        this.descricao = descricao;
        this.marca = marca;
        this.tipo = tipo;
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
    public String getTipo() {
      return this.tipo;
    };
    public boolean isNecessarioReceita() {
        necessarioReceita = !necessarioReceita;
        return necessarioReceita;
    };

}