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
@JsonPropertyOrder({ "id", "tipo","num_licencia","estado_licencia" })
public class LicenciaVO {

	@JsonProperty("id")
	private Integer id;
	@JsonProperty("tipo")
	private String tipo;
	@JsonProperty("num_licencia")
	private Integer numLicencia;
	@JsonProperty("estado_licencia")
	private String estadoLicencia;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * 
	 * @return The id
	 */
	@JsonProperty("id")
	public Integer getId() {
		return id;
	}

	/**
	 * 
	 * @param id
	 *            The id
	 */
	@JsonProperty("id")
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * 
	 * @return The tipo
	 */
	@JsonProperty("tipo")
	public String getTipo() {
		return tipo;
	}

	/**
	 * 
	 * @param tipo
	 *            The tipo
	 */
	@JsonProperty("tipo")
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	
	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	@JsonProperty("num_licencia")
	public Integer getNumLicencia() {
		return numLicencia;
	}
	@JsonProperty("num_licencia")
	public void setNumLicencia(Integer numLicencia) {
		this.numLicencia = numLicencia;
	}
	@JsonProperty("estado_licencia")
	public String getEstadoLicencia() {
		return estadoLicencia;
	}
	@JsonProperty("estado_licencia")
	public void setEstadoLicencia(String estadoLicencia) {
		this.estadoLicencia = estadoLicencia;
	}

}
