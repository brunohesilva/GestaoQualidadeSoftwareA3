package test;
import source.Remedio;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class RemedioTest {

    @Test
    void getidRemedio() {
        Remedio remedio1 = new Remedio(1, "Doril", "Tomou doril a dor sumiu", "Bayer", "pilula");
        assertEquals(1, remedio1.getidRemedio());
    }
    @Test
    void  getName() {
        Remedio remedio1 = new Remedio(1, "Doril", "Tomou doril a dor sumiu", "Bayer", "pilula");
        assertEquals("Doril", remedio1.getNome());
    }
    @Test
    void getDescricao() {
        Remedio remedio1 = new Remedio(1, "Doril", "Tomou doril a dor sumiu", "Bayer", "pilula");
        assertEquals("Tomou doril a dor sumiu", remedio1.getDescricao());
    }
    @Test
    void getMarca() {
        Remedio remedio1 = new Remedio(1, "Doril", "Tomou doril a dor sumiu", "Bayer", "pilula");
        assertEquals("Bayer", remedio1.getMarca());
    }
    @Test
    void getTipo() {
        Remedio remedio1 = new Remedio(1, "Doril", "Tomou doril a dor sumiu", "Bayer", "pilula");
        assertEquals("pilula", remedio1.getTipo());
    }

}