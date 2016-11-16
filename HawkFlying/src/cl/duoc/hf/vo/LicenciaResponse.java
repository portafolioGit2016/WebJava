package cl.duoc.hf.vo;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LicenciaResponse {
	  @JsonProperty("items")
	   private ArrayList<LicenciaVO> licencias;

	public ArrayList<LicenciaVO> getLicencias() {
		return licencias;
	}

	public void setLicencias(ArrayList<LicenciaVO> licencias) {
		this.licencias = licencias;
	} 

}
