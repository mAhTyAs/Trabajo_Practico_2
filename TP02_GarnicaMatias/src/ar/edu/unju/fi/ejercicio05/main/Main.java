package ar.edu.unju.fi.ejercicio05.main;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio01.model.Producto;
import ar.edu.unju.fi.ejercicio01.model.Producto.Categoria;
import ar.edu.unju.fi.ejercicio01.model.Producto.OrigenFabricacion;
import ar.edu.unju.fi.ejercicio05.model.PagoEfectivo;
import ar.edu.unju.fi.ejercicio05.model.PagoTarjeta;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<Producto>lista = new ArrayList<>();
		lista.add(new Producto("2HV44M", "Mouse",2000.00 ,OrigenFabricacion.CHINA, Categoria.INFORMATICA, true));
		lista.add(new Producto("4SM12D", "Teclado",2382.38 ,OrigenFabricacion.CHINA, Categoria.INFORMATICA, true));
		lista.add(new Producto("1PV74I", "Microondas",70000.02 ,OrigenFabricacion.ARGENTINA, Categoria.ELECTROHOGAR, false));
		lista.add(new Producto("0OU08K", "Heladera",100000.56 ,OrigenFabricacion.ARGENTINA, Categoria.ELECTROHOGAR, false));
		lista.add(new Producto("9TE94W", "Ventilador",80000.12 ,OrigenFabricacion.URUGUAY, Categoria.ELECTROHOGAR, true));
		lista.add(new Producto("5YY66N", "TV",100000.00 ,OrigenFabricacion.URUGUAY, Categoria.ELECTROHOGAR, true));
		lista.add(new Producto("3BX31Z", "Impresora",60999.99 ,OrigenFabricacion.CHINA, Categoria.INFORMATICA, true));
		lista.add(new Producto("6ZV14F", "Monitor",50123.33 ,OrigenFabricacion.BRASIL, Categoria.INFORMATICA, false));
		lista.add(new Producto("7GD37J", "Taladro",20349.99 ,OrigenFabricacion.ARGENTINA, Categoria.HERRAMIENTAS, false));
		lista.add(new Producto("8AS81S", "Telefono",15000.12 ,OrigenFabricacion.CHINA, Categoria.TELEFONIA, true));
		lista.add(new Producto("1LV42Q", "Caladora",29999.99 ,OrigenFabricacion.BRASIL, Categoria.HERRAMIENTAS, false));
		lista.add(new Producto("4HF89A", "Martillo",3000.23 ,OrigenFabricacion.BRASIL, Categoria.HERRAMIENTAS, true));
		lista.add(new Producto("7NK99O", "Fibra Optica",5500.47 ,OrigenFabricacion.ARGENTINA, Categoria.TELEFONIA, false));
		lista.add(new Producto("0HV55P", "Memoria Ram",15600.45 ,OrigenFabricacion.URUGUAY, Categoria.INFORMATICA, true));
		lista.add(new Producto("2XN30X", "Presador i5",50000.76 ,OrigenFabricacion.CHINA, Categoria.INFORMATICA, true));
		
		int opcion=0;
		do {
			System.out.println("-----Menu-----");
			System.out.println("1-Mostrar Productos");
			System.out.println("2-Realizar Compra");
			System.out.println("3-Salir");
			System.out.print("Elija una Opcion: ");
			opcion = sc.nextInt();
			switch(opcion) {
			case 1: System.out.println("-----Productos Disponibles-----");
			        for(Producto prod : lista) {
			        	if(prod.isEstado()) {
			        		System.out.println(prod);
			        	}
			        	
			        }
				break;
			case 2: System.out.println("-----Realizar Compra-----");
				    List<Producto> prodComp = new ArrayList<>();
				    boolean band;
				    double monto=0.0;
				    sc.nextLine();
			        do {
				    	System.out.print("Ingrese Codigo del Produucto: ");
				    	String codigo = sc.nextLine();
				    	
				    	for(Producto prod : lista) {
				    		
				    		if(prod.getCodigo().equals(codigo)) {
				    			prodComp.add(prod);
				    			monto+=prod.getPrecioUni();
				    		}
				    		
				    	}
				    	System.out.print("Desea Comprar mas Productos?(Si/No): ");
				    	String op = sc.nextLine();
				    	band= op.equalsIgnoreCase("Si");
				    	
				    }while(band);
			        System.out.println("-----Opiones de pago-----");
			        System.out.println("1-Pago en efectivo");
			        System.out.println("2-Pago con tarjeta");
			        System.out.print("Elija una opicion: ");
			        int op = sc.nextInt();
			        sc.nextLine();
			        switch(op) {
			        case 1: PagoEfectivo efecivo = new PagoEfectivo(monto, LocalDate.now());
			                efecivo.realizarPago(monto);
			                efecivo.imprimirRecibo();
			                break;
			        case 2: System.out.print("Ingrese Numero de Tarjeta: ");
			                String num = sc.nextLine();
			        	    PagoTarjeta tarjeta = new PagoTarjeta(num, LocalDate.now(), monto);  
			        	    tarjeta.realizarPago(monto);
			        	    tarjeta.imprimirRecibo();
			        }
				break;
			}
		}while(opcion!=3);
		

	}

}
