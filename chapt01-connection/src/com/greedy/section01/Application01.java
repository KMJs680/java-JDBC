package com.greedy.section01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Application01 {

	public static void main(String[] args) {
		/*DB 접속을 위한 Connection 인스턴스 생성을 위한 레퍼런스 변수 선언
		 * 나중에 finally 블록에서 사용하기 위해 try 블럭 밖에 선언함*/
		Connection con = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
													"C##EMPLOYEE","EMPLOYEE"); 
			System.out.println(con);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		
		}catch (SQLException e) {
			e.printStackTrace();
		
		}finally {
			if(con!=null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				}
			}
		}

}
