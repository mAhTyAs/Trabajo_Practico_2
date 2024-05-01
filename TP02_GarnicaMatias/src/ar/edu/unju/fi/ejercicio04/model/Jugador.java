package ar.edu.unju.fi.ejercicio04.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import ar.edu.unju.fi.ejercicio04.constantes.Posicion;

public class Jugador {
	private String nombre;
	private String apellido;
	private LocalDate fechaNacimiento;
	private String nacionalidad;
	private float estatura;
	private int peso;
	private Posicion posision;
	private int edad;
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public float getEstatura() {
		return estatura;
	}

	public void setEstatura(float estatura) {
		this.estatura = estatura;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public Posicion getPosision() {
		return posision;
	}

	public void setPosision(Posicion posision) {
		this.posision = posision;
	}

	public int calcularEdad() {
		LocalDate fechaHoy = LocalDate.now();
		int edad = fechaHoy.getYear()-fechaNacimiento.getYear();
		return edad;
	}

	public Jugador(String nombre, String apellido, LocalDate fechaNacimiento,String nacionalidad, float estatura, int peso,
			Posicion posision) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.nacionalidad = nacionalidad;
		this.estatura = estatura;
		this.peso = peso;
		this.posision = posision;
		this.edad = calcularEdad();
	}

	@Override
	public String toString() {
		DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd-MM-yyyy");
		return "Jugador"+"\n"+
	           "Nombre: " + nombre +"\n"+ 
	           "Apellido: " + apellido +"\n"+ 
	           "FechaNacimiento: " + fechaNacimiento.format(formatter) +"\n"+
	           "Nacionalidad: "+ nacionalidad +"\n"+
	           "Estatura: " + estatura +"\n"+ 
	           "Peso: " + peso +"\n"+ 
	           "Posision: " + posision +"\n"+ 
	           "Edad: " + edad +"\n";
	}
	
	

}
