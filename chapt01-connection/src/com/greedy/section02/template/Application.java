package com.greedy.section02.template;

import java.sql.Connection;

import static com.greedy.section02.template.JDBCtemplate.getConnection;
import static com.greedy.section02.template.JDBCtemplate.close;
public class Application {

   public static void main(String[] args) {

      Connection con = getConnection();
      System.out.println(con);
      
      close(con);
      
      
   }

   
}