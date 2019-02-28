package application.model;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class classe {
	
	@Id
	private String code_fct;
	private String liba;
	private String libfr;
	
	
	
	public Collection<Missionaire> getMissionnaire() {
		return missionnaire;
	}
	public void setMissionnaire(Collection<Missionaire> missionnaire) {
		this.missionnaire = missionnaire;
	}
	public String getCode_fct() {
		return code_fct;
	}
	public void setCode_fct(String code_fct) {
		this.code_fct = code_fct;
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
	
	@OneToMany(mappedBy="classee")
	private Collection<Missionaire> missionnaire;
	
	

}
