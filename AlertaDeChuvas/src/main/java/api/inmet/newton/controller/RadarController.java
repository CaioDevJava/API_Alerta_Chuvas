package api.inmet.newton.controller;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import api.inmet.newton.models.DadosInmet;
import api.inmet.newton.service.RadarService;

@RestController
//@RequestMapping("https://apitempo.inmet.gov.br/estacao/dados/2020-05-02")
public class RadarController {
	

	
	//RadarService rds = new RadarService();
	
	@GetMapping("./atual")
	//@ResponseStatus(HttpStatus.CREATED)
	public DadosInmet buscar () {
		return null;
		
	}

}
