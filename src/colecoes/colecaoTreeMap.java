package colecoes;

import java.util.TreeMap;

import static colecoes.GeraString.generateRandomString;

public class colecaoTreeMap {

    // TreeMap é baseado em uma árvore binária e mantém a ordem natural ou conforme o comparador.

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        TreeMap<String, String> colecaoTreeMap = new TreeMap<>();

        for (int i = 1; i <= 1000000; i++) {
            String valor = generateRandomString();
            colecaoTreeMap.put(valor, valor);
        }

        colecaoTreeMap.put("Teste ADD", "Teste ADD");
        colecaoTreeMap.put("Teste ADD", "Teste ADD");
        colecaoTreeMap.remove("Teste ADD");
        //colecaoTreeMap.set(lastIndex, "Teste SET");
        System.out.println(colecaoTreeMap.containsKey("Teste ADD"));

        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println(totalTime + " milissegundos");

    }
}
