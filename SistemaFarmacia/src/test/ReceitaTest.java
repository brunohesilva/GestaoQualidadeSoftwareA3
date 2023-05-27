package test;
import source.Receita;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ReceitaTest {

    @Test
    void getIdReceita(){
        Receita receita1 = new Receita(1, "Bruno");
        assertEquals(1, receita1.getIdReceita());
    }
    @Test
    void getNomePaciente() {
        Receita receita1 = new Receita(1, "Bruno");
        assertEquals("Bruno", receita1.getNomePaciente());
    }
}