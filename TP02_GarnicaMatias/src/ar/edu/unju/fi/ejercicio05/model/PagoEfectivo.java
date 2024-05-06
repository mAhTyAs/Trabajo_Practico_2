package ar.edu.unju.fi.ejercicio05.model;

import java.time.LocalDate;

import ar.edu.unju.fi.ejercicio05.interfaces.Pago;

public class PagoEfectivo implements Pago {
	private double montoPagado;
	private LocalDate fechaPago;
	
	
	
	public PagoEfectivo(double montoPagado, LocalDate fechaPago) {
		super();
		this.montoPagado = montoPagado;
		this.fechaPago = fechaPago;
	}
	@Override
	public void realizarPago(double monto) {
	    this.montoPagado = monto-(monto*0.10);
		
	}
	@Override
	public void imprimirRecibo() {
		System.out.println("----- Recibo de Pago en Efectivo -----");
        System.out.println("Fecha de pago: " + fechaPago);
        System.out.println("Monto pagado: " + montoPagado);
		
	}

}
