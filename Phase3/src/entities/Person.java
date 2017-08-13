package entities;
import java.util.*;

public class Person {
	private String name;
	private House house;
	private BloodStatus bloodStatus;
	private School school;
	private Date birthday;
	
	
	public Person() {
		this("", null, BloodStatus.Unknown, null, null);
	}
	public Person(String _name) {
		this(_name, null, BloodStatus.Unknown, null, null);
	}

	public Person(String _name, House _house, BloodStatus _bloodStatus, School _school, Date _birthday) {
		name = _name;
		house = _house;
		bloodStatus = _bloodStatus;
		school = _school;
		if(_birthday != null)
			birthday = (Date) _birthday.clone();
		else
			birthday = null;
	}
	

	public void setName(String _name) {
		name = _name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setHouse(House _house) {
		house = _house;
	}
	
	public House getHouse() {
		return house;
	}
	
	public void setBloodStatus(BloodStatus _bloodStatus) {
		bloodStatus = _bloodStatus;
	}
	
	public BloodStatus getBloodStatus() {
		return bloodStatus;
	}
	
	public void setSchool(School _school) {
		school = _school;
	}
	
	public School getSchool() {
		return school;
	}
	
	public void setBirthday(Date _birthday) {
		birthday = (Date) _birthday.clone();
	}
	
	public Date getBirthday() {
		return birthday;
	}
}
