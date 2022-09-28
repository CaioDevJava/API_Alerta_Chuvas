package api.inmet.newton.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Entity
@Table
public class AutomaticStationsFullEntity {
	
// Vento Direção Horario
	
	@Column(name="VEN_DIR")
	private int ventoDirHora;
	
// Data da Medição
	
    @Column(name="DT_MEDICAO")
    private String dataMedicao;
    
// Cidade onde esta a estação
    
    @Column(name="DC_NOME")
    private String cidadeEstacao;
    
// Precipitação total diario
    
    @Column(name="CHUVA")
    private int chuva;
    
// Pressão Atmsférica ao nível da estação horaria
    
    @Column(name="PRE_INS")
    private float presAtmNvlEstacaoHora;
    
// Latitude Localização
    
    @Column(name="VL_LATITUDE")
    private float latitude;
    
// Pressão Atmosférica minima na hora
    
    @Column(name="PRE_MIN")
    private float presAtmMinHora;
    
// Umidade Relativa Maxima na hora
    
    @Column(name="UMD_MAX")
    private int UmidRelMaxHora;
    
// Pressão Atmosférica Maxima na Hora
    
    @Column(name="PRE_MAX")
    private float presAtmMaxHora;
    
// Vento Velocidade Horaria
    
    @Column(name="VEN_VEL")
    private float velocVentoHora;
    
// Cidade/Estado da Estação
    
    @Column(name="UF")
    private String uf;
    
// Temperatura Orvalho Minima na Hora
    
    @Column(name="PTO_MIN")
    private float tempOrvalhoMinHora;
    
// Temperatura Máxima na Hora
    
    @Column(name="TEM_MAX")
    private float tempMaxHora;
    
// Radiação Global
    
    @Column(name="RAD_GLO")
    private float radiacaoGlobal;
    
// Temperatura do Ponto de Orvalho
    
    @Column(name="PTO_INS")
    private float tempOrvalho;
    
// Vento Rajada Maxima
    
    @Column(name="VEN_RAJ")
    private float ventoRajada;
    
// Temperatura do Ar Bulbo Seco Horaria
    
	@Column(name="TEM_INS")
	private int tempArBulboSeco;
	
// Umidade Relativa do Ar Horaria
	
    @Column(name="UMD_INS")
    public int umidRelArHora;
    
// Codigo da Estação (PK)
    
    @Id
    @Column(name="CD_ESTACAO")
    private String codEstacao;
    
// Umidade Relativa na Hora
    
    @Column(name="TEM_MIN")
    private int umidRelHora;
    
// Longitude
    
    @Column(name="VL_LONGITUDE")
    private float longitude;
    
// Hora da Medição
    
    @Column(name="HR_MEDICAO")
    private int horaMedicao;
    
// Umidade Relativa do ar minima diaria
    
    @Column(name="UMD_MIN")
    private int umidRelArMinDia;
    
// Temperatura Orvalho Maxima na Hora
    
    @Column(name="PTO_MAX")
    private float TempOrvalhoMaxHora;
    
    
	public int getVentoDirHora() {
		return ventoDirHora;
	}
	public void setVentoDirHora(int ventoDirHora) {
		this.ventoDirHora = ventoDirHora;
	}
	public String getDataMedicao() {
		return dataMedicao;
	}
	public void setDataMedicao(String dataMedicao) {
		this.dataMedicao = dataMedicao;
	}
	public String getCidadeEstacao() {
		return cidadeEstacao;
	}
	public void setCidadeEstacao(String cidadeEstacao) {
		this.cidadeEstacao = cidadeEstacao;
	}
	public int getChuva() {
		return chuva;
	}
	public void setChuva(int chuva) {
		this.chuva = chuva;
	}
	public float getPresAtmNvlEstacaoHora() {
		return presAtmNvlEstacaoHora;
	}
	public void setPresAtmNvlEstacaoHora(float presAtmNvlEstacaoHora) {
		this.presAtmNvlEstacaoHora = presAtmNvlEstacaoHora;
	}
	public float getLatitude() {
		return latitude;
	}
	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}
	public float getPresAtmMinHora() {
		return presAtmMinHora;
	}
	public void setPresAtmMinHora(float presAtmMinHora) {
		this.presAtmMinHora = presAtmMinHora;
	}
	public int getUmidRelMaxHora() {
		return UmidRelMaxHora;
	}
	public void setUmidRelMaxHora(int umidRelMaxHora) {
		UmidRelMaxHora = umidRelMaxHora;
	}
	public float getPresAtmMaxHora() {
		return presAtmMaxHora;
	}
	public void setPresAtmMaxHora(float presAtmMaxHora) {
		this.presAtmMaxHora = presAtmMaxHora;
	}
	public float getVelocVentoHora() {
		return velocVentoHora;
	}
	public void setVelocVentoHora(float velocVentoHora) {
		this.velocVentoHora = velocVentoHora;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public float getTempOrvalhoMinHora() {
		return tempOrvalhoMinHora;
	}
	public void setTempOrvalhoMinHora(float tempOrvalhoMinHora) {
		this.tempOrvalhoMinHora = tempOrvalhoMinHora;
	}
	public float getTempMaxHora() {
		return tempMaxHora;
	}
	public void setTempMaxHora(float tempMaxHora) {
		this.tempMaxHora = tempMaxHora;
	}
	public float getRadiacaoGlobal() {
		return radiacaoGlobal;
	}
	public void setRadiacaoGlobal(float radiacaoGlobal) {
		this.radiacaoGlobal = radiacaoGlobal;
	}
	public float getTempOrvalho() {
		return tempOrvalho;
	}
	public void setTempOrvalho(float tempOrvalho) {
		this.tempOrvalho = tempOrvalho;
	}
	public float getVentoRajada() {
		return ventoRajada;
	}
	public void setVentoRajada(float ventoRajada) {
		this.ventoRajada = ventoRajada;
	}
	public int getTempArBulboSeco() {
		return tempArBulboSeco;
	}
	public void setTempArBulboSeco(int tempArBulboSeco) {
		this.tempArBulboSeco = tempArBulboSeco;
	}
	public int getUmidRelArHora() {
		return umidRelArHora;
	}
	public void setUmidRelArHora(int umidRelArHora) {
		this.umidRelArHora = umidRelArHora;
	}
	public String getCodEstacao() {
		return codEstacao;
	}
	public void setCodEstacao(String codEstacao) {
		this.codEstacao = codEstacao;
	}
	public int getUmidRelHora() {
		return umidRelHora;
	}
	public void setUmidRelHora(int umidRelHora) {
		this.umidRelHora = umidRelHora;
	}
	public float getLongitude() {
		return longitude;
	}
	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}
	public int getHoraMedicao() {
		return horaMedicao;
	}
	public void setHoraMedicao(int horaMedicao) {
		this.horaMedicao = horaMedicao;
	}
	public int getUmidRelArMinDia() {
		return umidRelArMinDia;
	}
	public void setUmidRelArMinDia(int umidRelArMinDia) {
		this.umidRelArMinDia = umidRelArMinDia;
	}
	public float getTempOrvalhoMaxHora() {
		return TempOrvalhoMaxHora;
	}
	public void setTempOrvalhoMaxHora(float tempOrvalhoMaxHora) {
		TempOrvalhoMaxHora = tempOrvalhoMaxHora;
	}


    
}
