package application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import application.model.mission;
@Repository
public interface MissionRepository extends JpaRepository<mission, Long> {

}
