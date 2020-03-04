package info.pablogiraldo.ejercicios.poo;

import java.util.ArrayList;
import java.util.Arrays;

public class BibliotecaF {

	public ArrayList<UsuarioF> usuarios = new ArrayList<UsuarioF>();
	public ArrayList<LibroF> libros = new ArrayList<LibroF>();

	public BibliotecaF(ArrayList<UsuarioF> usuarios, ArrayList<LibroF> libros) {
		this.usuarios = usuarios;
		this.libros = libros;
	}

	public boolean prestamo(int idUsuario, int idLibro) {

		boolean prestado = this.prestamo(this.usuarios.get(idUsuario - 1), this.libros.get(idLibro - 1));

		return prestado;

	}

	public boolean prestamo(UsuarioF usr, LibroF lib) {

		if (lib.getNumEjemplaresPrestados() < lib.getNumEjemplares() && !usr.idLibros.contains(lib.getId())) {

			usr.idLibros.add(lib.getId());
			lib.idUsuarios.add(usr.getId());

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

	public boolean devolucion(UsuarioF usr, LibroF lib) {

		if (lib.getNumEjemplaresPrestados() > 0 && usr.idLibros.contains(lib.getId())) {

			usr.idLibros.removeAll(Arrays.asList(lib.getId()));
			lib.idUsuarios.removeAll(Arrays.asList(usr.getId()));

			lib.setNumEjemplaresPrestados(lib.getNumEjemplaresPrestados() - 1);

			return true;
		} else {
			return false;
		}
	}

}
