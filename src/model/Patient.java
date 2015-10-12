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
  private int patientId;
  private String name;
  private int age;
  private int ssn;
  private int contactNumber;
  private String address;
  private String healthCondition;
  private String healthRecord;
  
  public Patient(Controller window)
  {
	  this.name = window.storeName;
	  this.address = window.storeAddress;
	  this.ssn = Integer.getInteger(window.storeSsn);
	  /* ADD GUI FIELD FOR PHONE # */
	  this.healthRecord = window.storeConcerns;
  }
  
  // Should this method return the details as an ArrayList?
  /* getPatientDetails()  {
  return patientId    
  return name
  return age
  return ssn
  return contactNumber
  return address
  return healthCondition
  return healthRecord
  } */
  
  public void setPatientDetails(int patientId, String name, int age, int ssn, int contactNumber, 
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
