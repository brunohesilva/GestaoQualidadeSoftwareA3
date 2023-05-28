package test;
import source.Model.Remedio;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class RemedioTest {

    @Test
    void getIdRemedio() {
        Remedio remedio1 = new Remedio(1, "Doril", "Tomou doril a dor sumiu", "Bayer", "pilula",5);
        assertEquals(1, remedio1.getIdRemedio());
    }
    @Test
    void  getName() {
        Remedio remedio1 = new Remedio(1, "Doril", "Tomou doril a dor sumiu", "Bayer", "pilula",5);
        assertEquals("Doril", remedio1.getNome());
    }
    @Test
    void getDescricao() {
        Remedio remedio1 = new Remedio(1, "Doril", "Tomou doril a dor sumiu", "Bayer", "pilula",5);
        assertEquals("Tomou doril a dor sumiu", remedio1.getDescricao());
    }
    @Test
    void getMarca() {
        Remedio remedio1 = new Remedio(1, "Doril", "Tomou doril a dor sumiu", "Bayer", "pilula", 5);
        assertEquals("Bayer", remedio1.getMarca());
    }
    @Test
    void getTipo() {
        Remedio remedio1 = new Remedio(1, "Doril", "Tomou doril a dor sumiu", "Bayer", "pilula",5);
        assertEquals("pilula", remedio1.getTipo());
    }
    @Test
    void isnecessarioReceita() {
        Remedio remedio1 = new Remedio(1, "Doril", "Tomou doril a dor sumiu", "Bayer", "pilula",5);
        assertFalse(!remedio1.isNecessarioReceita());
    }
    @Test
    void quantidadeEstoque() {
        Remedio remedio1 = new Remedio(1, "Doril", "Tomou doril a dor sumiu", "Bayer", "pilula",5);
        assertTrue(remedio1.quantidadeEstoque());
    }

}