package ar.ciu.concurrencia.aerofit.dto;

import ar.ciu.concurrencia.aerofit.model.Pasajere;

public class PasajereDto {
	private String nombre;
	private String apellido;
	private Integer pasajesComprados;
	
	//Constructores
	public PasajereDto() {}
	
	//Métodos
	public Pasajere toModel() {
		Pasajere modelPasajere = new Pasajere();
		
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
