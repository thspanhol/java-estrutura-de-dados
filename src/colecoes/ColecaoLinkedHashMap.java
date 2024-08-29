package colecoes;

import java.util.LinkedHashMap;

import static colecoes.GeraString.generateRandomString;

public class ColecaoLinkedHashMap {

    // LinkedHashMap tem capacidade inicial de 16 e fator de carga 0.75, mas mantém a ordem de inserção.

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        LinkedHashMap<String, String> colecaoLinkedHashMap = new LinkedHashMap<>();

        for (int i = 1; i <= 1000000; i++) {
            String valor = generateRandomString();
            colecaoLinkedHashMap.put(valor, valor);
        }

        int lastIndex = colecaoLinkedHashMap.size() - 1;

        colecaoLinkedHashMap.put("Teste ADD", "Teste ADD");
        colecaoLinkedHashMap.put("Teste ADD", "Teste ADD");
        colecaoLinkedHashMap.remove("Teste ADD");
        //colecaoLinkedHashMap.set(lastIndex, "Teste SET");
        System.out.println(colecaoLinkedHashMap.containsKey("Teste ADD"));

        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println(totalTime + " milissegundos");

    }
}
