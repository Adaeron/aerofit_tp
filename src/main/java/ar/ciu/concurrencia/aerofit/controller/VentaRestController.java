package ar.ciu.concurrencia.aerofit.controller;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.ciu.concurrencia.aerofit.dto.CompraDto;
import ar.ciu.concurrencia.aerofit.dto.PasajeroDto;
import ar.ciu.concurrencia.aerofit.dto.VueloDto;
import ar.ciu.concurrencia.aerofit.model.Pasajero;
import ar.ciu.concurrencia.aerofit.model.Vuelo;
import ar.ciu.concurrencia.aerofit.service.ComprarVueloService;
import ar.ciu.concurrencia.aerofit.store.StoreDB;

@RestController
@RequestMapping("/vuelos")
public class VentaRestController {
	
	@GetMapping("/listar")
	public ResponseEntity<?> getVuelos(){
		Collection<Vuelo> vuelos = StoreDB.getInstance().findAll();
		Collection<VueloDto> vuelosDto = new ArrayList<VueloDto>();
		
		vuelos.forEach(v -> vuelosDto.add(v.toDto()));
		
		return ResponseEntity.ok(vuelosDto);
	}
	
	@GetMapping("/vuelo/{numeroVuelo}")
	public ResponseEntity<?>getVueloById(@PathVariable Integer numeroVuelo){
		VueloDto vueloDto = StoreDB.getInstance().getVueloById(numeroVuelo).toDto();
		
		return ResponseEntity.ok(vueloDto);
	}
	
	@PutMapping("/compraPasaje")
	public ResponseEntity<?> compraPasaje(@RequestBody CompraDto compra){
		Integer numeroVuelo = compra.getNumeroVuelo();
		Vuelo vuelo = StoreDB.getInstance().getVueloById(numeroVuelo);
		Pasajero pasajeroModel = new Pasajero(compra.getNombre(), compra.getApellido(), compra.getPasajesVendidos());
		
		return ResponseEntity.ok(ComprarVueloService.registrarVenta(vuelo, pasajeroModel));
	}
}
