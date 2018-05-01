package com.kelaskoding.entity;



import java.util.ArrayList;
import java.util.List;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "groupes")
public class Group {

	@Id
	@GeneratedValue (strategy=GenerationType.AUTO)
	
	private int idg;
	
	@ManyToMany(mappedBy ="SpiJoblist")
	   private List<SpiJob> SpiJobList;
	
	@ManyToMany
	   private List<User> UserList=new ArrayList<>();

	public int getIdg() {
		return idg;
	}

	public void setIdg(int idg) {
		this.idg = idg;
	}

	public List<SpiJob> getSpiJobList() {
		return SpiJobList;
	}

	public void setSpiJobSet(List<SpiJob> spiJobList) {
		SpiJobList = spiJobList;
	}

	public List<User> getUserSet() {
		return UserList;
	}

	public void setUserSet(List<User> UserList) {
		this.UserList = UserList;
	}
	
	
	public Group(int idg) {
		super();
		this.idg = idg;

	}


	
}
