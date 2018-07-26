package com.h2.test;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestH2DBConnection {

	private static final String JDBC_DRIVER = "org.h2.Driver";   
	private static final String DB_URL = "jdbc:h2:file:///D:/services_ws/h2tesdb;AUTO_SERVER=TRUE";  

	private static final String USER = "sa"; 
	private static final String PASS = ""; 

	public static void main(String[] args) {

		Connection conn = null; 
		Statement stmt = null; 
		ResultSet rs = null;
		try { 
			Class.forName(JDBC_DRIVER); 

			conn = DriverManager.getConnection(DB_URL,USER,PASS);

			stmt = conn.createStatement(); 
			String sql = "SELECT id, title, author, submission_date FROM SUDARSHAN.TUTORIALS_TBL"; 
			rs = stmt.executeQuery(sql); 

			int id =0;
			String title = null;
			String author = null;
			Date submission_date = null;
			while(rs.next()) { 
				id  = rs.getInt("id"); 
				title = rs.getString("title"); 
				author = rs.getString("author"); 
				submission_date = rs.getDate("submission_date");  

				System.out.print("ID: " + id); 
				System.out.print(", TITLE: " + title); 
				System.out.print(", AUTHOR: " + author); 
				System.out.println(", SUBMISSION_DATE: " + submission_date); 
			} 

		} catch (Exception exp) {
			exp.printStackTrace();
		} finally {
			try {
				if(stmt!=null)
					stmt.close();
				if(rs!=null)
					rs.close();
				if(conn!=null)
					conn.close();
			} catch(Exception exp) {

			}
		}
	}

}
