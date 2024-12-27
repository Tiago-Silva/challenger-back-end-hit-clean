package br.com.challengerbackendhitclean.application.usecase.Planet;

import br.com.challengerbackendhitclean.application.gateway.PlanetGateway;
import br.com.challengerbackendhitclean.application.usecase.UseCase;
import br.com.challengerbackendhitclean.domain.entity.Planet;

import java.util.List;

public class GetAllPlanetsUseCase implements UseCase<Void, List<Planet>> {

    private final PlanetGateway planetGateway;
    public GetAllPlanetsUseCase(PlanetGateway planetGateway) {
        this.planetGateway = planetGateway;
    }

    @Override
    public List<Planet> execute(Void unused) {
        return this.planetGateway.getAll();
    }
}
