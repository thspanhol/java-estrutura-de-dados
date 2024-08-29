package colecoes;

import java.util.LinkedList;

import static colecoes.GeraString.generateRandomString;

public class ColecaoLinkedList {
    public static void main(String[] args) {

        // A LinkedList não tem uma capacidade inicial ou máxima, pois é baseada em nós ligados.

        long startTime = System.currentTimeMillis();

        LinkedList<String> colecaoLinkedList = new LinkedList<>();

        for (int i = 1; i <= 1000000; i++) {
            colecaoLinkedList.add(generateRandomString());
        }

        int lastIndex = colecaoLinkedList.size() - 1;

        colecaoLinkedList.add("Teste ADD");
        colecaoLinkedList.add("Teste ADD");
        colecaoLinkedList.remove(lastIndex);
        colecaoLinkedList.set(lastIndex, "Teste SET");
        System.out.println(colecaoLinkedList.get(lastIndex));

        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println(totalTime + " milissegundos");

    }
}
