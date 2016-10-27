package cl.duoc.hf.delegate;

import java.util.ArrayList;

import cl.duoc.hf.service.UserService;
import cl.duoc.hf.vo.PerfilVO;
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
}
