package api.inmet.newton.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import api.inmet.newton.dto.AutomaticStationsDto;
import api.inmet.newton.service.AutomaticStationsService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@RequestMapping("https://apitempo.inmet.gov.br/estacao/dados")
@RestController
public class AutomaticStationsController {
	
	/*@Autowired
	AutomaticStationsService ass;

	
	@GetMapping("https://apitempo.inmet.gov.br/estacao/2022-09-29")
	public List<AutomaticStationsDto> recuperarDados(){
		return ass.recuperarTodos();
	}*/

}
