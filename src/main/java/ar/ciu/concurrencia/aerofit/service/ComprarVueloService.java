package ar.ciu.concurrencia.aerofit.service;

import org.springframework.stereotype.Service;

import ar.ciu.concurrencia.aerofit.model.Pasajero;
import ar.ciu.concurrencia.aerofit.model.Vuelo;

@Service
public class ComprarVueloService {
	
	public synchronized static String registrarVenta(Vuelo vuelo, Pasajero pasajero) {
		
		if(vuelo.getPasajesVendidos() + pasajero.getPasajesComprados() > vuelo.getPasajes()) {
			return "El cupo de pasajes para la venta es insuficiente.";
		} else {
			vuelo.sumarPasajesVendidos(pasajero.getPasajesComprados());
			vuelo.guardarVenta(pasajero);
			return "Compra exitosa!";
		}
		
	}
}
