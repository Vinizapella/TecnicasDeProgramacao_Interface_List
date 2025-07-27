package atv4.Model;

import java.util.Scanner;

public class Livro {

    private String titulo;
    private String autor;
    private int numPaginas;
    private double preco;

    public void preencher(Scanner scanner) {
        System.out.print("Título: ");
        this.titulo = scanner.nextLine();

        System.out.print("Autor: ");
        this.autor = scanner.nextLine();

        System.out.print("Número de páginas: ");
        this.numPaginas = scanner.nextInt();
        scanner.nextLine(); // limpar buffer

        System.out.print("Preço: ");
        this.preco = scanner.nextDouble();
        scanner.nextLine(); // limpar buffer
    }

    public void imprimir(int indice) {
        System.out.println("[" + indice + "]");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de páginas: " + numPaginas);
        System.out.println("Preço: R$" + preco);
        System.out.println("--------------------------");
    }
}

