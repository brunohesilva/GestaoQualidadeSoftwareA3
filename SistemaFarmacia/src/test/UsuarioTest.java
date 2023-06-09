package test;

import org.junit.jupiter.api.Test;
import source.Model.Usuario;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioTest {

    Usuario user1;
    public UsuarioTest() {
        user1 = new Usuario(1, "Bruno", "38940293827", "bruno@gmail.com", "senha123", 1, "09:00 até 16:00", "Gerente", 1);
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
        assertEquals("38940293827", user1.getCpf());
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
    @Test
    void cadastroUsuario() {
        UsuarioTest usuarioTest = new UsuarioTest();
        Usuario usuario = new Usuario(1, "Bruno", "38940293827", "bruno@gmail.com", "senha123", 1, "09:00 até 16:00", "Gerente", 1);
        boolean cadastrado = usuario.cadastroUsuario(usuario);
        assertTrue(cadastrado);
    }
    @Test
    void listaUsuario() {
        UsuarioTest usuarioTest = new UsuarioTest();
        Usuario usuario = user1.listaUsuario(1);
        assertNotNull(usuario);
        assertEquals(1, usuario.getIdUsuario());
        assertEquals("Bruno", usuario.getNome());
    }
    @Test
    void atualizaUsuario() {
        UsuarioTest usuarioTest = new UsuarioTest();
        Usuario usuario = new Usuario(1, "Bruno", "38940293827", "bruno@gmail.com", "senha123", 1, "09:00 até 16:00", "Gerente", 1);
        boolean atualizado = usuario.atualizaUsuario(1, usuario);
        assertTrue(atualizado);

        Usuario usuario2 = usuario.listaUsuario(1);
        assertNotNull(usuario2);
        assertEquals(1, usuario2.getIdUsuario());
        assertEquals("Bruno", usuario2.getNome());
    }
    @Test
    void deletaUsuario() {
        UsuarioTest usuarioTest = new UsuarioTest();
        Usuario usuario = new Usuario(1, "Bruno", "38940293827", "bruno@gmail.com", "senha123", 1, "09:00 até 16:00", "Gerente", 1);
        boolean deletado = usuario.deletaUsuario(1);

        Usuario usuario2 = usuario.listaUsuario(2);
        assertNull(usuario2);
    }

}