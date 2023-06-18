package source.Model;

public class Produto {

    private int idProduto;
    private String nome;
    private String descricao;
    private String marca;
    private int necessarioReceita;
    private int quantidade;

    public Produto(int idProduto, String nome, String descricao, String marca, int necessarioReceita, int quantidade) {
        this.idProduto = idProduto;
        this.nome = nome;
        this.descricao = descricao;
        this.marca = marca;
        this.necessarioReceita = necessarioReceita;
        this.quantidade = quantidade;
    }

    public int getIdProduto() {
        return this.idProduto;
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
    public int getNecessarioReceita() {
      return this.necessarioReceita;
    };
    public int getQuantidade(){
      return this.quantidade;
    };

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setNecessarioReceita(int necessarioReceita) {
        this.necessarioReceita = necessarioReceita;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public boolean quantidadeEstoque() {
        if(quantidade>0) {
            this.quantidade -= 1;
        }
        return true;
    }
    public boolean cadastroProduto(Produto produto) {
        return true;
    }
    public Produto listaProduto(int idProduto) {
        if (idProduto == 1) {
            return new Produto(idProduto, nome, descricao, marca, necessarioReceita, quantidade);
        } else {
            return null;
        }
    }
    public boolean atualizaProduto(int idProduto, Produto produto) {
        return true;
    }
    public boolean deletaProduto(int idProduto) {
        return true;
    }
    @Override
    public String toString() {
        return "Produto [idProduto=" + idProduto + ", nome=" + nome + ", descrição=" + descricao + ", marca=" + marca + ", necessarioReceita?=" + necessarioReceita + ", quantidade=" + quantidade + "]";
    }

}