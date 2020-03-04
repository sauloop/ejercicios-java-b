package info.pablogiraldo.ejercicios.poo;

import java.util.ArrayList;

public class BibliotecaD {

	private ArrayList<UsuarioC> usuarios = new ArrayList<UsuarioC>();
	private ArrayList<LibroC> libros = new ArrayList<LibroC>();

	public BibliotecaD(ArrayList<UsuarioC> usuarios, ArrayList<LibroC> libros) {
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

		boolean prestado = this.prestamo(this.usuarios.get(idUsuario - 1), this.libros.get(idLibro - 1));

		return prestado;

	}

	public boolean prestamo(UsuarioC usr, LibroC lib) {

		if (!lib.isPrestado()) {
			lib.setIdUsuario(usr.getId());
			lib.setPrestado(true);

			usr.setIdLibro(lib.getId());
			return true;
		} else {
			return false;
		}
	}

	public boolean devolucion(int idUsuario, int idLibro) {

		boolean devuelto = this.devolucion(this.usuarios.get(idUsuario - 1), this.libros.get(idLibro - 1));

		return devuelto;
	}

	public boolean devolucion(UsuarioC usr, LibroC lib) {

		if (lib.isPrestado()) {
			lib.setIdUsuario(0);
			lib.setPrestado(false);

			usr.setIdLibro(0);
			return true;
		} else {
			return false;
		}
	}

}
