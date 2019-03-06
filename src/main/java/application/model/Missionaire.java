package application.model;	import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

	import javax.persistence.*;

import application.model.Categorie;
import application.model.Classe;
import application.model.deptgen;

import application.model.Groupe;

	@Entity
	public class Missionaire implements Serializable {
		@Id
		private String cin ; 
		private String matricule ; 
		private String nom;
		private String nomL;
		private String prenom;
		private String prenomL;
		private String nationalite;
		private String nationaliteL;
		private Date datenaissance;
		private String place_naissance ; 
		private String rib ; 
		private Date date_cin;
		private String place_cin;
		private String groupe ; 
		private String niveau;
		private String ministr;
		
		@ManyToOne (fetch=FetchType.EAGER, cascade=CascadeType.ALL)
		private Grade graade;

		@ManyToOne (fetch=FetchType.EAGER, cascade=CascadeType.ALL)
		private Fonction fonnction;


		@ManyToOne (fetch=FetchType.EAGER, cascade=CascadeType.ALL)
		private Classe classee;

		@ManyToOne (fetch=FetchType.EAGER, cascade=CascadeType.ALL)
		private Categorie cat;

		@ManyToOne (fetch=FetchType.EAGER, cascade=CascadeType.ALL)
		private Groupe group;

		@ManyToOne (fetch=FetchType.EAGER, cascade=CascadeType.ALL)
		private deptgen dept;

		@OneToMany
		private Collection<Ord_Miss> ordmiss;
		
	public String getPlace_naissance() {
			return place_naissance;
		}


		public void setPlace_naissance(String place_naissance) {
			this.place_naissance = place_naissance;
		}


		public String getRib() {
			return rib;
		}


		public void setRib(String rib) {
			this.rib = rib;
		}


		public String getGroupe() {
			return groupe;
		}


		public void setGroupe(String groupe) {
			this.groupe = groupe;
		}


	public Missionaire()
	{
	}


	public Missionaire(String cin, String matricule) {
		super();
		this.cin = cin;
		this.matricule = matricule;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cin == null) ? 0 : cin.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Missionaire other = (Missionaire) obj;
		if (cin == null) {
			if (other.cin != null)
				return false;
		} else if (!cin.equals(other.cin))
			return false;
		return true;
	}


	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
	}
	public String getMatricule() {
		return matricule;
	}
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getNomL() {
		return nomL;
	}


	public void setNomL(String nomL) {
		this.nomL = nomL;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getPrenomL() {
		return prenomL;
	}


	public void setPrenomL(String prenomL) {
		this.prenomL = prenomL;
	}


	public String getNationalite() {
		return nationalite;
	}


	public void setNationalite(String nationalite) {
		this.nationalite = nationalite;
	}


	public String getNationaliteL() {
		return nationaliteL;
	}


	public void setNationaliteL(String nationaliteL) {
		this.nationaliteL = nationaliteL;
	}


	public Date getDatenaissance() {
		return datenaissance;
	}


	public void setDatenaissance(Date datenaissance) {
		this.datenaissance = datenaissance;
	}


	public Date getDate_cin() {
		return date_cin;
	}


	public void setDate_cin(Date date_cin) {
		this.date_cin = date_cin;
	}


	public String getPlace_cin() {
		return place_cin;
	}


	public void setPlace_cin(String place_cin) {
		this.place_cin = place_cin;
	}




	public String getNiveau() {
		return niveau;
	}


	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}


	public String getMinistr() {
		return ministr;
	}


	public void setMinistr(String ministr) {
		this.ministr = ministr;
	}







public Grade getGraade() {
		return graade;
	}


	public void setGraade(Grade graade) {
		this.graade = graade;
	}


public Fonction getFonnction() {
	return fonnction;
}


public void setFonnction(Fonction fonnction) {
	this.fonnction = fonnction;
}


public Classe getClassee() {
	return classee;
}


public void setClassee(Classe classee) {
	this.classee = classee;
}


public Categorie getCat() {
	return cat;
}


public void setCat(Categorie cat) {
	this.cat = cat;
}


public Groupe getGroup() {
	return group;
}


public void setGroup(Groupe group) {
	this.group = group;
}


public deptgen getDept() {
	return dept;
}


public void setDept(deptgen dept) {
	this.dept = dept;
}




	}

	
