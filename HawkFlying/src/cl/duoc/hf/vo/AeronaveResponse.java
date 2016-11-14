package cl.duoc.hf.vo;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AeronaveResponse {

	 @JsonProperty("items")
	   private ArrayList<AeronaveVO> aeronaves;

	public ArrayList<AeronaveVO> getAeronaves() {
		return aeronaves;
	}

	public void setAeronaves(ArrayList<AeronaveVO> aeronaves) {
		this.aeronaves = aeronaves;
	} 


}
