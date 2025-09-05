
# Atividade: Interface List e ArrayList em Java

Este repositório documenta os exercícios e conceitos chave da aula sobre o uso da **interface List** e da classe **ArrayList**, parte do Collection Framework em Java.  
O objetivo é reforçar a manipulação de listas de objetos, aplicando os conceitos de **POO** junto a coleções dinâmicas.

---
## 📚 Conteúdo da Aula  

### 1. Listas em Java
Em Java, as listas são manipuladas por meio da **interface `List`**, presente no pacote `java.util`.  
Existem diversas implementações, sendo as mais comuns:  

- **ArrayList** → baseado em array (contíguo na memória)  
  ⚡ Rápido para acessar elementos (`get(i)`)  
  🐢 Mais lento para inserir/remover no meio ou começo  
  🧵 Não é sincronizado  
  🟢 Use quando precisa de acesso rápido e poucas mudanças na estrutura  

- **LinkedList** → baseado em lista encadeada  
  ⚡ Rápido para inserir/remover em posições variadas  
  🐢 Lento para acessar por índice  
  🧵 Não é sincronizado  
  🟢 Use quando há muitas inserções/remoções  

- **Vector** → semelhante ao ArrayList, mas **sincronizado**  
  ⚡ Rápido para acessar elementos  
  🔒 Seguro para múltiplas threads  
  🐢 Mais lento que ArrayList devido à sincronização  

---

### 2. ArrayList
O **ArrayList** é um array redimensionável.  

**Características principais:**
- Permite **elementos duplicados**.  
- Mantém a **ordem de inserção**.  
- Acesso rápido por índice.  
- Cresce dinamicamente conforme necessário.  

---

### 3. Exemplo de uso do ArrayList
```java
import java.util.ArrayList;
import java.util.List;

public class ExemploArrayList {
    public static void main(String[] args) {
        List<String> listaDeFrutas = new ArrayList<>();

        // Adicionando elementos
        listaDeFrutas.add("Maçã");
        listaDeFrutas.add("Banana");
        listaDeFrutas.add("Laranja");
        listaDeFrutas.add("Manga");

        // Exibindo lista
        System.out.println("Lista de Frutas: " + listaDeFrutas);

        // Acessando elemento específico
        System.out.println("Fruta na posição 2: " + listaDeFrutas.get(2));

        // Removendo elemento
        listaDeFrutas.remove("Banana");
        System.out.println("Após remoção: " + listaDeFrutas);

        // Tamanho da lista
        System.out.println("Tamanho: " + listaDeFrutas.size());

        // Verificando se contém um elemento
        System.out.println("Contém Laranja? " + listaDeFrutas.contains("Laranja"));
    }
}

```
---

### 4. Observação Importante 
O **ArrayList** não pode armazenar tipos primitivos diretamente.
É necessário usar as **classes wrapper**:
  - ```java int → Integer ```
  - ```double → Double ```
  - ```boolean → Boolean ```

---

### 5. Percorrendo a Lista
**Com for tradicional**:
 ```java
List<String> frutas = new ArrayList<>();
frutas.add("Maça");
frutas.add("Abacate");
frutas.add("Limão");
frutas.add("Laranja");

for (int i = 0; i < frutas.size(); i++) {
    String f = frutas.get(i);
    System.out.println(f);
}

 ```
---

**Com for-each:**
```java
for (String f : frutas) {
    System.out.println(f);
}
```
✔ Vantagens do for-each: simplicidade, segurança e legibilidade.
---

# 🚀 Atividades Propostas

📌 Refaça as atividades da lista anterior, permitindo ao usuário:

- Inserir dados  
- Listar dados cadastrados  
- Remover itens da lista  

---

## Ex0. Telefone Celular ✅ (já implementado no exemplo do material)

**Atributos:**
- marca (String)  
- modelo (String)  
- preço (double)  
- memória (int)  

---

## Ex1. TV

**Atributos:**
- marca (String)  
- tamanho (double)  
- resolução (String)  
- preço (double)  

---

## Ex2. Casa

**Atributos:**
- endereço (String)  
- área (double)  
- número de quartos (int)  
- preço (double)  

---

## Ex3. Aluno

**Atributos:**
- nome (String)  
- idade (int)  
- matrícula (String)  
- ano de ingresso (int)  

---

## Ex4. Livro

**Atributos:**
- título (String)  
- autor (String)  
- número de páginas (int)  
- preço (double)  

---

## Ex5. Animal de Estimação

**Atributos:**
- espécie (String)  
- raça (String)  
- idade (int)  
- peso (double)  

---

## Ex6. Bicicleta

**Atributos:**
- marca (String)  
- modelo (String)  
- tamanho do quadro (double)  
- preço (double)  

---

## Ex7. Filme

**Atributos:**
- título (String)  
- diretor (String)  
- duração (int)  
- preço (double)  

---

## Ex8. Música

**Atributos:**
- título (String)  
- artista (String)  
- duração (double)  
- preço (double)  

➡ Além dos métodos tradicionais, implementar também:  
- `tocarMusica()` → imprime mensagem simulando execução da música.  
- `desligarMusica()` → imprime mensagem simulando parada da música.  

---

## Ex9. Jogo de Vídeo Game

**Atributos:**
- título (String)  
- plataforma (String)  
- classificação etária (String)  
- preço (double)  

---

## Ex10. Bolsa de Valores

**Atributos:**
- nome da empresa (String)  
- preço da ação (double)  
- volume de negociações (double)  
- variação diária (double)  

---

<p align="center">
  &copy; 2025 - Atividade de Técnicas de Programação
</p>
