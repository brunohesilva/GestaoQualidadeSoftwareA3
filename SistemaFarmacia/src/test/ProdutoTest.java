package test;
import source.Produto;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class ProdutoTest {
    @Test
    void getidProduto() {
        Produto produto1 = new Produto(1, "Doril");
        assertEquals(1, produto1.getidProduto());
    }
    @Test
    void  getName() {
        Produto produto1 = new Produto(1, "Doril");
        assertEquals("Doril", produto1.getNome());
    }
}