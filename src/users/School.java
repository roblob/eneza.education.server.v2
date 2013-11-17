package users;

import java.util.*;

public class School {
	public ArrayList<SchoolClass> classes;
	public ArrayList<Teacher> teachers;
	public int school_id;
	public String school_name;

	public School(String school_name) {
		this.school_name = school_name;
		classes = new ArrayList<SchoolClass>();
		teachers = new ArrayList<Teacher>();
		school_id = getNewSchoolID();
	}
}
