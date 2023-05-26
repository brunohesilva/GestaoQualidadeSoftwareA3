package test;
import source.Produto;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class ProdutoTest {
    @Test
    void  getName() {
        Produto produto1 = new Produto("Doril");
        assertEquals("Doril", produto1.getNome());
    }
}