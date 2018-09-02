package de.felix.rezepte.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Rezept {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int rezeptId;
	private String name;
	private String details;
	
	public Rezept() {
		
	}
	
	public Rezept(String name, String details, String status) {
		super();
		this.name = name;
		this.details = details;
		Status = status;
	}
	
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	private String Status;
	
	public int getRezeptId() {
		return rezeptId;
	}
	public void setRezeptId(int rezeptId) {
		this.rezeptId = rezeptId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	
}
