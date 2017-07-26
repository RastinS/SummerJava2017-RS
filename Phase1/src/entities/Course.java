package entities;
import java.util.*;

public class Course {
	private String name;
	private char min_grade;
	private String professor_name;
	private int year;
	private Vector<String> student_names;
	
	public Course(String _name) {
		name = _name;
		student_names = new Vector<String>();
	}
	
	public Course(String _name, String _professor_name, char _min_grade, int _year) {
		name = _name;
		min_grade = _min_grade;
		professor_name = _professor_name;
		year = _year;
		student_names = new Vector<String>();
	}
	
	public Course(String _name, char _min_grade, String _professor_name, int _year, Vector<String> _student_names) {
		name = _name;
		min_grade = _min_grade;
		professor_name = _professor_name;
		year = _year;
		student_names = (Vector<String>) _student_names.clone();
	}
	
	public void set_name(String _name) {
		name = _name;
	}
	
	public String get_name() {
		return name;
	}
	
	public void set_min_grade(char _min_grade) {
		min_grade = _min_grade;
	}
	
	public char get_min_grade() {
		return min_grade;
	}
	
	public void set_professor_name(String _professor_name) {
		professor_name = _professor_name;
	}
	
	public String get_professor_name() {
		return professor_name;
	}
	
	public void set_year(int _year) {
		year = _year;
	}
	
	public int get_year() {
		return year;
	}
	
	public void add_student(String student_name) {
		student_names.add(student_name);
	}
	
	public void add_students(Vector<String> _student_names) {
		for(int i = 0; i < _student_names.size(); i++)
			student_names.add(_student_names.get(i));
	}
	
	public void set_student_names(Vector<String> _student_names) {
		student_names = (Vector<String>) _student_names.clone();
	}

	public Vector<String> get_student_names() {
		return student_names;
	}
}
