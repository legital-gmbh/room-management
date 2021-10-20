package org.legital.roommanagement.controller;

import org.legital.roommanagement.exception.ResourceNotFoundException;
import org.legital.roommanagement.domain.Building;
import org.legital.roommanagement.service.BuildingService;
import org.legital.roommanagement.to.BuildingTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api/buildings")
public class BuildingController {

    private final BuildingService buildingService;

    public BuildingController(BuildingService buildingService) {
        this.buildingService = buildingService;
    }

    @GetMapping
    public List<BuildingTO> getAll() {
        return buildingService.findAll()
                .stream()
                .map(BuildingTO::from)
                .collect(Collectors.toList());
    }

    @GetMapping("{id}")
    public BuildingTO getOne(@PathVariable Long id) {
        return BuildingTO.from(buildingService.findById(id).orElseThrow(ResourceNotFoundException::new));
    }

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody BuildingTO buildingTO, UriComponentsBuilder ucb) {
        Building building = buildingService.saveBuilding(buildingTO);
        return ResponseEntity.created(ucb.path("api/buildings/{id}").buildAndExpand(building.getId()).toUri()).build();
    }

    @PutMapping("{id}")
    public BuildingTO update(@PathVariable Long id,@RequestBody BuildingTO buildingTO) {
        return BuildingTO.from(buildingService.updateBuilding(id,buildingTO));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        buildingService.deleteById(id);
        return ResponseEntity.ok().build();
    }

}
