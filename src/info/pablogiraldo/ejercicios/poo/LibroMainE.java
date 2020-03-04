package info.pablogiraldo.ejercicios.poo;

import java.util.ArrayList;

public class LibroMainE {

	public static void main(String[] args) {

		ArrayList<Integer> idLibros = new ArrayList<Integer>();

		System.out.println(idLibros.size());

		UsuarioE usuario1 = new UsuarioE(1, idLibros, "Usuario 1");
		UsuarioE usuario2 = new UsuarioE(2, idLibros, "Usuario 2");
//		UsuarioE usuario3 = new UsuarioE(3, idLibros, "Usuario 3");

		UsuarioF usuariof1 = new UsuarioF(1, idLibros, "Usuario 1");
		UsuarioF usuariof2 = new UsuarioF(2, idLibros, "Usuario 2");

		System.out.println("Número libros usuario f1: " + usuariof1.idLibros.size());
		System.out.println("Número libros usuario f2: " + usuariof2.idLibros.size());

		System.out.println("Número libros usuario 1: " + usuario1.getIdLibros().size());
		System.out.println("Número libros usuario 2: " + usuario2.getIdLibros().size());

		ArrayList<Integer> idUsuarios = new ArrayList<Integer>();

		LibroE libro1 = new LibroE(1, idUsuarios, "Libro 1", "Autor A", 1, 0);
		LibroE libro2 = new LibroE(2, idUsuarios, "Libro 2", "Autor B", 1, 0);

		ArrayList<UsuarioE> usuarios = new ArrayList<UsuarioE>();
		ArrayList<LibroE> libros = new ArrayList<LibroE>();

		usuarios.add(usuario1);
		usuarios.add(usuario2);
//		usuarios.add(usuario3);

		libros.add(libro1);
		libros.add(libro2);

		BibliotecaE bibliotecaE = new BibliotecaE(usuarios, libros);

		System.out.println("Número libros usuario 1: " + usuario1.getIdLibros().size());
		System.out.println("Número libros usuario 2: " + usuario2.getIdLibros().size());

		System.out.println("\n");
		System.out.println("Préstamos:");
		System.out.println("Usuario 2 saca libro 1: " + bibliotecaE.prestamo(usuario2, libro1));
		System.out.println("Libro 1 prestados: " + libro1.getNumEjemplaresPrestados());
		System.out.println("Libro 2 prestados: " + libro2.getNumEjemplaresPrestados());
//		System.out.println("Usuario 2 saca libro 1: " + bibliotecaE.prestamo(usuario2, libro1));
//		System.out.println("Usuario 1 saca libro 2: " + bibliotecaE.prestamo(usuario1, libro2));
//		System.out.println("Usuario 1 saca libro 2: " + bibliotecaE.prestamo(1, 2));
//		System.out.println("Libro 1 prestados: " + libro1.getNumEjemplaresPrestados());
//		System.out.println("Libro 2 prestados: " + libro2.getNumEjemplaresPrestados());
		System.out.println("Número libros usuario 1: " + usuario1.getIdLibros().size());
		System.out.println("Número libros usuario 2: " + usuario2.getIdLibros().size());

		System.out.println("\n");
		System.out.println("Devoluciones:");
		System.out.println("Usuario 2 devuelve libro 1: " + bibliotecaE.devolucion(usuario2, libro1));
		System.out.println("Libro 1 prestados: " + libro1.getNumEjemplaresPrestados());
		System.out.println("Libro 2 prestados: " + libro2.getNumEjemplaresPrestados());
//		System.out.println("Usuario 2 devuelve libro 1: " + bibliotecaE.devolucion(usuario2, libro1));
//		System.out.println("Usuario 1 devuelve libro 2: " + bibliotecaE.devolucion(usuario1, libro2));
//		System.out.println("Usuario 1 devuelve libro 2: " + bibliotecaE.devolucion(1, 2));
//		System.out.println("Libro 1 prestados: " + libro1.getNumEjemplaresPrestados());
//		System.out.println("Libro 2 prestados: " + libro2.getNumEjemplaresPrestados());
		System.out.println("Número libros usuario 1: " + usuario1.getIdLibros().size());
		System.out.println("Número libros usuario 2: " + usuario2.getIdLibros().size());

	}

}
