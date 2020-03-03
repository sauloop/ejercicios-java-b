package info.pablogiraldo.ejercicios.poo;

import java.util.ArrayList;

public class LibroMainB {

	public static void main(String[] args) {

		Usuario usuarioA = new Usuario(1, "Usuario A", false);
		Usuario usuarioB = new Usuario(2, "Usuario B", false);
		Usuario usuarioC = new Usuario(3, "Usuario C", false);

		Libro libroA = new Libro(1, "Libro A", "Autor A", 1, 0);
		Libro libroB = new Libro(1, "Libro B", "Autor B", 2, 0);

		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
		ArrayList<Libro> libros = new ArrayList<Libro>();

		usuarios.add(usuarioA);
		usuarios.add(usuarioB);
		usuarios.add(usuarioC);

		libros.add(libroA);
		libros.add(libroB);

		BibliotecaB bibliotecaB = new BibliotecaB(usuarios, libros);

		System.out.println("\n");
		System.out.println("N�mero ejemplares libro A: " + libroA.getNumEjemplares());
		System.out.println("N�mero ejemplares libro B: " + libroB.getNumEjemplares());

		System.out.println("\n");
		System.out.println("En pr�stamo usuario A: " + usuarioA.isEnPrestamo());
		System.out.println("En pr�stamo usuario B: " + usuarioB.isEnPrestamo());
		System.out.println("En pr�stamo usuario C: " + usuarioC.isEnPrestamo());

		System.out.println("\n");
		System.out.println("Pr�stamos:");
		System.out.println("Usuario B saca libro A: " + bibliotecaB.prestamo(2, 1));
		System.out.println("Usuario B saca libro B: " + bibliotecaB.prestamo(2, 2));
		System.out.println("Usuario A saca libro B: " + bibliotecaB.prestamo(1, 2));
		System.out.println("Usuario C saca libro A: " + bibliotecaB.prestamo(3, 1));

		System.out.println("\n");
		System.out.println("En pr�stamo usuario A: " + usuarioA.isEnPrestamo());
		System.out.println("En pr�stamo usuario B: " + usuarioB.isEnPrestamo());
		System.out.println("En pr�stamo usuario C: " + usuarioC.isEnPrestamo());

		System.out.println("\n");
		System.out.println("Devoluciones:");
		System.out.println("Usuario B: " + bibliotecaB.devolucion(2, 1));
		System.out.println("Usuario A: " + bibliotecaB.devolucion(1, 2));
		System.out.println("Usuario C: " + bibliotecaB.devolucion(3, 1));

		System.out.println("\n");
		System.out.println("En pr�stamo usuario A: " + usuarioA.isEnPrestamo());
		System.out.println("En pr�stamo usuario B: " + usuarioB.isEnPrestamo());
		System.out.println("En pr�stamo usuario C: " + usuarioC.isEnPrestamo());

	}

}
