package autentica;

import java.lang.reflect.Array;

interface Valida {
    String validar(Usuario pessoa, String str);
    String validar(Usuario pessoa, long lon);
}
interface Operacao {
    int executar(int a, int b);
}

public class Autentica {

    public static void main(String[] args) {

        Operacao soma = (a, b) -> a + b;
        System.out.println(soma.executar(4, 3));

    }
}