package api.inmet.newton.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import api.inmet.newton.models.AutomaticStationsFullEntity;

@Repository
public interface AutomaticStationsFullRepository extends JpaRepository <AutomaticStationsFullEntity, Long> {

}
