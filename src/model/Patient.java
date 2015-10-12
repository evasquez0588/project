package model;
import java.util.ArrayList;

import GUI.Controller;

/********************************************************************************
CSE 360 IPIMS Project
File Name: Patient.java
Group: 2
Description: This class contains the functions assigned to the Patient object.
*********************************************************************************/

public class Patient
{
  // Instance variables
  private String patientId;
  private String name;
  private String age;
  private String ssn;
  private String contactNumber;
  private String address;
  private String healthCondition;
  private String healthRecord;
  
  public Patient(Controller window)
  {
	  this.name = window.storeName;
	  this.address = window.storeAddress;
	  this.ssn = window.storeSsn;
	  /* ADD GUI FIELD FOR PHONE # */
	  this.healthRecord = window.storeConcerns;
  }
  
  // Should this method return the details as an ArrayList?
  public ArrayList<String> getPatientDetails()  {
	  ArrayList<String> summary = new ArrayList<String>();
	  summary.add(patientId);    
	  summary.add(name);
	  summary.add(age);
	  summary.add(ssn);
	  summary.add(contactNumber);
	  summary.add(address);
	  summary.add(healthCondition);
	  summary.add(healthRecord);
	  return summary;
  }
  
  public void setPatientDetails(String patientId, String name, String age, String ssn, String contactNumber, 
    String address, String healthCondition, String healthRecord) {
    this.patientId = patientId;  
    this.name = name;
    this.age = age;
    this.ssn = ssn;
    this.contactNumber = contactNumber;
    this.address = address;
    this.healthCondition = healthCondition;
    this.healthRecord = healthRecord;
  }
  
  /*getAppointment (patientId, date, doctorId)  {
  return patientId
  return import date from Date external tool
  return doctorId
  }
  
  getAppointment(patientId, OldDate, newDate, oldDoctorId, newDoctorId) {
  Get patientId
  Get oldDate
  Get oldDoctorId
  Get newDoctorId
  Other getAppointment method called
  getAppointment (patientId, newDate,  newDoctorId ) replaces old Appointment
  }
  
  cancelAppointment(patientId, date, doctorId)   {
  Get patientId
  Get date
  Get doctor id
  
  while (true) {
        Search for patientId
        Find patientId
        Find appointment date from patient info
        Delete date
        Search for doctorId
      Delete doctorId
    }
  } */
  
}
