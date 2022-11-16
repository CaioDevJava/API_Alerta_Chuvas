package api.inmet.newton.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class AutomaticStationsFullDto {
 
	@JsonProperty("CD_ESTACAO")
    private String codEstacao;
    @JsonProperty("VEN_DIR")
	private String ventoDirHora;
    @JsonProperty("DT_MEDICAO")
    private String dataMedicao;
    @JsonProperty("DC_NOME")
    private String cidadeEstacao;
    @JsonProperty("CHUVA")
    private String chuva;
    @JsonProperty("PRE_INS")
    private String presAtmNvlEstacaoHora;
    @JsonProperty("VL_LATITUDE")
    private String latitude;
    @JsonProperty("PRE_MIN")
    private String presAtmMinHora;
    @JsonProperty("UMD_MAX")
    private String UmidRelMaxHora;
    @JsonProperty("PRE_MAX")
    private String presAtmMaxHora;
    @JsonProperty("VEN_VEL")
    private String velocVentoHora;
    @JsonProperty("UF")
    private String uf;
    @JsonProperty("PTO_MIN")
    private String tempOrvalhoMinHora;
    @JsonProperty("TEM_MAX")
    private String tempMaxHora;
    @JsonProperty("RAD_GLO")
    private String radiacaoGlobal;
    @JsonProperty("PTO_INS")
    private String tempOrvalho;
    @JsonProperty("VEN_RAJ")
    private String ventoRajada;
    @JsonProperty("TEM_INS")
	private String tempArBulboSeco;
    @JsonProperty("UMD_INS")
    public String umidRelArHora;
    @JsonProperty("TEM_MIN")
    private String umidRelHora;
    @JsonProperty("VL_LONGITUDE")
    private String longitude;
    @JsonProperty("HR_MEDICAO")
    private String horaMedicao;
    @JsonProperty("UMD_MIN")
    private String umidRelArMinDia;
    @JsonProperty("PTO_MAX")
    private String TempOrvalhoMaxHora;
    
    public AutomaticStationsFullDto() {
    	super();
    }
	 
}
