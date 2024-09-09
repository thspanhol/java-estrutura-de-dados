package colecoes;

import java.util.ArrayList;

import static colecoes.GeraString.generateRandomString;

public class ColecaoArrayList {
    public static void main(String[] args) {

        // O ArrayList tem um tamanho inicial padrão de 10 elementos, e cresce dinamicamente conforme necessário.
        // Quando a capacidade é excedida, o tamanho do array subjacente é aumentado em 50% do tamanho atual.


        ArrayList<String> colecaoArrayList = new ArrayList<>();

        for (int i = 1; i <= 1000000; i++) {
            colecaoArrayList.add(generateRandomString());
        }

        // Inicia contador
        long startTime = System.nanoTime();

        // Pega elemento no meio
        colecaoArrayList.get(500000);
        long getTime = System.nanoTime();
        System.out.println(getTime - startTime + " nanossegundos para buscar um elemento no meio.");
        // Adiciona no início
        colecaoArrayList.addFirst("TESTE ADD INICIO");
        long addFirstTime = System.nanoTime();
        System.out.println(addFirstTime - getTime + " nanossegundos para adicionar no início.");
        // Adicionar no meio
        colecaoArrayList.add(500000, "TESTE ADD MEIO");
        long addMidTime = System.nanoTime();
        System.out.println(addMidTime - addFirstTime + " nanossegundos para adicionar no meio.");
        // Adicionar no final
        colecaoArrayList.addLast("TESTE ADD FINAL");
        long addFinalTime = System.nanoTime();
        System.out.println(addFinalTime - addMidTime + " nanossegundos para adicionar no final.");
        // Alterar no meio
        colecaoArrayList.set(500000, "TESTE SET MEIO");
        long setMidTime = System.nanoTime();
        System.out.println(setMidTime - addFinalTime + " nanossegundos para alterar no meio.");
        // Remover no meio
        colecaoArrayList.remove(500000);
        long removeMidTime = System.nanoTime();
        System.out.println(removeMidTime - setMidTime + " nanossegundos para remover no meio.");
        // Remover todos
        colecaoArrayList.clear();
        long removeAllTime = System.nanoTime();
        System.out.println(removeAllTime - removeMidTime + " nanossegundos para remover todos.");

        // Encerra contador
        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println(totalTime + " nanossegundos total.");

    }

}
