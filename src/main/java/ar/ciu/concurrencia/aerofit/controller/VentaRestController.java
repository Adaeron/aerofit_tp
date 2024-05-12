package ar.ciu.concurrencia.aerofit.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VentaRestController {
	@GetMapping("/hola")
	public ResponseEntity<?> saludo(){
		return ResponseEntity.ok("Hola");
	}
}
