package java8;

public class Generics {
    public static void main(String[] args) {

        Nome<String> thales = new Nome<>("Thales");
        Nome<Integer> idade = new Nome<>(27);

        System.out.println(thales.getNome());
        System.out.println(idade.getNome());

    }
}
