package application.model;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class deptgen {

	
	@Id
	private int code;
	private String liba;
	private String libfr;
	private String type;
	
	
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
	
	

	@OneToMany(mappedBy="dept")
	private Collection<Missionaire> missionnaire;
	
	
	
}
