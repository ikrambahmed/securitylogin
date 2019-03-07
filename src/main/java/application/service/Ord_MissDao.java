package application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import application.model.Ord_Miss;
import application.repository.Ord_MissRepository;

	@Service
	@Primary
	public class Ord_MissDao {
		
		
		@Autowired
        Ord_MissRepository ordmissRepository	 ; 	
		
		public List<Ord_Miss> findAll(){
			return ordmissRepository.findAll();
		}
		
		
		public Object addordMiss(Ord_Miss ordMiss) {
			return ordmissRepository.save(ordMiss);
		}
}
