package java8;

public class Nome<T> {
    private T nome;

    public Nome(T nome) {
        this.nome = nome;
    }

    public T getNome() {
        return nome;
    }

    public void setNome(T nome) {
        this.nome = nome;
    }
}
