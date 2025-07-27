package atv6.Model;
import java.util.Scanner;

public class Bicicleta {

    private String marca;
    private String modelo;
    private double tamanhoQuadro;
    private double preco;

    public void preencher(Scanner scanner) {
        System.out.print("Marca: ");
        this.marca = scanner.nextLine();

        System.out.print("Modelo: ");
        this.modelo = scanner.nextLine();

        System.out.print("Tamanho do quadro (em cm): ");
        this.tamanhoQuadro = scanner.nextDouble();
        scanner.nextLine(); // limpar buffer

        System.out.print("Preço: ");
        this.preco = scanner.nextDouble();
        scanner.nextLine(); // limpar buffer
    }

    public void imprimir(int indice) {
        System.out.println("[" + indice + "]");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Tamanho do quadro: " + tamanhoQuadro + " cm");
        System.out.println("Preço: R$" + preco);
        System.out.println("--------------------------");
    }
}
