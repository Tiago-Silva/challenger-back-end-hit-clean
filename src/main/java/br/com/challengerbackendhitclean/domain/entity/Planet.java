package br.com.challengerbackendhitclean.domain.entity;

import br.com.challengerbackendhitclean.infrastructure.data.entityDB.PlanetDB;
import br.com.challengerbackendhitclean.infrastructure.web.dto.PlanetRequestDTO;
import br.com.challengerbackendhitclean.infrastructure.web.dto.PlanetResponseDTO;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

@Getter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Planet implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private int id;

    private String name;

    private String climate;

    private String terrain;

    private String filmAppearances;

    private Planet (
        final int id,
        final String name,
        final String climate,
        final String terrain,
        final String filmAppearances
    ) {
        this.id = id;
        this.name = name;
        this.climate = climate;
        this.terrain = terrain;
        this.filmAppearances = filmAppearances;
    };

    private Planet (
        final String name,
        final String climate,
        final String terrain,
        final String filmAppearances
    ) {
        this.name = name;
        this.climate = climate;
        this.terrain = terrain;
        this.filmAppearances = filmAppearances;
    };

    public static Planet withRequestDTO(PlanetRequestDTO requestDTO) {
        return new Planet (
            requestDTO.name(),
            requestDTO.climate(),
            requestDTO.terrain(),
            requestDTO.filmAppearances()
        );
    }

    public static Planet withResponseDTO(PlanetResponseDTO responseDTO) {
        return new Planet (
            responseDTO.id(),
            responseDTO.name(),
            responseDTO.climate(),
            responseDTO.terrain(),
            responseDTO.filmAppearances()
        );
    }

    public static Planet withPlanetDB(PlanetDB planetDB) {
        return new Planet (
            planetDB.getId(),
            planetDB.getName(),
            planetDB.getClimate(),
            planetDB.getTerrain(),
            planetDB.getFilmAppearances()
        );
    }
}
