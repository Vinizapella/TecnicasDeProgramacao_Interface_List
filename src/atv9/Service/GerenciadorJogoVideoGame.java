package atv9.Service;

import atv9.Model.JogoVideoGame;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorJogoVideoGame {
    private List<JogoVideoGame> lista;

    public GerenciadorJogoVideoGame() {
        lista = new ArrayList<>();
    }

    public void adicionar(JogoVideoGame jogo) {
        lista.add(jogo);
    }

    public void listar() {
        if (lista.isEmpty()) {
            System.out.println("Lista vazia.");
            return;
        }

        for (int i = 0; i < lista.size(); i++) {
            JogoVideoGame jogo = lista.get(i);
            jogo.imprimir(i);
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