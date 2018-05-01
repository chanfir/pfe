package com.kelaskoding.entity;



import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity 
public class SpiJob {
	
	
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id ;
	private String name ;
	private String description;
	private String JobPath;
	
	@OneToMany(mappedBy="spijob")
	   private List<HistoriqueJob> historiqueList =new ArrayList<>();
	
	@ManyToMany
	   private Set<Group> GroupSet;
	
	@OneToMany(mappedBy="spijob")
    private List<ParametreJob> paramSet=new ArrayList<ParametreJob>();
	
	
	
	public int getId() {
		return id;
	}


	public Set<Group> getGroupSet() {
		return GroupSet;
	}


	public void setGroupSet(Set<Group> groupSet) {
		GroupSet = groupSet;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getJobPath() {
		return JobPath;
	}


	public void setJobPath(String jobPath) {
		JobPath = jobPath;
	}
	

	public SpiJob(int id, String name, String description, String jobPath) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		JobPath = jobPath;

	}


	public List<ParametreJob> getParamSet() {
		return paramSet;
	}


	public void setParamSet(List<ParametreJob> paramSet) {
		this.paramSet = paramSet;
	}




}
