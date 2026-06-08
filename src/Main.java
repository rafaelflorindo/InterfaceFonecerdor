import controller.ControllerFornecedor;
import model.Fornecedor;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ControllerFornecedor controllerFornecedor = new ControllerFornecedor();
        Scanner scanner = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("\n===== MENU FORNECEDOR =====");
            System.out.println("1 - Inserir fornecedor");
            System.out.println("2 - Listar todos os fornecedores");
            System.out.println("3 - Buscar fornecedor por código");
            System.out.println("4 - Buscar fornecedor por CNPJ");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                case 1:

                    System.out.print("Nome do fornecedor: ");
                    String nome = scanner.nextLine();

                    System.out.print("CNPJ do fornecedor: ");
                    String cnpj = scanner.nextLine();

                    Fornecedor fornecedor = new Fornecedor(nome, cnpj);

                    if (controllerFornecedor.adicionarFornecedor(fornecedor)) {
                        System.out.println("Fornecedor cadastrado com sucesso!");
                    } else {
                        System.out.println("Erro ao cadastrar fornecedor!");
                    }
                    break;

                case 2:
                    System.out.println("\n=== LISTA DE FORNECEDORES ===");

                    for (Fornecedor f : controllerFornecedor.listarFornecedores()) {
                        System.out.println("-------------------------");
                        System.out.println("ID: " + f.id);
                        System.out.println("Nome: " + f.nome);
                        System.out.println("CNPJ: " + f.cnpj);
                    }
                    break;

                case 3:
                    System.out.print("Informe o código do fornecedor: ");
                    int idBuscar = scanner.nextInt();
                    scanner.nextLine();

                    Fornecedor fornecedorId = controllerFornecedor.buscarFornecedorPorId(idBuscar);

                    if (fornecedorId != null) {
                        System.out.println("\nFornecedor encontrado:");
                        System.out.println("ID: " + fornecedorId.getId());
                        System.out.println("Nome: " + fornecedorId.getNome());
                        System.out.println("CNPJ: " + fornecedorId.getCnpj());
                    } else {
                        System.out.println("Fornecedor não encontrado!");
                    }
                    break;

                case 4:
                    System.out.print("Informe o CNPJ: ");
                    String buscaCnpj = scanner.nextLine();

                    Fornecedor fornecedorCnpj =
                            controllerFornecedor.buscarFornecedorPorCnpj(buscaCnpj);

                    if (fornecedorCnpj != null) {
                        System.out.println("\nFornecedor encontrado:");
                        System.out.println("ID: " + fornecedorCnpj.getId());
                        System.out.println("Nome: " + fornecedorCnpj.getNome());
                        System.out.println("CNPJ: " + fornecedorCnpj.getCnpj());
                    } else {
                        System.out.println("Fornecedor não encontrado!");
                    }
                    break;

                case 0:
                    System.out.println("Encerrando sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        scanner.close();
    }
}