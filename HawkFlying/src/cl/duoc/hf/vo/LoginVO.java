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
@JsonPropertyOrder({ "cantidad" , "tipoperfil", "id_usuario"})

public class LoginVO {

	@JsonProperty("cantidad")
	private Integer cantidad;
	@JsonProperty("tipoperfil")
	private Integer tipoPerfil;
	@JsonProperty("id_usuario")
	private Integer idUsuario;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * 
	 * @return The cantidad
	 */
	@JsonProperty("cantidad")
	public Integer getCantidad() {
		return cantidad;
	}

	/**
	 * 
	 * @param cantidad
	 *            The cantidad
	 */
	@JsonProperty("cantidad")
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	@JsonProperty("tipoperfil")
	public Integer getTipoPerfil() {
		return tipoPerfil;
	}

	@JsonProperty("tipoperfil")
	public void setTipoPerfil(Integer tipoPerfil) {
		this.tipoPerfil = tipoPerfil;
	}
	@JsonProperty("id_usuario")
	public Integer getIdUsuario() {
		return idUsuario;
	}
	@JsonProperty("id_usuario")
	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}
}