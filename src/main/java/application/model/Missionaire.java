package application.model;	import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import application.model.Categorie;
import application.model.Classe;
import application.model.Deptgen;

import application.model.Groupe;

	@Entity
	public class Missionaire implements Serializable  {
		@Id
		@Column(name = "cin")
	private String cin ; 
		@Column(name = "matricule")
		private String matricule ; 
		@Column(name = "nom")
		
		private String nom;
		@Column(name = "nomL")
		private String nomL;
		@Column(name = "prenom")
		private String prenom;
		@Column(name = "prenomL")
		private String prenomL;
		@Column(name = "nationalite")
		private String nationalite;
		@Column(name = "nationaliL")
		private String nationaliteL;
		@Column(name = "date_naiss")
		private Date datenaissance;
		@Column(name = "place_naiss")
		private String place_naissance ; 
		@Column(name = "rib")
		private String rib ; 
		@Column(name = "date_cin")
		private Date date_cin;
		@Column(name = "place_cin")
		private String place_cin;
		@Column(name = "groupe")
		private String groupe ; 
		@Column(name = "niveau")
		private String niveau;
		@Column(name = "ministr")
		private String ministr;
		
		@ManyToOne 
		private Grade graade;
		
		@ManyToOne 
		private Fonction fonnction;
	
		@ManyToOne
		private Classe classee;
		
		@ManyToOne
		private Categorie cat;
		
		@ManyToOne 
		private Groupe group;
		
		@ManyToOne
		private Deptgen dept;

		@OneToMany
		@JsonIgnore
		private Collection<Ord_Miss> ordmiss;
		
		
		
		
	public Missionaire(String cin, String matricule, String nom, String nomL, String prenom, String prenomL,
				String nationalite, String nationaliteL, Date datenaissance, String place_naissance, String rib,
				Date date_cin, String place_cin, String groupe, String niveau, String ministr, Grade graade,
				Fonction fonnction, Classe classee, Categorie cat, Groupe group, Deptgen dept,
				Collection<Ord_Miss> ordmiss) {
			super();
			this.cin = cin;
			this.matricule = matricule;
			this.nom = nom;
			this.nomL = nomL;
			this.prenom = prenom;
			this.prenomL = prenomL;
			this.nationalite = nationalite;
			this.nationaliteL = nationaliteL;
			this.datenaissance = datenaissance;
			this.place_naissance = place_naissance;
			this.rib = rib;
			this.date_cin = date_cin;
			this.place_cin = place_cin;
			this.groupe = groupe;
			this.niveau = niveau;
			this.ministr = ministr;
			this.graade = graade;
			this.fonnction = fonnction;
			this.classee = classee;
			this.cat = cat;
			this.group = group;
			this.dept = dept;
			this.ordmiss = ordmiss;
		}


	public String getPlace_naissance() {
			return place_naissance;
		}


		public Collection<Ord_Miss> getOrdmiss() {
		return ordmiss;
	}


	public void setOrdmiss(Collection<Ord_Miss> ordmiss) {
		this.ordmiss = ordmiss;
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


public Deptgen getDept() {
	return dept;
}


public void setDept(Deptgen dept) {
	this.dept = dept;
}




	}

	
