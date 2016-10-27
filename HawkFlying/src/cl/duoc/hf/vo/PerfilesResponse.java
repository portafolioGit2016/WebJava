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
public class PerfilesResponse {

	@JsonProperty("items")
	private ArrayList<PerfilVO> perfiles = new ArrayList<PerfilVO>();
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * 
	 * @return The items
	 */
	@JsonProperty("items")
	public ArrayList<PerfilVO> getPerfiles() {
		return perfiles;
	}

	/**
	 * 
	 * @param items
	 *            The items
	 */
	@JsonProperty("items")
	public void setPerfiles(ArrayList<PerfilVO> perfiles) {
		this.perfiles = perfiles;
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