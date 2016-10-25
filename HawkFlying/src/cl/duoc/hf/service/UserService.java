package cl.duoc.hf.service;

import java.util.ArrayList;

import cl.duoc.hf.viewBean.RegistroBean;
import cl.duoc.hf.vo.UsuarioVO;

/**
 * @author CENTAUR
 *
 */
public interface UserService
{
	public boolean isValidUser(String username, String password);
	public boolean createUser(RegistroBean registroBean);
	public ArrayList<UsuarioVO> getUsuarios();
	public void deleteUser(int id);
}
