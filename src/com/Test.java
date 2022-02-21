package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		try(Connection con = DriverManager.
				getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","password"))
		{
			
			// create table
//		String sql_query = "create table employees"
//				+ "(empId number,empName varchar2(30), empSalary number,empAddress varchar2(50))";
//			
//		Statement statement = con.createStatement();
//		boolean execute = statement.execute(sql_query);
//		
//		if(execute==false) {
//			System.out.println("table is created");
//		}
			
			//deleting table
			
//		String sql_drop = "drop table employees";
//		
//		Statement statement = con.createStatement();
//		boolean execute = statement.execute(sql_drop);
//		
//		if(execute==false) {
//			System.out.println("table is dropped");
//		}
			
			//inserting table details
			
//			Statement statement = con.createStatement();
//			
//			String sql_insert = "insert into employees values(101, 'Sudhanshu Kumar', 56000, 'Vasundhara Enclave, Delhi')";
//		
//			int count = statement.executeUpdate(sql_insert);
//			
//			if(count!=0) {
//				System.out.println("details have been inserted");
//			}
			
			//fetching details
			
//			Statement statement = con.createStatement();
//			
//			String sql_select = "select * from employees";
//			ResultSet rSet = statement.executeQuery(sql_select);
//			
//			while(rSet.next()) {
//			
//				System.out.println(rSet.getInt(1)+".."+rSet.getString(2)+".."+rSet.getInt(3)+".."+rSet.getString(4));
//			
//			}
			
			//updating details
			
//			Statement statement = con.createStatement();
//			
//			String sql_update = "UPDATE employees SET empName = 'Alfred Schmidt', empAddress= 'Frankfurt' WHERE empID = 101";
//			
//			int count = statement.executeUpdate(sql_update);
//			
//			if(count!=0 && count!=-1) {
//				System.out.println("change has been done");
//			}
			
			
		}catch(Exception e) {e.printStackTrace();}

	}
}
