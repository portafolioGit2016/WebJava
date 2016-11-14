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
import org.springframework.web.servlet.ModelAndView;

import cl.duoc.hf.delegate.UserDelegate;
import cl.duoc.hf.delegate.VueloDelegate;
import cl.duoc.hf.viewBean.RegistroBean;
import cl.duoc.hf.viewBean.VueloBean;
/**
 * @author Jocelyn Poblete
 *	Metodos de los objetos que utiliza el modal que sale parahacer put, get que estan mandando desde jsp
 */
@Controller
public class VueloController {

	@Autowired
	private UserDelegate userDelegate;
	@Autowired
	private VueloDelegate vueloDelegate;	
	@RequestMapping(value="/administrar-vuelo",method=RequestMethod.GET)
	public ModelAndView displayLogin(HttpServletRequest request, HttpServletResponse response)
	{
		ModelAndView model = new ModelAndView("administrar-vuelo");
		model.addObject("listaAerodromos", vueloDelegate.getAerodromos());
		model.addObject("listaAeronaves", vueloDelegate.getAeronaves());
		model.addObject("listaPlanesDeVuelo", vueloDelegate.getPlanesDeVuelo());
		VueloBean vueloBean = new VueloBean();
		
		model.addObject("vueloBean", vueloBean);
		model.addObject("listaVuelos",vueloDelegate.getVuelos());
		return model;
	}
	@RequestMapping(value="/administrar-vuelo",method=RequestMethod.POST)
	
	public ModelAndView crearVuelo(HttpServletRequest request, HttpServletResponse response, @ModelAttribute("vueloBean")VueloBean vueloBean)
	{
		ModelAndView model= null;
		try {
			SimpleDateFormat sfO=new SimpleDateFormat("yyyy-MM-dd");
			Date fecha=sfO.parse(vueloBean.getFecha());
			SimpleDateFormat sf=new SimpleDateFormat("dd-MMM-yy",Locale.US);
			vueloBean.setFecha(sf.format(fecha).toUpperCase());
			boolean isCreated = vueloDelegate.createVuelo(vueloBean);
			if(isCreated)
			{
				System.out.println("Registro Creado Correctamente");
				model = new ModelAndView("administrar-vuelo");
				vueloBean = new VueloBean();
				model.addObject("vueloBean", vueloBean);
				model.addObject("listaAeronaves", vueloDelegate.getAeronaves());
				model.addObject("listaPlanesDeVuelo", vueloDelegate.getPlanesDeVuelo());
				request.setAttribute("message", "Vuelo creado correctamente");
			}
			else
			{
				model = new ModelAndView("administrar-vuelo");
				model.addObject("vueloBean", vueloBean);
				model.addObject("listaAeronaves", vueloDelegate.getAeronaves());
				model.addObject("listaPlanesDeVuelo", vueloDelegate.getPlanesDeVuelo());
				request.setAttribute("message", "Error al crear vuelo");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
				
		return model;
	}
	/*
	 * 
	}*/
	public VueloController() {
		// TODO Auto-generated constructor stub
	}

}
