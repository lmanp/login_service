package io.java.login_service.model;

import java.text.ParseException;
import java.util.Date;

public class Student {
	
	private Number id;
	private String name;
	private Date dob;
	private Number grade;
	
	public Student() {
		
	}
	
	public Student(Number id , String name , Date dob , Number grade) {
		
		super();
		this.id=id;
		this.name=name;
		this.dob=dob;
		this.grade=grade;
	}
	
	public Number getGrade() {
		return grade;
	}
	public void setGrade(Number grade) {
		this.grade = grade;
	}
	public Date getDob() throws ParseException{
		 return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Number getId() {
		return id;
	}
	public void setId(Number id) {
		this.id = id;
	}

}
