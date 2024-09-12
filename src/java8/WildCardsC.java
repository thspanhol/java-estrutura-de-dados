package java8;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class WildCardsC {

    public static void printList(List<?> list) {
        for (Object element : list) {
            System.out.print(element);
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

        List<?> strList = List.of("Preto", "Branco", 7, 7);
        List<?> intList = List.of(1, 2, 't', "th");

        printList(strList);
        System.out.println();
        printList(intList);
        System.out.println();

        /* Upper Bounded Wildcards (? extends Type): Usado quando você quer permitir qualquer tipo que seja uma
        subclasse (ou o próprio tipo) de um tipo específico. */

        List<? extends Number> numberList = List.of(1, 2, 1.1, 2.2);
        List<? extends Serializable> serializableList = List.of('t', 'h', "sp", "th" );

        System.out.println(sum(numberList));
        System.out.println(serializableList);


        /* Lower Bounded Wildcards (? super Type): Usado quando você quer permitir qualquer tipo que seja uma
        superclasse (ou o próprio tipo) de um tipo específico. */

        List<? super Number> numbersList = new ArrayList<>();
        List<? super Integer> integerList = new ArrayList<>();

        addNumbers(numbersList);
        addNumbers(integerList);

        System.out.println(numberList);
        System.out.println(integerList);

    }
}
