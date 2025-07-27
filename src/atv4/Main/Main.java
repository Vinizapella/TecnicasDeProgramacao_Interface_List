package atv4.Main;

import atv4.Model.Livro;
import atv4.Service.GerenciadorLivro;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        GerenciadorLivro gerenciador = new GerenciadorLivro();

        int opcao;

        do {
            mostrarMenu();
            opcao = opcaoMenu(input, "Escolha uma opção: ");

            switch (opcao) {
                case 1:
                    Livro novoLivro = new Livro();
                    novoLivro.preencher(input);
                    gerenciador.adicionar(novoLivro);
                    break;

                case 2:
                    gerenciador.listar();
                    break;

                case 3:
                    int indice = opcaoMenu(input, "Digite o índice do livro a remover: ");
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
        System.out.println("\nMENU - GERENCIADOR DE LIVROS:");
        System.out.println("1 - Adicionar livro");
        System.out.println("2 - Listar livros");
        System.out.println("3 - Remover livro");
        System.out.println("0 - Sair");
    }

    private static int opcaoMenu(Scanner input, String mensagem) {
        System.out.print(mensagem);
        int valor = input.nextInt();
        input.nextLine(); // limpar buffer
        return valor;
    }
}