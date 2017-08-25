package entities;
import java.util.*;

public class School {
	private String name;
	private int numOfStudents;
	private boolean housed;
	private ArrayList<House> houses;
	private Vector<Student> students;
	private Vector<Professor> professors;
	private ArrayList<Course> courses;
	private String location;
	
	
	public School() {
		this("", null, null, "", null, null);
	}
	
	public School(String _name) {
		this(_name, null, null, "", null, null);
	}
	
	public School(String _name, ArrayList<House> _houses, ArrayList<Course> _courses, String _location, Vector<Student> _students, Vector<Professor> _professors) {
		name = _name;
		
		if(_houses != null)
			houses = (ArrayList<House>) _houses.clone();
		else
			houses = null;
		
		if(_courses != null)
			courses = (ArrayList<Course>) _courses.clone();
		else
			courses = null;
		
		if(_students != null) {
			students = (Vector<Student>) _students.clone();
			numOfStudents = students.size();
		}
		else {
			students = null;
			numOfStudents = 0;
		}
		
		if(_professors != null)
			professors = (Vector<Professor>) _professors.clone();
		else
			professors = null;
		
		location = _location;
	}
	

	public void setName(String _name) {
		name = _name;
	}
	
	public String getName() {
		return name;
	}
	
	public int getNumOfStudents() {
		return numOfStudents;
	}
	
	public boolean isHoused() {
		return housed;
	}
	
	public void setHouses(ArrayList<House> _houses) {
		houses = (ArrayList<House>) _houses.clone();
	}
	
	public void addHouse(House house) {
		houses.add(house);
	}
	
	public ArrayList<House> getHouses() {
		return houses;
	}
	
	public void setStudents(Vector<Student> _students) {
		students = (Vector<Student>) _students.clone();
		numOfStudents = students.size();
	}
	
	public void addStudent(Student studentName) {
		students.add(studentName);
		numOfStudents++;
	}
	
	public void addStudent(Vector<Student> _students) {
		if(students != null) {
			for(int i = 0; i < _students.size(); i++) {
				students.add(_students.get(i));
			}
			numOfStudents += _students.size();
		}
		
		else {
			students = (Vector<Student>) _students.clone();
			numOfStudents = students.size();
		}
	}
	
	public Vector<Student> getStudents() {
		return students;
	}
	
	public void setProfessors(Vector<Professor> _professors) {
		professors = (Vector<Professor>) _professors.clone();
	}
	
	public void add_professor(Professor professorName) {
		professors.add(professorName);
	}
	
	public Vector<Professor> getProfessors() {
		return professors;
	}
	
	public void setCourses(ArrayList<Course> _courses) {
		courses = (ArrayList<Course>) _courses.clone();
	}
	
	public void add_course(Course course) {
		courses.add(course);
	}
	
	public ArrayList<Course> getCourses() {
		return courses;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String _location) {
		location = _location;
	}
}
