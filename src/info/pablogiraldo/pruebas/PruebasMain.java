package info.pablogiraldo.pruebas;

public class PruebasMain {

	public static void main(String[] args) {

		String nombreUsuario1 = "Usuario 1";
		String nombreUsuario2 = "Usuario 2";

		String[] datosLibro1 = { "Libro 1", "Autor libro1" };
		String[] datosLibro2 = { "Libro 2", "Autor libro2" };

		Biblioteca biblioteca = new Biblioteca();

		System.out.println("\n");

		biblioteca.addUsuario(nombreUsuario1);
		biblioteca.addUsuario(nombreUsuario2);

		biblioteca.addLibro(datosLibro1);
		biblioteca.addLibro(datosLibro2);
		biblioteca.getLibro(1).setNumEjemplares(2);

		System.out.println("\n");
		System.out.println("Libro 1 ejemplares: " + biblioteca.getLibro(1).getNumEjemplares());
		System.out.println("Libro 2 ejemplares: " + biblioteca.getLibro(2).getNumEjemplares());
		System.out.println("Libro 1 prestados: " + biblioteca.getLibro(1).getNumEjemplaresPrestados());
		System.out.println("Libro 2 prestados: " + biblioteca.getLibro(2).getNumEjemplaresPrestados());
		System.out.println("Número libros usuario 1: " + biblioteca.getUsuario(1).getIdLibros().size());
		System.out.println("Número libros usuario 2: " + biblioteca.getUsuario(2).getIdLibros().size());

		System.out.println("\n");
		System.out.println("Préstamos:");
		System.out.println("Usuario 2 saca libro 1: " + biblioteca.prestamo(2, 1));
		if (biblioteca.getLibro(1).getIdUsuarios().size() > 0 && biblioteca.getUsuario(2).getIdLibros().size() > 0) {
			System.out.println("Libro prestado al usuario: " + biblioteca.getLibro(1).getIdUsuarios().get(0));
			System.out.println("El usuario " + biblioteca.getLibro(1).getIdUsuarios().get(0) + " tiene el libro: "
					+ biblioteca.getUsuario(2).getIdLibros().get(0));
		}
		System.out.println("Usuario 2 saca libro 1: " + biblioteca.prestamo(2, 1));
		System.out.println("Usuario 1 saca libro 1: " + biblioteca.prestamo(1, 1));
		System.out.println("Usuario 1 saca libro 1: " + biblioteca.prestamo(1, 1));
		System.out.println("Libro 1 prestados: " + biblioteca.getLibro(1).getNumEjemplaresPrestados());
		System.out.println("Libro 2 prestados: " + biblioteca.getLibro(2).getNumEjemplaresPrestados());
		System.out.println("Número libros usuario 1: " + biblioteca.getUsuario(1).getIdLibros().size());
		System.out.println("Número libros usuario 2: " + biblioteca.getUsuario(2).getIdLibros().size());

		System.out.println("\n");
		System.out.println("Devoluciones:");
		System.out.println("Usuario 2 devuelve libro 1: " + biblioteca.devolucion(2, 1));
		if (biblioteca.getLibro(1).getIdUsuarios().size() > 0 && biblioteca.getUsuario(2).getIdLibros().size() > 0) {
			System.out.println("Libro prestado al usuario: " + biblioteca.getLibro(1).getIdUsuarios().get(0));
			System.out.println("El usuario " + biblioteca.getLibro(1).getIdUsuarios().get(0) + " tiene el libro: "
					+ biblioteca.getUsuario(2).getIdLibros().get(0));
		}
		System.out.println("Usuario 2 devuelve libro 1: " + biblioteca.devolucion(2, 1));
		System.out.println("Libro 1 prestados: " + biblioteca.getLibro(1).getNumEjemplaresPrestados());
		System.out.println("Libro 2 prestados: " + biblioteca.getLibro(2).getNumEjemplaresPrestados());
		System.out.println("Número libros usuario 1: " + biblioteca.getUsuario(1).getIdLibros().size());
		System.out.println("Número libros usuario 2: " + biblioteca.getUsuario(2).getIdLibros().size());
	}

}
