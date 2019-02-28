package application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import application.model.classe;

@Repository

public interface ClasseRepository extends JpaRepository<classe, Long>{

}
