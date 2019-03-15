package application.model;



import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Mission implements Serializable{
	
	@Id
	private Long code_mission;
	private String objetA;
	private String objetF;
	private Date date_debut;
	private Date date_fin;
	
	public Mission() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Mission(Long code_mission, String objetA, String objetF, Date date_debut, Date date_fin, MotCle motcle) {
		super();
		this.code_mission = code_mission;
		this.objetA = objetA;
		this.objetF = objetF;
		this.date_debut = date_debut;
		this.date_fin = date_fin;
		Motcle = motcle;
	}

	@ManyToOne
	@JsonIgnore
	private MotCle Motcle;
	
	@OneToMany(mappedBy="mission")
	@JsonIgnore
	private Collection<Ord_Miss> ordmiss;
	
	public Collection<Ord_Miss> getOrdmiss() {
		return ordmiss;
	}
	public void setOrdmiss(Collection<Ord_Miss> ordmiss) {
		this.ordmiss = ordmiss;
	}
	public String getObjetA() {
		return objetA;
	}
	public void setObjetA(String objetA) {
		this.objetA = objetA;
	}
	public String getObjetF() {
		return objetF;
	}
	public void setObjetF(String objetF) {
		this.objetF = objetF;
	}
	public MotCle getMotcle() {
		return Motcle;
	}
	public void setMotcle(MotCle motcle) {
		Motcle = motcle;
	}
	public Long getCode_mission() {
		return code_mission;
	}
	public void setCode_mission(Long code_mission) {
		this.code_mission = code_mission;
	}

	public Date getDate_debut() {
		return date_debut;
	}
	public void setDate_debut(Date date_debut) {
		this.date_debut = date_debut;
	}
	public Date getDate_fin() {
		return date_fin;
	}
	public void setDate_fin(Date date_fin) {
		this.date_fin = date_fin;
	}
	
	
	
	

	

}
