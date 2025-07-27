package atv5.Main;
import atv5.Model.AnimalEstimacao;
import atv5.Service.GerenciadorAnimalEstimacao;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        GerenciadorAnimalEstimacao gerenciador = new GerenciadorAnimalEstimacao();

        int opcao;

        do {
            mostrarMenu();
            opcao = opcaoMenu(input, "Escolha uma opção: ");

            switch (opcao) {
                case 1:
                    AnimalEstimacao novoAnimal = new AnimalEstimacao();
                    novoAnimal.preencher(input);
                    gerenciador.adicionar(novoAnimal);
                    break;

                case 2:
                    gerenciador.listar();
                    break;

                case 3:
                    int indice = opcaoMenu(input, "Digite o índice do animal a remover: ");
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
        System.out.println("\nMENU - GERENCIADOR DE ANIMAIS DE ESTIMAÇÃO:");
        System.out.println("1 - Adicionar animal");
        System.out.println("2 - Listar animais");
        System.out.println("3 - Remover animal");
        System.out.println("0 - Sair");
    }

    private static int opcaoMenu(Scanner input, String mensagem) {
        System.out.print(mensagem);
        int valor = input.nextInt();
        input.nextLine(); // limpar buffer
        return valor;
    }
}