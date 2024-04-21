package com.rishika.springJwt.dto;


public class Patients {

	private String id;
	private String name;
	private String age;
	private String bloodGroup;
	private String prescription;
	private String dose;
	private String fees;
	public Patients() {
		super();
	}
	public Patients(String id, String name, String age, String bloodGroup, String prescription, String dose,
			String fees) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.bloodGroup = bloodGroup;
		this.prescription = prescription;
		this.dose = dose;
		this.fees = fees;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public String getPrescription() {
		return prescription;
	}
	public void setPrescription(String prescription) {
		this.prescription = prescription;
	}
	public String getDose() {
		return dose;
	}
	public void setDose(String dose) {
		this.dose = dose;
	}
	public String getFees() {
		return fees;
	}
	public void setFees(String fees) {
		this.fees = fees;
	}
	
	
}
