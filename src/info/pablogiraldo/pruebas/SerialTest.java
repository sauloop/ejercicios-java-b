package info.pablogiraldo.pruebas;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

//class SerialTest {
//	public static void main(String[] args) {
//		SerialDemo object = new SerialDemo(1, "geeksforgeeks");
//		String filename = "C:\\pruebas\\objeto.ser";
//
//		// Serialization
//		try {
//
//			// Saving of object in a file
//			FileOutputStream file = new FileOutputStream(filename);
//			ObjectOutputStream out = new ObjectOutputStream(file);
//
//			// Method for serialization of object
//			out.writeObject(object);
//
//			out.close();
//			file.close();
//
//			System.out.println("Object has been serialized");
//
//		}
//
//		catch (IOException ex) {
//			System.out.println("IOException is caught");
//		}
//
//		SerialDemo object1 = null;
//
//		// Deserialization
//		try {
//			// Reading the object from a file
//			FileInputStream file = new FileInputStream(filename);
//			ObjectInputStream in = new ObjectInputStream(file);
//
//			// Method for deserialization of object
//			object1 = (SerialDemo) in.readObject();
//
//			in.close();
//			file.close();
//
//			System.out.println("Object has been deserialized ");
//			System.out.println("a = " + object1.a);
//			System.out.println("b = " + object1.b);
//		}
//
//		catch (IOException ex) {
//			System.out.println("IOException is caught");
//		}
//
//		catch (ClassNotFoundException ex) {
//			System.out.println("ClassNotFoundException is caught");
//		}
//
//	}
//}
