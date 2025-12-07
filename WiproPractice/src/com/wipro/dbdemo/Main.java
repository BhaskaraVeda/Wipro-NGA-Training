package com.wipro.dbdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main {

	static Connection conObj;

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Mydb db = new Mydb();
		conObj = db.getConnection();
		Main m = new Main();
		// m.deleteCustomer();
		m.readCustomer();
		conObj.close();
	}

	void deleteCustomer() {
		try {
			Scanner s = new Scanner(System.in);
			int id = s.nextInt();

			String query = "delete from Customers where custid=?";

			PreparedStatement ps = conObj.prepareStatement(query);
			ps.setInt(1, id);
			ps.executeUpdate(); // execute the preparedQuery
			System.out.println("data inserted!");
			// 7
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	void updateCustomer() {
		try {
			Scanner s = new Scanner(System.in);
			String cname = s.next();
			int id = s.nextInt();
			String query = "update Customers set name=? where custid=?";
			PreparedStatement ps = conObj.prepareStatement(query);
			ps.setInt(2, id); // set the values in prepStatment query
			ps.setString(1, cname);
			ps.executeUpdate(); // execute the preparedQuery
			System.out.println("data inserted!");
			// 7
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	void InsertCustomer() {
		try {
			Scanner s = new Scanner(System.in);
			String cname = s.next();
			String cphone = s.next();
			int id = s.nextInt();

			String query = "insert into Customers values(?,?,?)";

			PreparedStatement ps = conObj.prepareStatement(query);
			ps.setInt(1, id); // set the values in prepStatment query
			ps.setString(2, cname);
			ps.setString(3, cphone);
			ps.executeUpdate(); // execute the preparedQuery
			System.out.println("data inserted!");
			conObj.close(); // 7
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	void readCustomers() {
		try {
			String cname, cphone;
			int id;
			String query = "select * from Customers";
			Statement createObj = conObj.createStatement();// 4creating object of Statement
			ResultSet records = createObj.executeQuery(query); // 5
			while (records.next()) // 6 getting the data
			{
				cname = records.getString("name");
				cphone = records.getString(3);
				id = records.getInt(1);
				System.out.println(cname + " " + cphone + " " + id);
			}
			// 7
		} catch (Exception e) {
			System.out.println(e);
		}
	}
// doing implementation
	void readCustomer() {
		try {
			Scanner s = new Scanner(System.in);
			int id = s.nextInt();
			String cname, cphone;
			String query = "select * from Customers where custid=" + id;
			// select * from Customers where custid=12;
			Statement createObj = conObj.createStatement();// 4creating object of Statement
			ResultSet records = createObj.executeQuery(query); // 5
			if (records.next()) // 6 getting the data
			{
				cname = records.getString("name");
				cphone = records.getString(3);

				System.out.println(cname + " " + cphone + " " + id);
			}
			// 7
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
// unit testing--- developer itself doing the testing      junit

// test case --- code which checks whether the expected 

/*
 *       
 * Step1 -> give the name of Driver class Step2-> create a database connection
 * with proper username and password Step3 -> store the database connection in
 * an object Step 4->> make use of Statement/ PreparedStatement --- create/ make
 * a query Step5-> execute the created query and commit Step6 -> close the
 * database connection
 * 
 */