package api.inmet.newton.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import api.inmet.newton.dto.AutomaticStationsFullDto;
import api.inmet.newton.mapper.AutomaticStationsFullMapper;
import api.inmet.newton.models.AutomaticStationsFullEntity;
import api.inmet.newton.repository.AutomaticStationsFullRepository;

@Service
public class AutomaticStationsFullService {
	
	@Autowired
	AutomaticStationsFullRepository asfr;
	
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
		asfr.save(dto);
		
		System.out.println(entity.toString());
		}
		return ResponseEntity.status(HttpStatus.OK).body("Salvo com sucesso!");
	}

}
