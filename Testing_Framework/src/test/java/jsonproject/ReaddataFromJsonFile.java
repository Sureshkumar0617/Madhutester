package jsonproject;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReaddataFromJsonFile {
	
	public static void main(String[] args) throws IOException, ParseException {
		
		JSONParser jsonparser = new JSONParser();
		FileReader reader = new FileReader(".\\jsonfiles\\addcandidate.json");
		
		Object obj = jsonparser.parse(reader);
		
		
		JSONObject addcandidateemployee = (JSONObject)obj;
		
		String fstname= (String) addcandidateemployee.get("First Name");
		String lstname= (String) addcandidateemployee.get("Last Name");
		String emid=(String) addcandidateemployee.get("Email");

		
		System.out.println("First Name: "+fstname);
		System.out.println("Last Name: "+lstname);
		System.out.println("Email:"+emid);
	}

}
