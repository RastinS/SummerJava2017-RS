package tests;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

import entities.*;

public class HouseTest {

	static House gryfendor;
	
	public static void main(String[] args) {
		System.out.println(nameTest());
		System.out.println(schoolTest());
		System.out.println(studentsTest());
		System.out.println(headTeacherTest());
		System.out.println(qualitiesTest());
		System.out.println(prefectsTest());
	}
	
	static boolean nameTest() {
		gryfendor = new  House("Gryfendor");
		String expected = "Gryfendor";
		String actual  = gryfendor.getName();
		if(!actual.equals(expected))
			return false;
		
		gryfendor = new House();
		gryfendor.setName("NewGryfendor");
		expected = "NewGryfendor";
		actual = gryfendor.getName();
		if(!actual.equals(expected))
			return false;
		
		return true;
	}
	
	static boolean schoolTest() {
		School hogwarts = new School();
		gryfendor = new House("Gryfendor", hogwarts, null, null, null, null);
		School expected = hogwarts;
		School actual = gryfendor.getSchool();
		if(!actual.equals(expected))
			return false;
		
		School foggyDogHouse = new School();
		gryfendor.setSchool(foggyDogHouse);
		expected = foggyDogHouse;
		actual = gryfendor.getSchool();
		if(!actual.equals(expected))
			return false;
		
		return true;
	}
	
	static boolean studentsTest() {
		Vector<Student> students = new Vector<Student>();
		students.add(new Student("Harry Potter"));
		students.add(new Student("Ron"));
		students.add(new Student("Neville"));
		students.add(new Student("Hermione"));
		gryfendor = new House("Gryfendor", null, students, null, null, null);
		Vector<Student> expected = students;
		Vector<Student> actual = gryfendor.getStudents();
		if(!actual.equals(expected))
			return false;
		
		gryfendor = new House();
		gryfendor.setStudents(students);
		expected = students;
		actual = gryfendor.getStudents();
		if(!actual.equals(expected))
			return false;
		
		return true;
	}
	
	static boolean headTeacherTest() {
		Professor snape = new Professor("snape");
		gryfendor = new House("Gryfendor", null, null, snape, null, null);
		Professor expected = snape;
		Professor actual  = gryfendor.getHeadTeacher();
		if(!actual.equals(expected))
			return false;
		
		gryfendor = new House();
		gryfendor.setHeadTeacher(snape);
		expected = snape;
		actual = gryfendor.getHeadTeacher();
		if(!actual.equals(expected))
			return false;
		
		return true;
	}
	
	static boolean qualitiesTest() {
		ArrayList<String> qualities = new ArrayList<String>();
		qualities.add("Good deeds");
		qualities.add("Wise");
		qualities.add("Considerate");
		gryfendor = new House("Gryfendor", null, null, null, qualities, null);
		ArrayList<String> expected = qualities;
		ArrayList<String> actual = gryfendor.getQualities();
		if(!actual.equals(expected))
			return false;
		
		gryfendor = new House();
		gryfendor.setQualities(qualities);
		expected = qualities;
		actual = gryfendor.getQualities();
		if(!actual.equals(expected))
			return false;
		
		return true;
	}
	
	static boolean prefectsTest() {
		Map<Integer, Student> prefects = new HashMap<Integer, Student>();
		prefects.put(2005, new Student("Harry Potter"));
		prefects.put(2006, new Student("Ron"));
		gryfendor = new House("Gryfendor", null, null, null, null, prefects);
		Map<Integer, Student> expected = prefects;
		Map<Integer, Student> actual = gryfendor.getPrefects();
		if(!actual.equals(expected))
			return false;
		
		gryfendor = new House();
		gryfendor.setPrefects(prefects);
		expected = prefects;
		actual = gryfendor.getPrefects();
		if(!actual.equals(expected))
			return false;
		
		return true;
	}
}
