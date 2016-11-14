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
@JsonPropertyOrder({ "id_vuelotipo", "tipo_vuelo" })
public class TipoVueloVO {

	@JsonProperty("id_vuelotipo")
	private Integer idVuelotipo;
	@JsonProperty("tipo_vuelo")
	private String tipoVuelo;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * 
	 * @return The idVuelotipo
	 */
	@JsonProperty("id_vuelotipo")
	public Integer getIdVuelotipo() {
		return idVuelotipo;
	}

	/**
	 * 
	 * @param idVuelotipo
	 *            The id_vuelotipo
	 */
	@JsonProperty("id_vuelotipo")
	public void setIdVuelotipo(Integer idVuelotipo) {
		this.idVuelotipo = idVuelotipo;
	}

	/**
	 * 
	 * @return The tipoVuelo
	 */
	@JsonProperty("tipo_vuelo")
	public String getTipoVuelo() {
		return tipoVuelo;
	}

	/**
	 * 
	 * @param tipoVuelo
	 *            The tipo_vuelo
	 */
	@JsonProperty("tipo_vuelo")
	public void setTipoVuelo(String tipoVuelo) {
		this.tipoVuelo = tipoVuelo;
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
