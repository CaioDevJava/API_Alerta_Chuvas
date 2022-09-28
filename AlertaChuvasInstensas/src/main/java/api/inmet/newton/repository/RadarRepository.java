package api.inmet.newton.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import api.inmet.newton.models.DadosInmet;

@Repository
public interface RadarRepository extends JpaRepository <DadosInmet, Long> {

	List<DadosInmet> buscaByDate(Date data);
	
}
