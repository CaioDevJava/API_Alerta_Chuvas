package api.inmet.newton.helper;

import java.util.ArrayList;
import java.util.List;

import api.inmet.newton.dto.AutomaticStationsFullDto;
import api.inmet.newton.mapper.AutomaticStationsFullMapper;
import api.inmet.newton.models.AutomaticStationsFullEntity;

public class AutomaticStationsFullHelper {
	
	private AutomaticStationsFullHelper() {
		throw new IllegalStateException("Essa é uma classe Helper que não pode ser instânciada!");
	}
	
	//Preencher a entity para persistir os dados
	//Colocar esse método no Helper
	public static List<AutomaticStationsFullEntity> preencherEntity(AutomaticStationsFullDto[] stationDto) {
		List<AutomaticStationsFullEntity> entity = new ArrayList();
		
		if(!stationDto.equals(null)) {
			for(int i=0; i < stationDto.length ; i++) {
				AutomaticStationsFullEntity entityTemp = AutomaticStationsFullMapper.ToAutomaticStationFullEntity(stationDto[i]);
				entity.add(entityTemp);
			}

		}
		
		return entity;
	}
}
