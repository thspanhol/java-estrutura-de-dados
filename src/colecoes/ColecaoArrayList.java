package colecoes;

import java.util.ArrayList;

import static colecoes.GeraString.generateRandomString;

public class ColecaoArrayList {
    public static void main(String[] args) {

        // O ArrayList tem um tamanho inicial padrão de 10 elementos, e cresce dinamicamente conforme necessário.
        // Quando a capacidade é excedida, o tamanho do array subjacente é aumentado em 50% do tamanho atual.

        long startTime = System.currentTimeMillis();

        ArrayList<String> colecaoArrayList = new ArrayList<>();

        for (int i = 1; i <= 1000000; i++) {
            colecaoArrayList.add(generateRandomString());
        }

        int lastIndex = colecaoArrayList.size() - 1;

        colecaoArrayList.add("Teste ADD"); // Inserção no final
        colecaoArrayList.add(0, "Teste ADD"); // Inserção no index informado
        colecaoArrayList.remove(lastIndex); // Remoção de um elemento
        colecaoArrayList.set(lastIndex, "Teste SET"); // Altera o elemento do index
        System.out.println(colecaoArrayList.get(lastIndex));

        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println(totalTime + " milissegundos");

    }

}
