package api.inmet.newton.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Entity
@Table
public class AtributosDiariosEntity {
	//ATRIBUTOS DIARIOS
	@Column(name="CHUVA")
	private float precipTotalDiario;
	
	@Column(name="PRESS_ATM_MED")
	private float pressaoAtmMedDiaria;
	
	@Column(name="TEMP_MAX")
	private float tempMaxDiaria;
	
	@Column(name="TEMP_MED")
	private float tempMedDiaria;
	
	@Column(name="TEMP_MIN")
	private float tempMinDiaria;
	
	@Column(name="UMID_MED")
	private float umidRelArMedDiaria;
	
	@Column(name="UMID_MIN")
	private float umidRelMinDiaria;
	
	@Column(name="VEL_VENTO_MED")
	private float velocidadeMedDiaria;
	
	//ATRIBUTOS HORARIOS
	
	@Column(name="VEN_DIR")
	private float ventoDirHoraria;
	
	

}
