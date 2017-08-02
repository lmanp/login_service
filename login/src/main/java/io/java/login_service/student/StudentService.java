package io.java.login_service.student;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import io.java.login_service.model.Student;

@Service
public class StudentService {

	List<Student> students = new ArrayList<>(Arrays.asList(new Student(1, "priya", this.getDate("07-22-1992"), 6),
			new Student(2, "abhi", this.getDate("10-15-1992"), 9),
			new Student(3, "ammulu", this.getDate("09-11-1992"), 7),
			new Student(4, "Janu", this.getDate("02-09-1994"), 4)));

	public List<Student> getAllStudents() {
		return students;
	}

	public Student getStudent(int id) {
		return students.stream().filter(s -> s.getId() == id).findFirst().get();
	}

	public void createStudent(Student student) {
		students.add(student);
	}

	public void deleteStudent(int id) {
		students.removeIf(s -> s.getId() == id);
	}

	private LocalDate getDate(String date) {
		DateTimeFormatter df =
                DateTimeFormatter.ofPattern("MM-dd-yyyy");
		LocalDate parsedDate = LocalDate.parse(date, df);
		System.out.println("Parsed LocalDate ::" + parsedDate);
		return parsedDate;
	}

}
