package atv8.Service;

import atv8.Model.Musica;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorMusica {
    private List<Musica> lista;

    public GerenciadorMusica() {
        lista = new ArrayList<>();
    }

    public void adicionar(Musica musica) {
        lista.add(musica);
    }

    public void listar() {
        if (lista.isEmpty()) {
            System.out.println("Lista vazia.");
            return;
        }

        for (int i = 0; i < lista.size(); i++) {
            Musica musica = lista.get(i);
            musica.imprimir(i);
        }
    }

    public void remover(int indice) {
        if (indice >= 0 && indice < lista.size()) {
            lista.remove(indice);
            System.out.println("Item removido com sucesso.");
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public void tocarMusica(int indice) {
        if (indice >= 0 && indice < lista.size()) {
            Musica musica = lista.get(indice);
            musica.tocarMusica();
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public void desligarMusica(int indice) {
        if (indice >= 0 && indice < lista.size()) {
            Musica musica = lista.get(indice);
            musica.desligarMusica();
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public int getTamanhoLista() {
        return lista.size();
    }
}