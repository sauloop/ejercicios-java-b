package info.pablogiraldo.pruebas;

import java.io.*;
import java.util.ArrayList;

//import java.util.ArrayList;

public class UsuarioFile implements Serializable {

	private static final long serialVersionUID = 1L;
//	private static int numInstancias = 1;
	private int id;

	private ArrayList<Integer> idLibros;
	private String nombre;

	public UsuarioFile(int id, String nombre) {
		this.id = id;
		this.idLibros = new ArrayList<Integer>();
		this.nombre = nombre;
//		numInstancias++;
	}

//	public int getNumInstancias() {
//		return numInstancias;
//	}

	public int getId() {
		return id;
	}

	public ArrayList<Integer> getIdLibros() {
		return idLibros;
	}

	public void setIdLibros(ArrayList<Integer> idLibros) {
		this.idLibros = idLibros;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return id + " nombre: " + nombre + ".";
	}

}
