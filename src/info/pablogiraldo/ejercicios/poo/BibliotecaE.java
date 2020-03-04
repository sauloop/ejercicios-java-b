package info.pablogiraldo.ejercicios.poo;

import java.util.ArrayList;
import java.util.Arrays;

public class BibliotecaE {

	private ArrayList<UsuarioE> usuarios = new ArrayList<UsuarioE>();
	private ArrayList<LibroE> libros = new ArrayList<LibroE>();

	public BibliotecaE(ArrayList<UsuarioE> usuarios, ArrayList<LibroE> libros) {
		this.usuarios = usuarios;
		this.libros = libros;
	}

	public ArrayList<UsuarioE> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(ArrayList<UsuarioE> usuarios) {
		this.usuarios = usuarios;
	}

	public ArrayList<LibroE> getLibros() {
		return libros;
	}

	public void setLibros(ArrayList<LibroE> libros) {
		this.libros = libros;
	}

//	public boolean prestamo(int idUsuario, int idLibro) {
//
//		boolean prestado = this.prestamo(this.usuarios.get(idUsuario - 1), this.libros.get(idLibro - 1));
//
//		return prestado;
//
//	}

	public boolean prestamo(UsuarioE usr, LibroE lib) {

		if (lib.getNumEjemplaresPrestados() < lib.getNumEjemplares() && !usr.getIdLibros().contains(lib.getId())) {
//			tc.arrLiOb.get(0).arrLiInt.add(5);
			this.usuarios.get(usr.getId() - 1).getIdLibros().add(lib.getId());

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

	public boolean devolucion(UsuarioE usr, LibroE lib) {

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
