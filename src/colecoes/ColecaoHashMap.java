package colecoes;

import java.util.HashMap;

import static colecoes.GeraString.generateRandomString;

public class ColecaoHashMap {
    public static void main(String[] args) {

        // HashMap tem capacidade inicial de 16 e fator de carga 0.75.
        // Baseada em chave-valor, não como uma lista ordenada de elementos.

        HashMap<String, String> colecaoHashMap = new HashMap<>();

        for (int i = 1; i <= 1000000; i++) {
            String valor = generateRandomString();
            colecaoHashMap.put(valor, valor);
        }

        // Inicia contador
        long startTime = System.nanoTime();

        // Adiciona um elemento
        colecaoHashMap.put("KEYTESTE", "VALUETESTE");
        long addTime = System.nanoTime();
        System.out.println(addTime - startTime + " nanossegundos para adicionar um elemento.");
        // Altera um elemento
        colecaoHashMap.put("KEYTESTE", "VALUETESTE2");
        long putTime = System.nanoTime();
        System.out.println(putTime - addTime + " nanossegundos para alterar um elemento.");
        // Resgata um elemento
        colecaoHashMap.get("KEYTESTE");
        long getTime = System.nanoTime();
        System.out.println(getTime - putTime + " nanossegundos para resgatar um elemento.");
        // Confere a existência de um elemento
        colecaoHashMap.containsKey("KEYTESTE");
        long containTime = System.nanoTime();
        System.out.println(containTime - getTime + " nanossegundos para conferir se contem um elemento.");
        // Remove um elemento
        colecaoHashMap.remove("KEYTESTE");
        long removeOneTime = System.nanoTime();
        System.out.println(removeOneTime - containTime + " nanossegundos para remover um elemento.");
        // Remover todos
        colecaoHashMap.clear();
        long removeAllTime = System.nanoTime();
        System.out.println(removeAllTime - removeOneTime + " nanossegundos para remover todos.");

        // Encerra contador
        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println(totalTime + " nanossegundos total.");

    }
}
