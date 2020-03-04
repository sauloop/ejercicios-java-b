package info.pablogiraldo.ejercicios.poo;

import java.util.ArrayList;

public class LibroMainD {

	public static void main(String[] args) {

		UsuarioC usuario1 = new UsuarioC(1, 0, "Usuario A");
		UsuarioC usuario2 = new UsuarioC(2, 0, "Usuario B");
		UsuarioC usuario3 = new UsuarioC(3, 0, "Usuario C");

		LibroC libro1 = new LibroC(1, 0, "Libro 1", "Autor A", false);
		LibroC libro2 = new LibroC(2, 0, "Libro 2", "Autor B", false);

		System.out.println("\n");
		System.out.println("Libro 1 está prestado: " + libro1.isPrestado());
		System.out.println("Libro 2 está prestado: " + libro2.isPrestado());

		ArrayList<UsuarioC> usuarios = new ArrayList<UsuarioC>();
		ArrayList<LibroC> libros = new ArrayList<LibroC>();

		usuarios.add(usuario1);
		usuarios.add(usuario2);
		usuarios.add(usuario3);

		libros.add(libro1);
		libros.add(libro2);

		BibliotecaD bibliotecaD = new BibliotecaD(usuarios, libros);

		System.out.println("\n");
		System.out.println("Préstamos:");
		System.out.println("Usuario 2 saca libro 1: " + bibliotecaD.prestamo(usuario2, libro1));
		System.out.println("Libro 1 está prestado: " + libro1.isPrestado());
		System.out.println("Usuario 2 saca libro 1: " + bibliotecaD.prestamo(2, 1));
		System.out.println("Usuario 1 saca libro 2: " + bibliotecaD.prestamo(1, 2));
		System.out.println("Libro 2 está prestado: " + libro2.isPrestado());

		System.out.println("\n");
		System.out.println("Devoluciones:");
		System.out.println("Usuario 2 devuelve libro 1: " + bibliotecaD.devolucion(usuario2, libro1));
		System.out.println("Libro 1 está prestado: " + libro1.isPrestado());
		System.out.println("Usuario 2 devuelve libro 1: " + bibliotecaD.devolucion(2, 1));
		System.out.println("Usuario 1 devuelve libro 2: " + bibliotecaD.devolucion(1, 2));
		System.out.println("Libro 2 está prestado: " + libro2.isPrestado());
	}

}
