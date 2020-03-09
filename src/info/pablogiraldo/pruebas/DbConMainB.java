package info.pablogiraldo.pruebas;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

class DbConMainB {
	public static void main(String a[]) {

		String url = "jdbc:mysql://localhost:3306/dbcon";
		String user = "root";
		String pass = "";

		String sql = "insert into usuario(nombre) values (?)";
		String nombre = "Zutano";

		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			con = DriverManager.getConnection(url, user, pass);

			PreparedStatement preparedStmt = con.prepareStatement(sql);

			preparedStmt.setString(1, nombre);

			preparedStmt.execute();

			con.close();

			System.out.println(nombre + " insertado correctamente.");

		} catch (Exception e) {
			System.err.println("Error.");
			System.err.println(e.getMessage());
		}
	}
}
