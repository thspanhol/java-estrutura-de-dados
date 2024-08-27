package java8;


import java.util.ArrayList;
import java.util.List;

public class WildCardsC {

    public static void printList(List<?> list) {
        for (Object element : list) {
            System.out.println(element);
        }
    }

    public static double sum(List<? extends Number> list) {
        double sum = 0;
        for (Number number : list) {
            sum += number.doubleValue();
        }
        return sum;
    }

    public static void addNumbers(List<? super Integer> list) {
        list.add(1);
        list.add(2);
        list.add(3);
    }

    public static void main(String[] args) {

        /* Unbounded Wildcards (?): Usado quando você quer permitir qualquer tipo de dado. */

        List<String> strList = List.of("Preto", "Branco", "Amarelo");
        List<Integer> intList = List.of(1, 2, 3);

        printList(strList);
        printList(intList);


        /* Upper Bounded Wildcards (? extends Type): Usado quando você quer permitir qualquer tipo que seja uma
        subclasse (ou o próprio tipo) de um tipo específico. */

        List<Integer> integerList = List.of(1, 2, 3);
        List<Double> doubleList = List.of(1.1, 2.2, 3.3);

        System.out.println(sum(integerList));
        System.out.println(sum(doubleList));

        /* Lower Bounded Wildcards (? super Type): Usado quando você quer permitir qualquer tipo que seja uma
        superclasse (ou o próprio tipo) de um tipo específico. */

        List<Number> numberList = new ArrayList<>();
        List<Object> objectList = new ArrayList<>();

        addNumbers(numberList);
        addNumbers(objectList);

        System.out.println(numberList);
        System.out.println(objectList);

    }
}
