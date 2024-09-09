package colecoes;

import java.util.LinkedList;

import static colecoes.GeraString.generateRandomString;

public class ColecaoLinkedList {
    public static void main(String[] args) {

        // A LinkedList não tem uma capacidade inicial ou máxima, pois é baseada em nós ligados.

        LinkedList<String> colecaoLinkedList = new LinkedList<>();

        for (int i = 1; i <= 1000000; i++) {
            colecaoLinkedList.add(generateRandomString());
        }

        // Inicia contador
        long startTime = System.nanoTime();

        // Pega elemento no meio
        colecaoLinkedList.get(500000);
        long getTime = System.nanoTime();
        System.out.println(getTime - startTime + " nanossegundos para buscar um elemento no meio.");
        // Adiciona no início
        colecaoLinkedList.addFirst("TESTE ADD INICIO");
        long addFirstTime = System.nanoTime();
        System.out.println(addFirstTime - getTime + " nanossegundos para adicionar no início.");
        // Adicionar no meio
        colecaoLinkedList.add(500000, "TESTE ADD MEIO");
        long addMidTime = System.nanoTime();
        System.out.println(addMidTime - addFirstTime + " nanossegundos para adicionar no meio.");
        // Adicionar no final
        colecaoLinkedList.addLast("TESTE ADD FINAL");
        long addFinalTime = System.nanoTime();
        System.out.println(addFinalTime - addMidTime + " nanossegundos para adicionar no final.");
        // Alterar no meio
        colecaoLinkedList.set(500000, "TESTE SET MEIO");
        long setMidTime = System.nanoTime();
        System.out.println(setMidTime - addFinalTime + " nanossegundos para alterar no meio.");
        // Remover no meio
        colecaoLinkedList.remove(500000);
        long removeMidTime = System.nanoTime();
        System.out.println(removeMidTime - setMidTime + " nanossegundos para remover no meio.");
        // Remover todos
        colecaoLinkedList.clear();
        long removeAllTime = System.nanoTime();
        System.out.println(removeAllTime - removeMidTime + " nanossegundos para remover todos.");

        // Encerra contador
        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println(totalTime + " nanossegundos total.");

    }
}
