package tests;

import java.util.Vector;

import entities.*;

public class FinishedCourseTest {
	
static FinishedCourse potions;
	
	public static void main(String[] args) {
		System.out.println(nameTest());
		System.out.println(minGradeTest());
		System.out.println(professorTest());
		System.out.println(yearTest());
		System.out.println(studentsTest());
		System.out.println(gradeTest());
		System.out.println(isPassedTest());
	}
	
	static boolean nameTest() {
		potions = new FinishedCourse("potions");
		String expected = "potions";
		String actual = potions.getName();
		if(!actual.equals(expected))
			return false;
		
		potions = new FinishedCourse();
		potions.setName("chemistry");
		expected = "chemistry";
		actual = potions.getName();
		if(!actual.equals(expected))
			return false;
		
		return true;
	}
	
	static boolean minGradeTest() {
		potions = new FinishedCourse("potions", null, Grade.O, 1998, null, null, false);
		Grade expected = Grade.O;
		Grade actual = potions.getMinGrade();
		if(!actual.equals(expected))
			return false;
		
		potions = new FinishedCourse();
		potions.setMinGrade(Grade.O);
		expected = Grade.O;
		actual = potions.getMinGrade();
		if(!actual.equals(expected))
			return false;
		
		return true;
	}

	static boolean professorTest() {
		Professor professor = new Professor("Albus");
		potions = new FinishedCourse("potions", professor, Grade.O, 1998, null, null, false);
		Professor expected = professor;
		Professor actual = potions.getProfessor();
		if(!actual.equals(expected))
			return false;
		
		potions = new FinishedCourse();
		potions.setProfessor(professor);
		expected = professor;
		actual = potions.getProfessor();
		if(!actual.equals(expected))
			return false;
		
		return true;
	}
	
	static boolean yearTest() {
		potions = new FinishedCourse("potions", null, Grade.O, 1998, null, null, false);
		int expected = 1998;
		int actual = potions.getYear();
		if(actual != expected)
			return false;
		
		potions = new FinishedCourse();
		potions.setYear(1998);
		expected = 1998;
		actual = potions.getYear();
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
		potions = new FinishedCourse("potions", null, Grade.O, 1998, students, null, false);
		Vector<Student> expected = students;
		Vector<Student> actual = potions.getStudents();
		if(!actual.equals(expected))
			return false;
		
		potions = new FinishedCourse();
		potions.setStudents(students);
		expected = students;
		actual = potions.getStudents();
		if(!actual.equals(expected))
			return false;
		
		return true;
	}
	
	static boolean gradeTest() {
		potions = new FinishedCourse("potions", null, Grade.T, 1998, null, Grade.O, false);
		Grade expected = Grade.O;
		Grade actual = potions.getGrade();
		if(!actual.equals(expected))
			return false;
		
		potions = new FinishedCourse();
		potions.setGrade(Grade.O);
		expected = Grade.O;
		actual = potions.getGrade();
		if(!actual.equals(expected))
			return false;
		
		return true;
	}
	
	static boolean isPassedTest() {
		potions = new FinishedCourse("potions", null, Grade.O, 1998, null, null, false);
		boolean expected = false;
		boolean actual = potions.isPassed();
		if(actual != expected)
			return false;
		
		potions = new FinishedCourse();
		potions.setPassed(true);
		expected = true;
		actual = potions.isPassed();
		if(actual != expected)
			return false;
		
		return true;
	}
}
