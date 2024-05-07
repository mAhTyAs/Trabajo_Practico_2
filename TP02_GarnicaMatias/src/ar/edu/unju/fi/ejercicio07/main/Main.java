package ar.edu.unju.fi.ejercicio07.main;
import java.nio.file.DirectoryStream.Filter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import ar.edu.unju.fi.ejercicio01.model.Producto;
import ar.edu.unju.fi.ejercicio01.model.Producto.Categoria;
import ar.edu.unju.fi.ejercicio01.model.Producto.OrigenFabricacion;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<Producto>lista = new ArrayList<Producto>();
		Producto p1 = new Producto("2HV44M", "Mouse",2000.00 ,OrigenFabricacion.CHINA, Categoria.INFORMATICA, true);
		Producto p2 = new Producto("4SM12D", "Teclado",2382.38 ,OrigenFabricacion.CHINA, Categoria.INFORMATICA, true);
		Producto p3 = new Producto("1PV74I", "Microondas",70000.02 ,OrigenFabricacion.ARGENTINA, Categoria.ELECTROHOGAR, false);
		Producto p4= new Producto("0OU08K", "Heladera",100000.56 ,OrigenFabricacion.ARGENTINA, Categoria.ELECTROHOGAR, false);
		Producto p5 = new Producto("9TE94W", "Ventilador",80000.12 ,OrigenFabricacion.URUGUAY, Categoria.ELECTROHOGAR, true);
		Producto p6 = new Producto("5YY66N", "TV",100000.00 ,OrigenFabricacion.URUGUAY, Categoria.ELECTROHOGAR, true);
		Producto p7 = new Producto("3BX31Z", "Impresora",60999.99 ,OrigenFabricacion.CHINA, Categoria.INFORMATICA, true);
		Producto p8 = new Producto("6ZV14F", "Monitor",50123.33 ,OrigenFabricacion.BRASIL, Categoria.INFORMATICA, false);
		Producto p9 = new Producto("7GD37J", "Taladro",20349.99 ,OrigenFabricacion.ARGENTINA, Categoria.HERRAMIENTAS, false);
		Producto p10 = new Producto("8AS81S", "Telefono",15000.12 ,OrigenFabricacion.CHINA, Categoria.TELEFONIA, true);
		Producto p11 = new Producto("1LV42Q", "Caladora",29999.99 ,OrigenFabricacion.BRASIL, Categoria.HERRAMIENTAS, false);
		Producto p12 = new Producto("4HF89A", "Martillo",3000.23 ,OrigenFabricacion.BRASIL, Categoria.HERRAMIENTAS, true);
		Producto p13 = new Producto("7NK99O", "Fibra Optica",5500.47 ,OrigenFabricacion.ARGENTINA, Categoria.TELEFONIA, false);
		Producto p14 = new Producto("0HV55P", "Memoria Ram",15600.45 ,OrigenFabricacion.URUGUAY, Categoria.INFORMATICA, true);
		Producto p15 = new Producto("2XN30X", "Presador i5",50000.76 ,OrigenFabricacion.CHINA, Categoria.INFORMATICA, true);
		lista = Arrays.asList(p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12,p13,p14,p15);
		
		int opcion=0;
		do {
			System.out.println("-----Menu-----");
			System.out.println("1-Mostrar Productos");
			System.out.println("2-Mostrar Productos Faltanes");
			System.out.println("3-Incrementar los Precios en un 20%");
			System.out.println("4-Mostrar Productos Electrohogar que esten disponibles");
			System.out.println("5-Ordenar productos por precio de forma descendente");
			System.out.println("6-Mostrar Productos con los nombres en Mayuscula");
			System.out.println("7-Salir");
			System.out.print("Elija una Opcion: ");
			opcion = sc.nextInt();
			switch(opcion) {
			case 1: Consumer<Producto> mostrar = p -> {if (p.isEstado())
			            System.out.println(p);
		            };
		            lista.forEach(mostrar);
				break;
				 
				
			case 2: for(Producto mnp : mostrarNoDisp(lista)) {
				        System.out.println(mnp);
			        }
			
				
				break;
				
			case 3: for(Producto aum : aumentarPrecio(lista)) {
		                System.out.println(aum);
			         }
				break;
				
			case 4: for(Producto mce : mostrarCategElect(lista)) {
                        System.out.println(mce);
			        }
				break;
				
			case 5: for(Producto ord : ordenarPrecio(lista)) {
                     System.out.println(ord);
			        }
				break;
				
			case 6: for(Producto mpm : mostrarProdMayusc(lista)) {
                        System.out.println(mpm);
			        }
				break;
			}
		}while(opcion!=7);
		
		
		

	}
public static List<Producto> mostrarNoDisp(List<Producto>lista){
	Predicate<Producto> cond = p -> !p.isEstado();
	return lista.stream()
	         .filter(cond)
			 .collect(Collectors.toList());
	}

public static List<Producto> aumentarPrecio(List<Producto>lista){
	Function<Producto, Producto> nuevoPrecio = p-> {p.setPrecioUni(p.getPrecioUni()*1.20f);
	    return p;
	};
	
	return lista.stream()
			.map(nuevoPrecio)
			.collect(Collectors.toList());
}

public static List<Producto> mostrarCategElect(List<Producto>lista){
	Predicate<Producto> cond = p -> p.getCategoria()==Categoria.ELECTROHOGAR;
	return lista.stream()
	         .filter(cond)
			 .collect(Collectors.toList());
		        
}

public static List<Producto> ordenarPrecio(List<Producto> lista){
	Comparator<Producto> comp = Comparator.comparing(Producto :: getPrecioUni).reversed();
    lista.sort(comp);
    return lista;
}

public static List<Producto> mostrarProdMayusc(List<Producto>lista){
	Function<Producto, Producto> mayuscula = p-> {p.setDescripcion(p.getDescripcion().toUpperCase());
	    return p;
	};
	
	return lista.stream()
			.map(mayuscula)
			.collect(Collectors.toList());
}

}
