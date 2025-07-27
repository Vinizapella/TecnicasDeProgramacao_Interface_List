package atv9.Model;

import java.util.Scanner;

public class JogoVideoGame {

    private String titulo;
    private String plataforma;
    private String classificacaoEtaria;
    private double preco;

    public void preencher(Scanner scanner) {
        System.out.print("Título: ");
        this.titulo = scanner.nextLine();

        System.out.print("Plataforma: ");
        this.plataforma = scanner.nextLine();

        System.out.print("Classificação etária: ");
        this.classificacaoEtaria = scanner.nextLine();

        System.out.print("Preço: ");
        this.preco = scanner.nextDouble();
        scanner.nextLine(); // limpar buffer
    }

    public void imprimir(int indice) {
        System.out.println("[" + indice + "]");
        System.out.println("Título: " + titulo);
        System.out.println("Plataforma: " + plataforma);
        System.out.println("Classificação etária: " + classificacaoEtaria);
        System.out.println("Preço: R$" + preco);
        System.out.println("--------------------------");
    }
}