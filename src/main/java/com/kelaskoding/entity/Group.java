package com.kelaskoding.entity;


import java.util.List;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Group {

	@Id
	@GeneratedValue (strategy=GenerationType.AUTO)
	
	private int idg;
	
//	@ManyToMany(mappedBy ="SpiJoblist")
//	   private List<SpiJob> SpiJobList;
	
//	@ManyToMany(mappedBy="UserList")
//	   private List<User> UserList;

	public int getIdg() {
		return idg;
	}

	public void setIdg(int idg) {
		this.idg = idg;
	}

//	public List<SpiJob> getSpiJobList() {
//		return SpiJobList;
//	}
//
//	public void setSpiJobSet(List<SpiJob> spiJobList) {
//		SpiJobList = spiJobList;
//	}

//	public List<User> getUserSet() {
//		return UserList;
//	}
//
//	public void setUserSet(List<User> UserList) {
//		this.UserList = UserList;
//	}
	
	public Group() {
		
	}

	public Group(int idg, List<SpiJob> spiJobList, List<User> userList) {
		super();
		this.idg = idg;
//		SpiJobList = spiJobList;
//		UserList = userList;
	}


	
}

