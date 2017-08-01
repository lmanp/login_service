package io.java.login_service.student;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import io.java.login_service.model.Student;

@Service
public class StudentService {
	
	DateFormat df = new SimpleDateFormat("MM-dd-yyyy");
	
	List<Student> students= Arrays.asList(
			new Student(1, "priya" , df.parse("07-22-1992") , 6),
			new Student(2 , "abhi" , null , 9),
			new Student(3 , "ammulu" , null , 7),
			new Student(4 , "Janu" , null , 4)
			);
	
	public List<Student> getAllStudents(){
		return students;
	}
		
	public Student getStudent(Number id) {
		return students.stream().filter(s->s.getId().equals(id)).findFirst().get();
	}

	public void createStudent(Student student) {
		students.add(student);
	}

	public void deleteStudent(Number id) {
		students.removeIf(s->s.getId().equals(id));
	}
	

}
