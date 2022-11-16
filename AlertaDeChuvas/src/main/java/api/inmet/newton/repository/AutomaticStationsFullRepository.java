package api.inmet.newton.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import api.inmet.newton.dto.AutomaticStationsFullDto;
import api.inmet.newton.models.AutomaticStationsFullEntity;

@Repository
public interface AutomaticStationsFullRepository extends JpaRepository<AutomaticStationsFullEntity, String>{
	
	List<AutomaticStationsFullDto> findByCodEstacao(String codEstacao);

	//void save(AutomaticStationsFullEntity entity);

}
