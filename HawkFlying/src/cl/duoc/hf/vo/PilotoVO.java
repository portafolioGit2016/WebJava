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
@JsonPropertyOrder({ "id_piloto", "fecha_vencimientomae", "num_licencia", "hora_total_vuelo", "estado_licencia",
		"id_usuario", "tipolicencia" })
public class PilotoVO {

	@JsonProperty("id_piloto")
	private Integer idPiloto;
	@JsonProperty("fecha_vencimientomae")
	private String fechaVencimientomae;
	@JsonProperty("hora_total_vuelo")
	private Integer horaTotalVuelo;	
	@JsonProperty("id_usuario")
	private Integer idUsuario;	
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	@JsonIgnore
	private UsuarioVO usuario;

	public UsuarioVO getUsuarioVO() {
		return usuario;
	}

	public void setUsuarioVO(UsuarioVO usuarioVO) {
		this.usuario = usuarioVO;
	}

	/**
	 * 
	 * @return The idPiloto
	 */
	@JsonProperty("id_piloto")
	public Integer getIdPiloto() {
		return idPiloto;
	}

	/**
	 * 
	 * @param idPiloto
	 *            The id_piloto
	 */
	@JsonProperty("id_piloto")
	public void setIdPiloto(Integer idPiloto) {
		this.idPiloto = idPiloto;
	}

	/**
	 * 
	 * @return The fechaVencimientomae
	 */
	@JsonProperty("fecha_vencimientomae")
	public String getFechaVencimientomae() {
		return fechaVencimientomae;
	}

	/**
	 * 
	 * @param fechaVencimientomae
	 *            The fecha_vencimientomae
	 */
	@JsonProperty("fecha_vencimientomae")
	public void setFechaVencimientomae(String fechaVencimientomae) {
		this.fechaVencimientomae = fechaVencimientomae;
	}

		/**
	 * 
	 * @return The horaTotalVuelo
	 */
	@JsonProperty("hora_total_vuelo")
	public Integer getHoraTotalVuelo() {
		return horaTotalVuelo;
	}

	/**
	 * 
	 * @param horaTotalVuelo
	 *            The hora_total_vuelo
	 */
	@JsonProperty("hora_total_vuelo")
	public void setHoraTotalVuelo(Integer horaTotalVuelo) {
		this.horaTotalVuelo = horaTotalVuelo;
	}

	/**
	 * 
	 * @return The idUsuario
	 */
	@JsonProperty("id_usuario")
	public Integer getIdUsuario() {
		return idUsuario;
	}

	/**
	 * 
	 * @param idUsuario
	 *            The id_usuario
	 */
	@JsonProperty("id_usuario")
	public void setUsuario(Integer idUsuario) { 
		this.idUsuario = idUsuario;
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