package p8.p8_6_challenge.c8_3;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) {
        HttpClient client = createHttpClient();
        HttpRequest request = createHttpRequest();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            ObjectMapper mapper = new ObjectMapper();
            JsonNode node = mapper.readTree(response.body());
            System.out.println(node.get("blog").asText());
        } catch (Exception e) {
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
                .uri(URI.create("https://api.github.com/users/miyabilink"))
                .headers("Accept", "application/vnd.github+json")
                .headers("X-GitHub-Api-Version", "2022-11-28")
                .GET()
                .build();
    }

}
