package cl.duoc.hf.vo;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TipoVueloResponse {

	  @JsonProperty("items")
	   private ArrayList<TipoVueloVO> tiposDeVuelo;

	public ArrayList<TipoVueloVO> getTiposDeVuelo() {
		return tiposDeVuelo;
	}

	public void setTiposDeVuelo(ArrayList<TipoVueloVO> tiposDeVuelo) {
		this.tiposDeVuelo = tiposDeVuelo;
	} 

}
