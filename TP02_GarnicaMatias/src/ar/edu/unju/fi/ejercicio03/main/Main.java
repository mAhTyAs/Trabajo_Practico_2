package ar.edu.unju.fi.ejercicio03.main;
import ar.edu.unju.fi.ejercicio03.constantes.Provincia;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Provincia[] lista= Provincia.values(); 
		for(Provincia p:lista) {
			System.out.println("\n"+"Provincia: "+p);
			System.out.println("Cantidad de Habitantes: "+p.getCantidadPoblacion());
			System.out.println("Superficie: "+p.getSuperficie()+" km²");
			System.out.println("Densidad Poblacional: " +p.calcularDensidadPob()+" hab./km²");
		}
	}

}
