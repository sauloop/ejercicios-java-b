package info.pablogiraldo.ejercicios.poo;

import java.util.ArrayList;

public class LibroMainF {

	public static void main(String[] args) {

		ArrayList<Integer> idLibros = new ArrayList<Integer>();

		System.out.println(idLibros.size());

		UsuarioF usuario1 = new UsuarioF(1, idLibros, "Usuario 1");
		UsuarioF usuario2 = new UsuarioF(2, idLibros, "Usuario 2");
		UsuarioF usuario3 = new UsuarioF(3, idLibros, "Usuario 3");

		System.out.println("Número libros usuario 1: " + usuario1.idLibros.size());
		System.out.println("Número libros usuario 2: " + usuario2.idLibros.size());

		ArrayList<Integer> idUsuarios = new ArrayList<Integer>();

		LibroF libro1 = new LibroF(1, idUsuarios, "Libro 1", "Autor A", 1, 0);
		LibroF libro2 = new LibroF(2, idUsuarios, "Libro 2", "Autor B", 1, 0);

		ArrayList<UsuarioF> usuarios = new ArrayList<UsuarioF>();
		ArrayList<LibroF> libros = new ArrayList<LibroF>();

		usuarios.add(usuario1);
		usuarios.add(usuario2);
		usuarios.add(usuario3);

		libros.add(libro1);
		libros.add(libro2);

		BibliotecaF bibliotecaF = new BibliotecaF(usuarios, libros);

		System.out.println("Número libros usuario 1: " + usuario1.getIdLibros().size());
		System.out.println("Número libros usuario 2: " + usuario2.getIdLibros().size());

		System.out.println("\n");
		System.out.println("Préstamos:");
		System.out.println("Usuario 2 saca libro 1: " + bibliotecaF.prestamo(usuario2, libro1));
		System.out.println("Número libros usuario 1: " + usuario1.idLibros.size());
		System.out.println("Número libros usuario 2: " + usuario2.idLibros.size());

		System.out.println("\n");
		System.out.println("Devoluciones:");
		System.out.println("Usuario 2 devuelve libro 1: " + bibliotecaF.devolucion(usuario2, libro1));
		System.out.println("Número libros usuario f1: " + usuario1.idLibros.size());
		System.out.println("Número libros usuario f2: " + usuario2.idLibros.size());

	}

}
