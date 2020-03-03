package info.pablogiraldo.ejercicios.poo;

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

}
