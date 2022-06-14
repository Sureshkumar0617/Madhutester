package com.qa.util;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReaddataFromJsonFile {
	
	public static void main(String[] args) throws IOException, ParseException {
		
		JSONParser jsonparser = new JSONParser();
		FileReader reader = new FileReader(".\\Jsonfile\\PaymentMethod.json");
		
		Object obj = jsonparser.parse(reader);
		
		
		JSONObject paymentmethods = (JSONObject)obj;
		
		String fstname= (String) paymentmethods.get("First Name");
		String lstname= (String) paymentmethods.get("Last Name");
		String Billadd=(String) paymentmethods.get("Billing Address");
		
		
		
		System.out.println("First Name: "+fstname);
		System.out.println("Last Name: "+lstname);
		System.out.println("Billing Address"+Billadd);
		
	}

}
