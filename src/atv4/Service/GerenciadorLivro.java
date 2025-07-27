package atv4.Service;

import atv4.Model.Livro;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorLivro {
    private List<Livro> lista;

    public GerenciadorLivro() {
        lista = new ArrayList<>();
    }

    public void adicionar(Livro livro) {
        lista.add(livro);
    }

    public void listar() {
        if (lista.isEmpty()) {
            System.out.println("Lista vazia.");
            return;
        }

        for (int i = 0; i < lista.size(); i++) {
            Livro livro = lista.get(i);
            livro.imprimir(i);
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


