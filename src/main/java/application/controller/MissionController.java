package application.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import application.model.Missionaire;
import application.model.mission;
import application.service.Missiondao;


@RestController
@RequestMapping("/api/mission")
@CrossOrigin
public class MissionController {
	
	@Autowired
	Missiondao missiondao;
	
	
	@GetMapping
	public List<mission> getMissionaires() {
		return missiondao.getMissions() ; 
		
	}
	@PostMapping
	public void addMission(@RequestBody mission Mission)
	{
		missiondao.addMission(Mission);
	}
	
	@PutMapping
	public void updateMission(@RequestBody mission missiona)
	{
		missiondao.updateMission(missiona);
		
	}
	@DeleteMapping("/{code}")
	public void deleteMission(@PathVariable Long code)
	{
		missiondao.deleteMission(code);
	}
	
}