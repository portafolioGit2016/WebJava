package cl.duoc.hf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cl.duoc.hf.delegate.UserDelegate;

@Controller
public class DeleteUsuarioController {
	@Autowired
	private UserDelegate userDelegate;
	@RequestMapping(value="/deleteUser",method=RequestMethod.GET, params = {"id"} )
	public @ResponseBody ModelAndView getUsersForGrid(
			@RequestParam(value = "id") int id){
		ModelAndView model = new ModelAndView("deleteUser");
		userDelegate.deleteUser(id);
		return model;
	}
}
