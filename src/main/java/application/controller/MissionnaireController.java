package application.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import application.model.Missionaire;
import application.service.MissionnaireService;


@RestController
@RequestMapping("/api/missionaire")
@CrossOrigin
public class MissionnaireController {
	
	@Autowired
	private MissionnaireService missionaireService ; 
	
	@GetMapping(value="lista")
	  public Optional<Missionaire> getMiss(@RequestParam(name="cin",defaultValue="")String cin)
	    {
		  return missionaireService.getMissionnaire(cin) ; 
	    }
		
	@GetMapping
	public List<Missionaire> getMissionaires() {
		return missionaireService.getMissionnaires() ; 
		
	}
	
	@PostMapping
	public void addMissionaire(@RequestBody Missionaire missionaire)
	{
		missionaireService.addMissionaire(missionaire);
	}
	
	@PutMapping
	public void updateMissionaire(@RequestBody Missionaire missionaire)
	{
		missionaireService.updateMissionaire(missionaire);
		
	}
	@DeleteMapping("/{cin}")
	public void deleteMissionaire(@PathVariable String cin)
	{
		missionaireService.deleteteMissionaire(cin);
	}
	
	
	
	
	
}
