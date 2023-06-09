package source;

import javax.swing.*;

import source.Model.Receita;
import source.Model.Remedio;
import source.Model.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main extends JFrame {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Receita> receitaList = new ArrayList<>();
    private static List<Remedio> remedioList = new ArrayList<>();
    private static List<Usuario> usuarioList = new ArrayList<>();

    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            System.out.println("Escolha uma opção:");
            System.out.println("---------------------------");
            System.out.println("1. Cadastra uma Receita");
            System.out.println("---------------------------");
            System.out.println("2. Cadastra um Remédio");
            System.out.println("3. Busca Remédio por ID");
            System.out.println("4. Lista todos os Remédios");
            System.out.println("5. Atualiza remédio por ID");
            System.out.println("6. Deleta um remédio por ID");
            System.out.println("---------------------------");
            System.out.println("7. Cadastra um Usuário");
            System.out.println("8. Busca Usuário por ID");
            System.out.println("9. Lista todos os Usuários");
            System.out.println("10. Atualiza usuário por ID");
            System.out.println("11. Deleta um usuário por ID");
            System.out.println("---------------------------");
            System.out.println("0. Sair");
            System.out.println("---------------------------");


            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    cadastroReceita();
                    break;
                case 2:
                    cadastroRemedio();
                    break;
                case 3:
                    listaByidRemedio();
                    break;
                case 4:
                    listAllRemedios();
                    break;
                case 5:
                    atualizaRemedioByidRemedio();
                    break;
                case 6:
                    deletaRemedio();
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

        System.out.println("Digite o nome do remédio:");
        String nomeRemedio = scanner.nextLine();

        System.out.println("Digite a descrição da receita:");
        String descricaoUso = scanner.nextLine();

        System.out.println("Digite o CRM do médico:");
        int crm = Integer.parseInt(scanner.nextLine());

        Receita receita = new Receita(idReceita, nomePaciente, nomeMedico, dataValidade, nomeRemedio, descricaoUso, crm);
        receitaList.add(receita);
        System.out.println("Receita cadastrada com sucesso.");
    }

    private static void cadastroRemedio() {
        System.out.println("Digite o ID do Remédio:");
        int idRemedio = Integer.parseInt(scanner.nextLine());

        System.out.println("Digite o nome do Remédio:");
        String nome = scanner.nextLine();

        System.out.println("Digite a descrição do remédio:");
        String descricao = scanner.nextLine();

        System.out.println("Digite a marca do remédio:");
        String marca = scanner.nextLine();

        System.out.println("Digite o tipo de remédio EX. Pílula ou Líquido:");
        String tipo = scanner.nextLine();

        System.out.println("Digite a quantidade em estoque:");
        int quantidade = Integer.parseInt(scanner.nextLine());

        Remedio remedio = new Remedio(idRemedio, nome, descricao, marca, tipo, quantidade);
        remedioList.add(remedio);
        System.out.println("Remédio cadastrada com sucesso.");
    }

    private static void listaByidRemedio() {
        System.out.println("Digite o ID do Remédio:");
        int idRemedio = Integer.parseInt(scanner.nextLine());

        for (Remedio remedio : remedioList) {
            if (remedio.getIdRemedio() == idRemedio) {
                System.out.println("Remédio encontrada: " + remedio);
                return;
            }
        }
        System.out.println("Remédio não encontrada com o ID fornecido.");
        }

    private static void listAllRemedios() {
        System.out.println("Listagem de todos os Remédios:");

        if (remedioList.isEmpty()) {
            System.out.println("Nenhum remédio cadastrado.");
        } else {
            for (Remedio remedio : remedioList) {
                System.out.println(remedio);

            }
        }
    }

    private static void atualizaRemedioByidRemedio() {
        System.out.println("Digite o ID do remédio");
        int idRemedio = Integer.parseInt(scanner.nextLine());

        for (Remedio remedio : remedioList) {
            if (remedio.getIdRemedio() == idRemedio) {
                System.out.println("Digite o novo nome do Remédio:");
                String nome = scanner.nextLine();

                System.out.println("Digite a nova descrição do remédio:");
                String descricao = scanner.nextLine();

                System.out.println("Digite a nova marca do remédio:");
                String marca = scanner.nextLine();

                System.out.println("Digite o novo tipo de remédio EX. Pílula ou Líquido:");
                String tipo = scanner.nextLine();

                System.out.println("Digite a nova quantidade em estoque:");
                int quantidade = Integer.parseInt(scanner.nextLine());

                remedio.setNome(nome);
                remedio.setDescricao(descricao);
                remedio.setMarca(marca);
                remedio.setTipo(tipo);
                remedio.setQuantidade(quantidade);
                System.out.println("Remédio atualizada com sucesso.");
                return;
            }
        }
        System.out.println("Remédio não encontrada com o ID fornecido.");
        }

    private static void deletaRemedio() {
        System.out.println("Digite o ID do remédio");
        int idRemedio = Integer.parseInt(scanner.nextLine());

        for (Remedio remedio : remedioList) {
            if (remedio.getIdRemedio() == idRemedio) {
                remedioList.remove(remedio);
                System.out.println("Remédio removida com sucesso.");
                return;
            }
        }
        System.out.println("Remédio não encontrada com o ID fornecido.");
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
                System.out.println("Usuário encontrada: " + usuario);
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

