package ar.ciu.concurrencia.aerofit.store;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

import ar.ciu.concurrencia.aerofit.model.Vuelo;

public class StoreDB {
	private Collection<Vuelo> vuelos;
	private static StoreDB instance = new StoreDB();
	
	private StoreDB() {
		this.vuelos = new ArrayList<Vuelo>();
		vuelos.add(new Vuelo(1000, 50, LocalDate.parse("2024-06-20")));
		vuelos.add(new Vuelo(1001, 60, LocalDate.parse("2024-06-25")));
		vuelos.add(new Vuelo(1002, 30, LocalDate.parse("2024-06-19")));
	}
	
	public ArrayList<Vuelo> getVuelos() {
		return (ArrayList<Vuelo>) this.vuelos;
	}
	
	public Vuelo getVueloById(Integer numeroVuelo) {
		return this.vuelos.stream()
						.filter(vuelo -> vuelo.getNumeroVuelo().equals(numeroVuelo))
						.findFirst()
						.orElse(null);
		
	}
	
	public Collection<Vuelo> findAll(){
		return this.vuelos;
	}
	
	public static StoreDB getInstance() {
		return instance;
	}

	public void setVuelos(Collection<Vuelo> vuelos) {
		this.vuelos = vuelos;
	}
}
