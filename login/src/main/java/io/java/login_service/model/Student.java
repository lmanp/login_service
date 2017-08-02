package io.java.login_service.model;

import java.time.LocalDate;

import javax.validation.constraints.*;

import org.springframework.format.annotation.DateTimeFormat;

public class Student {

	private int id;
	
	@NotNull
	@Size(min=5,max=30)
	private String name;
	
	@NotNull
	@DateTimeFormat(pattern="MM-dd-yyyy")
	private LocalDate dob;
	
	@NotNull
	@Min(1) @Max(10)
	private int grade;

	public Student() {

	}

	public Student(int id, String name, LocalDate dob, int grade) {

		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.grade = grade;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
