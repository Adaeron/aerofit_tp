package ar.ciu.concurrencia.aerofit.model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import ar.ciu.concurrencia.aerofit.dto.VueloDto;

public class Vuelo {
	//private UUID idVuelo;
	private Integer numeroVuelo;
	private Integer pasajes;
	private Integer pasajesVendidos;
	private List<Pasajere> pasajeres;
	
	//Constructores
	public Vuelo(Integer numeroVuelo, Integer pasajes) {
		//this.idVuelo = UUID.randomUUID();
		this.numeroVuelo = numeroVuelo;
		this.pasajes = pasajes;
		this.pasajeres = new ArrayList<Pasajere>();
	}
	
	public Vuelo() {}

	//Métodos
	public VueloDto toDto() {
		VueloDto vueloDto = new VueloDto();
		
		vueloDto.setPasajes(this.pasajes);
		vueloDto.setPasajesVendidos(this.pasajesVendidos);
		
		return vueloDto;
	}
	
	//Getters & Setters
	public Integer getNumeroVuelo() {
		return numeroVuelo;
	}

	public void setNumeroVuelo(Integer numeroVuelo) {
		this.numeroVuelo = numeroVuelo;
	}

	public Integer getPasajes() {
		return pasajes;
	}

	public void setPasajes(Integer pasajes) {
		this.pasajes = pasajes;
	}

	public Integer getPasajesVendidos() {
		return pasajesVendidos;
	}

	public void setPasajesVendidos(Integer pasajesVendidos) {
		this.pasajesVendidos = pasajesVendidos;
	}

	public List<Pasajere> getPasajeres() {
		return pasajeres;
	}

	public void setPasajeres(List<Pasajere> pasajeres) {
		this.pasajeres = pasajeres;
	}
	
}
