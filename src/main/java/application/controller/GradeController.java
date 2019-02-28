package application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import application.model.grade;
import application.service.Gradedao;

@RestController
@CrossOrigin
@RequestMapping
public class GradeController {

	@Autowired
	Gradedao gradedao;
	
	@GetMapping("/api/listgrade")
	public List<grade> getAllgrades(){
		return gradedao.findAll();
	}
	
	@GetMapping("/api/listegrade")
	public String getGrade(@RequestParam(name="name",defaultValue="")String name)
	{
		return gradedao.getGrade(name);
		
		
	}

}
