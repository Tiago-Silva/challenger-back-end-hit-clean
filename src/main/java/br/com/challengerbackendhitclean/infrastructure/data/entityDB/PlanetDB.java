package br.com.challengerbackendhitclean.infrastructure.data.entityDB;

import br.com.challengerbackendhitclean.domain.entity.Planet;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "planet")
@EqualsAndHashCode(of = "id")
public class PlanetDB implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String climate;

    private String terrain;

    @Column(name = "film_appearances")
    private String filmAppearances;

    public PlanetDB(Planet planet) {
        this.id = planet.getId();
        this.name = planet.getName();
        this.climate = planet.getClimate();
        this.terrain = planet.getTerrain();
        this.filmAppearances = planet.getFilmAppearances();
    }
}
