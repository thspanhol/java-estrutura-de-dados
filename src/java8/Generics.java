package java8;

public class Generics {
    public static void main(String[] args) {

        // Funcionam com qualquer tipo de dado, possibilita maior reutilização de código.

        Nome<String> thales = new Nome<>("Thales");
        Nome<Integer> idade = new Nome<>(27);

        System.out.println(thales.getNome());
        System.out.println(idade.getNome());

    }
}
