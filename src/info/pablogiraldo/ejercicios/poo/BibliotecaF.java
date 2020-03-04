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

//	public boolean prestamo(int idUsuario, int idLibro) {
//
//		boolean prestado = this.prestamo(this.usuarios.get(idUsuario - 1), this.libros.get(idLibro - 1));
//
//		return prestado;
//
//	}

	public boolean prestamo(UsuarioF usr, LibroF lib) {

		if (lib.getNumEjemplaresPrestados() < lib.getNumEjemplares() && !usr.idLibros.contains(lib.getId())) {
//			tc.arrLiOb.get(0).arrLiInt.add(5);
			this.usuarios.get(usr.getId() - 1).idLibros.add(lib.getId());

//			usr.getIdLibros().add((lib.getId()));
//			lib.getIdUsuarios().add((usr.getId()));

			lib.setNumEjemplaresPrestados(lib.getNumEjemplaresPrestados() + 1);

			return true;
		} else {
			return false;
		}
	}

//	public boolean devolucion(int idUsuario, int idLibro) {
//
//		boolean devuelto = this.devolucion(this.usuarios.get(idUsuario - 1), this.libros.get(idLibro - 1));
//
//		return devuelto;
//	}

	public boolean devolucion(UsuarioF usr, LibroF lib) {

		if (lib.getNumEjemplaresPrestados() > 0 && usr.getIdLibros().contains(lib.getId())) {

			this.usuarios.get(usr.getId() - 1).idLibros.removeAll(Arrays.asList(lib.getId()));

//			usr.getIdLibros().removeAll(Arrays.asList(lib.getId()));
//			lib.getIdUsuarios().removeAll(Arrays.asList(usr.getId()));

			lib.setNumEjemplaresPrestados(lib.getNumEjemplaresPrestados() - 1);

			return true;
		} else {
			return false;
		}
	}

}
