package application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import application.model.groupe;
import application.repository.GroupeRepository;


@Service
@Primary
public class Groupedao {

	
	
	@Autowired
	GroupeRepository grouperepository;
	
	public List<groupe> findAll(){
		return grouperepository.findAll();
	}


}
