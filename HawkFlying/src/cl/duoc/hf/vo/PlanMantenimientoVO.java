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
@JsonPropertyOrder({ "matricula", "cantidad_horas", "horas", "dias", "ultimovuelo" })
public class PlanMantenimientoVO {

	@JsonProperty("matricula")
	private String matricula;
	@JsonProperty("cantidad_horas")
	private Integer cantidadHoras;
	@JsonProperty("horas")
	private Integer horas;
	@JsonProperty("dias")
	private Integer dias;
	@JsonProperty("ultimovuelo")
	private String ultimovuelo;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * 
	 * @return The matricula
	 */
	@JsonProperty("matricula")
	public String getMatricula() {
		return matricula;
	}

	/**
	 * 
	 * @param matricula
	 *            The matricula
	 */
	@JsonProperty("matricula")
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	/**
	 * 
	 * @return The cantidadHoras
	 */
	@JsonProperty("cantidad_horas")
	public Integer getCantidadHoras() {
		return cantidadHoras;
	}

	/**
	 * 
	 * @param cantidadHoras
	 *            The cantidad_horas
	 */
	@JsonProperty("cantidad_horas")
	public void setCantidadHoras(Integer cantidadHoras) {
		this.cantidadHoras = cantidadHoras;
	}

	/**
	 * 
	 * @return The horas
	 */
	@JsonProperty("horas")
	public Integer getHoras() {
		return horas;
	}

	/**
	 * 
	 * @param horas
	 *            The horas
	 */
	@JsonProperty("horas")
	public void setHoras(Integer horas) {
		this.horas = horas;
	}

	/**
	 * 
	 * @return The dias
	 */
	@JsonProperty("dias")
	public Integer getDias() {
		return dias;
	}

	/**
	 * 
	 * @param dias
	 *            The dias
	 */
	@JsonProperty("dias")
	public void setDias(Integer dias) {
		this.dias = dias;
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

}
