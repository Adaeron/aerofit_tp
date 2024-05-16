package ar.ciu.concurrencia.aerofit.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import ar.ciu.concurrencia.aerofit.dto.VueloDto;

public class Vuelo {
	private Integer numeroVuelo;
	private LocalDate fecha;
	private Integer pasajes;
	private Integer pasajesVendidos;
	private List<Pasajere> pasajeres;
	
	//Constructores
	public Vuelo(Integer numeroVuelo, Integer pasajes, LocalDate fecha) {
		//this.idVuelo = UUID.randomUUID();
		this.numeroVuelo = numeroVuelo;
		this.fecha = fecha;
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

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
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
