import users.Student;
import users.User;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
public class JSONHandler {

	public User makeStuent(String json){
		JsonParser parser = new JsonParser();
		JsonObject obj =(JsonObject)parser.parse(json);
		JsonObject names = obj.getAsJsonObject("names");
		JsonObject mobile_number = obj.getAsJsonObject("mobile_number");
		JsonObject password = obj.getAsJsonObject("password");
		JsonObject email = obj.getAsJsonObject("email");
		JsonObject user_type = obj.getAsJsonObject("user_type");
		
		User user = new User(names.getAsString(), password.getAsString(), email.getAsString(), mobile_number.getAsString(), user_type.getAsString());
		
		return null;
		
	}
}
