package test;
import source.Model.Remedio;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class RemedioTest {

    Remedio remedio1;
    public RemedioTest() {
        remedio1 = new Remedio(1, "Doril", "Tomou doril a dor sumiu", "Bayer", "pilula",5);
    }

    @Test
    void getIdRemedio() {
        assertEquals(1, remedio1.getIdRemedio());
    }
    @Test
    void  getName() {
        assertEquals("Doril", remedio1.getNome());
    }
    @Test
    void getDescricao() {
        assertEquals("Tomou doril a dor sumiu", remedio1.getDescricao());
    }
    @Test
    void getMarca() {
        assertEquals("Bayer", remedio1.getMarca());
    }
    @Test
    void getTipo() {
        assertEquals("pilula", remedio1.getTipo());
    }
    @Test
    void isnecessarioReceita() {
        assertFalse(!remedio1.isNecessarioReceita());
    }
    @Test
    void quantidadeEstoque() {
        assertTrue(remedio1.quantidadeEstoque());
    }
    @Test
    void cadastroRemedio() {
        RemedioTest remedioTest = new RemedioTest();
        Remedio remedio = new Remedio(1, "Doril", "Tomou doril a dor sumiu", "Bayer", "pilula",5);
        boolean cadastrado = remedio.cadastroRemedio(remedio);
        assertTrue(cadastrado);
    }

}