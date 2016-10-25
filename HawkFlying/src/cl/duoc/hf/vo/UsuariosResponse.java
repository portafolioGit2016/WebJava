package cl.duoc.hf.vo;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UsuariosResponse {

	  @JsonProperty("items")
	   private ArrayList<UsuarioVO> usuarios;

	public ArrayList<UsuarioVO> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(ArrayList<UsuarioVO> usuarios) {
		this.usuarios = usuarios;
	} 
}
