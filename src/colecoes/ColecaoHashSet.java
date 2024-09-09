package colecoes;

import java.util.HashSet;

import static colecoes.GeraString.generateRandomString;

public class ColecaoHashSet {
    public static void main(String[] args) {

        // A HashSet tem uma capacidade inicial padrão de 16, com fator de carga 0.75.
        // Armazena valores únicos, não insere valores repetidos.
        // Não mantém a ordem dos elementos (Não é indexado).
        // É desenhado para eficiência em operações de adicionar, remover e verificar a existência de elementos.
        // Os elementos são armazenados de acordo com o valor do hash dos objetos.

        HashSet<String> colecaoHashSet = new HashSet<>();

        for (int i = 1; i <= 1000000; i++) {
            colecaoHashSet.add(generateRandomString());
        }

        // Inicia contador
        long startTime = System.nanoTime();

        // Adiciona um elemento
        colecaoHashSet.add("ELEMENTO ADICIONADO");
        long addTime = System.nanoTime();
        System.out.println(addTime - startTime + " nanossegundos para adicionar um elemento.");
        // Confere se elemento existe na coleção
        colecaoHashSet.contains("ELEMENTO ADICIONADO");
        long containTime = System.nanoTime();
        System.out.println(containTime - addTime + " nanossegundos para conferir se contêm o elemento.");
        // Remover um elemento
        colecaoHashSet.remove("ELEMENTO ADICIONADO");
        long removeTime = System.nanoTime();
        System.out.println(removeTime - containTime + " nanossegundos para remover um elemento.");
        // Remover todos elementos
        colecaoHashSet.clear();
        long removeAllTime = System.nanoTime();
        System.out.println(removeAllTime - removeTime + " nanossegundos para remover todos elementos.");

        // Encerra contador
        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println(totalTime + " nanossegundos total.");

    }
}
