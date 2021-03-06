package application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import application.model.Grade;
import application.repository.GradeRepository;



@Service
@Primary
public class Gradedao {

	
	@Autowired
	GradeRepository graderepository;
	
	public List<Grade> findAll(){
		return graderepository.findAll();
	}

	public String getGrade(String name) {
		return graderepository.getGrade(name) ; 
	}
	
	


}
