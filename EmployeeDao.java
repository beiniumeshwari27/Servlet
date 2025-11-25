package com.codegnan.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.codegnan.beans.Employee;

public class EmployeeDao {
static final String url="jdbc:mysql://localhost:3306/jfs__41";
static final String user="root";
static final String password="Umeshwari@123";

String query="insert into employee"
		+"(eno,ename,esal,eaddr,eemail,emobile)"
		+"values(?,?,?,?,?,?)";
public boolean save(Employee emp) {
	try(Connection connection=DriverManager.getConnection(url,user,password);
			PreparedStatement pst=connection.prepareStatement(query)){
		pst.setInt(1,emp.getEno());
		pst.setString(2,emp.getEname());
		pst.setFloat(1,emp.getEsal());
		pst.setString(1,emp.getEaddr());
		pst.setString(1,emp.getEemail());
		pst.setString(1,emp.getEmobile());
		int result=pst.executeUpdate();
		return result>0;
		
	}catch(SQLException e) {
		e.printStackTrace();
		return false;
	}
}
			
}