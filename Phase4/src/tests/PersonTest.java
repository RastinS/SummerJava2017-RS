package tests;

import entities.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class PersonTest {
	static Person hagrid;
	
	
	public static void main(String[] args) throws ParseException {
		System.out.println(nameTest());
		System.out.println(houseTest());
		System.out.println(bloodStatusTest());
		System.out.println(schoolTest());
		System.out.println(birthdayTest());
	}
	
	static boolean nameTest() {
		hagrid = new Person("Hagrid");
		String expected = "Hagrid";
		String actual = hagrid.getName();
		if(!actual.equals(expected))
			return false;
		
		hagrid.setName("BigHagrid");
		expected = "BigHagrid";
		actual = hagrid.getName();
		if(!actual.equals(expected))
			return false;
		
		return true;
	}
	
	static boolean houseTest() {
		House grifendor = new House("Grifendor");
		hagrid = new Person("Hagrid", grifendor, BloodStatus.Unknown, null, null);
		House expected = grifendor;
		House actual = hagrid.getHouse();
		if(!actual.equals(expected))
			return false;
		
		House slytherin = new House("Slytherin");
		hagrid.setHouse(slytherin);
		expected = slytherin;
		actual = hagrid.getHouse();
		if(!actual.equals(expected))
			return false;
		
		return true;
	}
	
	static boolean bloodStatusTest() {
		hagrid = new Person("Hagrid", null, BloodStatus.MuggleBorn, null, null);
		BloodStatus expected = BloodStatus.MuggleBorn;
		BloodStatus actual = hagrid.getBloodStatus();
		if(!actual.equals(expected))
			return false;
		
		hagrid.setBloodStatus(BloodStatus.PureBlood);
		expected = BloodStatus.PureBlood;
		actual = hagrid.getBloodStatus();
		if(!actual.equals(expected))
			return false;
		
		return true;
	}
	
	static boolean schoolTest() {
		School hagwarts = new School();
		hagrid = new Person("Hagrid", null, BloodStatus.Unknown, hagwarts, null);
		School expected = hagwarts;
		School actual = hagrid.getSchool();
		if(!actual.equals(expected))
			return false;
		
		School foggyDogHouse = new School();
		hagrid.setSchool(foggyDogHouse);
		expected = foggyDogHouse;
		actual = hagrid.getSchool();
		if(!actual.equals(expected))
			return false;
		
		return true;
	}
	
	static boolean birthdayTest() throws ParseException {
		DateFormat formatter = new SimpleDateFormat("d-MM-yyyy");
		Date birthday = formatter.parse("9-01-1960");
		hagrid = new Person("Hagrid", null, BloodStatus.Unknown, null, birthday);
		Date expected = birthday;
		Date actual = hagrid.getBirthday();
		if(!actual.equals(expected))
			return false;
		
		Date birthday2 = formatter.parse("9-03-1960");
		hagrid.setBirthday(birthday2);
		expected = birthday2;
		actual = hagrid.getBirthday();
		if(!actual.equals(expected))
			return false;
		
		return true;
	}
}