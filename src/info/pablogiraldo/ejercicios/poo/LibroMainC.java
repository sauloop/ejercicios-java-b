package info.pablogiraldo.ejercicios.poo;

import java.util.ArrayList;

public class LibroMainC {

	public static void main(String[] args) {

//		ArrayList<Integer> idLibros = new ArrayList<Integer>();

		UsuarioC usuario1 = new UsuarioC(1, 0, "Usuario A");
		UsuarioC usuario2 = new UsuarioC(2, 0, "Usuario B");
		UsuarioC usuario3 = new UsuarioC(3, 0, "Usuario C");

		LibroC libro1 = new LibroC(1, 0, "Libro 1", "Autor A", false);
		LibroC libro2 = new LibroC(2, 0, "Libro 2", "Autor B", false);

		ArrayList<UsuarioC> usuarios = new ArrayList<UsuarioC>();
		ArrayList<LibroC> libros = new ArrayList<LibroC>();

		usuarios.add(usuario1);
		usuarios.add(usuario2);
		usuarios.add(usuario3);

		libros.add(libro1);
		libros.add(libro2);

		BibliotecaC bibliotecaC = new BibliotecaC(usuarios, libros);

		System.out.println("\n");
		System.out.println("Préstamos:");
		System.out.println("Usuario 2 saca libro 1: " + bibliotecaC.prestamo(2, 1));
		System.out.println(bibliotecaC.getUsuarios().get(1).getIdLibro());
		System.out.println("Usuario 2 saca libro 1: " + bibliotecaC.prestamo(2, 1));

		System.out.println("\n");
		System.out.println("Devoluciones:");
		System.out.println("Usuario 2 devuelve libro 1: " + bibliotecaC.devolucion(2, 1));
		System.out.println(bibliotecaC.getUsuarios().get(1).getIdLibro());
		System.out.println("Usuario 2 devuelve libro 1: " + bibliotecaC.devolucion(2, 1));

	}

}
