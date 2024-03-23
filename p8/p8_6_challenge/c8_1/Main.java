package p8.p8_6_challenge.c8_1;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        HttpClient client = createHttpClient();
        HttpRequest request = createHttpRequest();

        try {
            client.send(request, HttpResponse.BodyHandlers.ofFile(Paths.get("p8/p8_6_challenge/c8_1/dj.ico")));
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static HttpClient createHttpClient() {
        return HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_1_1)
                .followRedirects(HttpClient.Redirect.NORMAL)
                .build();
    }

    public static HttpRequest createHttpRequest() {
        return HttpRequest.newBuilder()
                .uri(URI.create("http://dokojava.jp/favicon.ico"))
                .GET()
                .build();
    }
}
