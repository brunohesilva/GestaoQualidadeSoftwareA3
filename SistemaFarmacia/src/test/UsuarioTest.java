package test;

import org.junit.jupiter.api.Test;
import source.Usuario;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioTest {

    Usuario user1;
    public UsuarioTest() {
        user1 = new Usuario(1, "Bruno");
    }

    @Test
    void getIdUsuario() {
        assertEquals(1, user1.getIdUsuario());
    }
    @Test
    void getNome() {
        assertEquals("Bruno", user1.getNome());
    }

}