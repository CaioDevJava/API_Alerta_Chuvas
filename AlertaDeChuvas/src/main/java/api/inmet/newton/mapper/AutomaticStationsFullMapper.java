package api.inmet.newton.mapper;

import api.inmet.newton.dto.AutomaticStationsFullDto;
import api.inmet.newton.models.AutomaticStationsFullEntity;


public class AutomaticStationsFullMapper {
	

	
	private AutomaticStationsFullMapper() {
		throw new IllegalStateException("Mapper Class");
	}
	
	public static AutomaticStationsFullDto ToAutomaticStationsFullDto(AutomaticStationsFullEntity entity) {
	
		AutomaticStationsFullDto station = null;
		
		if(entity != null) {
			
			station = new AutomaticStationsFullDto();
			
			/*station.setVentoDirHora(entity.getVentoDirHora());
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
			station.setUmidRelHora(entity.getUmidRelHora());
			station.setLongitude(entity.getLongitude());
			station.setHoraMedicao(entity.getHoraMedicao());
			station.setUmidRelArMinDia(entity.getUmidRelArMinDia());
			station.setTempOrvalhoMaxHora(entity.getTempOrvalhoMaxHora());*/
		}
		
		
		return station;
	}
	
	public static AutomaticStationsFullEntity ToAutomaticStationFullEntity(AutomaticStationsFullDto station) {
		
		AutomaticStationsFullEntity entity = null;
		
		if(station != null) {	
			entity = new AutomaticStationsFullEntity();
			
			entity.setVentoDirHora(station.getVentoDirHora());
			entity.setDataMedicao(station.getDataMedicao());
			entity.setCidadeEstacao(station.getCidadeEstacao());
			entity.setChuva(station.getChuva());
			entity.setPresAtmNvlEstacaoHora(station.getPresAtmNvlEstacaoHora());
			entity.setLatitude(station.getLatitude());
			entity.setPresAtmMinHora(station.getPresAtmMinHora());
			entity.setUmidRelMaxHora(station.getUmidRelMaxHora());
			entity.setPresAtmMaxHora((station.getPresAtmMaxHora()));
			entity.setVelocVentoHora(station.getVelocVentoHora());
			entity.setUf(station.getUf());
			entity.setTempOrvalhoMinHora(station.getTempOrvalhoMinHora());
			entity.setTempMaxHora(station.getTempMaxHora());
			entity.setRadiacaoGlobal(station.getRadiacaoGlobal());
			entity.setTempOrvalho(station.getTempOrvalho());
			entity.setVentoRajada(station.getVentoRajada());
			entity.setTempArBulboSeco(station.getTempArBulboSeco());
			entity.setUmidRelArHora(station.getUmidRelArHora());
			entity.setCodEstacao(station.getCodEstacao());
			entity.setUmidRelHora(station.getUmidRelArHora());
			entity.setLongitude(station.getLongitude());
			entity.setHoraMedicao(station.getHoraMedicao());
			entity.setUmidRelArMinDia(station.getUmidRelArMinDia());
			entity.setTempOrvalhoMaxHora(station.getTempOrvalhoMaxHora());	
		}
		
		return entity;
	}
}
