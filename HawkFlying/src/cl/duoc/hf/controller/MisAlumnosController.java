package cl.duoc.hf.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import cl.duoc.hf.delegate.UserDelegate;
import cl.duoc.hf.vo.LoginVO;
import cl.duoc.hf.vo.PilotoVO;

@Controller
public class MisAlumnosController {
	@Autowired
	private UserDelegate userDelegate;

	@RequestMapping(value = "/misAlumnos", method = RequestMethod.GET)
	public ModelAndView displayLogin(HttpServletRequest request, HttpServletResponse response) {
		LoginVO datosUsuario = (LoginVO) request.getSession().getAttribute("usuarioLogeado");
		PilotoVO piloto= userDelegate.getPilotoxIdUsuario(datosUsuario.getIdUsuario());
		ModelAndView model = new ModelAndView("misAlumnos");
		model.addObject("listaAlumnos", userDelegate.getAlumnos(piloto.getIdPiloto().toString()));
		return model;
	}
}
