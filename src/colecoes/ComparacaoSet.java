package colecoes;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

import static colecoes.GeraString.generateRandomString;

public class ComparacaoSet {
    public static void main(String[] args) {

        // HashSet
        HashSet<String> colecaoHashSet = new HashSet<>();

        for (int i = 1; i <= 1000000; i++) {
            colecaoHashSet.add(generateRandomString());
        }

        // Inicia contador
        long startTime = System.nanoTime();

        // Adiciona um elemento
        colecaoHashSet.add("ELEMENTO ADICIONADO");
        long addTime = System.nanoTime();
        // Confere se elemento existe na coleção
        colecaoHashSet.contains("ELEMENTO ADICIONADO");
        long containTime = System.nanoTime();
        // Remover um elemento
        colecaoHashSet.remove("ELEMENTO ADICIONADO");
        long removeTime = System.nanoTime();
        // Remover todos elementos
        colecaoHashSet.clear();
        long removeAllTime = System.nanoTime();

        // Encerra contador
        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;

        // LinkedHashSet

        LinkedHashSet<String> colecaoLinkedHashSet = new LinkedHashSet<>();

        for (int i = 1; i <= 1000000; i++) {
            colecaoLinkedHashSet.add(generateRandomString());
        }

        // Inicia contador
        long lstartTime = System.nanoTime();

        // Adiciona elemento
        colecaoLinkedHashSet.add("ELEMENTO ADICIONADO");
        long laddTime = System.nanoTime();
        // Adicionar no final
        colecaoLinkedHashSet.addLast("TESTE ADD FINAL");
        long laddFinalTime = System.nanoTime();
        //System.out.println(laddFinalTime - laddTime + " nanossegundos para adicionar no final no LinkedHashSet.");
        // Confere se elemento existe na coleção
        colecaoLinkedHashSet.contains("ELEMENTO ADICIONADO");
        long lcontainTime = System.nanoTime();
        // Remover elemento
        colecaoLinkedHashSet.remove("ELEMENTO ADICIONADO");
        long lremoveTime = System.nanoTime();
        // Remover todos
        colecaoLinkedHashSet.clear();
        long lremoveAllTime = System.nanoTime();

        // Encerra contador
        long lendTime = System.nanoTime();
        long ltotalTime = lendTime - lstartTime;

        //Treeset
        TreeSet<String> colecaoTreeSet = new TreeSet<>();

        for (int i = 1; i <= 1000000; i++) {
            colecaoTreeSet.add(generateRandomString());
        }

        // Inicia contador
        long tstartTime = System.nanoTime();

        // Resgata o primeiro elemento
        colecaoTreeSet.first();
        long tfirstTime = System.nanoTime();
        //System.out.println(tfirstTime - tstartTime + " nanossegundos para resgatar o primeiro elemento no TreeSet.");
        // Resgata o último elemento
        colecaoTreeSet.last();
        long tlastTime = System.nanoTime();
        //System.out.println(tlastTime - tfirstTime + " nanossegundos para resgatar o último elemento no TreeSet.");
        // Adiciona elemento
        colecaoTreeSet.add("ELEMENTO ADICIONADO");
        long taddTime = System.nanoTime();
        // Confere se elemento existe na coleção
        colecaoTreeSet.contains("ELEMENTO ADICIONADO");
        long tcontainTime = System.nanoTime();
        // Remover elemento
        colecaoTreeSet.remove("ELEMENTO ADICIONADO");
        long tremoveTime = System.nanoTime();
        // Remover todos
        colecaoTreeSet.clear();
        long tremoveAllTime = System.nanoTime();

        // Encerra contador
        long tendTime = System.nanoTime();
        long ttotalTime = tendTime - tstartTime;

        System.out.println(addTime - startTime + " nanossegundos para adicionar um elemento no HashSet.");
        System.out.println(laddTime - lstartTime + " nanossegundos para adicionar um elemento no LinkedHashSet.");
        System.out.println(taddTime - tlastTime + " nanossegundos para adicionar um elemento no TreeSet.");
        System.out.println(addTime - startTime < laddTime - lstartTime && addTime - startTime < taddTime - tlastTime ? "HashSet foi mais rápido \n" : laddTime - lstartTime < taddTime - tstartTime ? "LinkedHashSet foi mais rápido \n" : "TreeSet foi mais rápido\n");

        System.out.println(containTime - addTime + " nanossegundos para conferir se contêm o elemento no HashSet.");
        System.out.println(lcontainTime - laddFinalTime + " nanossegundos para conferir se contêm o elemento no LinkedHashSet.");
        System.out.println(tcontainTime - taddTime + " nanossegundos para conferir se contêm o elemento no TreeSet.");
        System.out.println(containTime - addTime < lcontainTime - laddFinalTime && containTime - addTime < tcontainTime - taddTime ? "HashSet foi mais rápido \n" : lcontainTime - laddFinalTime < tcontainTime - taddTime ? "LinkedHashSet foi mais rápido \n" : "TreeSet foi mais rápido\n");

        System.out.println(removeTime - containTime + " nanossegundos para remover um elemento no HashSet.");
        System.out.println(lremoveTime - lcontainTime + " nanossegundos para remover um elemento no LinkedHashSet.");
        System.out.println(tremoveTime - tcontainTime + " nanossegundos para remover um elemento no TreeSet.");
        System.out.println(removeTime - containTime < lremoveTime - lcontainTime && removeTime - containTime < tremoveTime - tcontainTime ? "HashSet foi mais rápido \n" : lremoveTime - lcontainTime < tremoveTime - tcontainTime ? "LinkedHashSet foi mais rápido \n" : "TreeSet foi mais rápido\n");

        System.out.println(removeAllTime - removeTime + " nanossegundos para remover todos elementos no HashSet.");
        System.out.println(lremoveAllTime - lremoveTime + " nanossegundos para remover todos no LinkedHashSet.");
        System.out.println(tremoveAllTime - tremoveTime + " nanossegundos para remover todos no TreeSet.");
        System.out.println(removeAllTime - removeTime < lremoveAllTime - lremoveTime ? "HashSet foi mais rápido \n" : lremoveAllTime - lremoveTime < tremoveAllTime - tremoveTime ? "LinkedHashSet foi mais rápido \n" : "TreeSet foi mais rápido\n");

        System.out.println(totalTime + " nanossegundos total no HashSet.");
        System.out.println(ltotalTime + " nanossegundos total no LinkedHashSet.");
        System.out.println(ttotalTime + " nanossegundos total no TreeSet.");
        System.out.println(totalTime < ltotalTime ? "HashSet foi mais rápido \n" : ltotalTime < ttotalTime ? "LinkedHashSet foi mais rápido \n" : "TreeSet foi mais rápido\n");

        // A HashSet tem uma capacidade inicial padrão de 16, com fator de carga 0.75.
        // Armazena valores únicos, não insere valores repetidos.
        // Não mantém a ordem dos elementos (Não é indexado).
        // É desenhado para eficiência em operações de adicionar, remover e verificar a existência de elementos.
        // Os elementos são armazenados de acordo com o valor do hash dos objetos.

        // A LinkedHashSet tem uma capacidade inicial padrão de 16, com fator de carga 0.75, mas mantém a ordem de inserção.
        // Armazena valores únicos, não insere valores repetidos.
        // A ordem dos elementos é baseada na ordem de inserção, mas não é indexada como uma lista.
        // Duplamente Ligada

        // Treeset não possui capacidade inicial ou máxima definida, é uma árvore de busca binária.

//        --- Pontos em Comum ---
//        Todas implementam a interface Set em Java.
//        Não permitem elementos duplicados.

//        --- Diferenças ---
//
//        - Estrutura Interna:
//        HashSet: Baseado em um HashMap internamente. Não mantém nenhuma ordem específica dos elementos.
//        LinkedHashSet: Extensão do HashSet que usa uma lista duplamente ligada para preservar a ordem de inserção dos elementos.
//        TreeSet: Baseado em uma árvore de busca binária, mantendo os elementos ordenados de acordo com a ordem natural ou um comparador fornecido.
//
//        - Performance:
//        HashSet: Tempo constante para operações básicas como adicionar, remover e buscar.
//        LinkedHashSet: Performance semelhante ao HashSet, com um pequeno overhead para manter a ordem de inserção.
//        TreeSet: Tempo logarítmico para adicionar, remover e buscar devido à estrutura de árvore.
//
//        - Ordem dos Elementos:
//        HashSet: Não garante ordem dos elementos.
//        LinkedHashSet: Mantém a ordem de inserção.
//        TreeSet: Mantém a ordem natural dos elementos ou a ordem definida por um comparador.

    }
}
