package api.inmet.newton.helper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.time.Duration;

public class HttpHelper {
	private HttpHelper() {
		throw new IllegalStateException("Classe Helper");
	}
	
	public static HttpRequest conexaoApi(String data) {
		HttpRequest request = HttpRequest.newBuilder()
				.GET()
				.uri(URI.create("https://apitempo.inmet.gov.br/estacao/dados/" + data) )
				.header("accept", "application/json")
				.timeout(Duration.ofSeconds(5) )
				.build();
		return request;
	}

	public static HttpClient clienteHttpBuilder() {
		HttpClient httpClient = HttpClient.newBuilder()
				.connectTimeout(Duration.ofSeconds(5))
				.build();
		return httpClient;
	}

	public static HttpResponse<String> getResponse(HttpRequest request, HttpClient httpClient) throws IOException, InterruptedException {
		HttpResponse<String> response = httpClient.send(request, BodyHandlers.ofString());
		return response;
	}

}
