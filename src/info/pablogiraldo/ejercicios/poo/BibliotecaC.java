package info.pablogiraldo.ejercicios.poo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

//list.removeAll(Arrays.asList(2));

public class BibliotecaC {

	private ArrayList<UsuarioC> usuarios = new ArrayList<UsuarioC>();
	private ArrayList<LibroC> libros = new ArrayList<LibroC>();

	public BibliotecaC(ArrayList<UsuarioC> usuarios, ArrayList<LibroC> libros) {
		this.usuarios = usuarios;
		this.libros = libros;
	}

	public ArrayList<UsuarioC> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(ArrayList<UsuarioC> usuarios) {
		this.usuarios = usuarios;
	}

	public ArrayList<LibroC> getLibros() {
		return libros;
	}

	public void setLibros(ArrayList<LibroC> libros) {
		this.libros = libros;
	}

	public boolean prestamo(int idUsuario, int idLibro) {

		idUsuario = idUsuario - 1;
		idLibro = idLibro - 1;
		LibroC libro = libros.get(idLibro);

		if (!libro.isPrestado()) {
			libros.get(idLibro).setIdUsuario(idUsuario);
			libros.get(idLibro).setPrestado(true);

			usuarios.get(idUsuario).setIdLibro(idLibro + 1);
			return true;
		} else {
			return false;
		}
	}

	public boolean devolucion(int idUsuario, int idLibro) {
		idUsuario = idUsuario - 1;
		idLibro = idLibro - 1;
		LibroC libro = libros.get(idLibro);

		if (libro.isPrestado()) {
			libros.get(idLibro).setIdUsuario(0);
			libros.get(idLibro).setPrestado(false);

			usuarios.get(idUsuario).setIdLibro(0);
			return true;
		} else {
			return false;
		}
	}

	public void guardar(Connection con) {

		String sql = "insert into usuario(id_libro,nombre) values (?,?)";

		try {
			PreparedStatement preparedStmt = con.prepareStatement(sql);

			for (UsuarioC usr : this.usuarios) {

				preparedStmt.setInt(1, usr.getIdLibro());
				preparedStmt.setString(2, usr.getNombre());

				preparedStmt.execute();
			}
		} catch (Exception e) {
			System.err.println("Error.");
			System.err.println(e.getMessage());
		}

		sql = "insert into libro(titulo,autor,prestado) values (?,?,?)";

		try {
			PreparedStatement preparedStmt = con.prepareStatement(sql);

			for (LibroC lib : this.libros) {

				preparedStmt.setString(1, lib.getTitulo());
				preparedStmt.setString(2, lib.getAutor());
				preparedStmt.setBoolean(3, lib.isPrestado());

				preparedStmt.execute();
			}
		} catch (Exception e) {
			System.err.println("Error.");
			System.err.println(e.getMessage());
		}

	}

}
