package org.legital.roommanagement.repository;

import org.legital.roommanagement.domain.Building;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BuildingRepository extends JpaRepository<Building, Long> {
}
