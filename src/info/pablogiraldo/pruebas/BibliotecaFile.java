package info.pablogiraldo.pruebas;

import java.util.ArrayList;
import java.util.Arrays;
import java.io.*;

public class BibliotecaFile {

//	private ArrayList<SerialDemo> demos;
	private ArrayList<UsuarioFile> usuarios;
	private ArrayList<LibroFile> libros;

	private String archivoUsuarios = "C:\\pruebas\\usuarios.ser";
	private String archivoLibros = "C:\\pruebas\\libros.ser";

	public BibliotecaFile() {
//		this.demos = new ArrayList<SerialDemo>();
		this.usuarios = new ArrayList<UsuarioFile>();
		this.libros = new ArrayList<LibroFile>();
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

//	public ArrayList<SerialDemo> getDemos() {
//		return this.demos;
//	}
//
//	public void setDemos(ArrayList<SerialDemo> demos) {
//		this.demos = demos;
//	}

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
			FileOutputStream fos = new FileOutputStream(archivoUsuarios);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(this.usuarios);
			oos.close();
			fos.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

		try {
			FileOutputStream fos = new FileOutputStream(archivoLibros);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(this.libros);
			oos.close();
			fos.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

		System.out.println("\n");
		System.out.println("Datos guardados.");
	}

	@SuppressWarnings("unchecked")
	public void cargar() {
		try {
			FileInputStream fis = new FileInputStream(archivoUsuarios);
			ObjectInputStream ois = new ObjectInputStream(fis);

			this.usuarios = (ArrayList<UsuarioFile>) ois.readObject();

			ois.close();
			fis.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
			return;
		} catch (ClassNotFoundException c) {
			System.out.println("Class not found");
			c.printStackTrace();
			return;
		}

		try {
			FileInputStream fis = new FileInputStream(archivoLibros);
			ObjectInputStream ois = new ObjectInputStream(fis);

			this.libros = (ArrayList<LibroFile>) ois.readObject();

			ois.close();
			fis.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
			return;
		} catch (ClassNotFoundException c) {
			System.out.println("Class not found");
			c.printStackTrace();
			return;
		}
		System.out.println("\n");
		System.out.println("Datos cargados.");
	}

}
