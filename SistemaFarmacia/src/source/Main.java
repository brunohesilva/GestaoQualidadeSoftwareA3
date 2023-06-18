package source;

import javax.swing.*;

import source.Model.Produto;
import source.Model.Receita;
import source.Model.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main extends JFrame {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Receita> receitaList = new ArrayList<>();
    private static List<Produto> produtoList = new ArrayList<>();
    private static List<Usuario> usuarioList = new ArrayList<>();

//    public static void main(String[] args) {
//            TelaInicial telaInicial = new TelaInicial();
//            telaInicial.setVisible(true);
//}
//}


    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            System.out.println("Escolha uma opção:");
            System.out.println("---------------------------");
            System.out.println("1. Cadastrar uma receita");
            System.out.println("---------------------------");
            System.out.println("2. Cadastrar um produto");
            System.out.println("3. Buscar produto por ID");
            System.out.println("4. Listar todos os produtos");
            System.out.println("5. Atualizar produto por ID");
            System.out.println("6. Deletar um produto por ID");
            System.out.println("---------------------------");
            System.out.println("7. Cadastrar um usuário");
            System.out.println("8. Buscar usuário por ID");
            System.out.println("9. Listar todos os usuários");
            System.out.println("10. Atualizar usuário por ID");
            System.out.println("11. Deletar um usuário por ID");
            System.out.println("---------------------------");
            System.out.println("0. Sair");
            System.out.println("---------------------------");


            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    cadastroReceita();
                    break;
                case 2:
                    cadastroProduto();
                    break;
                case 3:
                    listaByidProduto();
                    break;
                case 4:
                    listAllProdutos();
                    break;
                case 5:
                    atualizaProdutoByidProduto();
                    break;
                case 6:
                    deletaProduto();
                    break;
                case 7:
                    cadastroUsuario();
                    break;
                case 8:
                    listaUsuarioByidUsuario();
                    break;
                case 9:
                    listaAllUsuarios();
                    break;
                case 10:
                    atulizaUsuarioByIdUsuario();
                    break;
                case 11:
                    deletaUsuario();
                    break;
                case 0:
                    running = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
            // new TelaInicial();
        }
    }

    private static void cadastroReceita() {
        System.out.println("Digite o ID da receita:");
        int idReceita = Integer.parseInt(scanner.nextLine());

        System.out.println("Digite o nome do paciente:");
        String nomePaciente = scanner.nextLine();

        System.out.println("Digite o nome do médico:");
        String nomeMedico = scanner.nextLine();

        System.out.println("Digite a data de validade:");
        String dataValidade = scanner.nextLine();

        System.out.println("Digite o nome do produto:");
        String nomeProduto = scanner.nextLine();

        System.out.println("Digite a descrição da receita:");
        String descricaoUso = scanner.nextLine();

        System.out.println("Digite o CRM do médico:");
        int crm = Integer.parseInt(scanner.nextLine());

        Receita receita = new Receita(idReceita, nomePaciente, nomeMedico, dataValidade, nomeProduto, descricaoUso, crm);
        receitaList.add(receita);
        System.out.println("Receita cadastrada com sucesso.");
    }

    private static void cadastroProduto() {
        System.out.println("Digite o ID do produto:");
        int idProduto = Integer.parseInt(scanner.nextLine());

        System.out.println("Digite o nome do produto:");
        String nome = scanner.nextLine();

        System.out.println("Digite a descrição do produto:");
        String descricao = scanner.nextLine();

        System.out.println("Digite a marca do produto:");
        String marca = scanner.nextLine();

        System.out.println("O produto requer receita? Digite 0 para 'não' e 1 para 'sim':");
        int necessarioReceita = Integer.parseInt(scanner.nextLine());

        System.out.println("Digite a quantidade em estoque:");
        int quantidade = Integer.parseInt(scanner.nextLine());

        Produto produto = new Produto(idProduto, nome, descricao, marca, necessarioReceita, quantidade);
        produtoList.add(produto);
        System.out.println("Produto cadastrado com sucesso.");
    }

    private static void listaByidProduto() {
        System.out.println("Digite o ID do Remédio:");
        int idProduto = Integer.parseInt(scanner.nextLine());

        for (Produto produto : produtoList) {
            if (produto.getIdProduto() == idProduto) {
                System.out.println("Produto encontrado: " + produto.getIdProduto());
                return;
            }
        }
        System.out.println("Produto não encontrado com o ID fornecido.");
        }

    private static void listAllProdutos() {
        System.out.println("Listagem de todos os Produtos:");

        if (produtoList.isEmpty()) {
            System.out.println("Nenhum remédio cadastrado.");
        } else {
            for (Produto produto : produtoList) {
                System.out.println(produto);

            }
        }
    }

    private static void atualizaProdutoByidProduto() {
        System.out.println("Digite o ID do produto");
        int idProduto = Integer.parseInt(scanner.nextLine());

        for (Produto produto : produtoList) {
            if (produto.getIdProduto() == idProduto) {
                System.out.println("Digite o novo nome do produto:");
                String nome = scanner.nextLine();

                System.out.println("Digite a nova descrição do produto:");
                String descricao = scanner.nextLine();

                System.out.println("Digite a nova marca do produto:");
                String marca = scanner.nextLine();

                System.out.println("O produto passará a exigir receita? Digite 0 para 'não' e 1 para 'sim':");
                int necessarioReceita = Integer.parseInt(scanner.nextLine());

                System.out.println("Digite a nova quantidade em estoque:");
                int quantidade = Integer.parseInt(scanner.nextLine());

                produto.setNome(nome);
                produto.setDescricao(descricao);
                produto.setMarca(marca);
                produto.setNecessarioReceita(necessarioReceita);
                produto.setQuantidade(quantidade);
                System.out.println("Produto atualizado com sucesso.");
                return;
            }
        }
        System.out.println("Produto não encontrado com o ID fornecido.");
        }

    private static void deletaProduto() {
        System.out.println("Digite o ID do produto");
        int idProduto = Integer.parseInt(scanner.nextLine());

        for (Produto produto : produtoList) {
            if (produto.getIdProduto() == idProduto) {
                produtoList.remove(produto);
                System.out.println("Produto removido com sucesso.");
                return;
            }
        }
        System.out.println("Produto não encontrado com o ID fornecido.");
        }
    private static void cadastroUsuario() {
        System.out.println("Digite o ID do Usuário:");
        int idUsuario = Integer.parseInt(scanner.nextLine());

        System.out.println("Digite o nome:");
        String nome = scanner.nextLine();

        System.out.println("Digite o CPF:");
        String cpf = scanner.nextLine();

        System.out.println("Digite o email:");
        String email = scanner.nextLine();

        System.out.println("Digite a senha:");
        String senha = scanner.nextLine();

        System.out.println("Digite 1 para Funcionário e 0 para Usuário:");
        int funcionario = Integer.parseInt(scanner.nextLine());

        System.out.println("Digite 1=ADM 0=Funcionário Comun");
        int admin = Integer.parseInt(scanner.nextLine());

        System.out.println("Defina o hórario do Funcionário:");
        String horario = scanner.nextLine();

        System.out.println("Defina o cargo do Funcionário:");
        String funcao = scanner.nextLine();

        Usuario usuario = new Usuario(idUsuario, nome, cpf, email, senha, funcionario,horario, funcao, admin);
        usuarioList.add(usuario);
        System.out.println("Usuário cadastrada com sucesso.");
    }

    private static void listaUsuarioByidUsuario() {
        System.out.println("Digite o ID do Usuário:");
        int idUsuario = Integer.parseInt(scanner.nextLine());

        for (Usuario usuario : usuarioList) {
            if (usuario.getIdUsuario() == idUsuario) {
                System.out.println("Usuário encontrado: " + usuario);
                return;
            }
        }
        System.out.println("Usuário não encontrada com o ID fornecido.");
    }

    private static void listaAllUsuarios() {
        System.out.println("Listagem de todos os Usuários:");

        if (usuarioList.isEmpty()) {
            System.out.println("Nenhum usuário cadastrado.");
        } else {
            for (Usuario usuario : usuarioList) {
                System.out.println(usuario);
            }
        }
    }

    private static void atulizaUsuarioByIdUsuario() {
        System.out.println("Digite o ID do Usuário");
        int idUsuario = Integer.parseInt(scanner.nextLine());

        for (Usuario usuario : usuarioList) {
            if (usuario.getIdUsuario() == idUsuario) {
                System.out.println("Digite o novo Nome:");
                String nome = scanner.nextLine();

                System.out.println("Digite o novo Email:");
                String email = scanner.nextLine();

                System.out.println("Digite a nova Senha:");
                String senha = scanner.nextLine();

                System.out.println("Digite o novo tipo de Usuário EX. 1=Funcionário 0=Usuário:");
                int funcionario = Integer.parseInt(scanner.nextLine());

                System.out.println("Digite o novo tipo de Funcionário EX. 1=ADM 0=Comun:");
                int admin = Integer.parseInt(scanner.nextLine());

                System.out.println("Digite o novo Hórario:");
                String horario = scanner.nextLine();

                System.out.println("Digite o novo Cargo:");
                String funcao = scanner.nextLine();

                usuario.setNome(nome);
                usuario.setEmail(email);
                usuario.setSenha(senha);
                usuario.setFuncionario(funcionario);
                usuario.setAdmin(admin);
                usuario.setHorario(horario);
                usuario.setFuncao(funcao);
                System.out.println("Usuário atualizada com sucesso.");
                return;
            }
        }
        System.out.println("Usuário não encontrada com o ID fornecido.");
    }

    private static void deletaUsuario() {
        System.out.println("Digite o ID do usuário");
        int idUsuario = Integer.parseInt(scanner.nextLine());

        for (Usuario usuario : usuarioList) {
            if (usuario.getIdUsuario() == idUsuario) {
                usuarioList.remove(usuario);
                System.out.println("Usuário removida com sucesso.");
                return;
            }
        }
        System.out.println("Usuário não encontrada com o ID fornecido.");
    }
}

