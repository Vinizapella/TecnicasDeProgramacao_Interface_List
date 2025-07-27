package atv8.Model;

import java.util.Scanner;

public class Musica {

    private String titulo;
    private String artista;
    private double duracao;
    private double preco;

    // Construtor padrão
    public Musica() {
    }

    // Construtor com parâmetros
    public Musica(String titulo, String artista, double duracao, double preco) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracao = duracao;
        this.preco = preco;
    }

    // Construtor de cópia
    public Musica(Musica outraMusica) {
        this.titulo = outraMusica.titulo;
        this.artista = outraMusica.artista;
        this.duracao = outraMusica.duracao;
        this.preco = outraMusica.preco;
    }

    public void preencher(Scanner scanner) {
        System.out.print("Título: ");
        this.titulo = scanner.nextLine();

        System.out.print("Artista: ");
        this.artista = scanner.nextLine();

        System.out.print("Duração (em minutos): ");
        this.duracao = scanner.nextDouble();
        scanner.nextLine(); // limpar buffer

        System.out.print("Preço: ");
        this.preco = scanner.nextDouble();
        scanner.nextLine(); // limpar buffer
    }

    public void imprimir(int indice) {
        System.out.println("[" + indice + "]");
        System.out.println("Título: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Duração: " + duracao + " minutos");
        System.out.println("Preço: R$" + preco);
        System.out.println("--------------------------");
    }



    // Método mockado para tocar a música
    public void tocarMusica() {
        System.out.println("♪ A música '" + this.titulo + "' de " + this.artista + " está tocando! ♪");
    }

    // Método mockado para desligar a música
    public void desligarMusica() {
        System.out.println("⏹ A música '" + this.titulo + "' foi pausada/parada.");
    }

    // Getters e Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}