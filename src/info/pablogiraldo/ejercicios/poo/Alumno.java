package info.pablogiraldo.ejercicios.poo;

public class Alumno {

	private String dni;
	private String nombre;
	private double notaMedia;
//	public ArrayList<String> asignaturas;
//	public ArrayList<Double> notas;
	public String[] asignaturas;
	public double[] notas;

	public Alumno() {
		this.asignaturas = new String[2];
		this.notas = new double[2];
	}

	public Alumno(String dni, String nombre) {
		this.dni = dni;
		this.nombre = nombre;
		this.asignaturas = new String[2];
		this.notas = new double[2];
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getNotaMedia() {
		this.notaMedia();
		return notaMedia;
	}

	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}

	public void notaMedia() {
		double sumaNotas = 0.0;
		for (int i = 0; i < this.notas.length; i++) {
			sumaNotas += this.notas[i];
		}
		this.notaMedia = sumaNotas / this.notas.length;

	}

}
