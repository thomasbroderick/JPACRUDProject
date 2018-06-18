package com.skilldistillery.jpacrud.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Unit {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String country;
	private String headquarters;
	@Column(name = "founding_date")
	private Date foundingDate;
	private int size;
	private String specializations;

	

	public Unit() {
	}

	public Unit(int id, String name, String country, String headquarters, Date foundingDate, int size,
			String specializations) {
		super();
		this.id = id;
		this.name = name;
		this.country = country;
		this.headquarters = headquarters;
		this.foundingDate = foundingDate;
		this.size = size;
		this.specializations = specializations;
	}

	// getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getHeadquarters() {
		return headquarters;
	}

	public void setHeadquarters(String headquarters) {
		this.headquarters = headquarters;
	}

	public Date getFoundingDate() {
		return foundingDate;
	}

	public void setFoundingDate(Date foundingDate) {
		this.foundingDate = foundingDate;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getSpecializations() {
		return specializations;
	}

	public void setSpecializations(String specializations) {
		this.specializations = specializations;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Unit [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", country=");
		builder.append(country);
		builder.append(", headquarters=");
		builder.append(headquarters);
		builder.append(", foundingDate=");
		builder.append(foundingDate);
		builder.append(", size=");
		builder.append(size);
		builder.append(", specializations=");
		builder.append(specializations);
		builder.append("]");
		return builder.toString();
	}

}
