package application.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;


import application.model.Missionaire;
import application.repository.MissionnaireRepository;
@Service
@Primary
public class MissionnaireService implements IMissionnaire {
    @Autowired
	private MissionnaireRepository missionnaireRepository ; 
	 
	@Override
	public List<Missionaire> getMissionnaires() {
		// TODO Auto-generated method stub
		return missionnaireRepository.findAll() ; 	}

	@Override
	public void addMissionaire(Missionaire missionaire) {
		missionnaireRepository.save(missionaire) ; 
		
	}

	@Override
	public void updateMissionaire(Missionaire missionaire) {
		
		
		missionnaireRepository.save(missionaire) ; 
		
	}

	@Override
	public void deleteteMissionaire(String cin) {
		
		Missionaire missionaire = new Missionaire() ; 
		missionaire.setCin(cin);
		missionnaireRepository.delete(missionaire);
	}

	
	public Optional<Missionaire> getMissionnaire(String cin ) {
		// TODO Auto-generated method stub
		return missionnaireRepository.getMiss(cin)  ; 
	}

}
