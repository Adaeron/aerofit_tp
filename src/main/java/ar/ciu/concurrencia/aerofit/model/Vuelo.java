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
	private List<Pasajero> ventas;
	
	//Constructores
	public Vuelo(Integer numeroVuelo, Integer pasajes, LocalDate fecha) {
		this.numeroVuelo = numeroVuelo;
		this.fecha = fecha;
		this.pasajes = pasajes;
		this.pasajesVendidos = 0;
		this.ventas = new ArrayList<Pasajero>();
	}
	
	public Vuelo() {}

	//Métodos
	public VueloDto toDto() {
		VueloDto vueloDto = new VueloDto();
		
		vueloDto.setPasajes(this.pasajes);
		vueloDto.setPasajesVendidos(this.pasajesVendidos);
		vueloDto.setFecha(this.fecha);
		vueloDto.setNumeroVuelo(this.numeroVuelo);
		
		return vueloDto;
	}
	
	//Métodos
	public void guardarVenta(Pasajero venta) {
		this.ventas.add(venta);
	}
	
	public void sumarPasajesVendidos(Integer cantidadPasajes) {
		this.pasajesVendidos += cantidadPasajes;
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

	public List<Pasajero> getVentas() {
		return this.ventas;
	}

	public void setVentas(List<Pasajero> ventas) {
		this.ventas = ventas;
	}
	
}
