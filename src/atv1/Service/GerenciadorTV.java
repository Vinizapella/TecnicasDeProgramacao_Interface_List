package atv1.Service;

import atv1.Model.TV;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorTV {
    private List<TV> lista;

    public GerenciadorTV() {
        lista = new ArrayList<>();
    }

    public void adicionar(TV tv) {
        lista.add(tv);
    }

    public void listar() {
        if (lista.isEmpty()) {
            System.out.println("Lista vazia.");
            return;
        }

        for (int i = 0; i < lista.size(); i++) {
            TV tv = lista.get(i);
            tv.imprimir(i);
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
