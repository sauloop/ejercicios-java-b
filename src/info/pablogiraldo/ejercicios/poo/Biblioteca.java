package info.pablogiraldo.ejercicios.poo;

import java.util.ArrayList;

public class Biblioteca {

	private ArrayList<Libro> libros = new ArrayList<Libro>();

	public Biblioteca(ArrayList<Libro> libros) {
		this.libros = libros;
	}

	public ArrayList<Libro> getLibros() {
		return libros;
	}

	public void setLibros(ArrayList<Libro> libros) {
		this.libros = libros;
	}

	public boolean prestamo(int id) {

		id = id - 1;
		Libro libro = libros.get(id);
		int numEjemplaresPrestados = libro.getNumEjemplaresPrestados();
		int numEjemplares = libro.getNumEjemplares();

		if (numEjemplaresPrestados < numEjemplares) {
			libros.get(id).setNumEjemplaresPrestados(numEjemplaresPrestados + 1);
			return true;
		} else {
			return false;
		}
	}

	public boolean devolucion(int id) {
		id = id - 1;
		Libro libro = libros.get(id);
		int numEjemplaresPrestados = libro.getNumEjemplaresPrestados();

		if (numEjemplaresPrestados > 0) {
			libros.get(id).setNumEjemplaresPrestados(numEjemplaresPrestados - 1);
			return true;
		} else {
			return false;
		}
	}

}
