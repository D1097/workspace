package com.internousdev.webproj2.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBConnector {
	/**
	 * :JDBCドライバー名
	 */
	private static String driverName="com.mysql.jdbc.Driver";
	/*
	 * dbURL
	 */
	private static String url="jdbc:mysql://localhost/testdb";
	/*
	 * db user
	 */
	private static String user="root";
	/*
	 * db password
	 */
	private static String password="root";

	public Connection getConnection(){
		Connection con=null;
		try{
			Class.forName(driverName);
			con=DriverManager.getConnection(url,user,password);
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return con;
	}
}
