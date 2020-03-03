package info.pablogiraldo.ejercicios.poo;

public class Usuario {

	private int id;
	private String nombre;
	boolean enPrestamo;

	public Usuario(int id, String nombre, boolean enPrestamo) {
		this.id = id;
		this.nombre = nombre;
		this.enPrestamo = enPrestamo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isEnPrestamo() {
		return enPrestamo;
	}

	public void setEnPrestamo(boolean enPrestamo) {
		this.enPrestamo = enPrestamo;
	}

}
