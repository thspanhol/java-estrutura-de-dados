package colecoes;

import java.util.TreeSet;

import static colecoes.GeraString.generateRandomString;

public class ColecaoTreeSet {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        TreeSet<String> colecaoTreeSet = new TreeSet<>();

        for (int i = 1; i <= 1000000; i++) {
            colecaoTreeSet.add(generateRandomString());
        }

        colecaoTreeSet.add("Teste ADD");
        colecaoTreeSet.add("Teste ADD");
        colecaoTreeSet.remove("Teste ADD");
        //colecaoTreeSet.set(lastIndex, "Teste SET");
        System.out.println(colecaoTreeSet.contains("Teste ADD"));

        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println(totalTime + " milissegundos");

    }
}
