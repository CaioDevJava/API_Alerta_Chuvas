package api.inmet.newton.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import api.inmet.newton.dto.AutomaticStationsFullDto;
import api.inmet.newton.service.AutomaticStationsFullService;

@RestController
public class AutomaticStationsFullController {

	
	
	@Autowired
	private AutomaticStationsFullService service;
	
	@GetMapping("/v1/automaticStationsFull")
	public ResponseEntity recuperar() throws Exception {
			
		 service.recuperarApi();

		return ResponseEntity.ok().body(null);
	}
	
	@PostMapping
	public ResponseEntity<List<AutomaticStationsFullDto>> recupera()  {
		//service.recuperar();
		return ResponseEntity.status(HttpStatus.OK).body(null);
	}
}
