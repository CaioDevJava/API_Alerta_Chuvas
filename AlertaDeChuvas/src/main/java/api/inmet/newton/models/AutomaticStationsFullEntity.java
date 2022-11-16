package api.inmet.newton.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="DADOS_API")
public class AutomaticStationsFullEntity {
	
// Codigo da Estação (PK)
    
    @Id
    @Column(name="CD_ESTACAO")
    private String codEstacao;
	
// Vento Direção Horario
	
	@Column(name="VEN_DIR")
	private String ventoDirHora;
	
// Data da Medição
	
    @Column(name="DT_MEDICAO")
    private String dataMedicao;
    
// Cidade onde esta a estação
    
    @Column(name="DC_NOME")
    private String cidadeEstacao;
    
// Precipitação total diario
    
    @Column(name="CHUVA")
    private String chuva;
    
// Pressão Atmsférica ao nível da estação horaria
    
    @Column(name="PRE_INS")
    private String presAtmNvlEstacaoHora;
    
// Latitude Localização
    
    @Column(name="VL_LATITUDE")
    private String latitude;
    
// Pressão Atmosférica minima na hora
    
    @Column(name="PRE_MIN")
    private String presAtmMinHora;
    
// Umidade Relativa Maxima na hora
    
    @Column(name="UMD_MAX")
    private String UmidRelMaxHora;
    
// Pressão Atmosférica Maxima na Hora
    
    @Column(name="PRE_MAX")
    private String presAtmMaxHora;
    
// Vento Velocidade Horaria
    
    @Column(name="VEN_VEL")
    private String velocVentoHora;
    
// Cidade/Estado da Estação
    
    @Column(name="UF")
    private String uf;
    
// Temperatura Orvalho Minima na Hora
    
    @Column(name="PTO_MIN")
    private String tempOrvalhoMinHora;
    
// Temperatura Máxima na Hora
    
    @Column(name="TEM_MAX")
    private String tempMaxHora;
    
// Radiação Global
    
    @Column(name="RAD_GLO")
    private String radiacaoGlobal;
    
// Temperatura do Ponto de Orvalho
    
    @Column(name="PTO_INS")
    private String tempOrvalho;
    
// Vento Rajada Maxima
    
    @Column(name="VEN_RAJ")
    private String ventoRajada;
    
// Temperatura do Ar Bulbo Seco Horaria
    
	@Column(name="TEM_INS")
	private String tempArBulboSeco;
	
// Umidade Relativa do Ar Horaria
	
    @Column(name="UMD_INS")
    public String umidRelArHora;
    

    
// Umidade Relativa na Hora
    
    @Column(name="TEM_MIN")
    private String umidRelHora;
    
// Longitude
    
    @Column(name="VL_LONGITUDE")
    private String longitude;
    
// Hora da Medição
    
    @Column(name="HR_MEDICAO")
    private String horaMedicao;
    
// Umidade Relativa do ar minima diaria
    
    @Column(name="UMD_MIN")
    private String umidRelArMinDia;
    
// Temperatura Orvalho Maxima na Hora
    
    @Column(name="PTO_MAX")
    private String TempOrvalhoMaxHora;
    
    public AutomaticStationsFullEntity() {
    	super();
    }
    

	@Override
	public String toString() {
		return "AutomaticStationsFullEntity [ventoDirHora=" + ventoDirHora + ", dataMedicao=" + dataMedicao
				+ ", cidadeEstacao=" + cidadeEstacao + ", chuva=" + chuva + ", presAtmNvlEstacaoHora="
				+ presAtmNvlEstacaoHora + ", latitude=" + latitude + ", presAtmMinHora=" + presAtmMinHora
				+ ", UmidRelMaxHora=" + UmidRelMaxHora + ", presAtmMaxHora=" + presAtmMaxHora + ", velocVentoHora="
				+ velocVentoHora + ", uf=" + uf + ", tempOrvalhoMinHora=" + tempOrvalhoMinHora + ", tempMaxHora="
				+ tempMaxHora + ", radiacaoGlobal=" + radiacaoGlobal + ", tempOrvalho=" + tempOrvalho + ", ventoRajada="
				+ ventoRajada + ", tempArBulboSeco=" + tempArBulboSeco + ", umidRelArHora=" + umidRelArHora
				+ ", codEstacao=" + codEstacao + ", umidRelHora=" + umidRelHora + ", longitude=" + longitude
				+ ", horaMedicao=" + horaMedicao + ", umidRelArMinDia=" + umidRelArMinDia + ", TempOrvalhoMaxHora="
				+ TempOrvalhoMaxHora + ", getVentoDirHora()=" + getVentoDirHora() + ", getDataMedicao()="
				+ getDataMedicao() + ", getCidadeEstacao()=" + getCidadeEstacao() + ", getChuva()=" + getChuva()
				+ ", getPresAtmNvlEstacaoHora()=" + getPresAtmNvlEstacaoHora() + ", getLatitude()=" + getLatitude()
				+ ", getPresAtmMinHora()=" + getPresAtmMinHora() + ", getUmidRelMaxHora()=" + getUmidRelMaxHora()
				+ ", getPresAtmMaxHora()=" + getPresAtmMaxHora() + ", getVelocVentoHora()=" + getVelocVentoHora()
				+ ", getUf()=" + getUf() + ", getTempOrvalhoMinHora()=" + getTempOrvalhoMinHora()
				+ ", getTempMaxHora()=" + getTempMaxHora() + ", getRadiacaoGlobal()=" + getRadiacaoGlobal()
				+ ", getTempOrvalho()=" + getTempOrvalho() + ", getVentoRajada()=" + getVentoRajada()
				+ ", getTempArBulboSeco()=" + getTempArBulboSeco() + ", getUmidRelArHora()=" + getUmidRelArHora()
				+ ", getCodEstacao()=" + getCodEstacao() + ", getUmidRelHora()=" + getUmidRelHora()
				+ ", getLongitude()=" + getLongitude() + ", getHoraMedicao()=" + getHoraMedicao()
				+ ", getUmidRelArMinDia()=" + getUmidRelArMinDia() + ", getTempOrvalhoMaxHora()="
				+ getTempOrvalhoMaxHora() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	
    
}
