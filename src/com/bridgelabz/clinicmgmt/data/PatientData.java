package com.bridgelabz.clinicmgmt.data;

import java.util.List;

import org.json.simple.parser.JSONParser;

import com.bridgelabz.clinicmgmt.model.Patient;

public interface PatientData {
	
	public void addPatient(Patient patient);
	JSONParser parser = new JSONParser();
	public List<Patient> getPatient();

}
