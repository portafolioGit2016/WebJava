package cl.duoc.hf.viewBean;

public class VueloBean {
	private Integer nro_vuelo;
	private Integer condicion;
	private Integer total_tv;
	private Integer origen;
	private Integer destino;
	private String fecha;
	private Integer id_mision;
	
	public Integer getNro_vuelo() {
		return nro_vuelo;
	}
	public void setNro_vuelo(Integer nro_vuelo) {
		this.nro_vuelo = nro_vuelo;
	}
	public Integer getCondicion() {
		return condicion;
	}
	public void setCondicion(Integer condicion) {
		this.condicion = condicion;
	}
	public Integer getTotal_tv() {
		return total_tv;
	}
	public void setTotal_tv(Integer total_tv) {
		this.total_tv = total_tv;
	}
	public Integer getOrigen() {
		return origen;
	}
	public void setOrigen(Integer origen) {
		this.origen = origen;
	}
	public Integer getDestino() {
		return destino;
	}
	public void setDestino(Integer destino) {
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
