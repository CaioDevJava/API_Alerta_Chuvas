package api.inmet.newton.helper;

import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import api.inmet.newton.dto.AutomaticStationsFullDto;
import api.inmet.newton.models.AutomaticStationsFullEntity;
import api.inmet.newton.service.AutomaticStationsFullService;
import api.inmet.newton.util.JsonUtil;

public class DataHelper {
	
	@Autowired
	AutomaticStationsFullService serviceStation;

	private DataHelper () {
		throw new IllegalStateException("Classe Helper");
	}
	
	
	
	public static String dataAtual() {
		SimpleDateFormat dataFormater = new SimpleDateFormat("yyyy-MM-dd");
		String data = dataFormater.format(new Date());
		
		return data;
	}
	
	public static List<AutomaticStationsFullEntity> dataInicioAteOFim () throws IOException, InterruptedException {

		
		List<AutomaticStationsFullEntity> entityStation =  new ArrayList();
		/*String dia = new String();
		String mes = new String();;
		String ano = new String();*/
		String data = new String();
		int anoInt = 1999;
		int mesInt = 0;

		for(int i = 0; i<3; i++) {
			anoInt = anoInt + 1;
			//ano = Integer.toString(anoInt);
			
			int o = 0;
			for( o = 0; o < 13; o++) {
				mesInt +=1;
				//mes = Integer.toString(mesInt);

				if(mesInt == 13) {
					mesInt = 0;
					o = 0;
					break;
				}

				int k = 0;
				int diaInt = 0;
				int indiceMes = 0;
				
				if(mesInt == 2) {
					indiceMes = 28;
					k=0;
				}else if(mesInt == 11) {
					indiceMes = 16;
					k=0;
				}else {
					indiceMes=30;
					k=0;
					}
					
					for(k = 0; k < indiceMes ; k++) {
						diaInt ++;
						//dia = Integer.toString(diaInt);
						data = anoInt +"-" + mesInt + "-" + diaInt;
						
						HttpRequest request = HttpHelper.conexaoApi(data);
						HttpClient httpClient = HttpHelper.clienteHttpBuilder();
						HttpResponse<String> response = HttpHelper.getResponse(request, httpClient);

						String json = AutomaticStationsFullHelper.jsonConvertDto(response);
						
						AutomaticStationsFullDto[] dto = JsonUtil.convertToObject(json, AutomaticStationsFullDto[].class);
						entityStation = AutomaticStationsFullHelper.preencherEntityStationFull(dto);

						if(diaInt == 30) {
							break;
						}
					}
				if(diaInt == 30) {
					k = 0;
					diaInt = 0;
					break;
		
				}else if(diaInt == 28 && mesInt == 2) {
					k = 0;
					diaInt = 0;
					break;
				}
			}
			
		}		

		return entityStation;
	}
}
