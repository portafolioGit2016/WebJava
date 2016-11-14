package cl.duoc.hf.vo;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({ "id_mision", "nombre", "etd", "direccion", "qrf", "tipo_vuelo", "identificacion_aeronave",
		"tipo_aeronave", "aerodromo_salida", "velocidad__crucero", "reglas_vuelo", "aerodromo_destino" })
public class PlanVueloVO {

	@JsonProperty("id_mision")
	private Integer idMision;
	@JsonProperty("nombre")
	private String nombre;
	@JsonProperty("etd")
	private String etd;
	@JsonProperty("direccion")
	private String direccion;
	@JsonProperty("qrf")
	private String qrf;
	@JsonProperty("tipo_vuelo")
	private Integer tipoVuelo;
	@JsonProperty("identificacion_aeronave")
	private String identificacionAeronave;
	@JsonProperty("tipo_aeronave")
	private String tipoAeronave;
	@JsonProperty("aerodromo_salida")
	private Integer aerodromoSalida;
	@JsonProperty("velocidad__crucero")
	private String velocidadCrucero;
	@JsonProperty("reglas_vuelo")
	private String reglasVuelo;
	@JsonProperty("aerodromo_destino")
	private Integer aerodromoDestino;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * 
	 * @return The idMision
	 */
	@JsonProperty("id_mision")
	public Integer getIdMision() {
		return idMision;
	}

	/**
	 * 
	 * @param idMision
	 *            The id_mision
	 */
	@JsonProperty("id_mision")
	public void setIdMision(Integer idMision) {
		this.idMision = idMision;
	}

	/**
	 * 
	 * @return The nombre
	 */
	@JsonProperty("nombre")
	public String getNombre() {
		return nombre;
	}

	/**
	 * 
	 * @param nombre
	 *            The nombre
	 */
	@JsonProperty("nombre")
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * 
	 * @return The etd
	 */
	@JsonProperty("etd")
	public String getEtd() {
		return etd;
	}

	/**
	 * 
	 * @param etd
	 *            The etd
	 */
	@JsonProperty("etd")
	public void setEtd(String etd) {
		this.etd = etd;
	}

	/**
	 * 
	 * @return The direccion
	 */
	@JsonProperty("direccion")
	public String getDireccion() {
		return direccion;
	}

	/**
	 * 
	 * @param direccion
	 *            The direccion
	 */
	@JsonProperty("direccion")
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * 
	 * @return The qrf
	 */
	@JsonProperty("qrf")
	public String getQrf() {
		return qrf;
	}

	/**
	 * 
	 * @param qrf
	 *            The qrf
	 */
	@JsonProperty("qrf")
	public void setQrf(String qrf) {
		this.qrf = qrf;
	}

	/**
	 * 
	 * @return The tipoVuelo
	 */
	@JsonProperty("tipo_vuelo")
	public Integer getTipoVuelo() {
		return tipoVuelo;
	}

	/**
	 * 
	 * @param tipoVuelo
	 *            The tipo_vuelo
	 */
	@JsonProperty("tipo_vuelo")
	public void setTipoVuelo(Integer tipoVuelo) {
		this.tipoVuelo = tipoVuelo;
	}

	/**
	 * 
	 * @return The identificacionAeronave
	 */
	@JsonProperty("identificacion_aeronave")
	public String getIdentificacionAeronave() {
		return identificacionAeronave;
	}

	/**
	 * 
	 * @param identificacionAeronave
	 *            The identificacion_aeronave
	 */
	@JsonProperty("identificacion_aeronave")
	public void setIdentificacionAeronave(String identificacionAeronave) {
		this.identificacionAeronave = identificacionAeronave;
	}

	/**
	 * 
	 * @return The tipoAeronave
	 */
	@JsonProperty("tipo_aeronave")
	public String getTipoAeronave() {
		return tipoAeronave;
	}

	/**
	 * 
	 * @param tipoAeronave
	 *            The tipo_aeronave
	 */
	@JsonProperty("tipo_aeronave")
	public void setTipoAeronave(String tipoAeronave) {
		this.tipoAeronave = tipoAeronave;
	}

	/**
	 * 
	 * @return The aerodromoSalida
	 */
	@JsonProperty("aerodromo_salida")
	public Integer getAerodromoSalida() {
		return aerodromoSalida;
	}

	/**
	 * 
	 * @param aerodromoSalida
	 *            The aerodromo_salida
	 */
	@JsonProperty("aerodromo_salida")
	public void setAerodromoSalida(Integer aerodromoSalida) {
		this.aerodromoSalida = aerodromoSalida;
	}

	/**
	 * 
	 * @return The velocidadCrucero
	 */
	@JsonProperty("velocidad__crucero")
	public String getVelocidadCrucero() {
		return velocidadCrucero;
	}

	/**
	 * 
	 * @param velocidadCrucero
	 *            The velocidad__crucero
	 */
	@JsonProperty("velocidad__crucero")
	public void setVelocidadCrucero(String velocidadCrucero) {
		this.velocidadCrucero = velocidadCrucero;
	}

	/**
	 * 
	 * @return The reglasVuelo
	 */
	@JsonProperty("reglas_vuelo")
	public String getReglasVuelo() {
		return reglasVuelo;
	}

	/**
	 * 
	 * @param reglasVuelo
	 *            The reglas_vuelo
	 */
	@JsonProperty("reglas_vuelo")
	public void setReglasVuelo(String reglasVuelo) {
		this.reglasVuelo = reglasVuelo;
	}

	/**
	 * 
	 * @return The aerodromoDestino
	 */
	@JsonProperty("aerodromo_destino")
	public Integer getAerodromoDestino() {
		return aerodromoDestino;
	}

	/**
	 * 
	 * @param aerodromoDestino
	 *            The aerodromo_destino
	 */
	@JsonProperty("aerodromo_destino")
	public void setAerodromoDestino(Integer aerodromoDestino) {
		this.aerodromoDestino = aerodromoDestino;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}