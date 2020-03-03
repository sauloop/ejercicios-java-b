package info.pablogiraldo.ejercicios.poo;

public class Libro {

	private int id;
	private String titulo;
	private String autor;
	private int numEjemplares;
	private int numEjemplaresPrestados;

	public Libro(int id, String titulo, String autor, int numEjemplares, int numEjemplaresPrestados) {
		this.id = id;
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
