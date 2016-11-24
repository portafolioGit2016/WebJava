package cl.duoc.hf.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import cl.duoc.hf.delegate.UserDelegate;
import cl.duoc.hf.vo.LoginVO;
import cl.duoc.hf.vo.PerfilVO;
import cl.duoc.hf.vo.PilotoVO;
import cl.duoc.hf.vo.UsuarioVO;

@Controller
public class PerfilController {
	@Autowired
	private UserDelegate userDelegate;

	@RequestMapping(value = "/verPerfil", method = RequestMethod.GET)
	public ModelAndView verPerfil(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView model = new ModelAndView("perfil");
		LoginVO datosUsuario = (LoginVO) request.getSession().getAttribute("usuarioLogeado");
		UsuarioVO usuario = userDelegate.getUsuario(datosUsuario.getIdUsuario().toString());
		PerfilVO perfil = userDelegate.getPerfil(usuario.getTipoperfil().toString());
		if (null != usuario.getLicenciaPiloto()) {
			PilotoVO piloto = userDelegate.getPiloto(usuario.getLicenciaPiloto().toString());
			UsuarioVO usuarioPiloto = userDelegate.getUsuario(piloto.getIdUsuario().toString());
			model.addObject("usuarioPiloto", usuarioPiloto);
		}
		final Calendar calendar = javax.xml.bind.DatatypeConverter.parseDateTime(usuario.getFechaNac());
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
		usuario.setFechaNac(sf.format(calendar.getTime()).toUpperCase());
		model.addObject("usuario", usuario);
		model.addObject("perfil", perfil);
		return model;
	}

}
