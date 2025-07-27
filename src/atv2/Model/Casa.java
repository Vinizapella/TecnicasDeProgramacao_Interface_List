package atv2.Model;

import java.util.Scanner;

public class Casa {

    private String endereco;
    private double area;
    private int numQuartos;
    private double preco;

    public void preencher(Scanner scanner) {
        System.out.print("Endereço: ");
        this.endereco = scanner.nextLine();

        System.out.print("Área (em m²): ");
        this.area = scanner.nextDouble();

        System.out.print("Número de quartos: ");
        this.numQuartos = scanner.nextInt();
        scanner.nextLine(); // limpar buffer

        System.out.print("Preço: ");
        this.preco = scanner.nextDouble();
        scanner.nextLine(); // limpar buffer
    }

    public void imprimir(int indice) {
        System.out.println("[" + indice + "]");
        System.out.println("Endereço: " + endereco);
        System.out.println("Área: " + area + " m²");
        System.out.println("Número de quartos: " + numQuartos);
        System.out.println("Preço: R$" + preco);
        System.out.println("--------------------------");
    }
}
