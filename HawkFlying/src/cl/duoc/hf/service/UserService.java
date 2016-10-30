package cl.duoc.hf.service;

import java.util.ArrayList;

import cl.duoc.hf.viewBean.RegistroBean;
import cl.duoc.hf.vo.PerfilVO;
import cl.duoc.hf.vo.PilotoVO;
import cl.duoc.hf.vo.UsuarioVO;

/**
 * @author CENTAUR
 *
 */
public interface UserService
{
	public UsuarioVO getUsuario(String id);
	public boolean isValidUser(String username, String password);
	public boolean createUser(RegistroBean registroBean);
	public ArrayList<UsuarioVO> getUsuarios();
	public ArrayList<PerfilVO> getPerfiles();
	public void deleteUser(int id);
	public ArrayList<PilotoVO> getPilotos();
	public boolean updateUser(RegistroBean registroBean);
}
