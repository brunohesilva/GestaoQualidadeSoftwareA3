package source;

public class Produto {

    private int idProduto;
    private String nome;
    private String descricao;

    public  Produto(int idProduto, String nome,String descricao) {
        this.idProduto = idProduto;
        this.nome = nome;
        this.descricao = descricao;
    }

    public int getidProduto() { return this.idProduto; }

    public String getNome() {
        return this.nome;
    }

    public String getDescricao() { return this.descricao; }
}
