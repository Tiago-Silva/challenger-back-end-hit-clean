package br.com.challengerbackendhitclean.application.usecase.Planet;

import br.com.challengerbackendhitclean.application.gateway.PlanetGateway;
import br.com.challengerbackendhitclean.application.usecase.UseCase;
import br.com.challengerbackendhitclean.domain.entity.Planet;

public class UpdatePlanetUseCase implements UseCase<Planet, Planet> {

    private final PlanetGateway planetGateway;
    public UpdatePlanetUseCase(PlanetGateway planetGateway) {
        this.planetGateway = planetGateway;
    }

    @Override
    public Planet execute(Planet planet) {
        return this.planetGateway.update(planet);
    }
}
