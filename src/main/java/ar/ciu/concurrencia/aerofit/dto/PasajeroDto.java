package ar.ciu.concurrencia.aerofit.dto;

import ar.ciu.concurrencia.aerofit.model.Pasajero;

public class PasajeroDto {
	private String nombre;
	private String apellido;
	private Integer pasajesComprados;
	
	//Constructores
	public PasajeroDto() {}
	
	public PasajeroDto(String nombre, String apellido, Integer pasajesComprados) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.pasajesComprados = pasajesComprados;
	}
	
	//Métodos
	public Pasajero toModel() {
		Pasajero modelPasajere = new Pasajero();
		
		modelPasajere.setNombre(this.nombre);
		modelPasajere.setApellido(this.apellido);
		modelPasajere.setPasajesComprados(pasajesComprados);
		
		return modelPasajere;
	}

	//Getters & Setters
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

	public Integer getPasajesComprados() {
		return pasajesComprados;
	}

	public void setPasajesComprados(Integer pasajesComprados) {
		this.pasajesComprados = pasajesComprados;
	}
	
}
