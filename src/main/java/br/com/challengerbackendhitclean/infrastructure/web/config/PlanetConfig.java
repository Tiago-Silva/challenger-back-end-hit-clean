package br.com.challengerbackendhitclean.infrastructure.web.config;

import br.com.challengerbackendhitclean.application.gateway.PlanetGateway;
import br.com.challengerbackendhitclean.application.usecase.Planet.*;
import br.com.challengerbackendhitclean.infrastructure.core.gateway.PlanetRepositoryGateway;
import br.com.challengerbackendhitclean.infrastructure.core.mapper.PlanetMapper;
import br.com.challengerbackendhitclean.infrastructure.data.repository.PlanetRepository;
import br.com.challengerbackendhitclean.infrastructure.data.service.SwApiClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class PlanetConfig {

    @Bean
    public CreatePlanetUseCase createPlanetUseCase(PlanetGateway planetGateway) {
        return new CreatePlanetUseCase(planetGateway);
    }

    @Bean
    public UpdatePlanetUseCase updatePlanetUseCase(PlanetGateway planetGateway) {
        return new UpdatePlanetUseCase(planetGateway);
    }

    @Bean
    public DeletePlanetUseCase deletePlanetUseCase(PlanetGateway planetGateway) {
        return new DeletePlanetUseCase(planetGateway);
    }

    @Bean
    public GetAllPlanetsUseCase getAllPlanetsUseCase(PlanetGateway planetGateway) {
        return new GetAllPlanetsUseCase(planetGateway);
    }

    @Bean
    public GetPlanetByIdUseCase getPlanetByIdUseCase(PlanetGateway planetGateway) {
        return new GetPlanetByIdUseCase(planetGateway);
    }

    @Bean
    public GetPlanetByNameUseCase getPlanetByNameUseCase(PlanetGateway planetGateway) {
        return new GetPlanetByNameUseCase(planetGateway);
    }

    @Bean
    public PlanetGateway planetGateway(PlanetRepository repository, PlanetMapper mapper) {
        return new PlanetRepositoryGateway(repository, mapper);
    }

    @Bean
    public PlanetMapper planetMapper() {
        return new PlanetMapper();
    }

    @Bean
    public SwApiClient swApiClient(WebClient.Builder webClientBuilder) {
        return new SwApiClient(webClientBuilder);
    }

    @Bean
    public WebClient.Builder webClientBuilder() {
        return WebClient.builder();
    }
}
