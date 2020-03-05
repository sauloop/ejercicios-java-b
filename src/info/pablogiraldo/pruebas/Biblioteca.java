package info.pablogiraldo.pruebas;

import java.util.ArrayList;
import java.util.Arrays;

public class Biblioteca {

	private ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
	private ArrayList<Libro> libros = new ArrayList<Libro>();

	public Biblioteca() {
		this.usuarios = new ArrayList<Usuario>();
		this.libros = new ArrayList<Libro>();
	}

	public Usuario getUsuario(int id) {
		return this.usuarios.get(id - 1);
	}

	public Libro getLibro(int id) {
		return this.libros.get(id - 1);
	}

	public ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(ArrayList<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public ArrayList<Libro> getLibros() {
		return libros;
	}

	public void setLibros(ArrayList<Libro> libros) {
		this.libros = libros;
	}

	public void addUsuario(String nombreUsuario) {
		Usuario usr = new Usuario(nombreUsuario);
		usuarios.add(usr);
		System.out.println(usr.getNombre() + " añadido a la biblioteca.");
	}

	public void addLibro(String[] datosLibro) {
		Libro lib = new Libro(datosLibro[0], datosLibro[1]);
		libros.add(lib);
		System.out.println(lib.getTitulo() + " añadido a la biblioteca.");
	}

	public boolean prestamo(int idUsuario, int idLibro) {

		boolean prestado = this.prestamo(this.usuarios.get(idUsuario - 1), this.libros.get(idLibro - 1));

		return prestado;

	}

	public boolean prestamo(Usuario usr, Libro lib) {

		if (lib.getNumEjemplaresPrestados() < lib.getNumEjemplares() && !usr.getIdLibros().contains(lib.getId())) {

			usr.getIdLibros().add(lib.getId());
			lib.getIdUsuarios().add(usr.getId());

			lib.setNumEjemplaresPrestados(lib.getNumEjemplaresPrestados() + 1);

			return true;
		} else {
			return false;
		}
	}

	public boolean devolucion(int idUsuario, int idLibro) {

		boolean devuelto = this.devolucion(this.usuarios.get(idUsuario - 1), this.libros.get(idLibro - 1));

		return devuelto;
	}

	public boolean devolucion(Usuario usr, Libro lib) {

		if (lib.getNumEjemplaresPrestados() > 0 && usr.getIdLibros().contains(lib.getId())) {

			usr.getIdLibros().removeAll(Arrays.asList(lib.getId()));
			lib.getIdUsuarios().removeAll(Arrays.asList(usr.getId()));

			lib.setNumEjemplaresPrestados(lib.getNumEjemplaresPrestados() - 1);

			return true;
		} else {
			return false;
		}
	}

}
