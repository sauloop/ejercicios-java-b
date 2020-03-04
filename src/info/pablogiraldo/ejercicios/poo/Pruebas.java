package info.pablogiraldo.ejercicios.poo;

import java.util.ArrayList;

public class Pruebas {

	public static void main(String[] args) {

		ArrayList<Integer> arrLiInt = new ArrayList<Integer>();
		ArrayList<Integer> arrLiIntB = new ArrayList<Integer>();
		ArrayList<TestOb> arrLiOb = new ArrayList<TestOb>();

//		arrLiInt.add(5);

		TestOb to1 = new TestOb(arrLiInt);
		TestOb to2 = new TestOb(arrLiIntB);

//		System.out.println(to1.arrLiInt.size());
//		System.out.println(to2.arrLiInt.size());

		arrLiOb.add(to1);
		arrLiOb.add(to2);

//		System.out.println(arrLiOb.get(0).arrLiInt.size());
//		System.out.println(arrLiOb.get(1).arrLiInt.size());

		TestClass tc = new TestClass(arrLiOb);

		tc.arrLiOb.get(0).arrLiInt.add(5);

		System.out.println(tc.arrLiOb.get(0).arrLiInt.size());
		System.out.println(tc.arrLiOb.get(1).arrLiInt.size());

		System.out.println(to1.arrLiInt.size());
		System.out.println(to2.arrLiInt.size());

//		System.out.println(to1.getArrLiInt().size());
//		System.out.println(to2.getArrLiInt().size());

//		tc.arrLiOb.get(0).arrLiInt.add(5);

		// System.out.println(to1.arrLiInt.size());
//		System.out.println(to2.arrLiInt.size());
//
//		System.out.println(tc.arrLiOb.get(0).arrLiInt.size());
//		System.out.println(tc.arrLiOb.get(1).arrLiInt.size());

	}
}
