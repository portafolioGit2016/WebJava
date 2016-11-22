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
import cl.duoc.hf.viewBean.LoginBean;
import cl.duoc.hf.vo.LoginVO;

@Controller
public class LoginController {
	@Autowired
	private LoginDelegate loginDelegate;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView displayLogin(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView model = new ModelAndView("login");
		LoginBean loginBean = new LoginBean();
		model.addObject("loginBean", loginBean);
		return model;
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView executeLogin(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("loginBean") LoginBean loginBean) {
		ModelAndView model = null;
		try {
			LoginVO isValidUser = loginDelegate.isValidUser(loginBean.getUsername(), loginBean.getPassword());
			if (isValidUser.getCantidad() > 0) {
				if (isValidUser.getTipoPerfil() == 1 || isValidUser.getTipoPerfil() == 2 || isValidUser.getTipoPerfil() == 5 || isValidUser.getTipoPerfil() == 6) {
					System.out.println("User Login Successful");
					
					request.setAttribute("loggedInUser", loginBean.getUsername());
					// se va a setear en la session.
					request.getSession().setAttribute("usuarioLogeado", isValidUser);
					model = new ModelAndView("welcome");
				} else {
					model = new ModelAndView("login");
					model.addObject("loginBean", loginBean);
					request.setAttribute("message", "Perfil invalido");
				}
			} else {
				model = new ModelAndView("login");
				model.addObject("loginBean", loginBean);
				request.setAttribute("message", "Usuario/Clave Invalido");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return model;
	}
}
