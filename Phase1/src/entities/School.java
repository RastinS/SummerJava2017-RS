package entities;
import java.util.*;

public class School {
	private String name;
	private int num_of_students;
	private boolean housed;
	private ArrayList<String> house_names;
	private Vector<String> student_names;
	private Vector<String> professor_names;
	private ArrayList<String> course_names;
	
	public School() {
		house_names = new ArrayList<String>();
		student_names = new Vector<String>();
		professor_names = new Vector<String>();
		course_names = new ArrayList<String>();
		num_of_students = 0;
	}
	
	public School(String _name) {
		name = _name;
		house_names = new ArrayList<String>();
		student_names = new Vector<String>();
		professor_names = new Vector<String>();
		course_names = new ArrayList<String>();
		num_of_students = 0;
	}
	
	public School(String _name, ArrayList<String> _house_names, ArrayList<String> _course_names, Object num_of_students, Vector<String> _student_names, Vector<String> _professor_names) {
		name = _name;
		
		if(_house_names != null)
			house_names = (ArrayList<String>) _house_names.clone();
		else
			house_names = new ArrayList<String>();
		
		if(_course_names != null)
			course_names = (ArrayList<String>) _course_names.clone();
		else
			course_names = new ArrayList<String>();
		
		if(_student_names != null)
			student_names = (Vector<String>) _student_names.clone();
		else
			student_names = new Vector<String>();
		
		if(_professor_names != null)
			professor_names = (Vector<String>) _professor_names.clone();
		else
			professor_names = new Vector<String>();
		
		num_of_students = student_names.size();
	}

	public void set_name(String _name) {
		name = _name;
	}
	
	public String get_name() {
		return name;
	}
	
	public int get_num_of_students() {
		return num_of_students;
	}
	
	public boolean is_housed() {
		return housed;
	}
	
	public void set_house_names(ArrayList<String> _house_names) {
		house_names = (ArrayList<String>) _house_names.clone();
	}
	
	public void add_house(String house_name) {
		house_names.add(house_name);
	}
	
	public ArrayList<String> get_house_names() {
		return house_names;
	}
	
	
	public void set_student_names(Vector<String> _student_names) {
		student_names = (Vector<String>) _student_names.clone();
		num_of_students = student_names.size();
	}
	
	public void add_student(String student_name) {
		student_names.add(student_name);
		num_of_students++;
	}
	
	public void add_student(Vector<String> _student_names) {
		for(int i = 0; i < _student_names.size(); i++) {
			student_names.add(_student_names.get(i));
		}
		num_of_students += _student_names.size();
	}
	
	public Vector<String> get_student_names() {
		return student_names;
	}
	
	public void set_professor_names(Vector<String> _professor_names) {
		professor_names = (Vector<String>) _professor_names.clone();
	}
	
	public void add_professor(String professor_name) {
		professor_names.add(professor_name);
	}
	
	public Vector<String> get_professor_names() {
		return professor_names;
	}
	
	public void set_course_names(ArrayList<String> _course_names) {
		course_names = (ArrayList<String>) _course_names.clone();
	}
	
	public void add_course(String course_name) {
		course_names.add(course_name);
	}
	
	public ArrayList<String> get_course_names() {
		return course_names;
	}
}
