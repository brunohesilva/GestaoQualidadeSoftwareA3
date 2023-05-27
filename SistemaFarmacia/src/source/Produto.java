package source;

public class Produto {

    private int idProduto;
    private String nome;
    private String descricao;
    private String marca;

    public  Produto(int idProduto, String nome,String descricao, String marca) {
        this.idProduto = idProduto;
        this.nome = nome;
        this.descricao = descricao;
        this.marca = marca;
    }

    public int getidProduto() { return this.idProduto; }

    public String getNome() {
        return this.nome;
    }

    public String getDescricao() { return this.descricao; }
    public String getMarca() { return this.marca; }

}
