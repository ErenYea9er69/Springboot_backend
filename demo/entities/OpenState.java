package com.models.demo.entities;

import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class OpenState {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idstate;
	private String nomstate;
	private String descriptionState;
	
	@JsonIgnore
	@OneToMany(mappedBy = "openstate")
	private List<Aimodel> Aimodels;
	
	public OpenState() {
		super();
	}
	
	public OpenState(String nomstate, String descriptionState) {
		super();
		this.nomstate = nomstate;
		this.descriptionState = descriptionState;
	}
	
	public Long getIdstate() {
		return idstate;
	}
	
	public void setIdstate(Long idstate) {
		this.idstate = idstate;
	}
	
	public String getNomstate() {
		return nomstate;
	}
	
	public void setNomstate(String nomstate) {
		this.nomstate = nomstate;
	}
	
	public String getDescriptionState() {
		return descriptionState;
	}
	
	public void setDescriptionState(String descriptionState) {
		this.descriptionState = descriptionState;
	}
	
	public List<Aimodel> getAimodels() {
		return Aimodels;
	}
	
	public void setAimodels(List<Aimodel> aimodels) {
		Aimodels = aimodels;
	}
}
