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
@JsonPropertyOrder({ "ultimovuelo" })
public class UltimoVueloVO {

	@JsonProperty("ultimovuelo")
	private String ultimovuelo;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

}
