package test;
import source.Remedio;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class RemedioTest {

    @Test
    void getidRemedio() {
        Remedio produto1 = new Remedio(1, "Doril", "Tomou doril a dor sumiu", "Bayer");
        assertEquals(1, produto1.getidRemedio());
    }
    @Test
    void  getName() {
        Remedio produto1 = new Remedio(1, "Doril", "Tomou doril a dor sumiu", "Bayer");
        assertEquals("Doril", produto1.getNome());
    }
    @Test
    void getDescricao() {
        Remedio produto1 = new Remedio(1, "Doril", "Tomou doril a dor sumiu", "Bayer");
        assertEquals("Tomou doril a dor sumiu", produto1.getDescricao());
    }
    @Test
    void getMarca() {
        Remedio produto1 = new Remedio(1, "Doril", "Tomou doril a dor sumiu", "Bayer");
        assertEquals("Bayer", produto1.getMarca());
    }
    
}