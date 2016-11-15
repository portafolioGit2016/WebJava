package cl.duoc.hf.viewBean;

public class VueloBean {
	private Integer nro_vuelo;
	private String condicion;
	private Integer total_tv;
	private String fecha;
	private Integer id_mision;
	private Integer idAeronave;
	private String tripulacion;
	
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
	public Integer getIdAeronave() {
		return idAeronave;
	}
	public void setIdAeronave(Integer idAeronave) {
		this.idAeronave = idAeronave;
	}
	public String getTripulacion() {
		return tripulacion;
	}
	public void setTripulacion(String tripulacion) {
		this.tripulacion = tripulacion;
	}
	
	/**
	public String origenVueloDisponible(VueloBean vuelo){
		if(vuelo.origen == "Santiago" || vuelo.origen == "Puerto Montt" || vuelo.origen == "Temuco"){
			return "Disponible";
		}else{
			return "Origen no disponible";
		}
	}
	
	public String destinoVueloDisponible(VueloBean vuelo){
		if(vuelo.origen == "Santiago" || vuelo.origen == "Puerto Montt" || vuelo.origen == "Temuco"){
			return "Disponible";
		}else{
			return "Destino no disponible";
		}
	}
	*/
}
