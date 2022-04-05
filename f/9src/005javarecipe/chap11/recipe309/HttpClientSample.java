package jp.co.shoeisha.javarecipe.chapter11.recipe309;

import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.URI;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import static java.net.http.HttpRequest.BodyPublishers;
import static java.net.http.HttpResponse.BodyHandlers;

class HttpClientSample {

    public static void main(String[] args) throws IOException, InterruptedException, ExecutionException {
        HttpClient client = HttpClient
            .newBuilder()
            .build();

        {
          // レスポンスが返ってくるまでブロックする
          HttpResponse<String> response = client.send(
              HttpRequest.newBuilder()
                  .uri(URI.create("https://www.google.com"))
                  .GET()
                  .build(),
              BodyHandlers.ofString()
          );
          System.out.println(response.statusCode());
        }
        {
          String message = "{ \"query\" : { \"match_all\" : {} } }";

          // レスポンスが返ってきてなくてもブロックしない
          CompletableFuture<String> response = client.sendAsync(
              HttpRequest.newBuilder()
                  .uri(URI.create("http://localhost:9200/test/_search"))
                  .header("Content-Type", "application/json")
                  .POST(BodyPublishers.ofString(message))
                  .build(),
              BodyHandlers.ofString()
          ).thenApply(r -> r.body());

          System.out.println(response.exceptionally(e -> e.getMessage()).get());

        }
    }

}
