package colecoes;

import java.util.ArrayList;

import static colecoes.GeraString.generateRandomString;

public class ColecaoArrayList {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        ArrayList<String> colecaoArrayList = new ArrayList<>();

        for (int i = 1; i <= 1000000; i++) {
            colecaoArrayList.add(generateRandomString());
        }

        int lastIndex = colecaoArrayList.size() - 1;

        colecaoArrayList.add("Teste ADD");
        colecaoArrayList.add("Teste ADD");
        colecaoArrayList.remove(lastIndex);
        colecaoArrayList.set(lastIndex, "Teste SET");
        System.out.println(colecaoArrayList.get(lastIndex));

        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println(totalTime + " milissegundos");

    }

}
