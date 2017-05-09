package com.sopra;
import java.sql.*;
import oracle.jdbc.pool.OracleDataSource;

public class JDBCVersion {

	public static void main(String[] args) throws SQLException {
		OracleDataSource ods = new OracleDataSource();
		ods.setURL("jdbc:oracle:thin:hr/oracle@localhost:1521/XE");
		Connection conn = ods.getConnection();
		
		DatabaseMetaData meta = conn.getMetaData();
		System.out.println("The JDBC driver version is " + meta.getDriverVersion());
		
		
	}

}
