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
public class Classe implements Serializable{
	@Id
	@Column(name = "CLASSGRD")
	private String code_fct;
	@Column(name ="LIBCLASSGRDA")
	private String liba;
	@Column(name ="LIBCLASSGRDL")
	private String libfr;
	
	@OneToMany(mappedBy="classee")
	@JsonIgnore
	private Collection<Missionaire> missionnaire;
	
	
	public Classe() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Classe(String code_fct, String liba, String libfr, Collection<Missionaire> missionnaire) {
		super();
		this.code_fct = code_fct;
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
	
	
	

}
