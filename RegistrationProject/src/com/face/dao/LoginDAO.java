package com.face.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.face.bo.LoginBO;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;


public class LoginDAO {
	public static java.util.List save(Connection connection, LoginBO logbo) throws SQLException{
		ArrayList habitList=new ArrayList();
		boolean status = false;
		Statement st=connection.createStatement();
		String str=logbo.getUsername();
		String pass=logbo.getPasssword();
		ResultSet rs=st.executeQuery("SELECT name,password from Registertable");
		int c=0;
		while(rs.next()) {
			
			if(str.toString().equals(rs.getString(1)) && pass.toString().equals(rs.getString(2))) 
			{
				status=true;
		        c=1;
		        break;
			}
			
			}
		
			
	     if(c==0)
	    	 status=false;
	     if(c== 1) {
	    	
	    	 ResultSet rs1=st.executeQuery("SELECT name,mobile,email from Registertable where name='"+str+"'");
	    	 
	    	 while(rs1.next()) {
	         habitList.add(rs1.getString(1));
	         habitList.add(rs1.getString(2));
	         habitList.add(rs1.getString(3));
	             
	    	 
	    	 }
		}
	    	 
	     
	    // boolean habitList;
		return habitList;
	 
}
}
