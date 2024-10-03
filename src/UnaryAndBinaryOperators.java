import java.time.LocalDate;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class UnaryAndBinaryOperators {

    // UnaryOperator é utilizado para criar um metodo que tem o parametro do mesmo tipo que seu retorno
    static UnaryOperator<String> unaryString = x -> x + " foi usado como parametro.";
    static UnaryOperator<Integer> unaryInteger = x -> x * 7;

    // BinaryOperator é utilizado para criar um metodo que tem oS parametroS do mesmo tipo que seu retorno
    static BinaryOperator<String> binaryString = (x, y) -> Integer.parseInt(y) >= 18 ? x + " é maior de idade." : x + " não é maior de idade";
    static BinaryOperator<Integer> binaryInteger = (x, y) -> x - y;

    public static void main(String[] args) {

        System.out.println(unaryString.apply("Meu parametro"));
        System.out.println(unaryInteger.apply(7));

        System.out.println(binaryString.apply("Fulana", Integer.toString(18)));
        System.out.println(binaryInteger.apply(LocalDate.now().getYear(), 1996));

        System.out.println(binaryString.apply("Fulana", Integer.toString(unaryInteger.apply(2))));

    }
}
