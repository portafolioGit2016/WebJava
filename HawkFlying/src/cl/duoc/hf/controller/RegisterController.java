package cl.duoc.hf.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import cl.duoc.hf.delegate.LoginDelegate;
import cl.duoc.hf.viewBean.RegistroBean;

@Controller
public class RegisterController {
	@Autowired
	private LoginDelegate loginDelegate;
	@RequestMapping(value="/register",method=RequestMethod.GET)
	public ModelAndView displayRegister(HttpServletRequest request, HttpServletResponse response)
	{
		ModelAndView model = new ModelAndView("register");
		RegistroBean registroBean = new RegistroBean();
		model.addObject("registroBean", registroBean);
		return model;
	}
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public ModelAndView crearRegistro(HttpServletRequest request, HttpServletResponse response, @ModelAttribute("registroBean")RegistroBean registroBean)
	{
		ModelAndView model= null;
		try
		{
			boolean isCreated = loginDelegate.createUser(registroBean);
			if(isCreated)
			{
				System.out.println("Registro Creado Correctamente");
				model = new ModelAndView("register");
				request.setAttribute("message", "Usuario creado correctamente");
			}
			else
			{
				model = new ModelAndView("register");
				model.addObject("registroBean", registroBean);
				request.setAttribute("message", "Error al crear usuario");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

		return model;
	}
}
