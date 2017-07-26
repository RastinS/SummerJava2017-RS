package entities;
import java.util.*;

public class Person {
	private String name;
	private String house_name;
	private String blood_status;
	private String school;
	private Date birthday;
	
	public Person(String _name) {
		name = _name;
	}

	public Person(String _name, String _house_name, String _blood_status, String _school, Date _birthday) {
		name = _name;
		house_name = _house_name;
		blood_status = _blood_status;
		school = _school;
		birthday = (Date) _birthday.clone();
	}

	public void set_name(String _name) {
		name = _name;
	}
	
	public String get_name() {
		return name;
	}
	
	public void set_house_name(String _house_name) {
		house_name = _house_name;
	}
	
	public String get_house_name() {
		return house_name;
	}
	
	public void set_blood_status(String _blood_status) {
		blood_status = _blood_status;
	}
	
	public String get_blood_status() {
		return blood_status;
	}
	
	public void set_school(String _school) {
		school = _school;
	}
	
	public String get_school() {
		return school;
	}
	
	public void set_birthday(Date _birthday) {
		birthday = _birthday;
	}
	
	public Date get_birthday() {
		return birthday;
	}
}
