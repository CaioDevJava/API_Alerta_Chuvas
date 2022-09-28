package api.inmet.newton.mapper;

import api.inmet.newton.dto.AutomaticStationsFullDto;
import api.inmet.newton.models.AutomaticStationsFullEntity;

public class AutomaticStationsFullMapper {
	
	AutomaticStationsFullDto station = null;
	AutomaticStationsFullEntity stationEntity = null;
	
	private AutomaticStationsFullMapper() {
		throw new IllegalStateException("Mapper Class");
	}
	
	public AutomaticStationsFullDto AutomaticFullMapperToautomaticStationsFullDto(AutomaticStationsFullEntity entity) {
		
		station = new AutomaticStationsFullDto();
		
		if(entity != null) {
			
			station.setVentoDirHora(entity.getVentoDirHora());
			station.setDataMedicao(entity.getDataMedicao());
			station.setCidadeEstacao(entity.getCidadeEstacao());
			station.setChuva(entity.getChuva());
			station.setPresAtmNvlEstacaoHora(entity.getPresAtmNvlEstacaoHora());
			station.setLatitude(entity.getLatitude());
			station.setPresAtmMinHora(entity.getPresAtmMinHora());
			station.setUmidRelMaxHora(entity.getUmidRelMaxHora());
			station.setPresAtmMaxHora(entity.getPresAtmMaxHora());
			station.setVelocVentoHora(entity.getVelocVentoHora());
			station.setUf(entity.getUf());
			station.setTempOrvalhoMinHora(entity.getTempOrvalhoMinHora());
			station.setTempMaxHora(entity.getTempMaxHora());
			station.setRadiacaoGlobal(entity.getRadiacaoGlobal());
			station.setTempOrvalho(entity.getTempOrvalho());
			station.setVentoRajada(entity.getVentoRajada());
			station.setTempArBulboSeco(entity.getTempArBulboSeco());
			station.setUmidRelArHora(entity.getUmidRelArHora());
			station.setCodEstacao(entity.getCodEstacao());
			station.setUmidRelHora(entity.getUmidRelArHora());
			station.setLongitude(entity.getLongitude());
			station.setHoraMedicao(entity.getHoraMedicao());
			station.setUmidRelArMinDia(entity.getUmidRelArMinDia());
			station.setTempOrvalhoMaxHora(entity.getTempOrvalhoMaxHora());
	
		}
		
		return station;
	}
	
	public AutomaticStationsFullEntity automaticStationsFullDtoToautomaticStationsFullMapper(AutomaticStationsFullDto station){
		
		stationEntity = new AutomaticStationsFullEntity();
		
		
	if(station != null) {
		stationEntity.setVentoDirHora(station.getVentoDirHora());
		stationEntity.setDataMedicao(station.getDataMedicao());
		stationEntity.setCidadeEstacao(station.getCidadeEstacao());
		stationEntity.setChuva(station.getChuva());
		stationEntity.setPresAtmNvlEstacaoHora(station.getPresAtmNvlEstacaoHora());
		stationEntity.setLatitude(station.getLatitude());
		stationEntity.setPresAtmMinHora(station.getPresAtmMinHora());
		stationEntity.setUmidRelMaxHora(station.getUmidRelMaxHora());
		stationEntity.setPresAtmMaxHora(station.getPresAtmMaxHora());
		stationEntity.setVelocVentoHora(station.getVelocVentoHora());
		stationEntity.setUf(station.getUf());
		stationEntity.setTempOrvalhoMinHora(station.getTempOrvalhoMinHora());
		stationEntity.setTempMaxHora(station.getTempMaxHora());
		stationEntity.setRadiacaoGlobal(station.getRadiacaoGlobal());
		stationEntity.setTempOrvalho(station.getTempOrvalho());
		stationEntity.setVentoRajada(station.getVentoRajada());
		stationEntity.setTempArBulboSeco(station.getTempArBulboSeco());
		stationEntity.setUmidRelArHora(station.getUmidRelArHora());
		stationEntity.setCodEstacao(station.getCodEstacao());
		stationEntity.setUmidRelHora(station.getUmidRelHora());
		stationEntity.setLongitude(station.getLongitude());
		stationEntity.setHoraMedicao(station.getHoraMedicao());
		stationEntity.setUmidRelArMinDia(station.getUmidRelArMinDia());
		stationEntity.setTempOrvalhoMaxHora(station.getTempOrvalhoMaxHora());
	}
		
		return stationEntity;
	}

}
