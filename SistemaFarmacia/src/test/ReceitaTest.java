package test;
import source.Receita;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.text.SimpleDateFormat;


class ReceitaTest {

    @Test
    void getIdReceita() {
        Receita receita1 = new Receita(1, "Bruno", "Dr. Hans Chucrute", "17 de Novembro", "Doril");
        assertEquals(1, receita1.getIdReceita());
    }
    @Test
    void getNomePaciente() {
        Receita receita1 = new Receita(1, "Bruno", "Dr. Hans Chucrute", "17 de Novembro", "Doril");
        assertEquals("Bruno", receita1.getNomePaciente());
    }
    @Test
    void getNomeMedico() {
        Receita receita1 = new Receita(1, "Bruno", "Dr. Hans Chucrute", "17 de Novembro", "Doril");
        assertEquals("Dr. Hans Chucrute", receita1.getNomeMedico());
    }
    @Test
    void getData() {
        Receita receita1 = new Receita(1, "Bruno", "Dr. Hans Chucrute", "17 de Novembro", "Doril");
        assertEquals("17 de Novembro", receita1.getDataValidade());
    }
    @Test
    void getNomeRemedio() {
        Receita receita1 = new Receita(1, "Bruno", "Dr. Hans Chucrute", "17 de Novembro", "Doril");
        assertEquals("Doril", receita1.getNomeRemedio());
    }

}