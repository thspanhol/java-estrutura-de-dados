package colecoes;

import java.util.TreeMap;

import static colecoes.GeraString.generateRandomString;

public class colecaoTreeMap {

    public static void main(String[] args) {

        // TreeMap é baseado em uma árvore binária e mantém a ordem natural ou conforme o comparador.
        // Baseada em chave-valor, ordena pela chave.

        TreeMap<String, String> colecaoTreeMap = new TreeMap<>();

        for (int i = 1; i <= 1000000; i++) {
            String valor = generateRandomString();
            colecaoTreeMap.put(valor, valor);
        }

        // Inicia contador
        long startTime = System.nanoTime();

        // Adiciona um elemento
        colecaoTreeMap.put("KEYTESTE", "VALUETESTE");
        long addTime = System.nanoTime();
        System.out.println(addTime - startTime + " nanossegundos para adicionar um elemento.");
        // Altera um elemento
        colecaoTreeMap.put("KEYTESTE", "VALUETESTE2");
        long putTime = System.nanoTime();
        System.out.println(putTime - addTime + " nanossegundos para alterar um elemento.");
        // Resgata um elemento
        colecaoTreeMap.get("KEYTESTE");
        long getTime = System.nanoTime();
        System.out.println(getTime - putTime + " nanossegundos para resgatar um elemento.");
        // Resgata o primeiro elemento pela chave
        colecaoTreeMap.firstKey();
        long firstTime = System.nanoTime();
        System.out.println(firstTime - getTime + " nanossegundos para resgatar o primeiro elemento.");
        // Resgata o último elemento pela chave
        colecaoTreeMap.lastKey();
        long lastTime = System.nanoTime();
        System.out.println(lastTime - firstTime + " nanossegundos para resgatar o último elemento.");
        // Confere a existência de um elemento
        colecaoTreeMap.containsKey("KEYTESTE");
        long containTime = System.nanoTime();
        System.out.println(containTime - getTime + " nanossegundos para conferir se contem um elemento.");
        // Remove um elemento
        colecaoTreeMap.remove("KEYTESTE");
        long removeOneTime = System.nanoTime();
        System.out.println(removeOneTime - containTime + " nanossegundos para remover um elemento.");
        // Remover todos
        colecaoTreeMap.clear();
        long removeAllTime = System.nanoTime();
        System.out.println(removeAllTime - removeOneTime + " nanossegundos para remover todos.");

        // Encerra contador
        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println(totalTime + " nanossegundos total.");

    }
}
