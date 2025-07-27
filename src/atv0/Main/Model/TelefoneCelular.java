package atv0.Main.Model;

import java.util.Scanner;

public class TelefoneCelular {

    private String marca;
    private String modelo;
    private double preco;
    private int memoria;

    public void preencher(Scanner scanner) {
        System.out.print("Marca: ");
        this.marca = scanner.nextLine();

        System.out.print("Modelo: ");
        this.modelo = scanner.nextLine();

        System.out.print("Preço: ");
        this.preco = scanner.nextDouble();

        System.out.print("Memória (em GB): ");
        this.memoria = scanner.nextInt();
        scanner.nextLine(); // limpar buffer (Sujeira deixada pelo double)
    }

    public void imprimir(int indice) {
        System.out.println("[" + indice + "]");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Preço: R$" + preco);
        System.out.println("Memória: " + memoria + "GB");
        System.out.println("--------------------------");
    }
}
