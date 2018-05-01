
package com.chanfir.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ParametreJob {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idp;
	private String clé;
	private String valeur;
	
	@ManyToOne
	private SpiJob spijob;
	
	
	
	public ParametreJob(int idp, String clé, String valeur) {
		super();
		this.idp = idp;
		this.clé = clé;
		this.valeur = valeur;
		
	}
	public ParametreJob() {
		// TODO Auto-generated constructor stub
	}
	public int getIdp() {
		return idp;
	}
	public void setIdp(int idp) {
		this.idp = idp;
	}
	public String getclé() {
		return clé;
	}
	public void setclé(String clé) {
		this.clé = clé;
	}
	public String getvaleur() {
		return valeur;
	}
	public void setvaleur(String valeur) {
		this.valeur = valeur;
	}
	
	
	
	
	
	
}