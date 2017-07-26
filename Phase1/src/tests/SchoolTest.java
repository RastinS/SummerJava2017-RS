package tests;


import java.util.ArrayList;
import java.util.Vector;
import org.junit.Assert;
import org.junit.Test;

import entities.School;

public class SchoolTest {

	private School hogwarts;

	@Test
	public void getNameTest()
	{
		hogwarts = new School("Hogwarts");
		String expected = "Hogwarts";
		String actual = hogwarts.get_name();
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void getCoursesTest()
	{
		ArrayList<String> courses = new ArrayList<String>();
		courses.add("Potions");
		courses.add("Divination");
		courses.add("Magical Creatures");
		courses.add("Defense Against The Dark Arts");
		courses.add("Transfiguration");
		courses.add("Charms");
		courses.add("Astronomy");
		courses.add("Flying");
		courses.add("Herbology");
		courses.add("History of Magic");

		hogwarts = new School("Hogwarts", null, courses, null, null, null);
		ArrayList<String> actual = hogwarts.get_course_names();
		ArrayList<String> expected = courses;
		Assert.assertArrayEquals(expected.toArray(), actual.toArray());
	}
	@Test
	public void getHousesTest()
	{
		ArrayList<String> houses = new ArrayList<String>();
		houses.add("Gryffindor");
		houses.add("Hufflepuff");
		houses.add("Ravenclaw");
		houses.add("Slytherin");
		hogwarts = new School("Hogwarts", houses, null, null, null, null);
		ArrayList<String> actual = hogwarts.get_house_names();
		ArrayList<String> expected = houses;
		Assert.assertEquals(expected, actual);
				
	}
	@Test
	public void getStudentsTest()
	{
		Vector<String> students = new Vector<String>();
		students.add("Harry Potter");
		students.add("Luna Lovegood");
		students.add("Lucius Malfoy");
		hogwarts = new School("Hogwarts", null, null, null, students, null);
		
		Vector<String> actual = hogwarts.get_student_names();
		Vector<String> expected = students;
		Assert.assertArrayEquals(expected.toArray(), actual.toArray());		
	}
	@Test
	public void getProfessorsTest()
	{
		/*public School(String name, ArrayList<String> houses, ArrayList<String> course#s,
		ArrayList<Integer> years, Vector<String> students, Vector<String> professors)*/
		Vector<String> professors = new Vector<String>();
		professors.add("Severus Snape");
		professors.add("Albus Dumbledore");
		professors.add("Minerva McGonnagol");
		hogwarts = new School("Hogwarts", null, null, null, null, professors);
		
		Vector<String> actual = hogwarts.get_professor_names();
		Vector<String> expected = professors;
		Assert.assertArrayEquals(expected.toArray(), actual.toArray());

	}

	@Test
	public void setCoursesTest()
	{
		ArrayList<String> courses = new ArrayList<String>();
		courses.add("Potions");
		courses.add("Divination");
		courses.add("Magical Creatures");
		courses.add("Defense Against The Dark Arts");
		courses.add("Transfiguration");
		courses.add("Charms");
		courses.add("Astronomy");
		courses.add("Flying");
		courses.add("Herbology");
		courses.add("History of Magic");

		hogwarts = new School("Hogwarts");
		hogwarts.set_course_names(courses);
		ArrayList<String> actual = hogwarts.get_course_names();
		ArrayList<String> expected = courses;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void setHousesTest()
	{
		ArrayList<String> houses = new ArrayList<String>();
		houses.add("Gryffindor");
		houses.add("Hufflepuff");
		houses.add("Ravenclaw");
		houses.add("Slytherin");
		hogwarts = new School("Hogwarts");
		hogwarts.set_house_names(houses);
		ArrayList<String> actual = hogwarts.get_house_names();
		ArrayList<String> expected = houses;
		Assert.assertArrayEquals(expected.toArray(), actual.toArray());
				
	}
	@Test
	public void setStudentsTest()
	{
		Vector<String> students = new Vector<String>();
		students.add("Harry Potter");
		students.add("Luna Lovegood");
		students.add("Lucius Malfoy");
		hogwarts = new School("Hogwarts");
		hogwarts.set_student_names(students);
		Vector<String> actual = hogwarts.get_student_names();
		Vector<String> expected = students;
		Assert.assertArrayEquals(expected.toArray(), actual.toArray());
		
	}
	@Test
	public void setProfessorsTest()
	{
		Vector<String> professors = new Vector<String>();
		professors.add("Severus Snape");
		professors.add("Albus Dumbledore");
		professors.add("Minerva McGonnagol");
		hogwarts = new School("Hogwarts");
		hogwarts.set_professor_names(professors);
		
		Vector<String> actual = hogwarts.get_professor_names();
		Vector<String> expected = professors;
		Assert.assertArrayEquals(expected.toArray(), actual.toArray());

	}

}
