package org.legital.roommanagement.repository;

import org.legital.roommanagement.domain.Building;
import org.legital.roommanagement.domain.Room;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoomRepository extends JpaRepository<Room, Long> {

    List<Room> findByBuilding(Building building);

}
