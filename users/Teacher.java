package users;

public class Teacher extends User {
	String school;

	public Teacher(String name, String password, int mobile_number,
			String school, int user_id) {
		super(name, password, mobile_number, user_id);
		this.school = school;
		this.user_type = "teacher";
	}

	public Teacher(String name, String password, String email, String school, int user_id) {
		super(name, password, email, user_id);
		this.school = school;
		this.user_type = "teacher";
	}

	
}
