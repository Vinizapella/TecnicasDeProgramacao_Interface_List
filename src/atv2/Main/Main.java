package atv2.Main;
import atv2.Model.Casa;
import atv2.Service.GerenciadorCasa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        GerenciadorCasa gerenciador = new GerenciadorCasa();

        int opcao;

        do {
            mostrarMenu();
            opcao = opcaoMenu(input, "Escolha uma opção: ");

            switch (opcao) {
                case 1:
                    Casa novaCasa = new Casa();
                    novaCasa.preencher(input);
                    gerenciador.adicionar(novaCasa);
                    break;

                case 2:
                    gerenciador.listar();
                    break;

                case 3:
                    int indice = opcaoMenu(input, "Digite o índice da casa a remover: ");
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
        System.out.println("\nMENU - GERENCIADOR DE CASAS:");
        System.out.println("1 - Adicionar casa");
        System.out.println("2 - Listar casas");
        System.out.println("3 - Remover casa");
        System.out.println("0 - Sair");
    }

    private static int opcaoMenu(Scanner input, String mensagem) {
        System.out.print(mensagem);
        int valor = input.nextInt();
        input.nextLine(); // limpar buffer
        return valor;
    }
}