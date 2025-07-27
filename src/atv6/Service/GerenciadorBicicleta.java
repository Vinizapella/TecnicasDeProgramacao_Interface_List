package atv6.Service;

import atv6.Model.Bicicleta;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorBicicleta {
    private List<Bicicleta> lista;

    public GerenciadorBicicleta() {
        lista = new ArrayList<>();
    }

    public void adicionar(Bicicleta bicicleta) {
        lista.add(bicicleta);
    }

    public void listar() {
        if (lista.isEmpty()) {
            System.out.println("Lista vazia.");
            return;
        }

        for (int i = 0; i < lista.size(); i++) {
            Bicicleta bicicleta = lista.get(i);
            bicicleta.imprimir(i);
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