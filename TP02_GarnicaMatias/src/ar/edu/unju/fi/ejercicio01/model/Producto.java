package ar.edu.unju.fi.ejercicio01.model;

public class Producto {
	private String codigo;
	private String descripcion;
	private double precioUni;
	 private OrigenFabricacion origenFabricacion;
	 private Categoria categoria;
	 private boolean estado;
	 
	 public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getPrecioUni() {
		return precioUni;
	}
	public void setPrecioUni(double precioUni) {
		this.precioUni = precioUni;
	}
	public OrigenFabricacion getOrigenFabricacion() {
		return origenFabricacion;
	}
	public void setOrigenFabricacion(OrigenFabricacion origenFabricacion) {
		this.origenFabricacion = origenFabricacion;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	public Producto() {
		super();
	}
	public Producto(String codigo, String descripcion, double precioUni, OrigenFabricacion origenFabricacion,
			Categoria categoria) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.precioUni = precioUni;
		this.origenFabricacion = origenFabricacion;
		this.categoria = categoria;
	}

	public enum OrigenFabricacion {
		 ARGENTINA, CHINA, BRASIL, URUGUAY
	 }
	 public enum Categoria {
		 TELEFONIA, INFORMATICA, ELECTROHOGAR, HERRAMIENTAS
	 }
	@Override
	public String toString() {
		return "\n"+
	           "Codigo: " + codigo + "\n"+
			   "Descripcion: " + descripcion + "\n"+
	           "Precio Unitario: " + precioUni+ "\n"+
	           "Origen de Fabricacion: " + origenFabricacion + "\n"+
	           "Categoria: " + categoria +"\n";
	}
	
	
	public Producto(String codigo, String descripcion, double precioUni, OrigenFabricacion origenFabricacion,
			Categoria categoria, boolean estado) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.precioUni = precioUni;
		this.origenFabricacion = origenFabricacion;
		this.categoria = categoria;
		this.estado = estado;
	}
	
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	
	 

}