package br.com.challengerbackendhitclean.application.usecase.Planet;

import br.com.challengerbackendhitclean.application.gateway.PlanetGateway;
import br.com.challengerbackendhitclean.application.usecase.UseCase;
import br.com.challengerbackendhitclean.domain.entity.Planet;

public class GetPlanetByIdUseCase implements UseCase<Integer, Planet> {

    private final PlanetGateway planetGateway;
    public GetPlanetByIdUseCase(PlanetGateway planetGateway) {
        this.planetGateway = planetGateway;
    }

    @Override
    public Planet execute(Integer integer) {
        return this.planetGateway.getId(integer);
    }
}
