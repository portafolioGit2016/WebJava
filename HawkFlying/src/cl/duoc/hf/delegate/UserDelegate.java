package cl.duoc.hf.delegate;

import java.util.ArrayList;

import cl.duoc.hf.service.UserService;
import cl.duoc.hf.viewBean.RegistroBean;
import cl.duoc.hf.vo.LicenciaVO;
import cl.duoc.hf.vo.PerfilVO;
import cl.duoc.hf.vo.PilotoVO;
import cl.duoc.hf.vo.UsuarioVO;

public class UserDelegate
{
	private UserService userService;

	public UserService getUserService()
	{
		return this.userService;
	}

	public void setUserService(UserService userService)
	{
		this.userService = userService;
	}
	public ArrayList<UsuarioVO> getUsuarios(){
		return userService.getUsuarios();
	}
	public void deleteUser(int id){
		userService.deleteUser(id);
	}
	public ArrayList<PerfilVO> getPerfiles(){
		return userService.getPerfiles();
	}
	public ArrayList<PilotoVO> getPilotos(){
		return userService.getPilotos();
	}
	public UsuarioVO getUsuario(String id){
		return userService.getUsuario(id);
	}
	public PilotoVO getPilotoxIdUsuario(Integer idUsuario){
		return userService.getPilotoxIdUsuario(idUsuario);
	}
	public boolean updateUser(RegistroBean registroBean){
		return userService.updateUser(registroBean);
	}
	public ArrayList<LicenciaVO> getLicenciasPiloto(Integer idPiloto){
		return userService.getLicenciasPiloto(idPiloto);
	}
	
}
