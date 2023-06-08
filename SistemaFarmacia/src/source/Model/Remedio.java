package source.Model;

public class Remedio {

    private int idRemedio;
    private String nome;
    private String descricao;
    private String marca;
    private String tipo;
    private boolean necessarioReceita;
    private int quantidade;

    public  Remedio(int idRemedio, String nome,String descricao, String marca, String tipo, int quantidade) {
        this.idRemedio = idRemedio;
        this.nome = nome;
        this.descricao = descricao;
        this.marca = marca;
        this.tipo = tipo;
        this.quantidade = quantidade;
    }

    public int getIdRemedio() {
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
    public int getQuantidade(){
      return this.quantidade;
    };

    public void setIdRemedio(int idRemedio) {
        this.idRemedio = idRemedio;
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

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setNecessarioReceita(boolean necessarioReceita) {
        this.necessarioReceita = necessarioReceita;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public boolean isNecessarioReceita() {
        necessarioReceita = !necessarioReceita;
        return necessarioReceita;
    };
    public boolean quantidadeEstoque() {
        if(quantidade>0) {
            this.quantidade -= 1;
        }
        return true;
    }
    public boolean cadastroRemedio(Remedio remedio) {
        return true;
    }
    public  Remedio listaRemedio(int idRemedio) {
        if (idRemedio == 1) {
            return new Remedio(idRemedio,nome,descricao,marca,tipo,quantidade);
        } else {
            return null;
        }
    }
    public boolean atualizaRemedio(int idRemedio, Remedio remedio) {
        return true;
    }
    @Override
    public String toString() {
        return "Remédio [idRemedio=" + idRemedio + ", nome=" + nome + ", descrição=" + descricao + ", marca=" + marca + ", tipo=" + tipo + ", necessarioReceita=" + necessarioReceita + ", quantidade=" + quantidade + "]";
    }

}