package ar.ciu.concurrencia.aerofit.dto;

public class CompraDto {
	private Integer numeroVuelo;
	private String nombre;
	private String apellido;
	private Integer pasajesVendidos;
	
	//Constructor
	public CompraDto() {}
	
	public CompraDto(Integer numeroVuelo, String nombre, String apellido, Integer pasajesVendidos) {
		this.numeroVuelo = numeroVuelo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.pasajesVendidos = pasajesVendidos;
	}
	
	//Getters & Setters
	public Integer getNumeroVuelo() {
		return numeroVuelo;
	}

	public void setNumeroVuelo(Integer numeroVuelo) {
		this.numeroVuelo = numeroVuelo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getPasajesVendidos() {
		return pasajesVendidos;
	}

	public void setPasajesVendidos(Integer pasajesVendidos) {
		this.pasajesVendidos = pasajesVendidos;
	}
}
