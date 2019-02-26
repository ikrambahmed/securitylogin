package application.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import application.model.Missionaire;
import application.repository.MissionnaireRepository;
@Service
@Primary
public class MissionnaireService implements ICrudService<Missionaire, String>{

	@Autowired
	private MissionnaireRepository missionnaireRepository;
	
	@Override
	public List<Missionaire> getAll() {
		// TODO Auto-generated method stub
		return missionnaireRepository.findAll() ; 	}

	@Override
	public void add(Missionaire entity) {
missionnaireRepository.save(entity)		;
	}

	@Override
	public void update(Missionaire entity) {
		missionnaireRepository.save(entity);		
	}

	@Override
	public void delete(String id) {
		Missionaire missionaire = new Missionaire();
		missionaire.setCin(id);
		missionnaireRepository.delete(missionaire);
		
	}

	@Override
	public void saveAll(Iterable<Missionaire> iterable) {
		// TODO Auto-generated method stub
		
	}

	

	

}

