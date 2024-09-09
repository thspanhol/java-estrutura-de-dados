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
                .skip(3) // Pula 3
                .distinct() // Filtra os repitidos
                .limit(6) // Limita 6 resultados
                .map(e -> e * 3) // Transforma os dados
                .filter(e -> e % 2 == 0) // Filtra pares
                .collect(Collectors.toList());

        System.out.println(novaLista);

    }
}
