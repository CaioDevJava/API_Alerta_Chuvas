package api.inmet.newton.helper;

import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

import api.inmet.newton.dto.AutomaticStationsFullDto;
import api.inmet.newton.mapper.AutomaticStationsFullMapper;
import api.inmet.newton.models.AutomaticStationsFullEntity;

public class AutomaticStationsFullHelper {
	
	private AutomaticStationsFullHelper() {
		throw new IllegalStateException("Helper Class");
	}

	public static List<AutomaticStationsFullEntity> preencherEntityStationFull(AutomaticStationsFullDto[] stationDto) {
		List<AutomaticStationsFullEntity> entityList = new ArrayList();
		
		if(!stationDto.equals(null)) {
			for(int i=0; i < stationDto.length ; i++) {
				AutomaticStationsFullEntity entityTemp = AutomaticStationsFullMapper.ToAutomaticStationFullEntity(stationDto[i]);
				entityList.add(entityTemp);
			}
		}
		return entityList;
	}

	public static String jsonConvertDto(HttpResponse<String> response) {
			String json = response.body().toString();
		return json;
	}
}