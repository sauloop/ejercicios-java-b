package info.pablogiraldo.ejercicios.poo;

import java.util.Scanner;

public class Ej6AlumnoMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String usrStr = "";

		Alumno alumno = new Alumno();

		System.out.println("Nombre:");
		usrStr = sc.nextLine();
		alumno.setNombre(usrStr);

		System.out.println("Dni:");
		usrStr = sc.nextLine();
		alumno.setDni(usrStr);

		for (int i = 0; i < alumno.notas.length; i++) {
			System.out.println("Asignatura " + (i + 1) + ":");
			usrStr = sc.nextLine();
			alumno.asignaturas[i] = usrStr;
			System.out.println("Nota asignatura " + (i + 1) + ":");
			usrStr = sc.nextLine();
			alumno.notas[i] = Double.parseDouble(usrStr);
		}

		sc.close();

//		alumno.notaMedia();
		System.out.println("Nota media: " + alumno.getNotaMedia());
	}

}
