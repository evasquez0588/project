package controller;

import java.sql.Connection;
import java.sql.SQLException;

public interface DBQuery {
	default Connection connectDatabase() {
		Connection connection = null;
		try {
			connection = MySQLConnector.connectDatabase("primafacie.cidse.dhcp.asu.edu", "IPIMS", "dbuser", "temp4now");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}
}
