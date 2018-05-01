package com.kelaskoding.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class HistoriqueJob {
	
	@Id
	@GeneratedValue( strategy = GenerationType.AUTO )
	private int idh;
	private double durée;
	private  String temps;
	
//	@ManyToMany 
//	   private Set<SpiJob> SpiJobSet;
	
	public HistoriqueJob(int idh, double durée, String temps) {
		super();
		this.idh = idh;
		this.durée = durée;
		this.temps = temps;
	}
	public int getIdh() {
		return idh;
	}
	public void setIdh(int idh) {
		this.idh = idh;
	}
	public double getDurée() {
		return durée;
	}
	public void setDurée(double durée) {
		this.durée = durée;
	}
	public String getTemps() {
		return temps;
	}
	public void setTemps(String temps) {
		this.temps = temps;
	}
	
	
	
	

}
