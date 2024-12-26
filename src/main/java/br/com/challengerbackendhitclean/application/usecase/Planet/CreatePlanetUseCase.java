package br.com.challengerbackendhitclean.application.usecase.Planet;

import br.com.challengerbackendhitclean.application.gateway.PlanetGateway;
import br.com.challengerbackendhitclean.application.usecase.UseCase;
import br.com.challengerbackendhitclean.domain.entity.Planet;

public class CreatePlanetUseCase implements UseCase<Planet, Planet> {

    private final PlanetGateway planetGateway;
    public CreatePlanetUseCase(PlanetGateway planetGateway) {
        this.planetGateway = planetGateway;
    }

    @Override
    public Planet execute(Planet planet) {

        if (
            planet == null ||
            planet.getName().isEmpty() ||
            planet.getClimate().isEmpty() ||
            planet.getTerrain().isEmpty()
        ) {
            throw new IllegalArgumentException("Invalid arguments");
        }

        return this.planetGateway.save(planet);
    }
}
