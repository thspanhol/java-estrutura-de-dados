package http;

public class HttpC {
    public static void main(String[] args) {

        /*
        Header
        são pares chave-valor que são enviados no início de uma requisição ou resposta HTTP.
        Eles transmitem informações adicionais sobre a requisição ou resposta.

          User-Agent
          É enviado pelo cliente para identificar a si mesmo ao servidor. Ele geralmente contém informações sobre o
          navegador, o sistema operacional e outras características.
          EX:"User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) Chrome/58.0.3029.110;

          Cookies
          Pequenos pedaços de dados armazenados no lado do cliente e enviados ao servidor em cada requisição subsequente.
          Eles são usados para manter o estado entre as requisições HTTP.
          EX: "Cookie", "sessionId=abc123"

          Encoding
          Processo de conversão de dados de um formato para outro. É usado para indicar ao cliente que o corpo da
          resposta foi codificado de uma determinada maneira e que deve ser decodificado antes de ser usado.
          EX: "Accept-Encoding", "gzip"

          Media Type
          Indica o tipo de dado que está sendo enviado ou recebido.
          O cabeçalho Content-Type é usado para especificar o tipo de mídia do recurso.
          EX: "Content-Type", "application/json"

        Body
        É o corpo da mensagem que é enviada em uma requisição ou resposta HTTP. O corpo pode conter dados como texto,
        JSON, XML, entre outros.

        Path Variable
        Representar partes dinâmicas de uma URL.
        EX: GET /produtos/{id}

        Query Parameter
        Parte da URL que contém pares chave-valor para enviar dados do cliente para o servidor.
        EX: http://example.com/search?query=java&sort=asc
        */
    }
}
