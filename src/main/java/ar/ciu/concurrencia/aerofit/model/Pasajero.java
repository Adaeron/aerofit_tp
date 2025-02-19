package ar.ciu.concurrencia.aerofit.model;

import ar.ciu.concurrencia.aerofit.dto.PasajeroDto;

public class Pasajero {
	private String nombre;
	private String apellido;
	private Integer pasajesComprados;
	
	//Constructores
	public Pasajero(String nombre, String apellido, Integer pasajesComprados) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.pasajesComprados = pasajesComprados;
	}

	public Pasajero() {}
	
	//Metodos
	public PasajeroDto toDto() {
		PasajeroDto pasajereDto = new PasajeroDto();
		
		pasajereDto.setNombre(this.nombre);
		pasajereDto.setApellido(this.apellido);
		pasajereDto.setPasajesComprados(this.pasajesComprados);
		
		return pasajereDto;
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
