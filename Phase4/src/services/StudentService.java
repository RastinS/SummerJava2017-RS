package services;

import entities.*;

public class StudentService {
	private Student student;
	
	StudentService() {}
	
	StudentService(Student _student) {
		student = _student;
	}
	
	
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student _student) {
		student = _student;
	}
	
	public void sortToHouse(House house) {
		student.setHouse(house);
	}
}
