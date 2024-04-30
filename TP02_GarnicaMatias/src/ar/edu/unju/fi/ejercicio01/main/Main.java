package ar.edu.unju.fi.ejercicio01.main;
import ar.edu.unju.fi.ejercicio01.model.Producto;
import ar.edu.unju.fi.ejercicio01.model.Producto.Categoria;
import ar.edu.unju.fi.ejercicio01.model.Producto.OrigenFabricacion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import ar.edu.unju.fi.ejercicio01.model.Producto;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		List<Producto> lista = new ArrayList<Producto>();
		
		int opcion=0;
		do {
			System.out.println("\n"+"-----Menu de Opciones-----");
			System.out.println("1-Crear Producto");
			System.out.println("2-Mostrar Productos");
			System.out.println("3-Modificar Producto");
			System.out.println("4-Salir");
			System.out.print("\n"+"Ingrese una opcion: ");
			opcion=sc.nextInt();
			switch(opcion) {
			//Crear Producto
			case 1: System.out.println("\n"+"-----Crear Producto-----");
			        sc.nextLine();
			        System.out.print("Ingrese Codigo: ");
			        String codigo=sc.nextLine();
			        System.out.print("Ingrese Descripsion: ");
			        String descripcion=sc.nextLine();
			        System.out.print("Ingrese Precio Unitario: ");
			        double precioUni=sc.nextDouble();
			        System.out.println("-----Origen de Fabricacion-----");
			        for(int i=0;i<OrigenFabricacion.values().length;i++) {
			        	System.out.println((i+1)+"-"+OrigenFabricacion.values()[i]);	
			        }
			        System.out.print("Eliga una opcion: ");
			        opcion=sc.nextInt();
			        OrigenFabricacion origenFabricacion=OrigenFabricacion.values()[opcion-1];
			        System.out.println("-----Categoria-----");
			        for(int i=0;i<Categoria.values().length;i++) {
			        	System.out.println((i+1)+"-"+Categoria.values()[i]);	
			        }
			        System.out.print("Eliga una opcion: ");
			        opcion=sc.nextInt();
			        Categoria categoria=Categoria.values()[opcion-1];
			        Producto prod = new Producto(codigo, descripcion, precioUni, origenFabricacion, categoria);
			        lista.add(prod);
			        break;
		 //Mostrar Productos
			case 2:  System.out.println("-----Productos-----");
		    if (lista.isEmpty()) {
		        System.out.println("No hay productos.");
		    } else {
		       for(Producto j: lista) {
		    	   System.out.println(j);
		        }
		    }
			        break;
		//Modificar un Producto       
			case 3: System.out.println("-----Modificar Producto-----");
			        sc.nextLine();
			        System.out.print("Ingrese codigo del producto: ");
			        String cod=sc.nextLine();
			        System.out.println("Que dato desea modificar");
			        System.out.println("1-Descripcion"+"\n"+"2-Precio"+"\n"+"3-Origen"+"\n"+"4-Categoria");
 			        System.out.print("Ingrese una opcion: ");
			        int dato = sc.nextInt();
 			        sc.nextLine();
			        for(Producto j:lista) {
			        	    	if(j.getCodigo().equals(cod)) {
			        	    		
			     			        switch(dato) {
			     			        case 1: System.out.println("Ingrese nueva descripcion: ");
			     			                descripcion = sc.nextLine();
			     			                j.setDescripcion(descripcion);
			     			             break;
			     			        case 2: System.out.println("Ingrese nuevo precio: ");
			     			                precioUni = sc.nextDouble();
			     			                j.setPrecioUni(precioUni);
			     			             break;   
			     			        case 3: System.out.println("-----Origen de Fabricacion-----");
			    			                for(int i=0;i<OrigenFabricacion.values().length;i++) {
			    			        	    System.out.println((i)+"-"+OrigenFabricacion.values()[i]);	
			    			                }
			    			                System.out.print("Eliga una opcion: ");
			    			                opcion=sc.nextInt();
			    			                origenFabricacion=OrigenFabricacion.values()[opcion];
			    			                j.setOrigenFabricacion(origenFabricacion);
			    			            break;
			     			        case 4: System.out.println("-----Categoria-----");
			    			                for(int i=0;i<Categoria.values().length;i++) {
			    			        	    System.out.println((i)+"-"+Categoria.values()[i]);	
			    			                }
			    			                System.out.print("Eliga una opcion: ");
			    			                opcion=sc.nextInt();
			    			                categoria=Categoria.values()[opcion];
			    			                j.setCategoria(categoria);
			    			             break;
			    			        default :  
			    			        break;
			     			        }
			        	    	}
			         	     }
            default: 
            	break;
			}    
		}while(opcion!=4);
	}
}