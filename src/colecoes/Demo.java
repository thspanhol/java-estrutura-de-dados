package colecoes;

import java.util.*;

public class Demo {
    public static void main(String[] args) {

        /*
        Listas (ArrayList, LinkedList): Permitem duplicados, ordenadas, ArrayList é rápida para acesso, LinkedList é rápida para inserções/remover.

        Mapas (HashMap, LinkedHashMap, TreeMap): Armazenam pares chave-valor, com diferentes ordens (não ordenado, ordenação de inserção, ou ordenação natural).

        Conjuntos (HashSet, LinkedHashSet, TreeSet): Armazenam elementos únicos, com diferentes ordens (não ordenado, ordenação de inserção, ou ordenação natural).
        */

        // ArrayList
        System.out.println("Exemplo ArrayList:");
        List<String> arrayList = new ArrayList<>();
        arrayList.add("B");
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add(1, "D");
        System.out.println("ArrayList: " + arrayList);
        arrayList.remove("B");
        System.out.println("ArrayList pós remoção: " + arrayList);

        // LinkedList
        System.out.println("\nExemplo LinkedList:");
        List<String> linkedList = new LinkedList<>();
        linkedList.add("A");
        linkedList.addFirst("B");
        linkedList.addLast("C");
        linkedList.add(2, "D");
        System.out.println("LinkedList: " + linkedList);
        linkedList.remove(1);
        System.out.println("LinkedList pós remoção: " + linkedList);

        // HashMap
        System.out.println("\nExemplo HashMap:");
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("A", 1);
        hashMap.put("B", 2);
        hashMap.put("C", 3);
        System.out.println("HashMap: " + hashMap);
        hashMap.remove("B");
        System.out.println("HashMap pós remoção: " + hashMap);

        // LinkedHashMap
        System.out.println("\nExemplo LinkedHashMap:");
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("A", 1);
        linkedHashMap.put("C", 3);
        linkedHashMap.put("B", 2);
        System.out.println("LinkedHashMap: " + linkedHashMap);
        linkedHashMap.remove("B");
        System.out.println("LinkedHashMap pós remoção: " + linkedHashMap);

        // TreeMap
        System.out.println("\nExemplo TreeMap:");
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("C", 3);
        treeMap.put("A", 1);
        treeMap.put("B", 2);
        System.out.println("TreeMap: " + treeMap);
        treeMap.remove("B");
        System.out.println("TreeMap pós remoção: " + treeMap);

        // HashSet
        System.out.println("\nExemplo HashSet:");
        Set<String> hashSet = new HashSet<>();
        hashSet.add("A");
        hashSet.add("B");
        hashSet.add("C");
        System.out.println("HashSet: " + hashSet);
        hashSet.remove("B");
        System.out.println("HashSet pós remoção: " + hashSet);

        // LinkedHashSet
        System.out.println("\nExemplo LinkedHashSet:");
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("A");
        linkedHashSet.add("B");
        linkedHashSet.add("C");
        System.out.println("LinkedHashSet: " + linkedHashSet);
        linkedHashSet.remove("B");
        System.out.println("LinkedHashSet pós remoção: " + linkedHashSet);

        // TreeSet
        System.out.println("\nExemplo TreeSet:");
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("C");
        treeSet.add("A");
        treeSet.add("B");
        System.out.println("TreeSet: " + treeSet);
        treeSet.remove("B");
        System.out.println("TreeSet pós remoção: " + treeSet);
    }
}
