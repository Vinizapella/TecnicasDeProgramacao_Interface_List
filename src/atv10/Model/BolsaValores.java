package atv10.Model;
import java.util.Scanner;

public class BolsaValores {

    private String nomeEmpresa;
    private double precoAcao;
    private double volumeNegociacoes;
    private double variacaoDiaria;

    public void preencher(Scanner scanner) {
        System.out.print("Nome da empresa: ");
        this.nomeEmpresa = scanner.nextLine();

        System.out.print("Preço da ação: ");
        this.precoAcao = scanner.nextDouble();
        scanner.nextLine(); // limpar buffer

        System.out.print("Volume de negociações: ");
        this.volumeNegociacoes = scanner.nextDouble();
        scanner.nextLine(); // limpar buffer

        System.out.print("Variação diária (%): ");
        this.variacaoDiaria = scanner.nextDouble();
        scanner.nextLine(); // limpar buffer
    }

    public void imprimir(int indice) {
        System.out.println("[" + indice + "]");
        System.out.println("Nome da empresa: " + nomeEmpresa);
        System.out.println("Preço da ação: $" + precoAcao);
        System.out.println("Volume de negociações: " + volumeNegociacoes);
        System.out.println("Variação diária: " + variacaoDiaria + "%");
        System.out.println("--------------------------");
    }
}
