package application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import application.model.groupe;
import application.service.Groupedao;

@RestController
@RequestMapping("/api/listgroupe")
@CrossOrigin

public class GroupeController {
	
	@Autowired
	Groupedao groupedao;
	
	@GetMapping
	public List<groupe> getAllgroupes(){
		return groupedao.findAll();
	}


}
