package entities;
import java.util.*;

public class Student extends Person{
	private Vector<Course> courses;
	private Vector<FinishedCourse> reportCard;
	
	
	public Student() {}
	
	public Student(String _name) {
		super(_name, null, BloodStatus.Unknown, null, null);
	}
	
	public Student(String _name, House _house, BloodStatus _bloodStatus, School _school, Date _birthday, Vector<Course> _courses, Vector<FinishedCourse> _reportCard) {
		super(_name, _house, _bloodStatus, _school, _birthday);
		
		if(_courses != null)
			courses = (Vector<Course>) _courses.clone();
		else
			courses = null;
		
		if(_reportCard != null)
			reportCard = (Vector<FinishedCourse>) _reportCard.clone();
		else
			reportCard = null;
	}
	
	
	public Vector<Course> getCourses() {
		return courses;
	}
	
	public void setCourses(Vector<Course> _courses) {
		courses = _courses;
	}
	
	public Vector<FinishedCourse> getReportCard() {
		return reportCard;
	}
	
	public void setReportCard(Vector<FinishedCourse> _reportCard) {
		reportCard = _reportCard;
	}
}
