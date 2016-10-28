package cl.duoc.hf.vo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
@JsonPropertyOrder({ "items" })
public class PilotosResponse {

	@JsonProperty("items")
	private ArrayList<PilotoVO> pilotos = new ArrayList<PilotoVO>();
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * 
	 * @return The items
	 */
	@JsonProperty("items")
	public ArrayList<PilotoVO> getPilotos() {
		return pilotos;
	}

	/**
	 * 
	 * @param items
	 *            The items
	 */
	@JsonProperty("items")
	public void setPilotos(ArrayList<PilotoVO> pilotos) {
		this.pilotos = pilotos;
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