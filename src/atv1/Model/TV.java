package atv1.Model;

import java.util.Scanner;

public class TV {

    private String marca;
    private double tamanho;
    private String resolucao;
    private double preco;

    public void preencher(Scanner scanner) {
        System.out.print("Marca: ");
        this.marca = scanner.nextLine();

        System.out.print("Tamanho (em polegadas): ");
        this.tamanho = scanner.nextDouble();
        scanner.nextLine(); // limpar buffer

        System.out.print("Resolução: ");
        this.resolucao = scanner.nextLine();

        System.out.print("Preço: ");
        this.preco = scanner.nextDouble();
        scanner.nextLine(); // limpar buffer
    }

    public void imprimir(int indice) {
        System.out.println("[" + indice + "]");
        System.out.println("Marca: " + marca);
        System.out.println("Tamanho: " + tamanho + "\"");
        System.out.println("Resolução: " + resolucao);
        System.out.println("Preço: R$" + preco);
        System.out.println("--------------------------");
    }
}