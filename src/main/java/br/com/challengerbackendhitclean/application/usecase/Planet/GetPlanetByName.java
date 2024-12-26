package br.com.challengerbackendhitclean.application.usecase.Planet;

import br.com.challengerbackendhitclean.application.gateway.PlanetGateway;
import br.com.challengerbackendhitclean.application.usecase.UseCase;
import br.com.challengerbackendhitclean.domain.entity.Planet;

public class GetPlanetByName implements UseCase<String, Planet> {

    private final PlanetGateway planetGateway;
    public GetPlanetByName(PlanetGateway planetGateway) {
        this.planetGateway = planetGateway;
    }

    @Override
    public Planet execute(String name) {
        return this.planetGateway.getByName(name);
    }
}
