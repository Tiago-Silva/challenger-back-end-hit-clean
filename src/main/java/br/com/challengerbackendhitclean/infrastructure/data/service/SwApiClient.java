package br.com.challengerbackendhitclean.infrastructure.data.service;

import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.util.UriComponentsBuilder;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Map;

public class SwApiClient {

    private final WebClient webClient;
    public SwApiClient(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("https://swapi.info/api").build();
    }

    public Mono<Integer> getFilmAppearances(String planetId) {
        String url = UriComponentsBuilder.fromPath("/planets/{id}")
                .buildAndExpand(Map.of("id", planetId))
                .toUriString();

        return this.webClient.get()
                .uri(url)
                .retrieve()
                .bodyToMono(Map.class)
                .map(response -> {
                    if (response != null && response.containsKey("films")) {
                        return ((List<?>) response.get("films")).size();
                    }
                    return 0;
                });
    }
}
