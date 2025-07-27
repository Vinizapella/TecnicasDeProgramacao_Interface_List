package atv5.Service;

import atv5.Model.AnimalEstimacao;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorAnimalEstimacao {
    private List<AnimalEstimacao> lista;

    public GerenciadorAnimalEstimacao() {
        lista = new ArrayList<>();
    }

    public void adicionar(AnimalEstimacao animal) {
        lista.add(animal);
    }

    public void listar() {
        if (lista.isEmpty()) {
            System.out.println("Lista vazia.");
            return;
        }

        for (int i = 0; i < lista.size(); i++) {
            AnimalEstimacao animal = lista.get(i);
            animal.imprimir(i);
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
