package com.kelaskoding.entity;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idu;
	private String nom;
	private String prenom ;
	
//	@ManyToMany
//	   private List<Group> groupList;
	
	public int getIdu() {
		return idu;
	}


	public void setIdu(int idu) {
		this.idu = idu;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public User(int idu, String nom, String prenom) {
		super();
		this.idu = idu;
		this.nom = nom;
		this.prenom = prenom;
		
	}
//		this.groupList = groupList;
//	}
//
//
//	public List<Group> getGroupList() {
//		return groupList;
//	}
//
//
//	public void setGroupList(List<Group> groupList) {
//		this.groupList = groupList;
//	}


	
	
	
	
	

}
