package ar.edu.unju.fi.ejercicio04.main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import ar.edu.unju.fi.ejercicio04.constantes.Posicion;
import ar.edu.unju.fi.ejercicio04.model.Jugador;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<Jugador> jugadores= new ArrayList<>();
		int opcion=0;
		do {
			System.out.println("\n"+"-----Menu de Opciones-----");
			System.out.println("1-Alta de jugador");
			System.out.println("2-Mostrar todos los jugadores");
			System.out.println("3-Modificar posision de un jugador");
			System.out.println("4-Eliminar un jugador");
			System.out.println("5-Salir");
			System.out.print("\n"+"Ingrese una opcion: ");
			opcion=sc.nextInt();
			switch(opcion) {
			case 1:  System.out.println("\n"+"-----Crear Jugador-----");
	                 sc.nextLine();
	                 System.out.print("Ingrese Nombre: ");
	                 String nombre=sc.nextLine();
	                 System.out.print("Ingrese Apellido: ");
				     String apellido=sc.nextLine();
	                 System.out.print("Ingrese fecha de nacimiento(yyyy-mm-dd): ");
	                 LocalDate fechaNacimiento = LocalDate.parse(sc.nextLine());
	                 System.out.print("Ingrese Nacionalidad: ");
	                 String nacionalidad = sc.nextLine();
	                 System.out.print("Ingrese Estatura: ");
	                 int estatura=sc.nextInt();
	                 System.out.print("Ingrese Peso: ");
	                 int peso = sc.nextInt();
	                 System.out.println("-----Posicion-----");
				        for(int i=0;i<Posicion.values().length;i++) {
				        	System.out.println((i+1)+"-"+Posicion.values()[i]);	
				        }
				        System.out.print("Eliga una opcion: ");
				        opcion=sc.nextInt();
				        Posicion posicion=Posicion.values()[opcion-1];
	                 Jugador jugador = new Jugador(nombre, apellido, fechaNacimiento, nacionalidad, estatura, peso, posicion);
	                 jugadores.add(jugador);
	                 break;
	                 
			case 2:  System.out.println("-----Jugadores-----");
		             if (jugadores.isEmpty()) {
		                 System.out.println("No hay Jugadores.");
		             } else {
		                     for(Jugador j: jugadores) {
		    	             System.out.println(j);
		                     }
		               }
		             break;
		             
			case 3:  System.out.println("-----Modificar Jugador-----");
	                 sc.nextLine();
	                 System.out.print("Ingrese nombre de jugador: ");
	                 String nom=sc.nextLine();
	                 System.out.println("Ingrese apellido de jugador: ");
	                 String apell = sc.nextLine();
	                 for(Jugador j : jugadores) {
	                	 if(j.getNombre().equals(nom)&&j.getApellido().equals(apell)) {
	                 
	                 System.out.println("Que dato desea modificar");
	                 System.out.println("-----Posicion-----");
				        for(int i=0;i<Posicion.values().length;i++) {
				        	System.out.println((i+1)+"-"+Posicion.values()[i]);	
				        }
				        System.out.print("Eliga una opcion: ");
				        opcion=sc.nextInt();
				        posicion=Posicion.values()[opcion-1];
				        j.setPosision(posicion);
	                	 }else {
	                		 System.out.println("Valor incorrecto");
	                	 }
	                 }
	                 
	                 
				     break;
				     
			case 4:  sc.nextLine();
		             System.out.println("-----Eliminar Jugador-----");
	                 System.out.print("Ingrese Nombre: ");
	                 nom = sc.nextLine();
	                 System.out.print("Ingrese Apellido: ");
	                 apell=sc.nextLine();
	                 Iterator<Jugador> iterator = jugadores.iterator();
        	         while(iterator.hasNext()) {
        	    	      Jugador e = iterator.next();
        	    	      if(e.getNombre().equals(nom)&&e.getApellido().equals(apell)) {
        	    		     iterator.remove();	
        	    	      }	
        	         }		      
	        }
			                 
		}while(opcion!=5);
	}	
		
		
}
	

