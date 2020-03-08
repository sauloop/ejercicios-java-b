package info.pablogiraldo.pruebas;

import java.io.*;
import java.util.ArrayList;

public class LibroFile implements Serializable {

	private static final long serialVersionUID = 1L;
//	private static int numInstancias = 1;
	private int id;
	private ArrayList<Integer> idUsuarios;
	private String titulo;
	private String autor;
	private int numEjemplares;
	private int numEjemplaresPrestados;

	public LibroFile(int id, String titulo, String autor) {
		this.id = id;
		this.idUsuarios = new ArrayList<Integer>();
		this.titulo = titulo;
		this.autor = autor;
		this.numEjemplares = 1;
		this.numEjemplaresPrestados = 0;
//		numInstancias++;
	}

//	public int getNumInstancias() {
//		return numInstancias;
//	}

	public int getId() {
		return id;
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

	@Override
	public String toString() {
		return id + " título: " + titulo + ", autor: " + autor + ", ejemplares: " + numEjemplares
				+ ", ejemplares prestados: " + numEjemplaresPrestados + ".";
	}

}
