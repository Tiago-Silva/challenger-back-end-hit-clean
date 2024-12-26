package br.com.challengerbackendhitclean.infrastructure.web.controller;

import br.com.challengerbackendhitclean.application.usecase.Planet.*;
import br.com.challengerbackendhitclean.infrastructure.core.mapper.PlanetMapper;
import br.com.challengerbackendhitclean.infrastructure.web.dto.PlanetRequestDTO;
import br.com.challengerbackendhitclean.infrastructure.web.dto.PlanetResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/planet")
public class PlanetController {

    private final CreatePlanetUseCase createPlanetUseCase;
    private final GetAllPlanetsUseCase getAllPlanetsUseCase;
    private final GetPlanetByIdUseCase getPlanetByIdUseCase;
    private final UpdatePlanetUseCase updatePlanetUseCase;
    private final DeletePlanetUseCase deletePlanetUseCase;
    private final GetPlanetByNameUseCase getPlanetByNameUseCase;
    private final PlanetMapper mapper;
    public PlanetController(CreatePlanetUseCase createPlanetUseCase, GetAllPlanetsUseCase getAllPlanetsUseCase, GetPlanetByIdUseCase getPlanetByIdUseCase, UpdatePlanetUseCase updatePlanetUseCase, DeletePlanetUseCase deletePlanetUseCase, GetPlanetByNameUseCase getPlanetByNameUseCase, PlanetMapper mapper) {
        this.createPlanetUseCase = createPlanetUseCase;
        this.getAllPlanetsUseCase = getAllPlanetsUseCase;
        this.getPlanetByIdUseCase = getPlanetByIdUseCase;
        this.updatePlanetUseCase = updatePlanetUseCase;
        this.deletePlanetUseCase = deletePlanetUseCase;
        this.getPlanetByNameUseCase = getPlanetByNameUseCase;
        this.mapper = mapper;
    }

    @PostMapping
    public ResponseEntity<HttpStatus> createPlanet(@RequestBody PlanetRequestDTO requestDTO) {
        this.createPlanetUseCase.execute(this.mapper.requestDTOToDomainObject(requestDTO));
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<HttpStatus> updatePlanet(@RequestBody PlanetResponseDTO responseDTO) {
        this.updatePlanetUseCase.execute(this.mapper.responseDTOToDomainObject(responseDTO));
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<HttpStatus> deletePlanet(@RequestBody PlanetResponseDTO responseDTO) {
        this.deletePlanetUseCase.execute(this.mapper.responseDTOToDomainObject(responseDTO));
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<PlanetResponseDTO>> getAllPlanets() {
        List<PlanetResponseDTO> responseDTOList = this.getAllPlanetsUseCase.execute(null).stream().map(this.mapper::domainObjectToResponseDTO).toList();
        return new ResponseEntity<>(responseDTOList, HttpStatus.OK);
    }

    @GetMapping("/id/{planetId}")
    public ResponseEntity<PlanetResponseDTO> getPlanetById(@PathVariable Integer planetId) {
        return new ResponseEntity<>(this.mapper.domainObjectToResponseDTO(this.getPlanetByIdUseCase.execute(planetId)), HttpStatus.OK);
    }

    @GetMapping("/name/{planetName}")
    public ResponseEntity<PlanetResponseDTO> getPlanetByName(@PathVariable String planetName) {
        return new ResponseEntity<>(this.mapper.domainObjectToResponseDTO(this.getPlanetByNameUseCase.execute(planetName)), HttpStatus.OK);
    }
}
