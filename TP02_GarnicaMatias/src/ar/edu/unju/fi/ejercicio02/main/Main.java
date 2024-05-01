package ar.edu.unju.fi.ejercicio02.main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio02.constantes.Mes;
import ar.edu.unju.fi.ejercicio02.model.Efemeride;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		List<Efemeride> lista= new ArrayList<>();
		int opcion=0;
		do {
			System.out.println("\n"+"-----Menu de Acciones-----");
			System.out.println("1-Crear efemeride");
			System.out.println("2-Mostrar efemerides");
			System.out.println("3-Eliminar efemeride");
			System.out.println("4-Modificar efemeride");
			System.out.println("5-Salir");
			System.out.print("\n"+"Ingrese una opcion: ");
			opcion=sc.nextInt();
			switch(opcion) {
			case 1:  System.out.println("\n"+"-----Crear Efemeride-----");
	                 sc.nextLine();
	                 System.out.print("Ingrese Codigo: ");
	                 String codigo=sc.nextLine();
	                 System.out.print("Ingrese un numero equivalente a un mes: ");
				     int op=sc.nextInt();
				     if(op>0&&op<13) {
				     Mes mes=Mes.values()[op-1];
				     
	                 System.out.print("Ingrese numero del dia: ");
	                 int dia=sc.nextInt();
	                 sc.nextLine();
	                 System.out.print("Ingrese Detalle: ");
	                 String detalle=sc.nextLine();
	                 Efemeride efemeride = new Efemeride(codigo, mes, dia, detalle);
	                 lista.add(efemeride);}
	                 else { System.out.println("Valor invalido");}
	                 break;
	                 
			case 2:  System.out.println("-----Efemerides-----");
		             if (lista.isEmpty()) {
		                 System.out.println("No hay efemerides.");
		             } else {
		                     for(Efemeride e: lista) {
		    	             System.out.println(e);
		                     }
		               }
		             break;
		             
			case 3:  sc.nextLine();
				     System.out.println("-----Eliminar Efemerides-----");
			         System.out.println("Ingrese codigo: ");
			         String cod = sc.nextLine();
			         Iterator<Efemeride> iterator = lista.iterator();
		        	    while(iterator.hasNext()) {
		        	    	Efemeride e = iterator.next();
		        	    	if(e.getCodigo().equals(cod)) {
		        	    		iterator.remove();	
		        	    	}	
		        	    }
				     break;
				     
			case 4:  System.out.println("-----Modificar Producto-----");
	                 sc.nextLine();
	                 System.out.print("Ingrese codigo del producto: ");
	                 cod=sc.nextLine();
	                 System.out.println("Que dato desea modificar");
	                 System.out.println("1-Codigo"+"\n"+"2-Mes"+"\n"+"3-Dia"+"\n"+"4-Detalle");
		             System.out.print("Ingrese una opcion: ");
	                 op = sc.nextInt();
		             sc.nextLine();
	                 for(Efemeride e:lista) {
	        	    	if(e.getCodigo().equals(cod)) {
	        	     		
	     			        switch(op) {
	     			        case 1: System.out.println("Ingrese nuevo codigo: ");
	     			                codigo = sc.nextLine();
	     			                e.setCodigo(codigo);
	     			             break;
	     			        case 2: System.out.print("Ingrese nuevo numero equivalente a un mes: ");
	   				                 op=sc.nextInt();
					                 if(op>0&&op<13) {
	   				                 Mes mes=Mes.values()[op-1];
					                 e.setMes(mes);}
					                 else {System.out.println("Valor incorrecto");}
					             break;
	     			        case 3: System.out.print("Ingrese nuevo numero del dia: ");
	   	                            int dia=sc.nextInt();
	     			                e.setDia(dia);
	     			             break;   
	     			        case 4:  System.out.print("Ingrese nuevo Detalle: ");
	   	                             String detalle=sc.nextLine();
	   	                             e.setDetalle(detalle);
	    			            break;
	     			        
	    			        default :  
	    			        break;
	     			        }
			            
	        	     	}
			         }
			}	
		}while(opcion!=5);

	}

}
