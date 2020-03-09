package info.pablogiraldo.pruebas;

import java.util.ArrayList;
import java.util.Arrays;
import java.io.*;

public class BibliotecaFile {
	private boolean conDatos = false;

	private ArrayList<UsuarioFile> usuarios;
	private ArrayList<LibroFile> libros;

	private String archivoUsuarios = "C:\\dev\\guardados\\usuarios.ser";
	private String archivoLibros = "C:\\dev\\guardados\\libros.ser";

	public BibliotecaFile() {
		this.usuarios = new ArrayList<UsuarioFile>();
		this.libros = new ArrayList<LibroFile>();
	}

	public boolean isConDatos() {
		return this.conDatos;
	}

	public void setConDatos(boolean conDatos) {
		this.conDatos = conDatos;
	}

	public UsuarioFile getUsuario(int id) {
		return this.usuarios.get(id - 1);
	}

	public LibroFile getLibro(int id) {
		return this.libros.get(id - 1);
	}

	public void listaUsuarios() {
		for (UsuarioFile usr : this.usuarios) {
			System.out.println(usr);
		}
	}

	public void listaLibros() {
		for (LibroFile lib : this.libros) {
			System.out.println(lib);
		}
	}

	public ArrayList<UsuarioFile> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(ArrayList<UsuarioFile> usuarios) {
		this.usuarios = usuarios;
	}

	public ArrayList<LibroFile> getLibros() {
		return libros;
	}

	public void setLibros(ArrayList<LibroFile> libros) {
		this.libros = libros;
	}

	public void addUsuario(int id, String nombreUsuario) {
		UsuarioFile usr = new UsuarioFile(id, nombreUsuario);
		usuarios.add(usr);
		System.out.println(usr.getNombre() + " añadido a la biblioteca.");
	}

	public void addLibro(int id, String[] datosLibro) {
		LibroFile lib = new LibroFile(id, datosLibro[0], datosLibro[1]);
		libros.add(lib);
		System.out.println(lib.getTitulo() + " añadido a la biblioteca.");
	}

	public boolean prestamo(int idUsuario, int idLibro) {

		boolean prestado = this.prestamo(this.usuarios.get(idUsuario - 1), this.libros.get(idLibro - 1));

		return prestado;

	}

	public boolean prestamo(UsuarioFile usr, LibroFile lib) {

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

	public boolean devolucion(UsuarioFile usr, LibroFile lib) {

		if (lib.getNumEjemplaresPrestados() > 0 && usr.getIdLibros().contains(lib.getId())) {

			usr.getIdLibros().removeAll(Arrays.asList(lib.getId()));
			lib.getIdUsuarios().removeAll(Arrays.asList(usr.getId()));

			lib.setNumEjemplaresPrestados(lib.getNumEjemplaresPrestados() - 1);

			return true;
		} else {
			return false;
		}
	}

	public void guardar() {

		try {

			FileOutputStream fosUsuarios = new FileOutputStream(archivoUsuarios);
			FileOutputStream fosLibros = new FileOutputStream(archivoLibros);

			ObjectOutputStream oosUsuarios = new ObjectOutputStream(fosUsuarios);
			ObjectOutputStream oosLibros = new ObjectOutputStream(fosLibros);

			oosUsuarios.writeObject(this.usuarios);
			oosLibros.writeObject(this.libros);

			oosUsuarios.close();
			fosUsuarios.close();

			oosLibros.close();
			fosLibros.close();

		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

		System.out.println("\n");
		System.out.println("Datos guardados.");
	}

	@SuppressWarnings("unchecked")
	public void cargar() {
		try {

			FileInputStream fisUsuarios = new FileInputStream(archivoUsuarios);
			FileInputStream fisLibros = new FileInputStream(archivoLibros);

			ObjectInputStream oisUsuarios = new ObjectInputStream(fisUsuarios);
			ObjectInputStream oisLibros = new ObjectInputStream(fisLibros);

			this.usuarios = (ArrayList<UsuarioFile>) oisUsuarios.readObject();
			this.libros = (ArrayList<LibroFile>) oisLibros.readObject();

			oisUsuarios.close();
			fisUsuarios.close();

			oisLibros.close();
			fisLibros.close();

		} catch (IOException ioe) {
			ioe.printStackTrace();
			return;
		} catch (ClassNotFoundException c) {
			System.out.println("Class not found");
			c.printStackTrace();
			return;
		}

		this.conDatos = true;

		System.out.println("\n");
		System.out.println("Datos cargados.");
	}

}
