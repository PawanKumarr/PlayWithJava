package com.sopra;
import java.sql.*;
import oracle.jdbc.pool.OracleDataSource;

public class DataHandler {

	public DataHandler() {
	}
	
	String jdbcUrl = null;
	String userid = null;
	String password = null;
	Connection conn;
	
	public void getDBConnection() throws SQLException{
	OracleDataSource ds = new OracleDataSource();
	ds.setURL(jdbcUrl);
	conn=ds.getConnection(userid,password);
	}

}
