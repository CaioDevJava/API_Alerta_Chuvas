package api.inmet.newton.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class AutomaticStationsDto {
	
	private String regiao;
	private String uf;
	private String estacao;
	private String codEstacao;
	private Long latitude;
	private Long longitude;
	private int altitude;
	public String getRegiao() {
		return regiao;
	}
	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getEstacao() {
		return estacao;
	}
	public void setEstacao(String estacao) {
		this.estacao = estacao;
	}
	public String getCodEstacao() {
		return codEstacao;
	}
	public void setCodEstacao(String codEstacao) {
		this.codEstacao = codEstacao;
	}
	public Long getLatitude() {
		return latitude;
	}
	public void setLatitude(Long latitude) {
		this.latitude = latitude;
	}
	public Long getLongitude() {
		return longitude;
	}
	public void setLongitude(Long longitude) {
		this.longitude = longitude;
	}
	public int getAltitude() {
		return altitude;
	}
	public void setAltitude(int altitude) {
		this.altitude = altitude;
	}
	
	
	
}
