package atv0.Main.Service;

import atv0.Main.Model.TelefoneCelular;

import java.util.ArrayList;
import java.util.List;


public class GerenciadorTelefoneCelular {
    private List<TelefoneCelular> lista;

    public GerenciadorTelefoneCelular() {
        lista = new ArrayList<>();
    }

    public void adicionar(TelefoneCelular telefone) {
        lista.add(telefone);
    }

    public void listar() {
        if (lista.isEmpty()) { // verificar tabela dos metodos do List que deixei no material de vocês

            System.out.println("Lista vazia.");
            return;
        }

        for (int i = 0; i < lista.size(); i++) {
            TelefoneCelular tel = lista.get(i);
            tel.imprimir(i);
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
