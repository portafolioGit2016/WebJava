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
@JsonPropertyOrder({ "id_usuario", "username", "password", "nombre", "apellido", "email", "fecha_nac",
		"licencia_piloto", "tipoperfil", "rut" })
public class UsuarioVO {

	public UsuarioVO(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}
	public UsuarioVO() {
	}
	@JsonProperty("id_usuario")
	private Integer idUsuario;
	@JsonProperty("username")
	private String username;
	@JsonProperty("password")
	private String password;
	@JsonProperty("nombre")
	private String nombre;
	@JsonProperty("apellido")
	private String apellido;
	@JsonProperty("email")
	private String email;
	@JsonProperty("fecha_nac")
	private String fechaNac;
	@JsonProperty("licencia_piloto")
	private Integer licenciaPiloto;
	@JsonProperty("tipoperfil")
	private Integer tipoperfil;
	@JsonProperty("rut")
	private String rut;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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
	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	/**
	 *
	 * @return The username
	 */
	@JsonProperty("username")
	public String getUsername() {
		return username;
	}

	/**
	 *
	 * @param username
	 *            The username
	 */
	@JsonProperty("username")
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 *
	 * @return The password
	 */
	@JsonProperty("password")
	public String getPassword() {
		return password;
	}

	/**
	 *
	 * @param password
	 *            The password
	 */
	@JsonProperty("password")
	public void setPassword(String password) {
		this.password = password;
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
	 * @return The apellido
	 */
	@JsonProperty("apellido")
	public String getApellido() {
		return apellido;
	}

	/**
	 *
	 * @param apellido
	 *            The apellido
	 */
	@JsonProperty("apellido")
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 *
	 * @return The email
	 */
	@JsonProperty("email")
	public String getEmail() {
		return email;
	}

	/**
	 *
	 * @param email
	 *            The email
	 */
	@JsonProperty("email")
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 *
	 * @return The fechaNac
	 */
	@JsonProperty("fecha_nac")
	public String getFechaNac() {
		return fechaNac;
	}

	/**
	 *
	 * @param fechaNac
	 *            The fecha_nac
	 */
	@JsonProperty("fecha_nac")
	public void setFechaNac(String fechaNac) {
		this.fechaNac = fechaNac;
	}

	/**
	 *
	 * @return The licenciaPiloto
	 */
	@JsonProperty("licencia_piloto")
	public Integer getLicenciaPiloto() {
		return licenciaPiloto;
	}

	/**
	 *
	 * @param licenciaPiloto
	 *            The licencia_piloto
	 */
	@JsonProperty("licencia_piloto")
	public void setLicenciaPiloto(Integer licenciaPiloto) {
		this.licenciaPiloto = licenciaPiloto;
	}

	/**
	 *
	 * @return The tipoperfil
	 */
	@JsonProperty("tipoperfil")
	public Integer getTipoperfil() {
		return tipoperfil;
	}

	/**
	 *
	 * @param tipoperfil
	 *            The tipoperfil
	 */
	@JsonProperty("tipoperfil")
	public void setTipoperfil(Integer tipoperfil) {
		this.tipoperfil = tipoperfil;
	}

	/**
	 *
	 * @return The rut
	 */
	@JsonProperty("rut")
	public String getRut() {
		return rut;
	}

	/**
	 *
	 * @param rut
	 *            The rut
	 */
	@JsonProperty("rut")
	public void setRut(String rut) {
		this.rut = rut;
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
