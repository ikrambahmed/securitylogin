package application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import application.model.Mission;
import application.model.Ord_Miss;
import application.service.Missiondao;
import application.service.Ord_MissDao;

@RestController
@RequestMapping("/api/ordMiss")
@CrossOrigin
public class Ord_MissController {

	
	@Autowired
	Ord_MissDao ordMissDao;
	
	
	@GetMapping
	public List<Ord_Miss> getOrds() {
		return ordMissDao. findAll(); 
		
	}
}
