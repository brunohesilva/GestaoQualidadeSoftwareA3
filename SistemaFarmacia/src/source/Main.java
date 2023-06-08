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
    public static void main(String[] args)
    {
        boolean running = true;

        while (running) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Cadastra uma Receita");
            System.out.println("2. Ler pessoa por ID");
            System.out.println("3. Listar todas as pessoas");
            System.out.println("4. Atualizar pessoa por ID");
            System.out.println("5. Deletar pessoa por ID");
            System.out.println("0. Sair");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    cadastroReceita();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
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

    System.out.println("Digite o nome do rémedio:");
    String nomeRemedio = scanner.nextLine();

    System.out.println("Digite a descrição da receita:");
    String descricaoUso = scanner.nextLine();

    System.out.println("Digite o CRM do médico:");
    int crm = Integer.parseInt(scanner.nextLine());

    Receita receita = new Receita(idReceita, nomePaciente, nomeMedico, dataValidade, nomeRemedio, descricaoUso, crm);
    receitaList.add(receita);
    System.out.println("Receita cadastrada com sucesso.");
}



}