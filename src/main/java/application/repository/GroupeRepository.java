package application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import application.model.groupe;

@Repository

public interface GroupeRepository extends JpaRepository <groupe, Long> {

}
