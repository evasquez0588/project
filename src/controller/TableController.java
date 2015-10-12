package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Random;

import model.Patient;


public class TableController implements DBQuery{
	/**
	 * @return a table
	 * @throws SQLException
	 */
	
	private static int GKey;
	
	public ArrayList<ArrayList<String>> get() throws SQLException {
		
		ArrayList<ArrayList<String>> result = new ArrayList<>();
		Connection connection = this.connectDatabase();
		if(connection == null) {
			// You can use other approaches for the connection issue.
			// As the connection error generally comes from network errors or 
			// user permissions, it should be taken care of individually
			throw new SQLException("cannot connect database");
		}
		String sql;
		sql = "select * from Syndromes";
		PreparedStatement statement = connection.prepareStatement(sql);
		ResultSet resultset = statement.executeQuery();
		while(resultset.next()) {
			ArrayList<String> record = new ArrayList<>();
			for (int i = 1; i <= resultset.getMetaData().getColumnCount(); i++)
				record.add(resultset.getString(i));		
			result.add(record);
		}
		resultset.close();
		statement.close();
		
		// NEVER FORGET TO RELEASE THE CONNECTION!
		connection.close();
		return result;
	}
	
public ArrayList<ArrayList<String>> searchUpdateHealthConditions(Patient p) throws SQLException {
		
		ArrayList<ArrayList<String>> result = new ArrayList<>();
		Connection connection = this.connectDatabase();
		if(connection == null) {
			// You can use other approaches for the connection issue.
			// As the connection error generally comes from network errors or 
			// user permissions, it should be taken care of individually
			throw new SQLException("cannot connect database");
		}
		String sql;
		sql = "select GKey from patient where FirstName=" + p.firstName + " and LastName=" + p.lastName;
		PreparedStatement statement = connection.prepareStatement(sql);
		ResultSet resultset = statement.executeQuery();
		while(resultset.next()) {
			ArrayList<String> record = new ArrayList<>();
			for (int i = 1; i <= resultset.getMetaData().getColumnCount(); i++)
				record.add(resultset.getString(i));		
			result.add(record);
		}
		String GKey = result.get(0).get(0);
		sql = "select HCID from HasCondition where GKey=" +GKey;
		statement = connection.prepareStatement(sql);
		resultset = statement.executeQuery();
		while(resultset.next()) {
			ArrayList<String> record = new ArrayList<>();
			for (int i = 1; i <= resultset.getMetaData().getColumnCount(); i++)
				record.add(resultset.getString(i));		
			result.add(record);
		}
		String HCID = result.get(0).get(0);
		sql = "select HealthCondition, Allergies from HealthConditions where HCID=" +HCID;
		statement = connection.prepareStatement(sql);
		resultset = statement.executeQuery();
		while(resultset.next()) {
			ArrayList<String> record = new ArrayList<>();
			for (int i = 1; i <= resultset.getMetaData().getColumnCount(); i++)
				record.add(resultset.getString(i));		
			result.add(record);
		}
		p.healthCondition = result.get(0).get(0);
		p.allergies = result.get(0).get(1);
		resultset.close();
		statement.close();
		
		// NEVER FORGET TO RELEASE THE CONNECTION!
		connection.close();
		return result;
	}



public ArrayList<ArrayList<String>> registerPatient(Patient p) throws SQLException {
	
	Random rand = new Random();
	
	ArrayList<ArrayList<String>> result = new ArrayList<>();
	Connection connection = this.connectDatabase();
	if(connection == null) {
		// You can use other approaches for the connection issue.
		// As the connection error generally comes from network errors or 
		// user permissions, it should be taken care of individually
		throw new SQLException("cannot connect database");
	}
	
	String sql;
	int Gkey;
	ResultSet resultset;
	PreparedStatement statement;
	
	do {
		Gkey = rand.nextInt(10000);
		sql = "select * from GlobalKey where Gkey = " + Gkey;
		statement = connection.prepareStatement(sql);
		resultset = statement.executeQuery();
		while(resultset.next()) {
			ArrayList<String> record = new ArrayList<>();
			for (int i = 1; i <= resultset.getMetaData().getColumnCount(); i++)
				record.add(resultset.getString(i));		
			result.add(record);
		}
	} while(result.size() != 0);
	
	sql = "INSERT INTO `GlobalKey`(`Gkey`) VALUES (" + Gkey + ")";
	statement = connection.prepareStatement(sql);
	statement.executeQuery();
	
	sql = "UPDATE `Patient` SET `DateOfBirth`="+p.birthdate+",`FirstName`="+p.firstName+",`Gkey`="+Gkey+",`LastName`="+p.lastName+",`Sex`="+p.sex+",`SSN`="+p.ssn+",`Username`=temp"+Gkey;
	statement = connection.prepareStatement(sql);
	statement.executeQuery();
	
	resultset.close();
	statement.close();
	
	// NEVER FORGET TO RELEASE THE CONNECTION!
	connection.close();
	return result;
}

}
