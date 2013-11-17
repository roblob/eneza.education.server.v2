package users;

public class Student extends User {
	String school;
	boolean gender;
	int level;

	public Student(String name, String password,String email, String number, int level, String school){
		super(name, password, email,number, "student");
		this.user_type = "student";
		this.school = school;
		this.gender = gender;
		this.level = level;
		this.user_id =1;
		

	}
}
