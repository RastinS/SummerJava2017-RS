package tests;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;

import entities.*;

public class StudentTest {
	static Student ron;
	
	public static void main(String[] args) throws ParseException {
		System.out.println(nameTest());
		System.out.println(houseTest());
		System.out.println(bloodStatusTest());
		System.out.println(schoolTest());
		System.out.println(birthdayTest());
		System.out.println(coursesTest());
		System.out.println(reportCardTest());
	}
	
	static boolean nameTest() {
		ron = new Student("ron");
		String expected = "ron";
		String actual = ron.getName();
		if(!actual.equals(expected))
			return false;
		
		ron.setName("Bigron");
		expected = "Bigron";
		actual = ron.getName();
		if(!actual.equals(expected))
			return false;
		
		return true;
	}
	
	static boolean houseTest() {
		House grifendor = new House("Grifendor");
		ron = new Student("ron", grifendor, BloodStatus.Unknown, null, null, null, null);
		House expected = grifendor;
		House actual = ron.getHouse();
		if(!actual.equals(expected))
			return false;
		
		House slytherin = new House("Slytherin");
		ron.setHouse(slytherin);
		expected = slytherin;
		actual = ron.getHouse();
		if(!actual.equals(expected))
			return false;
		
		return true;
	}
	
	static boolean bloodStatusTest() {
		ron = new Student("ron", null, BloodStatus.MuggleBorn, null, null, null, null);
		BloodStatus expected = BloodStatus.MuggleBorn;
		BloodStatus actual = ron.getBloodStatus();
		if(!actual.equals(expected))
			return false;
		
		ron.setBloodStatus(BloodStatus.PureBlood);
		expected = BloodStatus.PureBlood;
		actual = ron.getBloodStatus();
		if(!actual.equals(expected))
			return false;
		
		return true;
	}
	
	static boolean schoolTest() {
		School hagwarts = new School();
		ron = new Student("ron", null, BloodStatus.Unknown, hagwarts, null, null, null);
		School expected = hagwarts;
		School actual = ron.getSchool();
		if(!actual.equals(expected))
			return false;
		
		School foggyDogHouse = new School();
		ron.setSchool(foggyDogHouse);
		expected = foggyDogHouse;
		actual = ron.getSchool();
		if(!actual.equals(expected))
			return false;
		
		return true;
	}
	
	static boolean birthdayTest() throws ParseException {
		DateFormat formatter = new SimpleDateFormat("d-MM-yyyy");
		Date birthday = formatter.parse("9-01-1960");
		ron = new Student("ron", null, BloodStatus.Unknown, null, birthday, null, null);
		Date expected = birthday;
		Date actual = ron.getBirthday();
		if(!actual.equals(expected))
			return false;
		
		Date birthday2 = formatter.parse("9-03-1960");
		ron.setBirthday(birthday2);
		expected = birthday2;
		actual = ron.getBirthday();
		if(!actual.equals(expected))
			return false;
		
		return true;
	}
	
	static boolean coursesTest() {
		Vector<Course> courses = new Vector<Course>();
		courses.add(new Course("Flying"));
		courses.add(new Course("Potions"));
		ron = new Student("ron", null, BloodStatus.Unknown, null, null, courses, null);
		Vector<Course> expected = courses;
		Vector<Course> actual = ron.getCourses();
		if(!actual.equals(expected))
			return false;
		
		ron = new Student();
		ron.setCourses(courses);
		expected = courses;
		actual = ron.getCourses();
		if(!actual.equals(expected))
			return false;
		
		return true;
	}
	
	static boolean reportCardTest() {
		Vector<FinishedCourse> reportCard = new Vector<FinishedCourse>();
		reportCard.add(new FinishedCourse("Flying"));
		reportCard.add(new FinishedCourse("Potions"));
		reportCard.add(new FinishedCourse("Beasts"));
		ron = new Student("ron", null, BloodStatus.Unknown, null, null, null, reportCard);
		Vector<FinishedCourse> expected = reportCard;
		Vector<FinishedCourse> actual = ron.getReportCard();
		if(!actual.equals(expected))
			return false;
		
		ron = new Student();
		ron.setReportCard(reportCard);
		expected = reportCard;
		actual = ron.getReportCard();
		if(!actual.equals(expected))
			return false;
		
		return true;
	}
}
