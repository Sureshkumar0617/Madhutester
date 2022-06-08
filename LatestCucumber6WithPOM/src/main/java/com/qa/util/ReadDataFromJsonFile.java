package com.qa.util;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadDataFromJsonFile {
	
	public static void main(String[] args) throws IOException, ParseException {
		
		JSONParser jsonparser = new JSONParser();
		FileReader reader = new FileReader(".\\JsonFiles\\ContactUs.json");
		
		Object obj = jsonparser.parse(reader);
		
		
		JSONObject contactus = (JSONObject)obj;
		
		String subhead= (String) contactus.get("Subject Heading");
		String emailid= (String) contactus.get("Email address");
		String ordref=(String) contactus.get("Order reference");
        String Msg= (String) contactus.get("Message");
		
		System.out.println("Subject Heading: "+subhead);
		System.out.println("Email address: "+emailid);
		System.out.println("Order reference:"+ordref);
		System.out.println("Message:"+Msg);
	}

}



