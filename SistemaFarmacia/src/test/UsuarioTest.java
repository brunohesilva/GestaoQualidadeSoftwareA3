package test;

import org.junit.jupiter.api.Test;
import source.Usuario;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioTest {

    @Test
    void getIdUsuario() {
        Usuario user1 = new Usuario(1);
        assertEquals(1, user1.getIdUsuario());
    }
    
}