package com.models.demo.entities;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;

@Entity
public class Aimodel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idModel;
	private String name;
	private String version;
	private Date trainingDate;
	private String email;
	private Float accuracy;
	
	@ManyToOne
	@JoinColumn(name = "openstate_idstate", referencedColumnName = "idstate")
	private OpenState openstate;
	
	public Aimodel(String name, String version, Date trainingDate, String email, Float accuracy) {
		super();
		this.name = name;
		this.version = version;
		this.trainingDate = trainingDate;
		this.email = email;
		this.accuracy = accuracy;
	}
	
	public Aimodel() {
		super();
	}
	
	public Long getIdModel() {
		return idModel;
	}
	
	public void setIdModel(Long idModel) {
		this.idModel = idModel;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getVersion() {
		return version;
	}
	
	public void setVersion(String version) {
		this.version = version;
	}
	
	public Date getTrainingDate() {
		return trainingDate;
	}
	
	public void setTrainingDate(Date trainingDate) {
		this.trainingDate = trainingDate;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Float getAccuracy() {
		return accuracy;
	}
	
	public void setAccuracy(Float accuracy) {
		this.accuracy = accuracy;
	}
	
	public OpenState getOpenstate() {
		return openstate;
	}
	
	public void setOpenstate(OpenState openstate) {
		this.openstate = openstate;
	}
	
	@Override
	public String toString() {
		return "Aimodel [idModel=" + idModel + ", name=" + name + ", version=" + version + ", trainingDate="
				+ trainingDate + ", email=" + email + ", accuracy=" + accuracy + "]";
	}
}