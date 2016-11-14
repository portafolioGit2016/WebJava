package cl.duoc.hf.vo;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AerodromoResponse {

	  @JsonProperty("items")
	   private ArrayList<AerodromoVO> aerodromos;

	public ArrayList<AerodromoVO> getAerodromos() {
		return aerodromos;
	}

	public void setAerodromos(ArrayList<AerodromoVO> aerodromos) {
		this.aerodromos = aerodromos;
	} 

}
