package cl.duoc.hf.viewBean;

public class VueloBean {
	private Integer nro_vuelo;
	private String condicion;
	private Integer total_tv;
	private String origen;
	private String destino;
	private String fecha;
	private Integer id_mision;
	
	public Integer getNro_vuelo() {
		return nro_vuelo;
	}
	public void setNro_vuelo(Integer nro_vuelo) {
		this.nro_vuelo = nro_vuelo;
	}
	public String getCondicion() {
		return condicion;
	}
	public void setCondicion(String condicion) {
		this.condicion = condicion;
	}
	public Integer getTotal_tv() {
		return total_tv;
	}
	public void setTotal_tv(Integer total_tv) {
		this.total_tv = total_tv;
	}
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public Integer getId_mision() {
		return id_mision;
	}
	public void setId_mision(Integer id_mision) {
		this.id_mision = id_mision;
	}
}
