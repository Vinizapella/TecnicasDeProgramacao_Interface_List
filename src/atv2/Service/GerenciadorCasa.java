package atv2.Service;

import atv2.Model.Casa;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorCasa {
    private List<Casa> lista;

    public GerenciadorCasa() {
        lista = new ArrayList<>();
    }

    public void adicionar(Casa casa) {
        lista.add(casa);
    }

    public void listar() {
        if (lista.isEmpty()) {
            System.out.println("Lista vazia.");
            return;
        }

        for (int i = 0; i < lista.size(); i++) {
            Casa casa = lista.get(i);
            casa.imprimir(i);
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
