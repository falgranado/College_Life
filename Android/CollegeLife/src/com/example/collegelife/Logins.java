package com.example.collegelife;

import java.util.List;

public class Logins {
	
	private String ID;
	private String password;
	private String name;
	private String email;
	private List<Course> courses;
	

	public Logins(String iD, String password, String name, String email, List<Course> courses) {
		super();
		this.ID = iD;
		this.password = password;
		this.name = name;
		this.email = email;
		this.courses = courses;
	}

	public String getNumID() {
		return ID;
	}

	public void setNumID(String ID) {
		this.ID = ID;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
}
