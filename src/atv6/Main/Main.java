package atv6.Main;

import atv6.Model.Bicicleta;
import atv6.Service.GerenciadorBicicleta;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        GerenciadorBicicleta gerenciador = new GerenciadorBicicleta();

        int opcao;

        do {
            mostrarMenu();
            opcao = opcaoMenu(input, "Escolha uma opção: ");

            switch (opcao) {
                case 1:
                    Bicicleta novaBicicleta = new Bicicleta();
                    novaBicicleta.preencher(input);
                    gerenciador.adicionar(novaBicicleta);
                    break;

                case 2:
                    gerenciador.listar();
                    break;

                case 3:
                    int indice = opcaoMenu(input, "Digite o índice da bicicleta a remover: ");
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
        System.out.println("\nMENU - GERENCIADOR DE BICICLETAS:");
        System.out.println("1 - Adicionar bicicleta");
        System.out.println("2 - Listar bicicletas");
        System.out.println("3 - Remover bicicleta");
        System.out.println("0 - Sair");
    }

    private static int opcaoMenu(Scanner input, String mensagem) {
        System.out.print(mensagem);
        int valor = input.nextInt();
        input.nextLine(); // limpar buffer
        return valor;
    }
}