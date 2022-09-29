package api.inmet.newton.mapper;

//import api.inmet.newton.dto.AutomaticStationsDto;
//import api.inmet.newton.models.AutomaticStationEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class AutomaticStationsMapper {
	
	private AutomaticStationsMapper() {
		throw new IllegalStateException("Mapper Class");
	}
	
	/*public AutomaticStationsDto automaticStationDtoToAutomaticStationMapper(AutomaticStationEntity entity) {
		AutomaticStationsDto stations = null;
		
		if(entity != null) {
			stations.setRegiao(entity.getCodEstacao());
			stations.setUf(entity.getUf());
			stations.setEstacao(entity.getEstacao());
			stations.setCodEstacao(entity.getCodEstacao());
			stations.setLatitude(entity.getLatitude());
			stations.setLatitude(entity.getLongitude());
			stations.setAltitude(entity.getAltitude());
		}
		return stations;
	}*/
}
