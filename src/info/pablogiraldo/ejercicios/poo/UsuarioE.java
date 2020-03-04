package info.pablogiraldo.ejercicios.poo;

import java.util.ArrayList;

public class UsuarioE {

	private int id;
	private ArrayList<Integer> idLibros;
	private String nombre;

	public UsuarioE(int id, ArrayList<Integer> idLibros, String nombre) {
		this.id = id;
		this.idLibros = idLibros;
		this.nombre = nombre;
		this.idLibros.add(5);
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
