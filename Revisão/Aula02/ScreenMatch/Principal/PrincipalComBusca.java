package Revisão.Aula02.ScreenMatch.Principal;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Scanner;

import Revisão.Aula02.ScreenMatch.Excecao.ErroDeConversaoDeAnoException;
import Revisão.Aula02.ScreenMatch.Modelos.Titulo;
import Revisão.Aula02.ScreenMatch.Modelos.TituloOmdb;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite um filme para busca");
            String busca = scanner.nextLine();
            String endereco = "https://omdbapi.com/?t=" + busca.replace(" ", "+") + "&apikey=55e5b4cd";
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .build();
            HttpResponse<String> response = client
                    .send(request, BodyHandlers.ofString());
            System.out.println(response.body());
            // client.sendAsync(request, BodyHandlers.ofString())
            // .thenApply(HttpResponse::body)
            // .thenAccept(System.out::println)
            // .join();
            scanner.close();
            String json = response.body();
            System.out.println(json);

            Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
            TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
            System.out.println(meuTituloOmdb);

            Titulo meuTitulo = new Titulo(meuTituloOmdb);
            System.out.println(meuTitulo);

        } catch (NumberFormatException e) {
            System.out.println("Aconteceu um erro: ");
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e ){
            System.out.println("Outro erro");
        } catch (ErroDeConversaoDeAnoException e){
            System.out.println(e.getMessage());
        }

    }

}
