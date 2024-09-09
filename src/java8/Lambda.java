package java8;

import java.util.ArrayList;

public class Lambda {
    public static void main(String[] args) {

        // Uma função anônima
        // Também pode ser usada para representar a implementação de uma interface funcional
        // (uma interface que contém apenas um método abstrato).

        ArrayList<Integer> valores = new ArrayList<>();
        ArrayList<Integer> dobro = new ArrayList<>();
        ArrayList<Integer> par = new ArrayList<>();
        ArrayList<Integer> impar = new ArrayList<>();

        valores.add(1);
        valores.add(2);
        valores.add(3);
        valores.add(4);

        valores.forEach(v -> dobro.add(v * 2));

        valores.forEach((v) -> {
            if (v % 2 == 0) {
                par.add(v);
            } else {
                impar.add(v);
            }
        });

        System.out.println(valores);
        System.out.println(dobro);
        System.out.println(par);
        System.out.println(impar);

    }
}
