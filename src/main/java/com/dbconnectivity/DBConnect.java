package com.dbconnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnect {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		try {
            //Step 1: Giving the class name
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //Step 2: Give the connection url, here the database name is amazon_db and userid/password is root/root
            
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/amazon_db","root","root");
            
            //Step 3: Use statement to establish the connection
            Statement smt = con.createStatement();
            
            
            //Step 4: Execute your mysql query
            
            ResultSet rs = smt.executeQuery("select * from mobile_products");
            
            while(rs.next()) {
            	
            	System.out.println(rs.getInt(1)+"" +rs.getString(2)+"" +rs.getString(3));
            }
               con.close();

            
        } catch (ClassNotFoundException e) {
        
       e.printStackTrace();
            
           
        }
	}
	
}
	
