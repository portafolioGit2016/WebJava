package cl.duoc.hf.delegate;

import java.util.ArrayList;
import java.util.Iterator;

import cl.duoc.hf.service.UserService;
import cl.duoc.hf.viewBean.PilotoBean;
import cl.duoc.hf.viewBean.RegistroBean;
import cl.duoc.hf.vo.LicenciaVO;
import cl.duoc.hf.vo.PerfilVO;
import cl.duoc.hf.vo.PilotoVO;
import cl.duoc.hf.vo.UsuarioVO;

public class UserDelegate {
	private UserService userService;

	public UserService getUserService() {
		return this.userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public ArrayList<UsuarioVO> getUsuarios() {
		return userService.getUsuarios();
	}

	public ArrayList<UsuarioVO> getAlumnos(String idInstructor) {
		return userService.getAlumnos(idInstructor);
	}

	public void deleteUser(int id) {
		userService.deleteUser(id);
	}

	public ArrayList<PerfilVO> getPerfiles() {
		return userService.getPerfiles();
	}

	public ArrayList<PilotoVO> getPilotos() {
		return userService.getPilotos();
	}

	public UsuarioVO getUsuario(String id) {
		return userService.getUsuario(id);
	}

	public PilotoVO getPilotoxIdUsuario(Integer idUsuario) {
		return userService.getPilotoxIdUsuario(idUsuario);
	}

	public boolean updateUser(RegistroBean registroBean) {
		return userService.updateUser(registroBean);
	}

	public ArrayList<LicenciaVO> getLicenciasPiloto(Integer idPiloto) {
		ArrayList<LicenciaVO> listaLicencias = userService.getLicenciasPiloto(idPiloto);
		boolean existeHeli = false;
		boolean existePiloto = false;
		ArrayList<LicenciaVO> listaFiltrada = new ArrayList<LicenciaVO>();
		for (Iterator iterator = listaLicencias.iterator(); iterator.hasNext();) {
			LicenciaVO licenciaVO = (LicenciaVO) iterator.next();
			if (licenciaVO.getId().equals(1) && !existeHeli) {
				listaFiltrada.add(licenciaVO);
				existeHeli = true;
			} else if ((licenciaVO.getId().equals(2) || licenciaVO.getId().equals(3) || licenciaVO.getId().equals(4)
					|| licenciaVO.getId().equals(5) || licenciaVO.getId().equals(6)) && !existePiloto) {
				licenciaVO.setId(2);
				licenciaVO.setTipo("avion");
				listaFiltrada.add(licenciaVO);
				existePiloto = true;
			}
		}
		return listaFiltrada;
	}
 //retorna todas licencias vencidas del piloto.
	public ArrayList<LicenciaVO> getLicenciasAlerta(Integer idPiloto) {
		ArrayList<LicenciaVO> listaLicencias = userService.getLicenciasPiloto(idPiloto);
		ArrayList<LicenciaVO> listaFiltrada = new ArrayList<LicenciaVO>();
		for (Iterator iterator = listaLicencias.iterator(); iterator.hasNext();) {
			LicenciaVO licenciaVO = (LicenciaVO) iterator.next();
			if(!licenciaVO.getEstadoLicencia().equalsIgnoreCase("vigente"))
			{
				listaFiltrada.add(licenciaVO);				
			}
			
		}
		return listaFiltrada;
	}
	
	public String ultimoVuelo(String idPiloto)
	{
		return userService.ultimoVuelo(idPiloto);
	}
	
	public Integer createPiloto(PilotoBean pilotoBean){
		return userService.createPiloto(pilotoBean);
	}
	
	
}
