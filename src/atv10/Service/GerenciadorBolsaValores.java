package atv10.Service;

import atv10.Model.BolsaValores;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorBolsaValores {
    private List<BolsaValores> lista;

    public GerenciadorBolsaValores() {
        lista = new ArrayList<>();
    }

    public void adicionar(BolsaValores ativo) {
        lista.add(ativo);
    }

    public void listar() {
        if (lista.isEmpty()) {
            System.out.println("Lista vazia.");
            return;
        }

        for (int i = 0; i < lista.size(); i++) {
            BolsaValores ativo = lista.get(i);
            ativo.imprimir(i);
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