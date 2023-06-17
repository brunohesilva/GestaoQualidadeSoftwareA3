package test;
import source.Model.Produto;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ProdutoTest {

    Produto produto1;
    public ProdutoTest() {
        produto1 = new Produto(1, "Doril", "Tomou doril a dor sumiu", "Bayer", 0,5);
    }

    @Test
    void getIdProduto() {
        assertEquals(1, produto1.getIdProduto());
    }
    @Test
    void  getName() {
        assertEquals("Doril", produto1.getNome());
    }
    @Test
    void getDescricao() {
        assertEquals("Tomou doril a dor sumiu", produto1.getDescricao());
    }
    @Test
    void getMarca() {
        assertEquals("Bayer", produto1.getMarca());
    }
    @Test
    void getNecessarioReceita() {
        assertEquals("pilula", produto1.getNecessarioReceita());
    }
    @Test
    void quantidadeEstoque() {
        assertTrue(produto1.quantidadeEstoque());
    }
    @Test
    void cadastroProduto() {
        ProdutoTest produtoTest = new ProdutoTest();
        Produto produto = new Produto(1, "Doril", "Tomou doril a dor sumiu", "Bayer", 0,5);
        boolean cadastrado = produto.cadastroProduto(produto);
        assertTrue(cadastrado);
    }
    @Test
    void listaProduto() {
        ProdutoTest produtoTest = new ProdutoTest();
        Produto produto = produto1.listaProduto(1);
        assertNotNull(produto);
        assertEquals(1, produto.getIdProduto());
        assertEquals("Doril", produto.getNome());
    }
    @Test
    void atualizaProduto() {
        ProdutoTest produtoTest = new ProdutoTest();
        Produto produto = new Produto(1, "Doril", "Tomou doril a dor sumiu", "Bayer", 0,5);
        boolean atualizado = produto.atualizaProduto(1, produto1);
        assertTrue(atualizado);

        Produto produto2 = produto.listaProduto(1);
        assertNotNull(produto2);
        assertEquals("Doril", produto2.getNome());
        assertEquals(1, produto2.getIdProduto());
    }
    @Test
    void deletaProduto() {
        ProdutoTest produtoTest = new ProdutoTest();
        Produto produto = new Produto(1, "Doril", "Tomou doril a dor sumiu", "Bayer", 0,5);
        boolean deletado = produto.deletaProduto(1);
        assertTrue(deletado);

        Produto produto2 = produto.listaProduto(2);
        assertNull(produto2);
    }

}