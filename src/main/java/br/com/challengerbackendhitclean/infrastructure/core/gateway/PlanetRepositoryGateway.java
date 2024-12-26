package br.com.challengerbackendhitclean.infrastructure.core.gateway;

import br.com.challengerbackendhitclean.application.gateway.PlanetGateway;
import br.com.challengerbackendhitclean.domain.entity.Planet;
import br.com.challengerbackendhitclean.infrastructure.core.mapper.PlanetMapper;
import br.com.challengerbackendhitclean.infrastructure.data.entityDB.PlanetDB;
import br.com.challengerbackendhitclean.infrastructure.data.repository.PlanetRepository;

import java.util.List;

public class PlanetRepositoryGateway implements PlanetGateway {

    private final PlanetRepository repository;
    private final PlanetMapper mapper;
    public PlanetRepositoryGateway(PlanetRepository repository, PlanetMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public Planet save(Planet object) {
        PlanetDB newPlanet = this.repository.save(this.mapper.toPlanetDB(object));
        return this.mapper.toPlanet(newPlanet);
    }

    @Override
    public Planet update(Planet object) {
        this.repository.save(this.mapper.toPlanetDB(object));
        return object;
    }

    @Override
    public void delete(Planet object) {
        this.repository.delete(this.mapper.toPlanetDB(object));
    }

    @Override
    public Planet getId(int objectId) {
        return this.mapper.toPlanet(this.repository.findPlanetDBById(objectId));
    }

    @Override
    public List<Planet> getAll() {
        return this.repository.findAll().stream().map(this.mapper::toPlanet).toList();
    }

    @Override
    public Planet getByName(String name) {
        return this.mapper.toPlanet(this.repository.findPlanetDBByName(name));
    }
}
