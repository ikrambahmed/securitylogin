package application.model;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class MotCle  implements Serializable {
	
	
	
	@Id
	private Long code;
	private String libA;
	private String libF;
	
	
	
	@OneToMany(mappedBy="Motcle", fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	@JsonIgnore
	private Collection<Mission> missions;
	
	public Long getCode() {
		return code;
	}
	public void setCode(Long code) {
		this.code = code;
	}
	public String getLibA() {
		return libA;
	}
	public void setLibA(String libA) {
		this.libA = libA;
	}
	public String getLibF() {
		return libF;
	}
	public void setLibF(String libF) {
		this.libF = libF;
	}
	public MotCle(Long code, String libA, String libF, Collection<Mission> missions) {
		super();
		this.code = code;
		this.libA = libA;
		this.libF = libF;
		this.missions = missions;
	}
	public MotCle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Collection<Mission> getMissions() {
		return missions;
	}
	public void setMissions(Collection<Mission> missions) {
		this.missions = missions;
	}

	
	
}
