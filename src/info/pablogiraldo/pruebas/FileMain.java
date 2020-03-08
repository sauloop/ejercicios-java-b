package info.pablogiraldo.pruebas;

public class FileMain {

	public static void main(String[] args) {

		BibliotecaFile biblioteca = new BibliotecaFile();

//		addDatos(biblioteca);

		biblioteca.cargar();

		if (biblioteca.isConDatos()) {
			biblioteca.prestamo(1, 1);
		}

		System.out.println("\n");

		if (biblioteca.isConDatos()) {
			System.out.println("Nombre usuario: " + biblioteca.getUsuario(1).getNombre());
			System.out.println("Usuario 1 tiene el libro: " + biblioteca.getUsuario(1).getIdLibros().get(0));
			System.out.println("Ejemplares libro 1: " + biblioteca.getLibro(1).getNumEjemplares());
		} else {
			System.out.println("Sin datos.");
		}

//		biblioteca.guardar();
	}

	public static void addDatos(BibliotecaFile biblioteca) {

		String nombreUsuario1 = "Usuario 1";
		String nombreUsuario2 = "Usuario 2";

		String[] datosLibro1 = { "Libro 1", "Autor libro1" };
		String[] datosLibro2 = { "Libro 2", "Autor libro2" };

		biblioteca.addUsuario(1, nombreUsuario1);
		biblioteca.addUsuario(2, nombreUsuario2);

		biblioteca.addLibro(1, datosLibro1);
		biblioteca.addLibro(2, datosLibro2);
		biblioteca.getLibro(1).setNumEjemplares(2);
	}

}
