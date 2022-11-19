package api.inmet.newton.service;


import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import api.inmet.newton.dto.AutomaticStationsFullDto;
import api.inmet.newton.helper.AutomaticStationsFullHelper;
import api.inmet.newton.helper.DataHelper;
import api.inmet.newton.helper.HttpHelper;
import api.inmet.newton.models.AutomaticStationsFullEntity;
import api.inmet.newton.repository.AutomaticStationsFullRepository;
import api.inmet.newton.util.JsonUtil;


@Service
public class AutomaticStationsFullService {
	
	@Autowired
	AutomaticStationsFullRepository repositoryStation;

	public List<AutomaticStationsFullEntity> recuperarDadosApi () throws Exception {
			 String data = "2000-2-2";
			 data = DataHelper.dataAtual();
			
			HttpRequest request = HttpHelper.conexaoApi(data);
			HttpClient httpClient = HttpHelper.clienteHttpBuilder();
			HttpResponse<String> response = HttpHelper.getResponse(request, httpClient);
	
			String json = AutomaticStationsFullHelper.jsonConvertDto(response);
			
			AutomaticStationsFullDto[] dto = 
					JsonUtil.convertToObject(json, AutomaticStationsFullDto[].class);
	
			List<AutomaticStationsFullEntity> entityStation = AutomaticStationsFullHelper.preencherEntityStationFull(dto);
			 
			// List<AutomaticStationsFullEntity> entityStation = DataHelper.dataInicioAteOFim();
		
		return entityStation;
	
	}

	public HttpStatus salvarDados(List<AutomaticStationsFullEntity> entityStation) {
		AutomaticStationsFullEntity entity = null;

		if(entityStation != null) {
			repositoryStation.saveAll(entityStation);

				return HttpStatus.OK;
			}

		return HttpStatus.INTERNAL_SERVER_ERROR;
	}
	
	public String dadosApiDireto() {
		String test = "Passou pelo Service";
		/*HttpRequest request = HttpHelper.conexaoApi();
		HttpResponse response = HttpHelper.getResponse(request, null);*/
		return test;
	}
	
	
	public List<AutomaticStationsFullDto> buscar() {
		return null;
	}

}
