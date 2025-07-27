package atv3.Model;

import java.util.Scanner;

public class Aluno {

    private String nome;
    private int idade;
    private String matricula;
    private int anoIngresso;

    public void preencher(Scanner scanner) {
        System.out.print("Nome: ");
        this.nome = scanner.nextLine();

        System.out.print("Idade: ");
        this.idade = scanner.nextInt();
        scanner.nextLine(); // limpar buffer

        System.out.print("Matrícula: ");
        this.matricula = scanner.nextLine();

        System.out.print("Ano de ingresso: ");
        this.anoIngresso = scanner.nextInt();
        scanner.nextLine(); // limpar buffer
    }

    public void imprimir(int indice) {
        System.out.println("[" + indice + "]");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Matrícula: " + matricula);
        System.out.println("Ano de ingresso: " + anoIngresso);
        System.out.println("--------------------------");
    }
}