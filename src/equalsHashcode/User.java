package equalsHashcode;

import java.util.Objects;

public class User {
    String nome;
    String sobrenome;

    public User(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        User user = (User) o;
//        return Objects.equals(nome, user.nome) && Objects.equals(sobrenome, user.sobrenome);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(nome, sobrenome);
//    }

}
