package application.service;

import java.util.List;

import application.model.mission;


public interface IMission {
	List<mission> getMissions() ; 
	
	void addMission(mission Mission) ; 
	
	void updateMission(mission Mission) ; 
	
	void deleteMission(Long code) ; 
	
}
