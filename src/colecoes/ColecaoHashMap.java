package colecoes;

import java.util.HashMap;

import static colecoes.GeraString.generateRandomString;

public class ColecaoHashMap {
    public static void main(String[] args) {

        // HashMap tem capacidade inicial de 16 e fator de carga 0.75.

        long startTime = System.currentTimeMillis();

        HashMap<String, String> colecaoHashMap = new HashMap<>();

        for (int i = 1; i <= 1000000; i++) {
            String valor = generateRandomString();
            colecaoHashMap.put(valor, valor);
        }

        colecaoHashMap.put("Teste ADD", "Teste ADD");
        colecaoHashMap.put("Teste ADD", "Teste ADD");
        colecaoHashMap.remove("Teste ADD");
        //colecaoHashMap.set(lastIndex, "Teste SET");
        System.out.println(colecaoHashMap.containsKey("Teste ADD"));

        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println(totalTime + " milissegundos");

    }
}
