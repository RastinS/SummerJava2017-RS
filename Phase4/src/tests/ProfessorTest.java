package tests;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import entities.*;

public class ProfessorTest {
	static Professor snape;
	
	public static void main(String[] args) throws ParseException {
		System.out.println(nameTest());
		System.out.println(houseTest());
		System.out.println(bloodStatusTest());
		System.out.println(schoolTest());
		System.out.println(birthdayTest());
		System.out.println(coursesTest());
		System.out.println(notesTest());
	}
	
	static boolean nameTest() {
		snape = new Professor("snape");
		String expected = "snape";
		String actual = snape.getName();
		if(!actual.equals(expected))
			return false;
		
		snape.setName("Bigsnape");
		expected = "Bigsnape";
		actual = snape.getName();
		if(!actual.equals(expected))
			return false;
		
		return true;
	}
	
	static boolean houseTest() {
		House grifendor = new House("Grifendor");
		snape = new Professor("snape", grifendor, BloodStatus.Unknown, null, null, null, null);
		House expected = grifendor;
		House actual = snape.getHouse();
		if(!actual.equals(expected))
			return false;
		
		House slytherin = new House("Slytherin");
		snape.setHouse(slytherin);
		expected = slytherin;
		actual = snape.getHouse();
		if(!actual.equals(expected))
			return false;
		
		return true;
	}
	
	static boolean bloodStatusTest() {
		snape = new Professor("snape", null, BloodStatus.MuggleBorn, null, null, null, null);
		BloodStatus expected = BloodStatus.MuggleBorn;
		BloodStatus actual = snape.getBloodStatus();
		if(!actual.equals(expected))
			return false;
		
		snape.setBloodStatus(BloodStatus.PureBlood);
		expected = BloodStatus.PureBlood;
		actual = snape.getBloodStatus();
		if(!actual.equals(expected))
			return false;
		
		return true;
	}
	
	static boolean schoolTest() {
		School hagwarts = new School();
		snape = new Professor("snape", null, BloodStatus.Unknown, hagwarts, null, null, null);
		School expected = hagwarts;
		School actual = snape.getSchool();
		if(!actual.equals(expected))
			return false;
		
		School foggyDogHouse = new School();
		snape.setSchool(foggyDogHouse);
		expected = foggyDogHouse;
		actual = snape.getSchool();
		if(!actual.equals(expected))
			return false;
		
		return true;
	}
	
	static boolean birthdayTest() throws ParseException {
		DateFormat formatter = new SimpleDateFormat("d-MM-yyyy");
		Date birthday = formatter.parse("9-01-1960");
		snape = new Professor("snape", null, BloodStatus.Unknown, null, birthday, null, null);
		Date expected = birthday;
		Date actual = snape.getBirthday();
		if(!actual.equals(expected))
			return false;
		
		Date birthday2 = formatter.parse("9-03-1960");
		snape.setBirthday(birthday2);
		expected = birthday2;
		actual = snape.getBirthday();
		if(!actual.equals(expected))
			return false;
		
		return true;
	}
	
	static boolean coursesTest() {
		Map<Integer, Course> courses = new HashMap<Integer, Course>();
		courses.put(2005, new Course("Potions"));
		courses.put(2006, new Course("Potions"));
		snape = new Professor("snape", null, BloodStatus.Unknown, null, null, courses, null);
		Map<Integer, Course> expected = courses;
		Map<Integer, Course> actual = snape.getCourses();
		if(!actual.equals(expected))
			return false;
		
		snape = new Professor();
		snape.setCourses(courses);
		expected = courses;
		actual = snape.getCourses();
		if(!actual.equals(expected))
			return false;
		
		return true;
	}
	
	static boolean notesTest() {
		snape = new Professor("snape", null, BloodStatus.Unknown, null, null, null, "Pain in the arse");
		String expected = "Pain in the arse";
		String actual = snape.getNotes();
		if(!actual.equals(expected))
			return false;
		
		snape = new Professor();
		snape.setNotes("Good spy");
		expected = "Good spy";
		actual = snape.getNotes();
		if(!actual.equals(expected))
			return false;
		
		return true;
	}	
}
