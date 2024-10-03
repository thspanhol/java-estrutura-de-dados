package colecoes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ColecaoArray {

    static int[] nums1 = {1,2,3,4,5};
    static int[] nums2 = new int[5];
    static ArrayList<Integer> nums3 = new ArrayList<>();

    public static void main(String[] args) {

        // Tanto Array quanto ArrayList quebram ao tentar adicionar em um index que não existe
        // Array é criado com o espaço determinado na declaração e se preenche com valores padrão caso não informado
        // ArrayList é criado com CAPACIDADE de 10 elementos e aumenta em 50% seu tamanho quando necessário
        // Mesmo que a capacidade do ArrayList seja maior que o seu número de elementos, essa sobra não é preenchida

        // Array é mais performático, porém limitado
        // ArrayList é menos performático, porém dinâmico
        // Exemplos de perda de performance:
        //   A realocação dos dados de um ArrayList para outro quando atinge a capacidade máxima
        //   A reordenação dos index ao adicionar um elemento em um index específico

        //List.of(1, 2, 3, 4, 5);

        nums1[4] = 2;

        nums3.add(1);
        nums3.add(2);
        nums3.add(3);
        nums3.add(2,7);
        System.out.println(nums3.size());

        System.out.println("Nums1: " + Arrays.toString(nums1));
        System.out.println("Nums2: " + Arrays.toString(nums2));
        System.out.print("nums3: ");
        nums3.forEach(System.out::print);

    }
}
