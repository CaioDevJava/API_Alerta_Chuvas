package api.inmet.newton.service;


import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import api.inmet.newton.dto.AutomaticStationsFullDto;
import api.inmet.newton.helper.AutomaticStationsFullHelper;
import api.inmet.newton.mapper.AutomaticStationsFullMapper;
import api.inmet.newton.models.AutomaticStationsFullEntity;
import api.inmet.newton.util.JsonUtil;
@Service
public class AutomaticStationsFullService  {
	
	//tomaticStationsFullRepository asfr;
	
	
	public ResponseEntity recuperarApi () throws Exception {
		
		
		SimpleDateFormat dataFormater = new SimpleDateFormat("yyyy-MM-dd");
		String data = dataFormater.format(new Date());
		
		System.out.println(data);
		
		//Cria a requisição Http
		HttpRequest request = HttpRequest.newBuilder()
				.GET()
				.uri(URI.create("https://apitempo.inmet.gov.br/estacao/dados/" + data) )
				.header("accept", "application/json")
				.timeout(Duration.ofSeconds(5) )
				.build();
		
		// Executa a Requisição Http
		HttpClient httpClient = HttpClient.newBuilder()
				.connectTimeout(Duration.ofSeconds(5))
				.build();

		// Captura a response
		HttpResponse<String> response = httpClient.send(request, BodyHandlers.ofString());
		
		// Converte a Response em String
		String json = response.body().toString();

		// Converte String em objeto
		AutomaticStationsFullDto[] dto = JsonUtil.convertToObject(json, AutomaticStationsFullDto[].class);

		List<AutomaticStationsFullEntity>  entityStation = new ArrayList<>();
			
		//Testa pra ver se o DTO foi prenchido com os dados da API
			if(!dto.equals(null)) {
			
				//Converte o DTO em Entity
				entityStation= AutomaticStationsFullHelper.preencherEntity(dto);

				//Retorna o status e a lista de entity preenchida
				return ResponseEntity.status(HttpStatus.OK).body(entityStation);
			}
			
			// Em caso de sucesso retorna erro 400 e uma mensagem de onde foi o erro
		return ResponseEntity.badRequest().body("Erro ao converter em entity");
	}
	
		

	
	public List<AutomaticStationsFullDto> buscar(){
		return null;
	}
	
	@Transactional
	public ResponseEntity<String> salvarEntity(AutomaticStationsFullDto dto) {
		
		List<AutomaticStationsFullEntity> entityList = new ArrayList<>();
		AutomaticStationsFullEntity entity = new AutomaticStationsFullEntity();
		
		if(dto != null) {
		
		entity = AutomaticStationsFullMapper.ToAutomaticStationFullEntity(dto);
		//asfr.save(entity);
		
		System.out.println(entity.toString());
		}
		return ResponseEntity.status(HttpStatus.OK).body("Salvo com sucesso!");
	}
	
	@Transactional
	public ResponseEntity<String> salvarDto(AutomaticStationsFullEntity entity) {
		
		
		AutomaticStationsFullDto dto = new AutomaticStationsFullDto();
		
		if(entity != null) {
		
		entity = AutomaticStationsFullMapper.ToAutomaticStationFullEntity(dto);
		//asfr.save(dto);
		
		System.out.println(entity.toString());
		}
		return ResponseEntity.status(HttpStatus.OK).body("Salvo com sucesso!");
	}

}
