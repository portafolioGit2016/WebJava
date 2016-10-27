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
@JsonPropertyOrder({ "id_perfil", "perfil" })
public class PerfilVO {

	@JsonProperty("id_perfil")
	private Integer idPerfil;
	@JsonProperty("perfil")
	private String perfil;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * 
	 * @return The idPerfil
	 */
	@JsonProperty("id_perfil")
	public Integer getIdPerfil() {
		return idPerfil;
	}

	/**
	 * 
	 * @param idPerfil
	 *            The id_perfil
	 */
	@JsonProperty("id_perfil")
	public void setIdPerfil(Integer idPerfil) {
		this.idPerfil = idPerfil;
	}

	/**
	 * 
	 * @return The perfil
	 */
	@JsonProperty("perfil")
	public String getPerfil() {
		return perfil;
	}

	/**
	 * 
	 * @param perfil
	 *            The perfil
	 */
	@JsonProperty("perfil")
	public void setPerfil(String perfil) {
		this.perfil = perfil;
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