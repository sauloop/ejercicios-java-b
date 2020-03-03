package info.pablogiraldo.ejercicios.poo;

import java.util.ArrayList;

public class BibliotecaB {

	private ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
	private ArrayList<Libro> libros = new ArrayList<Libro>();

	public BibliotecaB(ArrayList<Usuario> usuarios, ArrayList<Libro> libros) {
		this.usuarios = usuarios;
		this.libros = libros;
	}

	public ArrayList<Libro> getLibros() {
		return libros;
	}

	public void setLibros(ArrayList<Libro> libros) {
		this.libros = libros;
	}

	public boolean prestamo(int idUsuario, int idLibro) {

		idUsuario = idUsuario - 1;
		idLibro = idLibro - 1;
		Usuario usuario = usuarios.get(idUsuario);
		Libro libro = libros.get(idLibro);
		int numEjemplaresPrestados = libro.getNumEjemplaresPrestados();
		int numEjemplares = libro.getNumEjemplares();

		if (!usuario.isEnPrestamo() && numEjemplaresPrestados < numEjemplares) {
			libros.get(idLibro).setNumEjemplaresPrestados(numEjemplaresPrestados + 1);
			usuarios.get(idUsuario).setEnPrestamo(true);
			return true;
		} else {
			return false;
		}
	}

	public boolean devolucion(int idUsuario, int idLibro) {
		idUsuario = idUsuario - 1;
		idLibro = idLibro - 1;
		Usuario usuario = usuarios.get(idUsuario);
		Libro libro = libros.get(idLibro);
		int numEjemplaresPrestados = libro.getNumEjemplaresPrestados();

		if (usuario.isEnPrestamo() && numEjemplaresPrestados > 0) {
			usuarios.get(idUsuario).setEnPrestamo(false);
			libros.get(idLibro).setNumEjemplaresPrestados(numEjemplaresPrestados - 1);
			return true;
		} else {
			return false;
		}
	}

}
