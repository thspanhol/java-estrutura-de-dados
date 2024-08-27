package java8;

import java.util.Optional;

public class OptionalC {
    public static void main(String[] args) {
        Optional<String> optional = Optional.ofNullable("Thales")
                .filter(text -> text.equals("Thales"));

        System.out.println(optional.orElse("Outro nome"));

        optional.ifPresentOrElse(op -> System.out.println(op),
                () -> System.out.println("Valor não encontrado."));

        System.out.println(optional);
    }
}
