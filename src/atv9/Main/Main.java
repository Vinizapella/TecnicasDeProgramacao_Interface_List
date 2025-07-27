package atv9.Main;
import atv9.Model.JogoVideoGame;
import atv9.Service.GerenciadorJogoVideoGame;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        GerenciadorJogoVideoGame gerenciador = new GerenciadorJogoVideoGame();

        int opcao;

        do {
            mostrarMenu();
            opcao = opcaoMenu(input, "Escolha uma opção: ");

            switch (opcao) {
                case 1:
                    JogoVideoGame novoJogo = new JogoVideoGame();
                    novoJogo.preencher(input);
                    gerenciador.adicionar(novoJogo);
                    break;

                case 2:
                    gerenciador.listar();
                    break;

                case 3:
                    int indice = opcaoMenu(input, "Digite o índice do jogo a remover: ");
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
        System.out.println("\nMENU - GERENCIADOR DE JOGOS DE VÍDEO GAME:");
        System.out.println("1 - Adicionar jogo");
        System.out.println("2 - Listar jogos");
        System.out.println("3 - Remover jogo");
        System.out.println("0 - Sair");
    }

    private static int opcaoMenu(Scanner input, String mensagem) {
        System.out.print(mensagem);
        int valor = input.nextInt();
        input.nextLine(); // limpar buffer
        return valor;
    }
}