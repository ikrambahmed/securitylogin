 package application.service;

import java.util.List;

import application.model.Missionaire;


public interface IMissionnaire {
  
	List<Missionaire> getMissionnaires() ; 
	
	void addMissionaire(Missionaire missionaire) ; 
	
	void updateMissionaire(Missionaire missionaire) ; 
	
	void deleteteMissionaire(String cin) ; 
	

}
