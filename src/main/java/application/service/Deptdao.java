package application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import application.model.Deptgen;
import application.repository.DeptRepository;



@Service
@Primary
public class Deptdao {
	
	@Autowired
	DeptRepository deptrepository;
	
	public List<Deptgen> findAll(){
		return deptrepository.findAll();
	}


}
