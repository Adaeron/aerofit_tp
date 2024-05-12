package ar.ciu.concurrencia.aerofit.dto;

import ar.ciu.concurrencia.aerofit.model.Vuelo;

public class VueloDto {
	private Integer numeroVuelo;
	private Integer pasajes;
	private Integer pasajesVendidos;
	
	//Constructores
	public VueloDto(Integer numeroVuelo, Integer pasajes, Integer pasajesVendidos) {
		this.numeroVuelo = numeroVuelo;
		this.pasajes = pasajes;
		this.pasajesVendidos = pasajesVendidos;
	}
	
	public VueloDto() {}

	//Métodos
	public Vuelo toModel() {
		Vuelo vueloModel = new Vuelo();
		
		vueloModel.setNumeroVuelo(this.numeroVuelo);
		vueloModel.setPasajes(this.pasajes);
		vueloModel.setPasajesVendidos(this.pasajesVendidos);
		
		return vueloModel;
	}

	
	//Getters & Setters
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
