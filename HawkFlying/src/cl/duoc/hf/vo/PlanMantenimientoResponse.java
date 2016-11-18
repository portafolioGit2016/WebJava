package cl.duoc.hf.vo;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PlanMantenimientoResponse {
	  @JsonProperty("items")
	   private ArrayList<PlanMantenimientoVO> planes;

	public ArrayList<PlanMantenimientoVO> getPlanes() {
		return planes;
	}

	public void setPlanes(ArrayList<PlanMantenimientoVO> planes) {
		this.planes = planes;
	} 
}
