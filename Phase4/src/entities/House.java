package entities;
import java.util.*;

public class House {
	private String name;
	private School school;
	private Vector<Student> students;
	private Professor headTeacher;
	private ArrayList<String> qualities;
	private Map<Integer, Student> prefects;
	
	
	public House() {}
	
	public House(String _name) {
		this(_name, null, null, null, null, null);
	}
	
	public House(String _name, School _school, Vector<Student> _students, Professor _headTeacher, ArrayList<String> _qualities, Map<Integer, Student> _prefects) {
		name = _name;
		school = _school;
		students = _students;
		headTeacher = _headTeacher;
		qualities = _qualities;
		prefects = _prefects;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String _name) {
		name = _name;
	}
	
	public School getSchool() {
		return school;
	}
	
	public void setSchool(School _school) {
		school = _school;
	}
	
	public Vector<Student> getStudents() {
		return students;
	}
	
	public void setStudents(Vector<Student> _students) {
		students = (Vector<Student>) _students.clone();
	}
	
	public void addStudent(Student studentName) {
		students.add(studentName);
	}
	
	public void addStudent(Vector<Student> _students) {
		if(students != null) {
			for(int i = 0; i < _students.size(); i++)
				students.add(_students.get(i));
		}
		else 
			students = (Vector<Student>) _students.clone();
	}
	
	public Professor getHeadTeacher() {
		return headTeacher;
	}
	
	public void setHeadTeacher(Professor _headTeacher) {
		headTeacher = _headTeacher;
	}
	
	public ArrayList<String> getQualities() {
		return qualities;
	}
	
	public void setQualities(ArrayList<String> _qualities) {
		qualities = (ArrayList<String>) _qualities.clone();
	}
	
	public void addQuality(String quality) {
		if(qualities == null)
			qualities = new ArrayList<String>();
		
		qualities.add(quality);
	}
	
	public Map<Integer, Student> getPrefects() {
		return prefects;
	}
	
	public void setPrefects(Map<Integer, Student> _prefects) {
		prefects = _prefects;
	}
	
	public void addPrefect(Student student, Integer year) {
		prefects.put(year, student);
	}
}
