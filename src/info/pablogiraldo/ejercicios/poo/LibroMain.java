package info.pablogiraldo.ejercicios.poo;

import java.util.ArrayList;

public class LibroMain {

	public static void main(String[] args) {
		Libro libroA = new Libro(1, "Libro A", "Fulano", 1, 0);
		Libro libroB = new Libro(1, "Libro B", "Mengano", 2, 0);

		ArrayList<Libro> libros = new ArrayList<Libro>();

		libros.add(libroA);
		libros.add(libroB);

		Biblioteca biblioteca = new Biblioteca(libros);

		System.out.println("\n");
		System.out.println("Número ejemplares libro A: " + libroA.getNumEjemplares());
		System.out.println("Número ejemplares libro B: " + libroB.getNumEjemplares());

		System.out.println("\n");
		System.out.println("Préstamos:");
		System.out.println("Libro A: " + biblioteca.prestamo(1));
		System.out.println("Libro A: " + biblioteca.prestamo(1));
		System.out.println("Libro B: " + biblioteca.prestamo(2));
		System.out.println("Libro B: " + biblioteca.prestamo(2));
		System.out.println("Libro B: " + biblioteca.prestamo(2));

		System.out.println("\n");
		System.out.println("Devoluciones:");
		System.out.println("Libro A: " + biblioteca.devolucion(1));
		System.out.println("Libro A: " + biblioteca.devolucion(1));
		System.out.println("Libro B: " + biblioteca.devolucion(2));
		System.out.println("Libro B: " + biblioteca.devolucion(2));
		System.out.println("Libro B: " + biblioteca.devolucion(2));

	}

}
