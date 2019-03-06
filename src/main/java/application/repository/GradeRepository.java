package application.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import application.model.Grade;


@Repository
public interface GradeRepository extends JpaRepository<Grade, Long> {

	
	@Query("select code from Grade o where o.liba=:x")
	public String getGrade(@Param("x")String name); 
}
