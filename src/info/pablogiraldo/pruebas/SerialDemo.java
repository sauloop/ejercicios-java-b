package info.pablogiraldo.pruebas;

import java.io.*;

class SerialDemo implements Serializable {
	private static final long serialVersionUID = 1L;
	private int a;
	private String b;

	// Default constructor
	public SerialDemo(int a, String b) {
		this.a = a;
		this.b = b;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public String getB() {
		return b;
	}

	public void setB(String b) {
		this.b = b;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
