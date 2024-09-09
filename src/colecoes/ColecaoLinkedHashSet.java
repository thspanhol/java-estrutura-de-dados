package colecoes;

import java.util.LinkedHashSet;

import static colecoes.GeraString.generateRandomString;

public class ColecaoLinkedHashSet {
    public static void main(String[] args) {

        // A LinkedHashSet tem uma capacidade inicial padrão de 16, com fator de carga 0.75, mas mantém a ordem de inserção.
        // Armazena valores únicos, não insere valores repetidos.
        // A ordem dos elementos é baseada na ordem de inserção, mas não é indexada como uma lista.
        // Duplamente Ligada

        LinkedHashSet<String> colecaoLinkedHashSet = new LinkedHashSet<>();

        for (int i = 1; i <= 1000000; i++) {
            colecaoLinkedHashSet.add(generateRandomString());
        }

        // Inicia contador
        long startTime = System.nanoTime();

        // Adiciona elemento
        colecaoLinkedHashSet.add("ELEMENTO ADICIONADO");
        long addTime = System.nanoTime();
        System.out.println(addTime - startTime + " nanossegundos para adicionar um elemento.");
        // Adicionar no final
        colecaoLinkedHashSet.addLast("TESTE ADD FINAL");
        long addFinalTime = System.nanoTime();
        System.out.println(addFinalTime - addTime + " nanossegundos para adicionar no final.");
        // Confere se elemento existe na coleção
        colecaoLinkedHashSet.contains("ELEMENTO ADICIONADO");
        long containTime = System.nanoTime();
        System.out.println(containTime - addFinalTime + " nanossegundos para conferir se contêm o elemento.");
        // Remover elemento
        colecaoLinkedHashSet.remove("ELEMENTO ADICIONADO");
        long removeTime = System.nanoTime();
        System.out.println(removeTime - containTime + " nanossegundos para remover um elemento.");
        // Remover todos
        colecaoLinkedHashSet.clear();
        long removeAllTime = System.nanoTime();
        System.out.println(removeAllTime - removeTime + " nanossegundos para remover todos.");

        // Encerra contador
        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println(totalTime + " nanossegundos total.");

    }
}
