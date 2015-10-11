package controller;

import java.sql.Connection;
import java.sql.SQLException;

public interface DBQuery {
	default Connection connectDatabase() {
		Connection connection = null;
		try {
			connection = MySQLConnector.connectDatabase("databasedomain", "schema", "username", "password");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}
}
