package application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import application.model.Missionaire;


@Repository
public interface MissionnaireRepository extends JpaRepository<Missionaire , String>{

	
	
}
