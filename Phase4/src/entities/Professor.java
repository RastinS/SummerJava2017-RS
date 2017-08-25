package entities;
import java.util.*;

public class Professor extends Person {
	
	private Map<Integer, Course> courses;
	private String notes;
	
	
	public Professor() {}
	
	public Professor(String _name) {
		super(_name, null, BloodStatus.Unknown, null, null);
	}
	
	public Professor(String _name, House _house, BloodStatus _bloodStatus, School _school, Date _birthday, Map<Integer, Course> _courses, String _notes) {
		super(_name, _house, _bloodStatus, _school, _birthday);
		courses = _courses;
		notes = _notes;
	}
	
	
	public Map<Integer, Course> getCourses() {
		return courses;
	}
	
	public void setCourses(Map<Integer, Course> _courses) {
		courses = _courses;
	}
	
	public String getNotes() {
		return notes;
	}
	
	public void setNotes(String _notes) {
		notes = _notes;
	}
}
