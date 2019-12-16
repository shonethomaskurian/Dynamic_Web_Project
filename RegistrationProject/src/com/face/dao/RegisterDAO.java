package com.face.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.face.bo.RegisterBO;

public class RegisterDAO {
	
public static boolean save(Connection connection, RegisterBO regbo) throws SQLException{
		boolean status;
	Statement st=connection.createStatement();
	String query="insert into Registertable values('"+regbo.getName()+"','"+regbo.getMobile()+"','"+regbo.getEmail()+"','"+regbo.getPassword()+"')";
String str=regbo.getName();
	int resultset=st.executeUpdate(query);
if(resultset==1)
	status=true;
	
else
	status=false;
String s1=null,s2=null,s3=null;
ResultSet rs=st.executeQuery("SELECT name,mobile,email from Registertable");

while(rs.next()) {
	
	s1=rs.getString(1);
	s2=rs.getString(2);
	s3=rs.getString(3);
	
}
System.out.println(s1+" "+s2+" "+s3);
return status;
}
}
