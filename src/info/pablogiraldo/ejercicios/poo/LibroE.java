package info.pablogiraldo.ejercicios.poo;

import java.util.ArrayList;

public class LibroE {

	private int id;
	private ArrayList<Integer> idUsuarios;
	private String titulo;
	private String autor;
	private int numEjemplares;
	private int numEjemplaresPrestados;

	public LibroE(int id, ArrayList<Integer> idUsuarios, String titulo, String autor, int numEjemplares,
			int numEjemplaresPrestados) {
		this.id = id;
		this.idUsuarios = idUsuarios;
		this.titulo = titulo;
		this.autor = autor;
		this.numEjemplares = numEjemplares;
		this.numEjemplaresPrestados = numEjemplaresPrestados;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ArrayList<Integer> getIdUsuarios() {
		return idUsuarios;
	}

	public void setIdUsuarios(ArrayList<Integer> idUsuarios) {
		this.idUsuarios = idUsuarios;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumEjemplares() {
		return numEjemplares;
	}

	public void setNumEjemplares(int numEjemplares) {
		this.numEjemplares = numEjemplares;
	}

	public int getNumEjemplaresPrestados() {
		return numEjemplaresPrestados;
	}

	public void setNumEjemplaresPrestados(int numEjemplaresPrestados) {
		this.numEjemplaresPrestados = numEjemplaresPrestados;
	}

}
