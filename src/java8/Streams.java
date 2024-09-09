package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {

        // API introduzida no Java 8 para processar coleções de dados de maneira funcional.

        ArrayList<Integer> lista = new ArrayList<>(Arrays.asList(1,5,8,9,1,4,7,5,6,6,9,9));

        List<Integer> novaLista = lista.stream()
                .skip(3) // pula 3
                .distinct() // filtra os repetidos
                .limit(6) // limita 6
                .map(e -> e * 3) // transforma o elemento
                .filter(e -> e % 2 == 0) // filtra pares
                .collect(Collectors.toList());

        System.out.println(novaLista);
        novaLista.stream().forEach(System.out::println);

    }
}
