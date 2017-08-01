package io.java.login_service.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.java.login_service.model.Student;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;

	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping("/students")
	public List<Student> getAllStudents() {
		return studentService.getAllStudents();

	}

	@RequestMapping("/students/{id}")
	public Student getStudent(@PathVariable Number id) {
		return studentService.getStudent(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/students")
	public void addStudent(@RequestBody Student student) {
		studentService.createStudent(student);

	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/students/{id}")
	public void removeStudent(@PathVariable Number id) {
		studentService.deleteStudent(id);
	}
}
