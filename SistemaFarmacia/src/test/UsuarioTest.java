package test;

import org.junit.jupiter.api.Test;
import source.Usuario;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioTest {

    Usuario user1;
    public UsuarioTest() {
        user1 = new Usuario(1, "Bruno", 010101010101, "bruno@gmail.com", "senha123", 1, "09:00 até 16:00", "Gerente", 1);
    }

    @Test
    void getIdUsuario() {
        assertEquals(1, user1.getIdUsuario());
    }
    @Test
    void getNome() {
        assertEquals("Bruno", user1.getNome());
    }
    @Test
    void getCpf() {
        assertEquals(010101010101, user1.getCpf());
    }
    @Test
    void getEmail() {
        assertEquals("bruno@gmail.com", user1.getEmail());
    }
    @Test
    void getSenha() {
        assertEquals("senha123", user1.getSenha());
    }
    @Test
    void getHorario() {
        assertEquals("09:00 até 16:00", user1.getHorario());
    }
    @Test
    void getFuncao() {
        assertEquals("Gerente", user1.getFuncao());
    }
    @Test
    void isFuncionario() {
        assertTrue(user1.isFuncionario());
    }
    @Test
    void isAdmin() {
        assertTrue(user1.isAdmin());
    }

}