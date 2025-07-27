package atv8.Main;

import atv8.Model.Musica;
import atv8.Service.GerenciadorMusica;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        GerenciadorMusica gerenciador = new GerenciadorMusica();

        int opcao;

        do {
            mostrarMenu();
            opcao = opcaoMenu(input, "Escolha uma opção: ");

            switch (opcao) {
                case 1:
                    Musica novaMusica = new Musica();
                    novaMusica.preencher(input);
                    gerenciador.adicionar(novaMusica);
                    break;

                case 2:
                    gerenciador.listar();
                    break;

                case 3:
                    int indice = opcaoMenu(input, "Digite o índice da música a remover: ");
                    gerenciador.remover(indice);
                    break;

                case 4:
                    int indiceTocar = opcaoMenu(input, "Digite o índice da música para tocar: ");
                    gerenciador.tocarMusica(indiceTocar);
                    break;

                case 5:
                    int indiceDesligar = opcaoMenu(input, "Digite o índice da música para parar: ");
                    gerenciador.desligarMusica(indiceDesligar);
                    break;

                case 6:
                    // Exemplo usando construtor com parâmetros
                    Musica musicaExemplo = new Musica("Amigo", "Milton Nascimento", 3.5, 12.00);
                    System.out.println("Música de exemplo criada:");
                    musicaExemplo.imprimir(999);
                    musicaExemplo.tocarMusica();
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
        System.out.println("\nMENU - GERENCIADOR DE MÚSICAS:");
        System.out.println("1 - Adicionar música");
        System.out.println("2 - Listar músicas");
        System.out.println("3 - Remover música");
        System.out.println("4 - Tocar música");
        System.out.println("5 - Parar música");
        System.out.println("6 - Testar música de exemplo");
        System.out.println("0 - Sair");
    }

    private static int opcaoMenu(Scanner input, String mensagem) {
        System.out.print(mensagem);
        int valor = input.nextInt();
        input.nextLine(); // limpar buffer
        return valor;
    }
}