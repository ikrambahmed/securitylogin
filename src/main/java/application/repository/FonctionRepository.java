package application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import application.model.fonction;

@Repository

public interface FonctionRepository extends JpaRepository<fonction, Long>{

}
