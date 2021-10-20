package org.legital.roommanagement.to;

import org.legital.roommanagement.domain.Building;

import java.time.LocalDate;

public class BuildingTO {
    private Long id;
    private Character code;
    private String description;
    private LocalDate constructionDate;

    public static BuildingTO from(Building building) {
        BuildingTO buildingTO = new BuildingTO();
        buildingTO.id = building.getId();
        buildingTO.code = building.getCode();
        buildingTO.description = building.getDescription();
        buildingTO.constructionDate = building.getConstructionDate();
        return buildingTO;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Character getCode() {
        return code;
    }

    public void setCode(Character code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getConstructionDate() {
        return constructionDate;
    }

    public void setConstructionDate(LocalDate constructionDate) {
        this.constructionDate = constructionDate;
    }
}
