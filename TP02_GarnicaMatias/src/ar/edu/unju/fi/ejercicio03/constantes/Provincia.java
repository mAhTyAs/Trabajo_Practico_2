package ar.edu.unju.fi.ejercicio03.constantes;

public enum Provincia {
	JUJUY(811611, 53219), SALTA(1441351,155488), TUCUMAN(1731820, 22524), CATAMARCA(429562, 102602), LA_RIOJA(383865 , 89680 ), SANTIAGO_DEL_ESTERO(1060906, 136351 );
	
	 private int cantidadPoblacion;
     private double superficie;
     private double densidadPob= calcularDensidadPob();

	 
     private Provincia(int cantidadPoblacion, double superficie) {
		 this.cantidadPoblacion = cantidadPoblacion;
		 this.superficie = superficie;
		 this.densidadPob = densidadPob;
		 
	}

	public int getCantidadPoblacion() {
		return cantidadPoblacion;
	}

	public void setCantidadPoblacion(int cantidadPoblacion) {
		this.cantidadPoblacion = cantidadPoblacion;
	}

	public double getSuperficie() {
		return superficie;
	}

	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}
     
    public double calcularDensidadPob() {
    	double densidadPob = cantidadPoblacion/superficie;
    	return densidadPob;
    }
     
     
	
}
     
    
    
