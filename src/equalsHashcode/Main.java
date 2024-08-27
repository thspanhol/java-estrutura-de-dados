package equalsHashcode;

public class Main {
    public static void main(String[] args) {

        long startTime = System.nanoTime();

        User userUm = new User("Tommy", "Oliver");
        User userDois = new User("Jason", "Scott");
        User userTres = new User("Tommy", "Oliver");

        System.out.println(userUm + " " + userUm.hashCode());

        System.out.println(userDois + " " + userDois.hashCode());

        System.out.println(userTres + " " + userTres.hashCode());

        System.out.println(userUm.equals(userTres));
        System.out.println(userUm.nome.equals(userTres.nome));

        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println(totalTime + " nanossegundos");

    }
}
