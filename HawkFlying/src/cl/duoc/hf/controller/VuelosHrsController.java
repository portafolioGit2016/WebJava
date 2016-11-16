package cl.duoc.hf.controller;

import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import cl.duoc.hf.delegate.UserDelegate;
import cl.duoc.hf.delegate.VueloDelegate;
import cl.duoc.hf.viewBean.ConsultaHrsBean;
import cl.duoc.hf.vo.AerodromoVO;
import cl.duoc.hf.vo.LicenciaVO;
import cl.duoc.hf.vo.LoginVO;
import cl.duoc.hf.vo.PilotoVO;
import cl.duoc.hf.vo.UsuarioVO;

@Controller
public class VuelosHrsController {
	@Autowired
	private UserDelegate userDelegate;
	@Autowired
	private VueloDelegate vueloDelegate;

	@RequestMapping(value = "/consultaHoras", method = RequestMethod.GET)
	public ModelAndView displayLogin(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView model = new ModelAndView("ConsultaHrsVuelo");
		LoginVO datosUsuario = (LoginVO) request.getSession().getAttribute("usuarioLogeado");
		PilotoVO piloto = userDelegate.getPilotoxIdUsuario(datosUsuario.getIdUsuario());
		ArrayList<LicenciaVO> listaLicencias = userDelegate.getLicenciasPiloto(piloto.getIdPiloto());
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
		model.addObject("listaLicencias", listaFiltrada);
		ConsultaHrsBean chsBean=new ConsultaHrsBean();
		chsBean.setIdPiloto(piloto.getIdPiloto());
		model.addObject("chsBean", chsBean);
		return model;
	}
}
