package api.inmet.newton.dto;

import lombok.AllArgsConstructor;


@AllArgsConstructor
public class AutomaticStationsFullDto {
	
	private int ventoDirHora;
    private String dataMedicao;
    private String cidadeEstacao;
    private int chuva;
    private float presAtmNvlEstacaoHora;
    private float latitude;
    private float presAtmMinHora;
    private int UmidRelMaxHora;
    private float presAtmMaxHora;
    private float velocVentoHora;
    private String uf;
    private float tempOrvalhoMinHora;
    private float tempMaxHora;
    private float radiacaoGlobal;
    private float tempOrvalho;
    private float ventoRajada;
	private int tempArBulboSeco;
    public int umidRelArHora;
    private String codEstacao;
    private int umidRelHora;
    private float longitude;
    private int horaMedicao;
    private int umidRelArMinDia;
    private float TempOrvalhoMaxHora;
	
    public AutomaticStationsFullDto() {
		super();
	}

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
