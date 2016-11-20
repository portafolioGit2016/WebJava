package cl.duoc.hf.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import cl.duoc.hf.delegate.UserDelegate;
import cl.duoc.hf.delegate.VueloDelegate;
import cl.duoc.hf.vo.AlertaVO;
import cl.duoc.hf.vo.LicenciaVO;
import cl.duoc.hf.vo.LoginVO;
import cl.duoc.hf.vo.PilotoVO;

@Controller

public class AlertaController {
	@Autowired
	private UserDelegate userDelegate;
	@Autowired
	private VueloDelegate vueloDelegate;

	@RequestMapping(value = "/misAlertas", method = RequestMethod.GET)
	public ModelAndView displayLogin(HttpServletRequest request, HttpServletResponse response) {
		// como se llama jsp
		ModelAndView model = new ModelAndView("alertas");
		ArrayList<AlertaVO> listaAlerta = new ArrayList<AlertaVO>();
		LoginVO datosUsuario = (LoginVO) request.getSession().getAttribute("usuarioLogeado");
		PilotoVO piloto = userDelegate.getPilotoxIdUsuario(datosUsuario.getIdUsuario());
		// fecha actual
		Calendar cal = Calendar.getInstance();

		// fecha mae
		Calendar cal2 = Calendar.getInstance();
		SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyyy", Locale.US);
		try {
			cal2.setTime(sf.parse(piloto.getFechaVencimientomae()));
			if (cal.getTimeInMillis() > cal2.getTimeInMillis()) {
				AlertaVO alerta = new AlertaVO();
				alerta.setMensaje("Licencia MAE esta Vencida");
				listaAlerta.add(alerta);
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// hoy -30 dias
		cal.add(Calendar.DATE, -30);
		cal2 = Calendar.getInstance();
		String fechaUltimoVuelo = userDelegate.ultimoVuelo(piloto.getIdPiloto().toString());
		if (fechaUltimoVuelo == null || fechaUltimoVuelo.equals("")) {
			AlertaVO alerta = new AlertaVO();
			alerta.setMensaje("Usted no registra vuelos");
			listaAlerta.add(alerta);
		} else {
			try {
				cal2.setTime(sf.parse(fechaUltimoVuelo));
				if (cal.getTimeInMillis() > cal2.getTimeInMillis()) {
					AlertaVO alerta = new AlertaVO();
					alerta.setMensaje("Lleva mas de 30 dias sin volar");
					listaAlerta.add(alerta);
				}
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		ArrayList<LicenciaVO> listaLicencia = userDelegate.getLicenciasAlerta(piloto.getIdPiloto());
		for (Iterator iterator = listaLicencia.iterator(); iterator.hasNext();) {
			LicenciaVO licenciaVO = (LicenciaVO) iterator.next();
			StringBuffer sb = new StringBuffer();
			sb.append("Su licencia Nro: ");
			sb.append(licenciaVO.getNumLicencia());
			sb.append(" Esta Vencida ");
			AlertaVO alerta = new AlertaVO();
			alerta.setMensaje(sb.toString());
			listaAlerta.add(alerta);

		}

		model.addObject("listaAlerta", listaAlerta);
		return model;
	}

}
