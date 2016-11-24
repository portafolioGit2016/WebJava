package cl.duoc.hf.service;

import java.util.ArrayList;

import cl.duoc.hf.viewBean.PilotoBean;
import cl.duoc.hf.viewBean.RegistroBean;
import cl.duoc.hf.viewBean.VueloBean;
import cl.duoc.hf.vo.LicenciaVO;
import cl.duoc.hf.vo.LoginVO;
import cl.duoc.hf.vo.PerfilVO;
import cl.duoc.hf.vo.PilotoVO;
import cl.duoc.hf.vo.UsuarioVO;
import cl.duoc.hf.vo.VueloVO;

/**
 * @author Jocelyn Poblete
 *	Interfaz de metodos que se implementan en Delegate USUARIO
 */
public interface UserService
{
	public boolean existsUser(String user);
	public UsuarioVO getUsuario(String id);
	public LoginVO isValidUser(String username, String password);
	public Integer createUser(RegistroBean registroBean);
	public ArrayList<UsuarioVO> getUsuarios();
	public ArrayList<PerfilVO> getPerfiles();
	public void deleteUser(int id);
	public ArrayList<PilotoVO> getPilotos();
	public boolean updateUser(RegistroBean registroBean);
	public PilotoVO getPilotoxIdUsuario(Integer idUsuario);
	public ArrayList<LicenciaVO> getLicenciasPiloto(Integer idPiloto);
	public ArrayList<UsuarioVO> getAlumnos(String idInstructor);
	public String ultimoVuelo(String idPiloto);
	public Integer createPiloto(PilotoBean pilotoBean);
	public PerfilVO getPerfil(String idPerfil);
	public PilotoVO getPiloto(String idPiloto);
}
