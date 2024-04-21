package com.rishika.springJwt.dto;


public class Doctors {

	private long id;
	private String docName;
	private String specialization;
	private String availability;
	
	public Doctors() {
		super();
	}

	public Doctors(long id, String docName, String specialization, String availability) {
		super();
		this.id = id;
		this.docName = docName;
		this.specialization = specialization;
		this.availability = availability;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDocName() {
		return docName;
	}

	public void setDocName(String docName) {
		this.docName = docName;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public String getAvailability() {
		return availability;
	}

	public void setAvailability(String availability) {
		this.availability = availability;
	}
	
	
}
