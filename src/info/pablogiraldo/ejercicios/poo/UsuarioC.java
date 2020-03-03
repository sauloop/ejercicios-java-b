package info.pablogiraldo.ejercicios.poo;

public class UsuarioC {

	private int id;
	private int idLibro;
	private String nombre;

	public UsuarioC(int id, int idLibro, String nombre) {
		super();
		this.id = id;
		this.idLibro = idLibro;
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdLibro() {
		return idLibro;
	}

	public void setIdLibro(int idLibro) {
		this.idLibro = idLibro;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
