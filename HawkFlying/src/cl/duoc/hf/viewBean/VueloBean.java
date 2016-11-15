package cl.duoc.hf.viewBean;

public class VueloBean {
	private Integer nro_vuelo;
	private String condicion;
	private Integer total_tv;
	private String fecha;
	private Integer id_mision;
	private Integer idAeronave;
	private Integer idCopiloto;
	private Integer tiempoPilotoP;
	private Integer tiempoCopilotoP;
	private Integer tiempoPilotoC;
	private Integer tiempoCopilotoC;
	
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
	public Integer getIdCopiloto() {
		return idCopiloto;
	}
	public void setIdCopiloto(Integer idCopiloto) {
		this.idCopiloto = idCopiloto;
	}
	public Integer getTiempoPilotoP() {
		return tiempoPilotoP;
	}
	public void setTiempoPilotoP(Integer tiempoPilotoP) {
		this.tiempoPilotoP = tiempoPilotoP;
	}
	public Integer getTiempoCopilotoP() {
		return tiempoCopilotoP;
	}
	public void setTiempoCopilotoP(Integer tiempoCopilotoP) {
		this.tiempoCopilotoP = tiempoCopilotoP;
	}
	public Integer getTiempoPilotoC() {
		return tiempoPilotoC;
	}
	public void setTiempoPilotoC(Integer tiempoPilotoC) {
		this.tiempoPilotoC = tiempoPilotoC;
	}
	public Integer getTiempoCopilotoC() {
		return tiempoCopilotoC;
	}
	public void setTiempoCopilotoC(Integer tiempoCopilotoC) {
		this.tiempoCopilotoC = tiempoCopilotoC;
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
