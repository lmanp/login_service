package io.java.login_service.model;

import java.util.Date;

public class TeachStaff {

	private Number id;
	private String name;
	private Date dob;
	private Number grade;
	private String subject;

	public TeachStaff() {

	}

	public TeachStaff(Number id, String name, Date dob, Number grade, String subject) {

		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.grade = grade;
		this.subject = subject;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Number getGrade() {
		return grade;
	}

	public void setGrade(Number grade) {
		this.grade = grade;
	}

	public Date getDob() {
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
