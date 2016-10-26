package cl.duoc.hf.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import cl.duoc.hf.delegate.UserDelegate;

@Controller
public class AdminUsuariosController {
	@Autowired
	private UserDelegate userDelegate;

	@RequestMapping(value="/adminUsuarios",method=RequestMethod.GET)
	public ModelAndView displayLogin(HttpServletRequest request, HttpServletResponse response)
	{
		ModelAndView model = new ModelAndView("adminUsuarios");
		model.addObject("listaUsuarios", userDelegate.getUsuarios());
		return model;
	}
}
