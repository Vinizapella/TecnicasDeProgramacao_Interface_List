package atv10.Main;
import atv10.Model.BolsaValores;
import atv10.Service.GerenciadorBolsaValores;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        GerenciadorBolsaValores gerenciador = new GerenciadorBolsaValores();

        int opcao;

        do {
            mostrarMenu();
            opcao = opcaoMenu(input, "Escolha uma opção: ");

            switch (opcao) {
                case 1:
                    BolsaValores novoAtivo = new BolsaValores();
                    novoAtivo.preencher(input);
                    gerenciador.adicionar(novoAtivo);
                    break;

                case 2:
                    gerenciador.listar();
                    break;

                case 3:
                    int indice = opcaoMenu(input, "Digite o índice do ativo a remover: ");
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
        System.out.println("\nMENU - GERENCIADOR DE BOLSA DE VALORES:");
        System.out.println("1 - Adicionar ativo");
        System.out.println("2 - Listar ativos");
        System.out.println("3 - Remover ativo");
        System.out.println("0 - Sair");
    }

    private static int opcaoMenu(Scanner input, String mensagem) {
        System.out.print(mensagem);
        int valor = input.nextInt();
        input.nextLine(); // limpar buffer
        return valor;
    }
}