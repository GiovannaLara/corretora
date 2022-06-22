package br.gov.sp.etec.corretora.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.sp.etec.corretora.model.CarroDto;

@RestController
public class CarroController {
	
	@GetMapping("get-carro")
	public ResponseEntity<?> getCarro(){
		
		CarroDto dto = new CarroDto();
		dto.setNomeCarro("Tiggo");
		return ResponseEntity.ok(dto);
	}
	

}
