package cl.duoc.hf.viewBean;

public class RegistroBean {
	private Integer id;
	private String username;
	private String password;
	private String nombre;
	private String apellido;
	private String email;
	private String fecha_Nacimiento;
	private String rut;
	private Integer licencia_piloto;
	private String tipoPerfil;
	private String fecVencMae;
	
	public Integer getLicencia_piloto() {
		return licencia_piloto;
	}
	public void setLicencia_piloto(Integer licencia_piloto) {
		this.licencia_piloto = licencia_piloto;
	}
	public String getTipoPerfil() {
		return tipoPerfil;
	}
	public void setTipoPerfil(String tipoPerfil) {
		this.tipoPerfil = tipoPerfil;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
	public String getFecha_Nacimiento() {
		return fecha_Nacimiento;
	}
	public void setFecha_Nacimiento(String fecha_Nacimiento) {
		this.fecha_Nacimiento = fecha_Nacimiento;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFecVencMae() {
		return fecVencMae;
	}
	public void setFecVencMae(String fecVencMae) {
		this.fecVencMae = fecVencMae;
	}
}
