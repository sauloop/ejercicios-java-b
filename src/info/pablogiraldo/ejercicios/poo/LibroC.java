package info.pablogiraldo.ejercicios.poo;

public class LibroC {

	private int id;
	private int idUsuario;
	private String titulo;
	private String autor;
	boolean prestado;

	public LibroC(int id, int idUsuario, String titulo, String autor, boolean prestado) {
		this.id = id;
		this.idUsuario = idUsuario;
		this.titulo = titulo;
		this.autor = autor;
		this.prestado = prestado;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
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

	public boolean isPrestado() {
		return prestado;
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}

}
