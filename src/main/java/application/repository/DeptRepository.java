package application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import application.model.deptgen;

@Repository

public interface DeptRepository extends JpaRepository<deptgen, Long> {

}
