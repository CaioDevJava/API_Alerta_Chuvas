package api.inmet.newton.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import api.inmet.newton.dto.AutomaticStationsDto;
import api.inmet.newton.models.AutomaticStationEntity;

@Repository
public interface AutomaticStationRepository extends JpaRepository<AutomaticStationsDto, String> {

	List<AutomaticStationEntity> queryByDate (Date data);
}
