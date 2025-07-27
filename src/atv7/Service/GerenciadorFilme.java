package atv7.Service;

import atv7.Model.Filme;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorFilme {
    private List<Filme> lista;

    public GerenciadorFilme() {
        lista = new ArrayList<>();
    }

    public void adicionar(Filme filme) {
        lista.add(filme);
    }

    public void listar() {
        if (lista.isEmpty()) {
            System.out.println("Lista vazia.");
            return;
        }

        for (int i = 0; i < lista.size(); i++) {
            Filme filme = lista.get(i);
            filme.imprimir(i);
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
}