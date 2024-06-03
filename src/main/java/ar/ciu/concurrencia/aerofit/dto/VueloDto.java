package ar.ciu.concurrencia.aerofit.dto;

import java.time.LocalDate;

import ar.ciu.concurrencia.aerofit.model.Vuelo;

public class VueloDto {
	private Integer numeroVuelo;
	private LocalDate fecha;
	private Integer pasajes;
	private Integer pasajesVendidos;
	
	//Constructores
	public VueloDto(Integer numeroVuelo, Integer pasajes, Integer pasajesVendidos, LocalDate fecha) {
		this.numeroVuelo = numeroVuelo;
		this.pasajes = pasajes;
		this.pasajesVendidos = pasajesVendidos;
		this.fecha = fecha;
	}
	
	public VueloDto() {}

	//Métodos
	public Vuelo toModel() {
		Vuelo vueloModel = new Vuelo();
		
		vueloModel.setNumeroVuelo(this.numeroVuelo);
		vueloModel.setPasajes(this.pasajes);
		vueloModel.setPasajesVendidos(this.pasajesVendidos);
		vueloModel.setFecha(this.fecha);
		
		return vueloModel;
	}

	
	//Getters & Setters
	public LocalDate getFecha() {
		return this.fecha;
	}
	
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	
	public Integer getNumeroVuelo() {
		return this.numeroVuelo;
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
	
	
}
