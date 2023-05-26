package source;

public class Produto {

    private int idProduto;
    private String nome;

    public  Produto(int idProduto, String nome) {
        this.idProduto = idProduto;
        this.nome = nome;
    }

    public int getidProduto() {
        return this.idProduto;
    }

    public String getNome() {
        return this.nome;
    }

}
