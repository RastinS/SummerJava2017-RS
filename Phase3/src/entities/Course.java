package entities;
import java.util.*;

public class Course {
	private String name;
	private Grade minGrade;
	private Professor professor;
	private int year;
	private Vector<Student> students;
	
	
	public Course() {
		this("", null, Grade.T, 0, null);
	}
	public Course(String _name) {
		this(_name, null, Grade.T, 0, null);
	}
	
	public Course(String _name, Professor _professor, Grade _minGrade, int _year) {
		this(_name, _professor, _minGrade, _year, null);
	}
	
	public Course(String _name, Professor _professor, Grade _minGrade, int _year, Vector<Student> _students) {
		name = _name;
		minGrade = _minGrade;
		professor = _professor;
		year = _year;
		if(_students != null)
			students = (Vector<Student>) _students.clone();
		else
			students = null;
	}
	
	
	public void setName(String _name) {
		name = _name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setMinGrade(Grade _minGrade) {
		minGrade = _minGrade;
	}
	
	public Grade getMinGrade() {
		return minGrade;
	}
	
	public void setProfessor(Professor _professor) {
		professor = _professor;
	}
	
	public Professor getProfessor() {
		return professor;
	}
	
	public void setYear(int _year) {
		year = _year;
	}
	
	public int getYear() {
		return year;
	}
	
	public void addStudent(Student student) {
		students.add(student);
	}
	
	public void addStudents(Vector<Student> _students) {
		if(students != null) {
			for(int i = 0; i < _students.size(); i++)
				students.add(_students.get(i));
		}
		
		else {
			students = (Vector<Student>) _students.clone();
		}
	}
	
	public void setStudents(Vector<Student> _students) {
		students = (Vector<Student>) _students.clone();
	}

	public Vector<Student> getStudents() {
		return students;
	}
}
