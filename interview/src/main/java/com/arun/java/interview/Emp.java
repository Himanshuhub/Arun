package com.arun.java.interview;

import lombok.Data;

@Data
public class Emp {
	private int id = 0;
	private String name = "";
	private int sal = 0;
	private String city = "";
	private double experience = 0;
	private String dept = "";
	private String contact = "";

	
	public Emp(int id, String name, int sal, String city, double experience, String dept, String contact) {
		this.name = name;
		this.sal = sal;
		this.city = city;
		this.experience = experience;
		this.dept = dept;
		this.contact = contact;
	}

	public int getId() {
		return id;
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

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getExperience() {
		return experience;
	}

	public void setExperience(double experience) {
		this.experience = experience;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

}
