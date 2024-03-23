package p8.p8_4_7_use_http_client;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpClient.Version;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {
    public static void main(String[] args) {
        HttpClient client = createHttpClient();
        HttpRequest request = createHttpRequest();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body());
            System.out.println(response.headers());
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static HttpClient createHttpClient() {
        return HttpClient.newBuilder()
                .version(Version.HTTP_1_1)
                .followRedirects(HttpClient.Redirect.NORMAL)
                .build();
    }

    public static HttpRequest createHttpRequest() {
        return HttpRequest.newBuilder()
                .uri(URI.create("http://dokojava.jp"))
                .GET()
                .build();
    }
}
