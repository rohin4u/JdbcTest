package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class SqlLoop {

	public static void main(String[] args) {

		try(Connection con = DriverManager.
				getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","password"))
		{
			
			Statement statement = con.createStatement();
			
			Scanner sc = new Scanner(System.in);
			
			while(true) {
				
				System.out.println("Enter Employee Id :");
				int id = sc.nextInt();
				
				System.out.println("Enter Employee Name :");
				String name = sc.next();
				
				System.out.println("Enter Employee Salary  :");
				int salary = sc.nextInt();
				
				System.out.println("Enter Employee Address");
				String address = sc.next();
				
				String sql_insert = String.format("insert into employees values(%d, '%s', %d, '%s')", 
													id, name,salary, address);
				
				statement.executeUpdate(sql_insert);
				
				System.out.println("details has been inserted");
				
				System.out.println("Do you want to update more details [yes/no]: ");
				
				String option = sc.next();
				
				if(option.equalsIgnoreCase("no")) {
					break;
				}
			}
			System.out.println("Thanks for your inputs");
			
			
		}catch(Exception e) {e.printStackTrace();}

	}

}
