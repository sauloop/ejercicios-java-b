package info.pablogiraldo.ejercicios.poo;

public class UsuarioLibro {
	private int idUsuario;
	private int idLibro;

	public UsuarioLibro(int idUsuario, int idLibro) {
		this.idUsuario = idUsuario;
		this.idLibro = idLibro;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public int getIdLibro() {
		return idLibro;
	}

	public void setIdLibro(int idLibro) {
		this.idLibro = idLibro;
	}

}
