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
@JsonPropertyOrder({ "num_licencia", "nombre", "fechamae", "ultimovuelo", "totalhrs" })
public class HrsVueloVO {

	@JsonProperty("num_licencia")
	private Integer numLicencia;
	@JsonProperty("nombre")
	private String nombre;
	@JsonProperty("fechamae")
	private String fechamae;
	@JsonProperty("ultimovuelo")
	private String ultimovuelo;
	@JsonProperty("totalhrs")
	private Integer totalhrs;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * 
	 * @return The numLicencia
	 */
	@JsonProperty("num_licencia")
	public Integer getNumLicencia() {
		return numLicencia;
	}

	/**
	 * 
	 * @param numLicencia
	 *            The num_licencia
	 */
	@JsonProperty("num_licencia")
	public void setNumLicencia(Integer numLicencia) {
		this.numLicencia = numLicencia;
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
	 * @return The fechamae
	 */
	@JsonProperty("fechamae")
	public String getFechamae() {
		return fechamae;
	}

	/**
	 * 
	 * @param fechamae
	 *            The fechamae
	 */
	@JsonProperty("fechamae")
	public void setFechamae(String fechamae) {
		this.fechamae = fechamae;
	}

	/**
	 * 
	 * @return The ultimovuelo
	 */
	@JsonProperty("ultimovuelo")
	public String getUltimovuelo() {
		return ultimovuelo;
	}

	/**
	 * 
	 * @param ultimovuelo
	 *            The ultimovuelo
	 */
	@JsonProperty("ultimovuelo")
	public void setUltimovuelo(String ultimovuelo) {
		this.ultimovuelo = ultimovuelo;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}
	@JsonProperty("totalhrs")
	public Integer getTotalhrs() {
		return totalhrs;
	}
	@JsonProperty("totalhrs")
	public void setTotalhrs(Integer totalhrs) {
		this.totalhrs = totalhrs;
	}

}
