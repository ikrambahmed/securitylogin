package application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import application.model.Deptgen;
import application.service.Deptdao;


@RestController
@RequestMapping("/api/listdept")
@CrossOrigin

public class DeptController {
	
	@Autowired
	Deptdao deptdao;
	
	@GetMapping("/alldept")
	public List<Deptgen> getAlldept(){
		return deptdao.findAll();
	}


}
