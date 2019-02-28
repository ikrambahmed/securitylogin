package application.model;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Categorie {

	@Id
	private int code;
	private String liba;
	private String libfr;
	
	
	
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

	

	@OneToMany(mappedBy="cat")
	private Collection<Missionaire> missionnaire;
	
}
