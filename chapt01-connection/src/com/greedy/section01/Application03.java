package com.greedy.section01;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Application03 {

	public static void main(String[] args) {
		Properties prop = new Properties();
		Connection con = null;
		
		try {
			prop.load(new FileReader("src/com/greedy/section01/connection/jdbc-config.properties"));
			System.out.println(prop);
			String driver = prop.getProperty("driver");
			String user = prop.getProperty("user");
			String pass = prop.getProperty("pass");
			String url = prop.getProperty("url");
			
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, pass);
			System.out.println("con : " +  con);
			
		
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		
		}finally {
			if(con != null) {
				try {
					con.close();
				} catch (SQLException e) {
						e.printStackTrace();
				}
			}
		}
	}

}
