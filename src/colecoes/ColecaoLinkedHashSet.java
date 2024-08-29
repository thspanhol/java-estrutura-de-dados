package colecoes;

import java.util.LinkedHashSet;

import static colecoes.GeraString.generateRandomString;

public class ColecaoLinkedHashSet {
    public static void main(String[] args) {

        // A LinkedHashSet tem uma capacidade inicial padrão de 16, com fator de carga 0.75, mas mantém a ordem de inserção.

        long startTime = System.currentTimeMillis();

        LinkedHashSet<String> colecaoLinkedHashSet = new LinkedHashSet<>();

        for (int i = 1; i <= 1000000; i++) {
            colecaoLinkedHashSet.add(generateRandomString());
        }

        colecaoLinkedHashSet.add("Teste ADD");
        colecaoLinkedHashSet.add("Teste ADD");
        colecaoLinkedHashSet.remove("Teste ADD");
        //colecaoLinkedHashSet.set(lastIndex, "Teste SET");
        System.out.println(colecaoLinkedHashSet.contains("Teste ADD"));

        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println(totalTime + " milissegundos");

    }
}
