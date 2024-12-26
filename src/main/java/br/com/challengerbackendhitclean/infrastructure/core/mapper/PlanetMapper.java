package br.com.challengerbackendhitclean.infrastructure.core.mapper;

import br.com.challengerbackendhitclean.domain.entity.Planet;
import br.com.challengerbackendhitclean.infrastructure.data.entityDB.PlanetDB;
import br.com.challengerbackendhitclean.infrastructure.web.dto.PlanetRequestDTO;
import br.com.challengerbackendhitclean.infrastructure.web.dto.PlanetResponseDTO;

public class PlanetMapper {

    public PlanetRequestDTO domainObjectToRequestDTO(Planet planet) {
        return new PlanetRequestDTO(planet.getName(), planet.getClimate(), planet.getTerrain(), planet.getFilmAppearances());
    }

    public PlanetResponseDTO domainObjectToResponseDTO(Planet planet) {
        return new PlanetResponseDTO(planet.getId(), planet.getName(), planet.getClimate(), planet.getTerrain(), planet.getFilmAppearances());
    }

    public Planet requestDTOToDomainObject(PlanetRequestDTO requestDTO) {
        return Planet.withRequestDTO(requestDTO);
    }

    public Planet responseDTOToDomainObject(PlanetResponseDTO responseDTO) {
        return Planet.withResponseDTO(responseDTO);
    }

    public PlanetDB toPlanetDB(Planet planet) {
        return new PlanetDB(planet);
    }

    public Planet toPlanet(PlanetDB planetDB) {
        return Planet.withPlanetDB(planetDB);
    }
}
