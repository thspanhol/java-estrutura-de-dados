package list;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> meuArrayList = new ArrayList<>();

        // Adiciona elementos na lista
        meuArrayList.add("Vermelho");
        meuArrayList.add("Branco");
        meuArrayList.add("Preto");
        meuArrayList.add("Azul");
        meuArrayList.add("Rosa");

        // Adiciona na posição informada
        meuArrayList.add(1, "Verde");

        // Substitui
        meuArrayList.set(0, "Amarelo");

        // Remove
        meuArrayList.remove(2);

        // Tamanho da lista
        System.out.println(meuArrayList.size());

        // Verifica se contem o elemento na lista
        System.out.println(meuArrayList.contains("Verde"));

        // Informa o index do elemento
        System.out.println(meuArrayList.indexOf("Preto"));

        // Cria uma sub lista
        List<String> meuSubArrayList = meuArrayList.subList(1, 3);
        System.out.println(meuSubArrayList);

        // Limpa a lista
        meuSubArrayList.clear();
        System.out.println(meuSubArrayList.isEmpty());


        System.out.println(meuArrayList);

        // LinkedList é duplamente encadeada, com uso recomendado para listas com grande número de inserções e remoções
        // Para listas com um grande número de resgate, recomenda-se Arraylist

    }
}
