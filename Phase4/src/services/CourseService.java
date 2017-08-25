package services;

import entities.*;

public class CourseService {
	private Course course;

	
	public CourseService() {}
	
	public CourseService(Course _course) {
		course = _course;
	}
	
	public Course getCourse() {
		return course;
	}

	public void setCourse(Course _course) {
		course = _course;
	}
}
