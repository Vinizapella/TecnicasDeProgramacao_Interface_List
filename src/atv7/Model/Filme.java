package atv7.Model;

import java.util.Scanner;

public class Filme {

    private String titulo;
    private String diretor;
    private int duracao;
    private double preco;

    public void preencher(Scanner scanner) {
        System.out.print("Título: ");
        this.titulo = scanner.nextLine();

        System.out.print("Diretor: ");
        this.diretor = scanner.nextLine();

        System.out.print("Duração (em minutos): ");
        this.duracao = scanner.nextInt();
        scanner.nextLine(); // limpar buffer

        System.out.print("Preço: ");
        this.preco = scanner.nextDouble();
        scanner.nextLine(); // limpar buffer
    }

    public void imprimir(int indice) {
        System.out.println("[" + indice + "]");
        System.out.println("Título: " + titulo);
        System.out.println("Diretor: " + diretor);
        System.out.println("Duração: " + duracao + " minutos");
        System.out.println("Preço: R$" + preco);
        System.out.println("--------------------------");
    }
}