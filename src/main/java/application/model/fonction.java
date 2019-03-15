package application.model;
import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Fonction implements Serializable{
	
	@Id
	@Column(name = "COD_FONCTION")

	private int code;
	@Column(name = "CLASSGRD")

	private String liba;
	@Column(name = "LIB_FONCL")

	private String libfr;
	
	private int type ; 
	
	@OneToMany(mappedBy="fonnction" , fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	@JsonIgnore
	private Collection<Missionaire> missionnaire;

	
	public Fonction() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Fonction(int code, String liba, String libfr, int type, Collection<Missionaire> missionnaire) {
		super();
		this.code = code;
		this.liba = liba;
		this.libfr = libfr;
		this.type = type;
		this.missionnaire = missionnaire;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public int getCode() {
		return code;
	}
	public Collection<Missionaire> getMissionnaire() {
		return missionnaire;
	}
	public void setMissionnaire(Collection<Missionaire> missionnaire) {
		this.missionnaire = missionnaire;
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
