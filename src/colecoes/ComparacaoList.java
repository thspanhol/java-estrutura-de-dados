package colecoes;

import java.util.ArrayList;
import java.util.LinkedList;

import static colecoes.GeraString.generateRandomString;

public class ComparacaoList {
    public static void main(String[] args) {

        // ARRAYLIST
        // O ArrayList tem um tamanho inicial padrão de 10 elementos, e cresce dinamicamente conforme necessário.
        // Quando a capacidade é excedida, o tamanho do array subjacente é aumentado em 50% do tamanho atual.


        ArrayList<String> colecaoArrayList = new ArrayList<>();

        for (int i = 1; i <= 1000000; i++) {
            colecaoArrayList.add(generateRandomString());
        }

        // Inicia contador
        long startTime = System.nanoTime();

        // Pega elemento no meio
        colecaoArrayList.get(500000);
        long getTime = System.nanoTime();
        // Adiciona no início
        colecaoArrayList.addFirst("TESTE ADD INICIO");
        long addFirstTime = System.nanoTime();
        // Adicionar no meio
        colecaoArrayList.add(500000, "TESTE ADD MEIO");
        long addMidTime = System.nanoTime();
        // Adicionar no final
        colecaoArrayList.addLast("TESTE ADD FINAL");
        long addFinalTime = System.nanoTime();
        // Alterar no meio
        colecaoArrayList.set(500000, "TESTE SET MEIO");
        long setMidTime = System.nanoTime();
        // Remover no meio
        colecaoArrayList.remove(500000);
        long removeMidTime = System.nanoTime();
        // Remover todos
        colecaoArrayList.clear();
        long removeAllTime = System.nanoTime();

        // Encerra contador
        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;

        //LINKEDLIST
        // A LinkedList não tem uma capacidade inicial ou máxima, pois é baseada em nós ligados.

        LinkedList<String> colecaoLinkedList = new LinkedList<>();

        for (int i = 1; i <= 1000000; i++) {
            colecaoLinkedList.add(generateRandomString());
        }

        // Inicia contador
        long lstartTime = System.nanoTime();

        // Pega elemento no meio
        colecaoLinkedList.get(500000);
        long lgetTime = System.nanoTime();
        // Adiciona no início
        colecaoLinkedList.addFirst("TESTE ADD INICIO");
        long laddFirstTime = System.nanoTime();
        // Adicionar no meio
        colecaoLinkedList.add(500000, "TESTE ADD MEIO");
        long laddMidTime = System.nanoTime();
        // Adicionar no final
        colecaoLinkedList.addLast("TESTE ADD FINAL");
        long laddFinalTime = System.nanoTime();
        // Alterar no meio
        colecaoLinkedList.set(500000, "TESTE SET MEIO");
        long lsetMidTime = System.nanoTime();
        // Remover no meio
        colecaoLinkedList.remove(500000);
        long lremoveMidTime = System.nanoTime();
        // Remover todos
        colecaoLinkedList.clear();
        long lremoveAllTime = System.nanoTime();

        // Encerra contador
        long lendTime = System.nanoTime();
        long ltotalTime = lendTime - lstartTime;

        System.out.println(getTime - startTime + " nanossegundos para buscar um elemento no meio ArrayList.");
        System.out.println(lgetTime - lstartTime + " nanossegundos para buscar um elemento no meio LinkedList.");
        System.out.println(getTime - startTime < lgetTime - lstartTime ? "ArrayList foi mais rápido \n" : "LinkedList foi mais rápido \n");

        System.out.println(addFirstTime - getTime + " nanossegundos para adicionar no início ArrayList.");
        System.out.println(laddFirstTime - lgetTime + " nanossegundos para adicionar no início LinkedList.");
        System.out.println(addFirstTime - getTime < laddFirstTime - lgetTime ? "ArrayList foi mais rápido \n" : "LinkedList foi mais rápido \n");

        System.out.println(addMidTime - addFirstTime + " nanossegundos para adicionar no meio ArrayList.");
        System.out.println(laddMidTime - laddFirstTime + " nanossegundos para adicionar no meio LinkedList.");
        System.out.println(addMidTime - addFirstTime < laddMidTime - laddFirstTime ? "ArrayList foi mais rápido \n" : "LinkedList foi mais rápido \n");

        System.out.println(addFinalTime - addMidTime + " nanossegundos para adicionar no final ArrayList.");
        System.out.println(laddFinalTime - laddMidTime + " nanossegundos para adicionar no final LinkedList.");
        System.out.println(addFinalTime - addMidTime < laddFinalTime - laddMidTime ? "ArrayList foi mais rápido \n" : "LinkedList foi mais rápido \n");

        System.out.println(setMidTime - addFinalTime + " nanossegundos para alterar no meio ArrayList.");
        System.out.println(lsetMidTime - laddFinalTime + " nanossegundos para alterar no meio LinkedList.");
        System.out.println(setMidTime - addFinalTime < lsetMidTime - laddFinalTime ? "ArrayList foi mais rápido \n" : "LinkedList foi mais rápido \n");

        System.out.println(removeMidTime - setMidTime + " nanossegundos para remover no meio ArrayList.");
        System.out.println(lremoveMidTime - lsetMidTime + " nanossegundos para remover no meio LinkedList.");
        System.out.println(removeMidTime - setMidTime < lremoveMidTime - lsetMidTime ? "ArrayList foi mais rápido \n" : "LinkedList foi mais rápido \n");

        System.out.println(removeAllTime - removeMidTime + " nanossegundos para remover todos ArrayList.");
        System.out.println(lremoveAllTime - lremoveMidTime + " nanossegundos para remover todos LinkedList.");
        System.out.println(removeAllTime - removeMidTime < lremoveAllTime - lremoveMidTime ? "ArrayList foi mais rápido \n" : "LinkedList foi mais rápido \n");

        System.out.println(totalTime + " nanossegundos total ArrayList.");
        System.out.println(ltotalTime + " nanossegundos total LinkedList.");
        System.out.println(totalTime < ltotalTime ? "ArrayList foi mais rápido" : "LinkedList foi mais rápido");

        // ARRAYLIST
        // O ArrayList tem um tamanho inicial padrão de 10 elementos, e cresce dinamicamente conforme necessário.
        // Quando a capacidade é excedida, o tamanho do array subjacente é aumentado em 50% do tamanho atual.

        //LINKEDLIST
        // A LinkedList não tem uma capacidade inicial ou máxima, pois é baseada em nós ligados.

//        --- Pontos em Comum ---
//        Ambas são implementações da interface List em Java.
//        Mantêm a ordem dos elementos conforme a inserção.
//        Permitem elementos duplicados.

//        --- Diferenças --
//        - Estrutura Interna
//        ArrayList: Implementado internamente como um array dinâmico. O tamanho do array pode crescer conforme necessário.
//        LinkedList: Implementado como uma lista duplamente ligada, onde cada elemento (nó) contém uma referência ao anterior e ao próximo.
//
//        - Performance
//        ArrayList: Acesso a elementos é rápido.
//                   Inserções e remoções no final são rápidas, mas inserções e remoções no meio da lista podem ser lentas.

//        LinkedList: Inserções e remoções são rápidas em qualquer posição, porque envolve apenas ajustes de ponteiros.
//                    Acesso a elementos é lento porque é necessário percorrer a lista desde o início ou fim.
//
//        - Uso de Memória
//        ArrayList: Usa menos memória, pois armazena diretamente os elementos em um array.
//        LinkedList: Usa mais memória, pois armazena referências extras para o nó anterior e o próximo em cada elemento.
    }
}
