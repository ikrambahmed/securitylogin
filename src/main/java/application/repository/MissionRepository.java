package application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import application.model.Mission;
@Repository
public interface MissionRepository extends JpaRepository<Mission, Long> {

}
