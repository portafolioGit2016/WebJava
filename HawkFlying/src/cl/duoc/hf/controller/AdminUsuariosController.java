package cl.duoc.hf.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cl.duoc.hf.delegate.LoginDelegate;
import cl.duoc.hf.delegate.UserDelegate;
import cl.duoc.hf.viewBean.RegistroBean;

@Controller
public class AdminUsuariosController {
	@Autowired
	private UserDelegate userDelegate;
	@Autowired
	private LoginDelegate loginDelegate;
	@RequestMapping(value="/adminUsuarios",method=RequestMethod.GET)
	public ModelAndView displayLogin(HttpServletRequest request, HttpServletResponse response)
	{
		ModelAndView model = new ModelAndView("adminUsuarios");
		model.addObject("listaUsuarios", userDelegate.getUsuarios());
		RegistroBean registroBean = new RegistroBean();
		model.addObject("registroBean", registroBean);
		return model;
	}
	@RequestMapping(value="/adminUsuarios",method=RequestMethod.POST)
	public ModelAndView crearRegistro(HttpServletRequest request, HttpServletResponse response, @ModelAttribute("registroBean")RegistroBean registroBean)
	{
		ModelAndView model= null;
		try
		{
			SimpleDateFormat sfO=new SimpleDateFormat("yyyy-MM-dd");
			Date fechaNac=sfO.parse(registroBean.getFecha_Nacimiento());
			SimpleDateFormat sf=new SimpleDateFormat("dd-MMM-yy",Locale.US);
			registroBean.setFecha_Nacimiento(sf.format(fechaNac).toUpperCase());
			boolean isCreated = loginDelegate.createUser(registroBean);
			if(isCreated)
			{
				System.out.println("Registro Creado Correctamente");
				model = new ModelAndView("adminUsuarios");
				model.addObject("listaUsuarios", userDelegate.getUsuarios());
				request.setAttribute("message", "Usuario creado correctamente");
			}
			else
			{
				model = new ModelAndView("adminUsuarios");
				model.addObject("registroBean", registroBean);
				model.addObject("listaUsuarios", userDelegate.getUsuarios());
				request.setAttribute("message", "Error al crear usuario");	
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

		return model;
	}
	@RequestMapping(value="/deleteUser",method=RequestMethod.GET, params = {"id"} )
	public @ResponseBody ModelAndView getUsersForGrid(HttpServletRequest request, HttpServletResponse response,
			@RequestParam(value = "id") int id){
		ModelAndView model = new ModelAndView("adminUsuarios");
		userDelegate.deleteUser(id);
		model.addObject("listaUsuarios", userDelegate.getUsuarios());
		request.setAttribute("message", "Usuario eliminado exitosamente");
		RegistroBean registroBean = new RegistroBean();
		model.addObject("registroBean", registroBean);
		return model;
	}
}
