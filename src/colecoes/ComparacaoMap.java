package colecoes;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

import static colecoes.GeraString.generateRandomString;

public class ComparacaoMap {
    public static void main(String[] args) {

        HashMap<String, String> colecaoHashMap = new HashMap<>();

        for (int i = 1; i <= 1000000; i++) {
            String valor = generateRandomString();
            colecaoHashMap.put(valor, valor);
        }

        // Inicia contador
        long startTime = System.nanoTime();

        // Adiciona um elemento
        colecaoHashMap.put("KEYTESTE", "VALUETESTE");
        long addTime = System.nanoTime();
        // Altera um elemento
        colecaoHashMap.put("KEYTESTE", "VALUETESTE2");
        long putTime = System.nanoTime();
        // Resgata um elemento
        colecaoHashMap.get("KEYTESTE");
        long getTime = System.nanoTime();
        // Confere a existência de um elemento
        colecaoHashMap.containsKey("KEYTESTE");
        long containTime = System.nanoTime();
        // Remove um elemento
        colecaoHashMap.remove("KEYTESTE");
        long removeOneTime = System.nanoTime();
        // Remover todos
        colecaoHashMap.clear();
        long removeAllTime = System.nanoTime();

        // Encerra contador
        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;

        LinkedHashMap<String, String> colecaoLinkedHashMap = new LinkedHashMap<>();

        for (int i = 1; i <= 1000000; i++) {
            String valor = generateRandomString();
            colecaoLinkedHashMap.put(valor, valor);
        }

        // Inicia contador
        long lstartTime = System.nanoTime();

        // Adiciona um elemento
        colecaoLinkedHashMap.put("KEYTESTE", "VALUETESTE");
        long laddTime = System.nanoTime();
        // Altera um elemento
        colecaoLinkedHashMap.put("KEYTESTE", "VALUETESTE2");
        long lputTime = System.nanoTime();
        // Resgata um elemento
        colecaoLinkedHashMap.get("KEYTESTE");
        long lgetTime = System.nanoTime();
        // Confere a existência de um elemento
        colecaoLinkedHashMap.containsKey("KEYTESTE");
        long lcontainTime = System.nanoTime();
        // Remove um elemento
        colecaoLinkedHashMap.remove("KEYTESTE");
        long lremoveOneTime = System.nanoTime();
        // Remover todos
        colecaoLinkedHashMap.clear();
        long lremoveAllTime = System.nanoTime();

        // Encerra contador
        long lendTime = System.nanoTime();
        long ltotalTime = lendTime - lstartTime;

        TreeMap<String, String> colecaoTreeMap = new TreeMap<>();

        for (int i = 1; i <= 1000000; i++) {
            String valor = generateRandomString();
            colecaoTreeMap.put(valor, valor);
        }

        // Inicia contador
        long tstartTime = System.nanoTime();

        // Adiciona um elemento
        colecaoTreeMap.put("KEYTESTE", "VALUETESTE");
        long taddTime = System.nanoTime();
        // Altera um elemento
        colecaoTreeMap.put("KEYTESTE", "VALUETESTE2");
        long tputTime = System.nanoTime();
        // Resgata um elemento
        colecaoTreeMap.get("KEYTESTE");
        long tgetTime = System.nanoTime();
        // Resgata o primeiro elemento pela chave
        colecaoTreeMap.firstKey();
        long tfirstTime = System.nanoTime();
        //System.out.println(tfirstTime - tgetTime + " nanossegundos para resgatar o primeiro elemento no TreeMap.");
        // Resgata o último elemento pela chave
        colecaoTreeMap.lastKey();
        long tlastTime = System.nanoTime();
        //System.out.println(tlastTime - tfirstTime + " nanossegundos para resgatar o último elemento no TreeMap. \n");
        // Confere a existência de um elemento
        colecaoTreeMap.containsKey("KEYTESTE");
        long tcontainTime = System.nanoTime();
        // Remove um elemento
        colecaoTreeMap.remove("KEYTESTE");
        long tremoveOneTime = System.nanoTime();
        // Remover todos
        colecaoTreeMap.clear();
        long tremoveAllTime = System.nanoTime();

        // Encerra contador
        long tendTime = System.nanoTime();
        long ttotalTime = tendTime - tstartTime;

        System.out.println(addTime - startTime + " nanossegundos para adicionar um elemento no HashMap.");
        System.out.println(laddTime - lstartTime + " nanossegundos para adicionar um elemento no LinkedHashMap.");
        System.out.println(taddTime - tstartTime + " nanossegundos para adicionar um elemento no TreeMap.");
        System.out.println(addTime - startTime < laddTime - lstartTime ? "HashMap foi mais rápido \n" : laddTime - lstartTime < taddTime - tstartTime ? "LinkedMap foi mais rápido \n" : "TreeMap foi mais rápido\n");

        System.out.println(putTime - addTime + " nanossegundos para alterar um elemento no HashMap.");
        System.out.println(lputTime - laddTime + " nanossegundos para alterar um elemento no LinkedHashMap.");
        System.out.println(tputTime - taddTime + " nanossegundos para alterar um elemento no TreeMap.");
        System.out.println(putTime - addTime < lputTime - laddTime ? "HashMap foi mais rápido \n" : lputTime - laddTime < tputTime - taddTime ? "LinkedMap foi mais rápido \n" : "TreeMap foi mais rápido\n");

        System.out.println(getTime - putTime + " nanossegundos para resgatar um elemento no HashMap.");
        System.out.println(lgetTime - lputTime + " nanossegundos para resgatar um elemento no LinkedHashMap.");
        System.out.println(tgetTime - tputTime + " nanossegundos para resgatar um elemento no TreeMap.");
        System.out.println(getTime - putTime < lgetTime - lputTime ? "HashMap foi mais rápido \n" : lgetTime - lputTime < tgetTime - tputTime ? "LinkedMap foi mais rápido \n" : "TreeMap foi mais rápido\n");

        System.out.println(containTime - getTime + " nanossegundos para conferir se contem um elemento no HashMap.");
        System.out.println(lcontainTime - lgetTime + " nanossegundos para conferir se contem um elemento no LinkedHashMap.");
        System.out.println(tcontainTime - tgetTime + " nanossegundos para conferir se contem um elemento no TreeMap.");
        System.out.println(containTime - getTime < lcontainTime - lgetTime ? "HashMap foi mais rápido \n" : lcontainTime - lgetTime < tcontainTime - tgetTime ? "LinkedMap foi mais rápido \n" : "TreeMap foi mais rápido\n");

        System.out.println(removeOneTime - containTime + " nanossegundos para remover um elemento no HashMap.");
        System.out.println(lremoveOneTime - lcontainTime + " nanossegundos para remover um elemento no LinkedHashMap.");
        System.out.println(tremoveOneTime - tcontainTime + " nanossegundos para remover um elemento no TreeMap.");
        System.out.println(removeOneTime - containTime < lremoveOneTime - lcontainTime && removeOneTime - containTime < tremoveOneTime - tcontainTime ? "HashMap foi mais rápido \n" : lremoveOneTime - lcontainTime < tremoveOneTime - tcontainTime ? "LinkedMap foi mais rápido \n" : "TreeMap foi mais rápido \n");

        System.out.println(removeAllTime - removeOneTime + " nanossegundos para remover todos no HashMap.");
        System.out.println(lremoveAllTime - lremoveOneTime + " nanossegundos para remover todos no LinkedHashMap.");
        System.out.println(tremoveAllTime - tremoveOneTime + " nanossegundos para remover todos no TreeMap.");
        System.out.println(removeAllTime - removeOneTime < lremoveAllTime - lremoveOneTime ? "HashMap foi mais rápido \n" : lremoveAllTime - lremoveOneTime < tremoveAllTime - tremoveOneTime ? "LinkedMap foi mais rápido \n" : "TreeMap foi mais rápido\n");

        System.out.println(totalTime + " nanossegundos total no HashMap.");
        System.out.println(ltotalTime + " nanossegundos total no LinkedHashMap.");
        System.out.println(ttotalTime + " nanossegundos total no TreeMap.");
        System.out.println(totalTime < ltotalTime ? "HashMap foi mais rápido \n" : ltotalTime < ttotalTime ? "LinkedMap foi mais rápido \n" : "TreeMap foi mais rápido\n");

        // HashMap
        // HashMap tem capacidade inicial de 16 e fator de carga 0.75.
        // Baseada em chave-valor, não como uma lista ordenada de elementos.

        // LinkedHashMap
        // LinkedHashMap tem capacidade inicial de 16 e fator de carga 0.75, mas mantém a ordem de inserção.
        // Baseada em chave-valor, não como uma lista ordenada de elementos.

        // TreeMap
        // TreeMap é baseado em uma árvore binária e mantém a ordem natural ou conforme o comparador.
        // Baseada em chave-valor, ordena pela chave.

//        --- Pontos em Comum ---
//        Todas são implementações da interface Map em Java.
//        Armazenam pares chave-valor.
//        Não permitem chaves duplicadas, mas permitem valores duplicados.

//        --- Diferenças ---
//        - Estrutura Interna:
//        HashMap: Usa uma tabela hash para armazenar os elementos. As entradas não têm uma ordem definida.
//        LinkedHashMap: Similar ao HashMap, mas mantém uma lista duplamente ligada das entradas para preservar a ordem de inserção.
//        TreeMap: Implementado como uma árvore de busca binária, o que mantém as chaves ordenadas de acordo com a ordem natural ou um comparador fornecido.
//
//        - Performance:
//        HashMap: Oferece tempo constante para operações de inserção, remoção e busca, se a função de hash estiver bem distribuída.
//        LinkedHashMap: Tem performance semelhante ao HashMap, mas com um pouco de overhead para manutenção da ordem.
//        TreeMap: Tempo logarítmico para inserção, remoção e busca devido à sua estrutura de árvore.
//
//        - Ordem dos Elementos:
//        HashMap: Sem ordem específica.
//        LinkedHashMap: Mantém a ordem de inserção.
//        TreeMap: Mantém a ordem natural das chaves ou a ordem definida por um comparador.

    }
}
