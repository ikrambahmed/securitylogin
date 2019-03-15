package application.model;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Deptgen implements Serializable  {

	
	@Id
	@Column(name = "CODE")

	private int code;
	
	@Column(name = "LIB_A")

	private String liba;
	
	@Column(name = "LIB_L")

	private String libfr;
	
	@Column(name = "TYP_DEPT")

	private String type;
	
	
	
	public Deptgen(int code, String liba, String libfr, String type, Collection<Missionaire> missionnaire,
			Collection<User> users) {
		super();
		this.code = code;
		this.liba = liba;
		this.libfr = libfr;
		this.type = type;
		this.missionnaire = missionnaire;
		this.users = users;
	}
	public Deptgen() {
		super();
		// TODO Auto-generated constructor stub
	}



	@OneToMany(mappedBy="dept")
	@JsonIgnore
	private Collection<Missionaire> missionnaire;
	
	public Collection<User> getUsers() {
		return users;
	}
	public void setUsers(Collection<User> users) {
		this.users = users;
	}
	public Collection<Missionaire> getMissionnaire() {
		return missionnaire;
	}
	public void setMissionnaire(Collection<Missionaire> missionnaire) {
		this.missionnaire = missionnaire;
	}



	@ManyToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinTable(name="User_stract")
	private Collection<User> users;
	
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
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
