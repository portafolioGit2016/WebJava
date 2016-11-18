package cl.duoc.hf.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import cl.duoc.hf.delegate.VueloDelegate;
import cl.duoc.hf.viewBean.ConsultaPlanMantenimientoBean;

@Controller
public class AeronavesDisponiblesController {
	@Autowired
	private VueloDelegate vueloDelegate;
	@RequestMapping(value = "/consultaAeronavesDisponibles", method = RequestMethod.GET)
	public ModelAndView displayLogin(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView model = new ModelAndView("consultaAeronavesDisponibles");
		ConsultaPlanMantenimientoBean cpmb=new ConsultaPlanMantenimientoBean();
		model.addObject("consultaBean", cpmb);
		return model;
	}
	@RequestMapping(value = "/consultaAeronavesDisponibles", method = RequestMethod.POST)
	public ModelAndView buscarPlanesdeMantenimiento(HttpServletRequest request, HttpServletResponse response, @ModelAttribute("consultaBean")ConsultaPlanMantenimientoBean cpmBean) {
		ModelAndView model = new ModelAndView("consultaAeronavesDisponibles");
		model.addObject("listaAeronaves", vueloDelegate.getAeronavesDisponibles(cpmBean.getTipoBusqueda().toString()));
		model.addObject("consultaBean", cpmBean);
		return model;
	}
}
