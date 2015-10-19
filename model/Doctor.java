package model;

public class Doctor {
	public String firstName;
	public String lastName;
	public String userName;
	public BusinessHours availble;
	String specialty;
	
	public Doctor(String first, String last, String specialize ){
		firstName = first;
		lastName = last;
		specialty = specialize;
	}
	
	public void setHours(int weekday, int startHour, int endHour){
		availble = new BusinessHours(weekday,startHour,endHour);
	}
	
	public Patient searchPatient(Patient[] p, String name){
		for(int i = 0; i < p.length; i++){
			String fullName = p[i].firstName + p[i].lastName;
			if(name.equals(fullName)){
				return p[i];
			}
		}
		return null;
	}
	
	public void updateHealth(Patient p){
		p.healthCondition = "";  //get from input
		p.allergies = "";   //get from input
		
		
	}
	
	//public Lab getLabRecord()
	
	//publid void e-Prescribe()
}
