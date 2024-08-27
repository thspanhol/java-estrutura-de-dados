package colecoes;

import java.util.HashSet;

import static colecoes.GeraString.generateRandomString;

public class ColecaoHashSet {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        HashSet<String> colecaoHashSet = new HashSet<>();

        for (int i = 1; i <= 1000000; i++) {
            colecaoHashSet.add(generateRandomString());
        }

        colecaoHashSet.add("Teste ADD");
        colecaoHashSet.add("Teste ADD");
        colecaoHashSet.remove("Teste ADD");
        //colecaoHashSet.set(lastIndex, "Teste SET");
        System.out.println(colecaoHashSet.contains("Teste ADD"));

        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println(totalTime + " milissegundos");

    }
}
