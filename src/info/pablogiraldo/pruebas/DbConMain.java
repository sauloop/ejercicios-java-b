package info.pablogiraldo.pruebas;

import java.sql.*;
//import java.util.*;
//import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

class DbConMain {
	public static void main(String a[]) {
		// Creating the connection
		String url = "jdbc:mysql://localhost:3306/dbcon";
		String user = "root";
		String pass = "";

		// Entering the data
		@SuppressWarnings("resource")
		Scanner k = new Scanner(System.in);
		System.out.println("enter name");
		String name = k.next();
		System.out.println("enter roll no");
		int roll = k.nextInt();
		System.out.println("enter class");
		String cls = k.next();

		// Inserting data using SQL query
		String sql = "insert into estudiante values('" + name + "'," + roll + ",'" + cls + "')";
		Connection con = null;
		try {
//			DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Reference to connection interface
			con = DriverManager.getConnection(url, user, pass);

			Statement st = con.createStatement();
			int m = ((java.sql.Statement) st).executeUpdate(sql);
			if (m == 1)
				System.out.println("inserted successfully : " + sql);
			else
				System.out.println("insertion failed");
			con.close();
		} catch (Exception ex) {
			System.err.println(ex);
		}
	}
}
