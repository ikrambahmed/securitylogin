package application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import application.model.classe;
import application.repository.ClasseRepository;



@Service
@Primary
public class Classedao {
	
	@Autowired
	ClasseRepository classerepository;
	
	public List<classe> findAll(){
		return classerepository.findAll();
	}


}
