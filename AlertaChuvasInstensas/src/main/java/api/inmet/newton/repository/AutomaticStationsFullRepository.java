package api.inmet.newton.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import api.inmet.newton.dto.AutomaticStationsFullDto;

@Repository
public interface AutomaticStationsFullRepository extends JpaRepository<AutomaticStationsFullDto, String> {
	
	List<AutomaticStationsFullDto> queryByCodEstacao(String codEstacao);

}
