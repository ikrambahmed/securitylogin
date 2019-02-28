package application.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import application.model.grade;


@Repository
public interface GradeRepository extends JpaRepository<grade, Long> {

	
	@Query("select code from grade o where o.liba=:x")
	public String getGrade(@Param("x")String name); 
}
