package ar.edu.unju.fi.ejercicio05.model;

import java.time.LocalDate;

import ar.edu.unju.fi.ejercicio05.interfaces.Pago;

public class PagoTarjeta implements Pago {
	private String numTarjeta;
	private LocalDate fechaPago;
	private double montoPagado;
	
	
	public PagoTarjeta(String numTarjeta, LocalDate fechaPago, double montoPagado) {
		super();
		this.numTarjeta = numTarjeta;
		this.fechaPago = fechaPago;
		this.montoPagado = montoPagado;
	}
	@Override
	public void realizarPago(double monto) {
		this.montoPagado = monto*1.15;
		
	}
	@Override
	public void imprimirRecibo() {
		System.out.println("----- Recibo de Pago con Tarjeta -----");
        System.out.println("Número de tarjeta: " + numTarjeta);
        System.out.println("Fecha de pago: " + fechaPago);
        System.out.println("Monto pagado: " + montoPagado);
		
	}

}
