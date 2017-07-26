package tests;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.Assert;
import org.junit.Test;

import entities.Person;

public class PersonTest {

	Person snape;
	@Test
	public void getNameTest()
	{
		snape = new Person("Severus Snape");
		
		String actual = snape.get_name();
		String expected = "Severus Snape";
		
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void getHouseTest() throws ParseException
	{
		DateFormat formatter = new SimpleDateFormat("d-MM-yyyy"); 
		snape = new Person("Severus Snape", "Slytherin", "half-blood", "Hogwarts", formatter.parse("9-01-1960"));
		String actual = snape.get_house_name();
		String expected = "Slytherin";
		
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void getBloodStatusTest() throws ParseException
	{
		DateFormat formatter = new SimpleDateFormat("d-MM-yyyy"); 
		snape = new Person("Severus Snape", "Slytherin", "half-blood", "Hogwarts", formatter.parse("9-01-1960"));
		
		String actual = snape.get_blood_status();
		String expected = "half-blood";
		
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void getSchoolTest() throws ParseException
	{
		DateFormat formatter = new SimpleDateFormat("d-MM-yyyy"); 
		snape = new Person("Severus Snape", "Slytherin", "half-blood", "Hogwarts", formatter.parse("9-01-1960"));		
		String actual = snape.get_school();
		String expected = "Hogwarts";
		
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void setNameTest()
	{
		snape = new Person("");
		snape.set_name("Severus Snape");
		String actual = snape.get_name();
		String expected = "Severus Snape";
		
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void setHouseTest()
	{
		snape = new Person("Severus Snape");
		snape.set_house_name("Slytherin");
		String actual = snape.get_house_name();
		String expected = "Slytherin";
		
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void setBloodStatusTest()
	{
		snape = new Person("Severus Snape");
		snape.set_blood_status("Half-Blood");
		String actual = snape.get_blood_status();
		String expected = "Half-Blood";
		
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void setSchoolTest()
	{
		snape = new Person("Severus Snape");
		snape.set_school("Hogwarts");
		String actual = snape.get_school();
		String expected = "Hogwarts";
		
		Assert.assertEquals(expected, actual);
	}

}
