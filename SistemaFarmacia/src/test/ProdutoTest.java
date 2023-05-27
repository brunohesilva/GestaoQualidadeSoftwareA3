package test;
import source.Produto;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class ProdutoTest {
    @Test
    void getidProduto() {
        Produto produto1 = new Produto(1, "Doril", "Tomou doril a dor sumiu", "Bayer");
        assertEquals(1, produto1.getidProduto());
    }
    @Test
    void  getName() {
        Produto produto1 = new Produto(1, "Doril", "Tomou doril a dor sumiu", "Bayer");
        assertEquals("Doril", produto1.getNome());
    }
    @Test
    void getDescricao() {
        Produto produto1 = new Produto(1, "Doril", "Tomou doril a dor sumiu", "Bayer");
        assertEquals("Tomou doril a dor sumiu", produto1.getDescricao());
    }
    @Test
    void getMarca() {
        Produto produto1 = new Produto(1, "Doril", "Tomou doril a dor sumiu", "Bayer");
        assertEquals("Bayer", produto1.getMarca());
    }
}