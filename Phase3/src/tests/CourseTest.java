package tests;

import java.util.*;
import entities.*;

public class CourseTest {
	
	static Course flying;
	
	public static void main(String[] args) {
		System.out.println(nameTest());
		System.out.println(minGradeTest());
		System.out.println(professorTest());
		System.out.println(yearTest());
		System.out.println(studentsTest());
	}
	
	static boolean nameTest() {
		flying = new Course("flying");
		String expected = "flying";
		String actual = flying.getName();
		if(!actual.equals(expected))
			return false;
		
		flying = new Course();
		flying.setName("chemistry");
		expected = "chemistry";
		actual = flying.getName();
		if(!actual.equals(expected))
			return false;
		
		return true;
	}
	
	static boolean minGradeTest() {
		flying = new Course("flying", null, Grade.O, 1998);
		Grade expected = Grade.O;
		Grade actual = flying.getMinGrade();
		if(!actual.equals(expected))
			return false;
		
		flying = new Course();
		flying.setMinGrade(Grade.O);
		expected = Grade.O;
		actual = flying.getMinGrade();
		if(!actual.equals(expected))
			return false;
		
		return true;
	}

	static boolean professorTest() {
		Professor professor = new Professor("Albus");
		flying = new Course("flying", professor, Grade.O, 1998);
		Professor expected = professor;
		Professor actual = flying.getProfessor();
		if(!actual.equals(expected))
			return false;
		
		flying = new Course();
		flying.setProfessor(professor);
		expected = professor;
		actual = flying.getProfessor();
		if(!actual.equals(expected))
			return false;
		
		return true;
	}
	
	static boolean yearTest() {
		flying = new Course("flying", null, Grade.O, 1998);
		int expected = 1998;
		int actual = flying.getYear();
		if(actual != expected)
			return false;
		
		flying = new Course();
		flying.setYear(1998);
		expected = 1998;
		actual = flying.getYear();
		if(actual != expected)
			return false;
		
		return true;
	}
	
	static boolean studentsTest() {
		Vector<Student> students = new Vector<Student>();
		students.add(new Student("Harry Potter"));
		students.add(new Student("Ron"));
		students.add(new Student("Neville"));
		students.add(new Student("Hermione"));
		flying = new Course("flying", null, Grade.O, 1998, students);
		Vector<Student> expected = students;
		Vector<Student> actual = flying.getStudents();
		if(!actual.equals(expected))
			return false;
		
		flying = new Course();
		flying.setStudents(students);
		expected = students;
		actual = flying.getStudents();
		if(!actual.equals(expected))
			return false;
		
		return true;
	}
}