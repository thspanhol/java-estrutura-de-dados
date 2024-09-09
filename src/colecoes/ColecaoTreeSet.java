package colecoes;

import java.util.TreeSet;

import static colecoes.GeraString.generateRandomString;

public class ColecaoTreeSet {
    public static void main(String[] args) {

        // Não possui capacidade inicial ou máxima definida, é uma árvore de busca binária.

        TreeSet<String> colecaoTreeSet = new TreeSet<>();

        for (int i = 1; i <= 1000000; i++) {
            colecaoTreeSet.add(generateRandomString());
        }

        // Inicia contador
        long startTime = System.nanoTime();

        // Resgata o primeiro elemento
        colecaoTreeSet.first();
        long firstTime = System.nanoTime();
        System.out.println(firstTime - startTime + " nanossegundos para resgatar o primeiro elemento.");
        // Resgata o último elemento
        colecaoTreeSet.last();
        long lastTime = System.nanoTime();
        System.out.println(lastTime - firstTime + " nanossegundos para resgatar o último elemento.");
        // Adiciona elemento
        colecaoTreeSet.add("ELEMENTO ADICIONADO");
        //colecaoTreeSet.addFirst("ELEMENTO ADICIONADO"); ???
        long addTime = System.nanoTime();
        System.out.println(addTime - lastTime + " nanossegundos para adicionar um elemento.");
        // Confere se elemento existe na coleção
        colecaoTreeSet.contains("ELEMENTO ADICIONADO");
        long containTime = System.nanoTime();
        System.out.println(containTime - addTime + " nanossegundos para conferir se contêm o elemento.");
        // Remover elemento
        colecaoTreeSet.remove("ELEMENTO ADICIONADO");
        long removeTime = System.nanoTime();
        System.out.println(removeTime - containTime + " nanossegundos para remover um elemento.");
        // Remover todos
        colecaoTreeSet.clear();
        long removeAllTime = System.nanoTime();
        System.out.println(removeAllTime - removeTime + " nanossegundos para remover todos.");

        // Encerra contador
        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println(totalTime + " nanossegundos total.");

    }
}
