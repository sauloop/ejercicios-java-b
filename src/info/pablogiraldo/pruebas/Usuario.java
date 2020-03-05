package info.pablogiraldo.pruebas;

import java.util.ArrayList;

public class Usuario {

	private static int numInstancias = 1;
	private int id;
	private ArrayList<Integer> idLibros;
	private String nombre;

	public Usuario(String nombre) {
		this.id = numInstancias;
		this.idLibros = new ArrayList<Integer>();
		this.nombre = nombre;
		numInstancias++;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

}
