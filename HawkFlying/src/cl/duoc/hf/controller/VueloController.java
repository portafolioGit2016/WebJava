package cl.duoc.hf.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
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
import cl.duoc.hf.viewBean.PlanVueloBean;
import cl.duoc.hf.viewBean.TripulacionBean;
import cl.duoc.hf.viewBean.VueloBean;
import cl.duoc.hf.vo.AerodromoVO;
import cl.duoc.hf.vo.AeronaveVO;
import cl.duoc.hf.vo.LoginVO;
import cl.duoc.hf.vo.PilotoVO;
import cl.duoc.hf.vo.PlanVueloVO;
import cl.duoc.hf.vo.TipoVueloVO;
import cl.duoc.hf.vo.UsuarioVO;
import cl.duoc.hf.vo.VueloVO;
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
	
	@ModelAttribute("listaAerodromos")
	public ArrayList<AerodromoVO> getAerodromos(){
		return vueloDelegate.getAerodromos();
	}
	@ModelAttribute("listaAeronaves")
	public ArrayList<AeronaveVO> getAeronaves(){
		return vueloDelegate.getAeronaves();
	}
	@ModelAttribute("listaPlanesDeVuelo")
	public ArrayList<PlanVueloVO> getPlanesDeVuelo(){
		return vueloDelegate.getPlanesDeVuelo();
	}
	@ModelAttribute("listaTiposVuelo")
	public ArrayList<TipoVueloVO> getTiposDeVuelo(){
		return vueloDelegate.getTiposDeVuelo();
	}
	@ModelAttribute("listaVuelos")
	public ArrayList<VueloVO> getVuelos(){
		return vueloDelegate.getVuelos();
	}
	@ModelAttribute("listaCopiloto")
	public ArrayList<PilotoVO> getPilotos(){
		return userDelegate.getPilotos();
	}
	@RequestMapping(value="/administrar-vuelo",method=RequestMethod.GET)
	public ModelAndView displayLogin(HttpServletRequest request, HttpServletResponse response)
	{
		ModelAndView model = new ModelAndView("administrar-vuelo");
		LoginVO datosUsuario=(LoginVO)request.getSession().getAttribute("usuarioLogeado");
		UsuarioVO usuario=userDelegate.getUsuario(datosUsuario.getIdUsuario().toString());
		VueloBean vueloBean = new VueloBean();
		PlanVueloBean planVueloBean=new PlanVueloBean();
		
		model.addObject("vueloBean", vueloBean);
		model.addObject("planVueloBean", planVueloBean);
		model.addObject("usuario", usuario);
		return model;
	}
	@RequestMapping(value="/administrar-vuelo",method=RequestMethod.POST)
	
	public ModelAndView crearVuelo(HttpServletRequest request, HttpServletResponse response,ModelAndView model, @ModelAttribute("vueloBean")VueloBean vueloBean)
	{
		try {
			SimpleDateFormat sfO=new SimpleDateFormat("yyyy-MM-dd");
			Date fecha=sfO.parse(vueloBean.getFecha());
			SimpleDateFormat sf=new SimpleDateFormat("dd-MMM-yy",Locale.US);
			vueloBean.setFecha(sf.format(fecha).toUpperCase());
			Integer idVuelo = vueloDelegate.createVuelo(vueloBean);
			if(idVuelo!=null)
			{
				//cargndo las horas del piloto.
				LoginVO datosUsuario=(LoginVO)request.getSession().getAttribute("usuarioLogeado");
				PilotoVO piloto= userDelegate.getPilotoxIdUsuario(datosUsuario.getIdUsuario());
				TripulacionBean tripulacion = new TripulacionBean();
				tripulacion.setIdPiloto(piloto.getIdPiloto());
				tripulacion.setIdVuelo(idVuelo);
				tripulacion.setTiempoCopiloto(vueloBean.getTiempoCopilotoP());
				tripulacion.setTiempoPiloto(vueloBean.getTiempoPilotoP());
				vueloDelegate.createTripulacion(tripulacion);
				
				//cargando las horas del copiloto.
				tripulacion = new TripulacionBean();
				tripulacion.setIdPiloto(vueloBean.getIdCopiloto());
				tripulacion.setIdVuelo(idVuelo);
				tripulacion.setTiempoCopiloto(vueloBean.getTiempoCopilotoC());
				tripulacion.setTiempoPiloto(vueloBean.getTiempoPilotoC());
				vueloDelegate.createTripulacion(tripulacion);
				System.out.println("Registro Creado Correctamente");
				vueloBean = new VueloBean();
				PlanVueloBean planVueloBean=new PlanVueloBean();
				model.addObject("vueloBean", vueloBean);
				model.addObject("planVueloBean", planVueloBean);
				request.setAttribute("message", "Vuelo creado correctamente");
			}
			else
			{
				PlanVueloBean planVueloBean=new PlanVueloBean();
				model.addObject("vueloBean", vueloBean);
				model.addObject("planVueloBean", planVueloBean);
				request.setAttribute("message", "Error al crear vuelo");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
				
		return model;
	}
	
@RequestMapping(value="/crearPlanVuelo",method=RequestMethod.POST)
	
	public ModelAndView crearPlanVuelo(HttpServletRequest request, HttpServletResponse response,ModelAndView model, @ModelAttribute("planVueloBean")PlanVueloBean planVueloBean)
	{
		try {
			SimpleDateFormat sfO=new SimpleDateFormat("yyyy-MM-dd");
			Date fecha=sfO.parse(planVueloBean.getEtd());
			SimpleDateFormat sf=new SimpleDateFormat("dd-MMM-yy",Locale.US);
			planVueloBean.setEtd(sf.format(fecha).toUpperCase());
			fecha=sfO.parse(planVueloBean.getQrf());
			planVueloBean.setQrf(sf.format(fecha).toUpperCase());
			boolean isCreated = vueloDelegate.createPlanVuelo(planVueloBean);
			if(isCreated)
			{
				System.out.println("Registro Creado Correctamente");
				VueloBean vueloBean = new VueloBean();
				planVueloBean=new PlanVueloBean();
				model.addObject("vueloBean", vueloBean);
				model.addObject("planVueloBean", planVueloBean);
				request.setAttribute("message", "Plan de Vuelo creado correctamente");
			}
			else
			{
				planVueloBean=new PlanVueloBean();
				VueloBean vueloBean = new VueloBean();
				model.addObject("vueloBean", vueloBean);
				model.addObject("planVueloBean", planVueloBean);
				request.setAttribute("message", "Error al crear plan de vuelo");
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
