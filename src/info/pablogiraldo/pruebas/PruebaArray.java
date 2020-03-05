package info.pablogiraldo.pruebas;

import java.util.ArrayList;
import java.util.Arrays;

public class PruebaArray {

	public static void main(String[] args) {

		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(5);
		numeros.add(7);
		System.out.println("\n");
		for (int num : numeros) {
			System.out.println(num);
		}

		numeros.removeAll(Arrays.asList(7));

		System.out.println("\n");
		for (int num : numeros) {
			System.out.println(num);
		}
	}

}
