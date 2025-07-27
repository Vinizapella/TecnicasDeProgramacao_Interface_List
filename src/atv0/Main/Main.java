package atv0.Main;
import atv0.Main.Model.TelefoneCelular;
import atv0.Main.Service.GerenciadorTelefoneCelular;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        GerenciadorTelefoneCelular gerenciador = new GerenciadorTelefoneCelular();

        int opcao;

        do {
            mostrarMenu();
            opcao = opcaoMenu(input, "Escolha uma opção: ");

            switch (opcao) {
                case 1:
                    TelefoneCelular novoTelefone = new TelefoneCelular();
                    novoTelefone.preencher(input);
                    gerenciador.adicionar(novoTelefone);
                    break;

                case 2:
                    gerenciador.listar();
                    break;

                case 3:
                    int indice = opcaoMenu(input, "Digite o índice do telefone a remover: ");
                    gerenciador.remover(indice);
                    break;

                case 0:
                    System.out.println("Encerrando o programa.");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        input.close();
    }

    private static void mostrarMenu() {
        System.out.println("\nMENU:");
        System.out.println("1 - Adicionar telefone");
        System.out.println("2 - Listar telefones");
        System.out.println("3 - Remover telefone");
        System.out.println("0 - Sair");
    }

    private static int opcaoMenu(Scanner input, String mensagem) {
        System.out.print(mensagem);
        int valor = input.nextInt();
        input.nextLine(); // limpar buffer
        return valor;
    }
}
