package br.com.challengerbackendhitclean.application.usecase.Planet;

import br.com.challengerbackendhitclean.application.gateway.PlanetGateway;
import br.com.challengerbackendhitclean.application.usecase.UseCase;
import br.com.challengerbackendhitclean.domain.entity.Planet;

public class DeletePlanetUseCase implements UseCase<Planet, Planet> {

    private final PlanetGateway planetGateway;
    public DeletePlanetUseCase(PlanetGateway planetGateway) {
        this.planetGateway = planetGateway;
    }

    @Override
    public Planet execute(Planet planet) {
        if (planet == null) {
            throw new IllegalArgumentException("Invalid arguments");
        }
        this.planetGateway.delete(planet);
        return planet;
    }
}
