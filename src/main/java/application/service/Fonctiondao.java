package application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import application.model.fonction;
import application.repository.FonctionRepository;




@Service
@Primary
public class Fonctiondao {

	
	
	@Autowired
	FonctionRepository fonctionrepository;
	
	public List<fonction> findAll(){
		return fonctionrepository.findAll();
	}


}
