package tests;


import java.text.ParseException;
import java.util.ArrayList;
import java.util.Vector;

import entities.*;

public class SchoolTest {

	static School hogwarts;
	
	public static void main(String[] args) throws ParseException {
		System.out.println(nameTest());
		System.out.println(coursesTest());
		System.out.println(housesTest());
		System.out.println(studentsTest());
		System.out.println(professorsTest());
	}

	static boolean nameTest()
	{
		hogwarts = new School("Hogwarts");
		String expected = "Hogwarts";
		String actual = hogwarts.getName();
		if(!actual.equals(expected))
			return false;
		
		hogwarts = new School();
		hogwarts.setName("Hogwarts");
		expected = "Hogwarts";
		actual = hogwarts.getName();
		if(!actual.equals(expected))
			return false;
		
		return true;
	}
	
	static boolean coursesTest()
	{
		ArrayList<Course> courses = new ArrayList<Course>();
		courses.add(new Course("Potions"));
		courses.add(new Course("Divination"));
		courses.add(new Course("Magical Creatures"));
		courses.add(new Course("Defense Against The Dark Arts"));

		hogwarts = new School("Hogwarts", null, courses, null, null, null);
		ArrayList<Course> actual = hogwarts.getCourses();
		ArrayList<Course> expected = courses;
		if(!actual.equals(expected))
			return false;
		
		hogwarts = new School("Hogwarts");
		hogwarts.setCourses(courses);
		actual = hogwarts.getCourses();
		expected = courses;
		if(!actual.equals(expected))
			return false;
		
		return true;
	}
	
	static boolean housesTest()
	{
		ArrayList<House> houses = new ArrayList<House>();
		houses.add(new House("Gryffindor"));
		houses.add(new House("Hufflepuff"));
		houses.add(new House("Ravenclaw"));
		houses.add(new House("Slytherin"));
		hogwarts = new School("Hogwarts", houses, null, null, null, null);
		ArrayList<House> actual = hogwarts.getHouses();
		ArrayList<House> expected = houses;
		if(!actual.equals(expected))
			return false;
		
		hogwarts = new School("Hogwarts");
		hogwarts.setHouses(houses);
		actual = hogwarts.getHouses();
		expected = houses;
		if(!actual.equals(expected))
			return false;
		
		return true;
	}
	
	static boolean studentsTest()
	{
		Vector<Student> students = new Vector<Student>();
		students.add(new Student("Harry Potter"));
		students.add(new Student("Luna Lovegood"));
		students.add(new Student("Lucius Malfoy"));
		hogwarts = new School("Hogwarts", null, null, null, students, null);
		
		Vector<Student> actual = hogwarts.getStudents();
		Vector<Student> expected = students;
		if(!actual.equals(expected))
			return false;
		
		hogwarts = new School("Hogwarts");
		hogwarts.setStudents(students);
		actual = hogwarts.getStudents();
		expected = students;
		if(!actual.equals(expected))
			return false;
		
		return true;
	}
	
	static boolean professorsTest()
	{
		Vector<Professor> professors = new Vector<Professor>();
		professors.add(new Professor("Severus Snape"));
		professors.add(new Professor("Albus Dumbledore"));
		professors.add(new Professor("Minerva McGonnagol"));
		hogwarts = new School("Hogwarts", null, null, null, null, professors);
		
		Vector<Professor> actual = hogwarts.getProfessors();
		Vector<Professor> expected = professors;
		if(!actual.equals(expected))
			return false;
		
		hogwarts = new School("Hogwarts");
		hogwarts.setProfessors(professors);
		actual = hogwarts.getProfessors();
		expected = professors;
		if(!actual.equals(expected))
			return false;
		
		return true;
	}
}
