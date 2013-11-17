package users;

public class User {
	public String name;
	public String password;
	protected String mobile_number;
	public String user_type;
	protected String email;
	public int user_id;
	public String username;

	public User(String name, String password, String contactData, String number, String user_type) {
		this(name, password);
		this.email = contactData;
		this.mobile_number = number;
		this.user_type= user_type;
	}

	private User(String name, String password) {
		this.name = name;
		this.password = password;
		this.username = createUsername(name);
	}

	public String toJsonRegistration() {
		String res = "{\n" + "\"names\" : " + "\"" + name + "\"," + "\n"
				+ "\"password\" : " + "\"" + password + "\"," + "\n";
		if (mobile_number != "")
			res += "\"mobile_number\" : " + "\"" + mobile_number + "\"," + "\n";
		if (email != null)
			res += "\"email\" : " + "\"" + email + "\"," + "\n";
		res += "\"user_type\" : " + "\"" + user_type + "\"\n" + "}";

		return res;
	}

	public String createUsername(String name) {
		String[] names = name.toUpperCase().split(" ");
		String res = names[0];
		for (int i = 1; i < names.length; i++) {
			res += names[i].substring(0, 3);
		}
		return res;
	}

	public String toJsonAfterRegistration() {
		return "{\n" + "\"user_id\" : " + user_id + ",\n\"username\" : \""
				+ username + "\"\n}";
	}

}
