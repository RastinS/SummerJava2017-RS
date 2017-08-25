package entities;
import java.util.*;

public class FinishedCourse extends Course{
	private Grade grade;
	private boolean passed;
	
	
	public FinishedCourse() {}
	
	public FinishedCourse(String _name) {
		super(_name);
	}
	
	public FinishedCourse(String _name, Professor _professor, Grade _minGrade, int _year, Vector<Student> _students, Grade _grade, boolean _passed) {
		super(_name, _professor, _minGrade, _year, _students);
		
		grade = _grade;
		passed = _passed;
	}
	
	public FinishedCourse(Course course, Grade _grade, boolean _passed) {
		super(course.getName(), course.getProfessor(), course.getMinGrade(), course.getYear(), course.getStudents());
		
		grade = _grade;
		passed = _passed;
	}
	
	
	public Grade getGrade() {
		return grade;
	}
	
	public void setGrade(Grade _grade) {
		grade = _grade;
	}
	
	public boolean isPassed() {
		return passed;
	}
	
	public void setPassed(boolean _passed) {
		passed = _passed;
	}
}
