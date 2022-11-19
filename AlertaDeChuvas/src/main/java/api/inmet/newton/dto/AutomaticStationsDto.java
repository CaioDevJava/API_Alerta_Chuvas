package api.inmet.newton.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AutomaticStationsDto {
	
	private String regiao;
	private String uf;
	private String estacao;
	private String codEstacao;
	private Long latitude;
	private Long longitude;
	private int altitude;
	
}
