package com.bridgelabz.clinicmgmt.data.main;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ClinicManagment {
	public static void main(String args[]) throws IOException, ParseException {
		// Take input from user and call respective operation
//		DoctorData data = new DoctorDataImpl();
//		List<Doctor> doctors = data.getDoctors();
//		data.addDoctor(null);
		JSONParser jsonParser = new JSONParser();
		try (FileReader reader=new FileReader("C:\\KAVYA\\bridgelabz\\src\\com\\bridgelabz\\clinicmgmt\\model\\Doctor.json"))
				{
			       Object obj=jsonParser.parse(reader);
			       JSONObject DoctorList = (JSONObject) obj;
			       System.out.println(DoctorList);
				}
}
}