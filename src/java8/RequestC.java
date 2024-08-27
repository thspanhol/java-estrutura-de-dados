package java8;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

class Login {
    String id;
    String nome;
    String email;
    String senha;

    @Override
    public String toString() {
        return '{' +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }
}

public class RequestC {

    public static void funCreate(String jsonData) {
        try {
            HttpClient client = HttpClient.newHttpClient();

            // Criação da URI para o POST (não é necessário passar um ID)
            URI uri = new URI("https://crud-node-a7h4.onrender.com/usuarios");

            // Criação da requisição POST com o corpo JSON
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(uri)
                    .POST(HttpRequest.BodyPublishers.ofString(jsonData))
                    .header("Content-Type", "application/json")
                    .build();

            // Enviar a requisição e obter a resposta
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // Verificar o status da resposta
            if (response.statusCode() == 201) {  // 201 Created
                System.out.println("Usuário criado com sucesso.");
            } else {
                System.out.println("Falha ao criar o usuário. Status: " + response.statusCode());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void funRead() {
        try {

            HttpClient client = HttpClient.newHttpClient();

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI("https://crud-node-a7h4.onrender.com/usuarios"))
                    .GET()
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            Gson gson = new Gson();

            List<Login> logins = gson.fromJson(response.body(), new TypeToken<List<Login>>() {
            }.getType());

            for (Login login : logins) {
                System.out.println("Nome: " + login.nome + " | Email: " + login.email + " | Senha: " + login.senha + " | ID: " + login.id);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void funUpdate(String id, String jsonData) {
        try {
            HttpClient client = HttpClient.newHttpClient();

            // Criação da URI para o PUT com o ID
            URI uri = new URI("https://crud-node-a7h4.onrender.com/usuarios/" + id);

            // Criação da requisição PUT com o corpo JSON
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(uri)
                    .PUT(HttpRequest.BodyPublishers.ofString(jsonData))
                    .header("Content-Type", "application/json")
                    .build();

            // Enviar a requisição e obter a resposta
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // Verificar o status da resposta
            if (response.statusCode() == 204) {
                System.out.println("Usuário atualizado com sucesso.");
            } else {
                System.out.println("Falha ao atualizar o usuário. Status: " + response.statusCode());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void funDelete(String id) {
        try {

            HttpClient client = HttpClient.newHttpClient();

            // Criação da URI para o DELETE com o ID
            URI uri = new URI("https://crud-node-a7h4.onrender.com/usuarios/" + id);

            // Criação da requisição DELETE
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(uri)
                    .DELETE()
                    .build();

            // Enviar a requisição e obter a resposta
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // Verificar o status da resposta
            if (response.statusCode() == 204) {
                System.out.println("Usuário deletado com sucesso.");
            } else {
                System.out.println("Falha ao deletar o usuário. Status: " + response.statusCode());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        String tommy = "{ \"nome\": \"Tommy\", \"email\": \"tommy@exemplo.com\", \"senha\": \"SenhaTommy\" }";
        String jason = "{ \"nome\": \"Jason\", \"email\": \"jason@exemplo.com\", \"senha\": \"SenhaJason\" }";
        String billy = "{ \"nome\": \"Billy\", \"email\": \"billy@exemplo.com\", \"senha\": \"SenhaBilly\" }";

        // CREATE
        //funCreate(tommy);

        // READ
        //funRead();

        // UPDATE
        //funUpdate("0dd09086-0586-489d-b530-59631ccb7e91", jason);

        // DELETE
        //funDelete("0dd09086-0586-489d-b530-59631ccb7e91");

    }

}
