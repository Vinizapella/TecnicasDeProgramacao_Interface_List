package atv5.Model;

import java.util.Scanner;

public class AnimalEstimacao {

    private String especie;
    private String raca;
    private int idade;
    private double peso;

    public void preencher(Scanner scanner) {
        System.out.print("Espécie: ");
        this.especie = scanner.nextLine();

        System.out.print("Raça: ");
        this.raca = scanner.nextLine();

        System.out.print("Idade (em anos): ");
        this.idade = scanner.nextInt();
        scanner.nextLine(); // limpar buffer

        System.out.print("Peso (em kg): ");
        this.peso = scanner.nextDouble();
        scanner.nextLine(); // limpar buffer
    }

    public void imprimir(int indice) {
        System.out.println("[" + indice + "]");
        System.out.println("Espécie: " + especie);
        System.out.println("Raça: " + raca);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Peso: " + peso + " kg");
        System.out.println("--------------------------");
    }
}
