package application.model;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Ord_Miss {
	
	@Id
	private Long num_ord ; 
	
	private Date Date_depart ; 
	private Date Date_arrivee ;
	private Double tot_mission ; 
	private Double tot_transport ; 
	
	
	public Missionaire getMissionnaire() {
		return missionnaire;
	}

	public void setMissionnaire(Missionaire missionnaire) {
		this.missionnaire = missionnaire;
	}

	@ManyToOne
	private Mission mission ; 
	
	@ManyToOne
	
	private Missionaire missionnaire;

	public Long getNum_ord() {
		return num_ord;
	}

	public void setNum_ord(Long num_ord) {
		this.num_ord = num_ord;
	}

	public Date getDate_depart() {
		return Date_depart;
	}

	public void setDate_depart(Date date_depart) {
		Date_depart = date_depart;
	}

	public Date getDate_arrivee() {
		return Date_arrivee;
	}

	public void setDate_arrivee(Date date_arrivee) {
		Date_arrivee = date_arrivee;
	}

	public Double getTot_mission() {
		return tot_mission;
	}

	public void setTot_mission(Double tot_mission) {
		this.tot_mission = tot_mission;
	}

	public Double getTot_transport() {
		return tot_transport;
	}

	public void setTot_transport(Double tot_transport) {
		this.tot_transport = tot_transport;
	}

	public Mission getMission() {
		return mission;
	}

	public void setMission(Mission mission) {
		this.mission = mission;
	}

	
	 
	 
	
	

}
