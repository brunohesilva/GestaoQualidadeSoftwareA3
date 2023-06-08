package test;
import source.Model.Receita;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ReceitaTest {

    Receita receita1;
    public ReceitaTest() {
        receita1 = new Receita(1, "Bruno", "Dr. Hans Chucrute", "17 de Novembro", "Doril", "Tomar duas vezes ao dia", 010101010101);
    }

    @Test
    void getIdReceita() {
        assertEquals(1, receita1.getIdReceita());
    }
    @Test
    void getNomePaciente() {
        assertEquals("Bruno", receita1.getNomePaciente());
    }
    @Test
    void getNomeMedico() {
        assertEquals("Dr. Hans Chucrute", receita1.getNomeMedico());
    }
    @Test
    void getData() {
        assertEquals("17 de Novembro", receita1.getDataValidade());
    }
    @Test
    void getNomeRemedio() {
        assertEquals("Doril", receita1.getNomeRemedio());
    }
    @Test
    void getDescricaoUso() {
        assertEquals("Tomar duas vezes ao dia", receita1.getDescricaoUso());
    }
    @Test
    void getCrm() {
        assertEquals(010101010101, receita1.getCrm());
    }
    @Test
    void cadastroReceita() {
        ReceitaTest receitaTest = new ReceitaTest();
        Receita receita = new Receita(1, "Bruno", "Dr. Hans Chucrute", "17 de Novembro", "Doril", "Tomar duas vezes ao dia", 010101010101);
        boolean cadastrado = receita.cadastroReceita(receita);
        assertTrue(cadastrado);
    }

}