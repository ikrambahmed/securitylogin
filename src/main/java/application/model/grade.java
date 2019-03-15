package application.model;
import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Grade implements Serializable{
	
	
	@Id
	private int code;
	private String liba;
	private String libfr;
	
	@OneToMany(mappedBy="graade" , fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	@JsonIgnore
	private Collection<Missionaire> missionnaire;

	public Grade() {
		super();
	}
	
	public Grade(int code, String liba, String libfr, Collection<Missionaire> missionnaire) {
		super();
		this.code = code;
		this.liba = liba;
		this.libfr = libfr;
		this.missionnaire = missionnaire;
	}
	public Collection<Missionaire> getMissionnaire() {
		return missionnaire;
	}
	public void setMissionnaire(Collection<Missionaire> missionnaire) {
		this.missionnaire = missionnaire;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getLiba() {
		return liba;
	}
	public void setLiba(String liba) {
		this.liba = liba;
	}
	public String getLibfr() {
		return libfr;
	}
	public void setLibfr(String libfr) {
		this.libfr = libfr;
	}
	
	
	
}
