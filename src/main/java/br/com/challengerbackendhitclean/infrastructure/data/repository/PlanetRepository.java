package br.com.challengerbackendhitclean.infrastructure.data.repository;

import br.com.challengerbackendhitclean.infrastructure.data.entityDB.PlanetDB;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlanetRepository extends JpaRepository<PlanetDB, Integer> {

    PlanetDB findPlanetDBById(int id);

    PlanetDB findPlanetDBByName(String name);
}
