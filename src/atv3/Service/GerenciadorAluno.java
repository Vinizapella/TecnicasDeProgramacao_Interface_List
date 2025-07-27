package atv3.Service;

import atv3.Model.Aluno;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorAluno {
    private List<Aluno> lista;

    public GerenciadorAluno() {
        lista = new ArrayList<>();
    }

    public void adicionar(Aluno aluno) {
        lista.add(aluno);
    }

    public void listar() {
        if (lista.isEmpty()) {
            System.out.println("Lista vazia.");
            return;
        }

        for (int i = 0; i < lista.size(); i++) {
            Aluno aluno = lista.get(i);
            aluno.imprimir(i);
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