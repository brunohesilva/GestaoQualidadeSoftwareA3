package test;
import source.Model.Receita;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ReceitaTest {

    @Test
    void getIdReceita() {
        Receita receita1 = new Receita(1, "Bruno", "Dr. Hans Chucrute", "17 de Novembro", "Doril", "Tomar duas vezes ao dia", 010101010101);
        assertEquals(1, receita1.getIdReceita());
    }
    @Test
    void getNomePaciente() {
        Receita receita1 = new Receita(1, "Bruno", "Dr. Hans Chucrute", "17 de Novembro", "Doril", "Tomar duas vezes ao dia", 010101010101);
        assertEquals("Bruno", receita1.getNomePaciente());
    }
    @Test
    void getNomeMedico() {
        Receita receita1 = new Receita(1, "Bruno", "Dr. Hans Chucrute", "17 de Novembro", "Doril", "Tomar duas vezes ao dia", 010101010101);
        assertEquals("Dr. Hans Chucrute", receita1.getNomeMedico());
    }
    @Test
    void getData() {
        Receita receita1 = new Receita(1, "Bruno", "Dr. Hans Chucrute", "17 de Novembro", "Doril", "Tomar duas vezes ao dia", 010101010101);
        assertEquals("17 de Novembro", receita1.getDataValidade());
    }
    @Test
    void getNomeRemedio() {
        Receita receita1 = new Receita(1, "Bruno", "Dr. Hans Chucrute", "17 de Novembro", "Doril", "Tomar duas vezes ao dia", 010101010101);
        assertEquals("Doril", receita1.getNomeRemedio());
    }
    @Test
    void getDescricaoUso() {
        Receita receita1 = new Receita(1, "Bruno", "Dr. Hans Chucrute", "17 de Novembro", "Doril", "Tomar duas vezes ao dia", 010101010101);
        assertEquals("Tomar duas vezes ao dia", receita1.getDescricaoUso());
    }
    @Test
    void getCrm() {
        Receita receita1 = new Receita(1, "Bruno", "Dr. Hans Chucrute", "17 de Novembro", "Doril", "Tomar duas vezes ao dia", 010101010101);
        assertEquals(010101010101, receita1.getCrm());
    }

}