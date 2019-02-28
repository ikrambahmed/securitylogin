package application.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import application.model.mission;
import application.repository.MissionRepository;

@Service
@Primary
public class Missiondao implements IMission {
	   
		@Autowired
		private MissionRepository missionRepository ; 
		 
		@Override
		public List<mission> getMissions() {
			// TODO Auto-generated method stub
			return missionRepository.findAll() ; 	}

		@Override
		public void addMission(mission Mission) {
			missionRepository.save(Mission) ; 
			
		}

		@Override
		public void updateMission(mission Mission) {
			
			
			missionRepository.save(Mission) ; 
			
		}

		@Override
		public void deleteMission(Long code) {
			
			mission Mission = new mission() ; 
			Mission.setCode_mission(code);
			missionRepository.delete(Mission);
		}

	}
