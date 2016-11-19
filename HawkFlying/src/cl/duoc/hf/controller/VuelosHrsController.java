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
import cl.duoc.hf.viewBean.ConsultaPlanMantenimientoBean;
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

	@RequestMapping(value = "/ConsultaHrsVuelo", method = RequestMethod.GET)
	public ModelAndView displayLogin(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView model = new ModelAndView("ConsultaHrsVuelo");
		LoginVO datosUsuario = (LoginVO) request.getSession().getAttribute("usuarioLogeado");
		PilotoVO piloto = userDelegate.getPilotoxIdUsuario(datosUsuario.getIdUsuario());
		model.addObject("listaLicencias", userDelegate.getLicenciasPiloto(piloto.getIdPiloto()));
		ConsultaHrsBean chsBean=new ConsultaHrsBean();
		chsBean.setIdPiloto(piloto.getIdPiloto());
		model.addObject("chsBean", chsBean);
		return model;
	}
	@RequestMapping(value = "/ConsultaHrsVuelo", method = RequestMethod.POST)
	public ModelAndView buscarHrsVuelo(HttpServletRequest request, HttpServletResponse response, @ModelAttribute("chsBean")ConsultaHrsBean chsBean) {
		ModelAndView model = new ModelAndView("ConsultaHrsVuelo");
		LoginVO datosUsuario = (LoginVO) request.getSession().getAttribute("usuarioLogeado");
		model.addObject("listaLicencias", userDelegate.getLicenciasPiloto(chsBean.getIdPiloto()));
		model.addObject("usuario", vueloDelegate.consultaHrsVuelo(chsBean.getTipoConsulta().toString(),datosUsuario.getIdUsuario().toString() ));
		model.addObject("chsBean", chsBean);
		return model;
	}
}
