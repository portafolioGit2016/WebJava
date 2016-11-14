package cl.duoc.hf.vo;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PlanVueloResponse {

	  @JsonProperty("items")
	   private ArrayList<PlanVueloVO> planesDeVuelo;

	public ArrayList<PlanVueloVO> getPlanesDeVuelo() {
		return planesDeVuelo;
	}

	public void setPlanesDeVuelo(ArrayList<PlanVueloVO> planesDeVuelo) {
		this.planesDeVuelo = planesDeVuelo;
	} 

}
