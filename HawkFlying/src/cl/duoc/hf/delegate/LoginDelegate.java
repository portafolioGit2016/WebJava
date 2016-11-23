package cl.duoc.hf.delegate;

import java.sql.SQLException;

import cl.duoc.hf.service.UserService;
import cl.duoc.hf.viewBean.RegistroBean;
import cl.duoc.hf.vo.LoginVO;

public class LoginDelegate
{
	private UserService userService;

	public UserService getUserService()
	{
		return this.userService;
	}

	public void setUserService(UserService userService)
	{
		this.userService = userService;
	}

	public LoginVO isValidUser(String username, String password)
	{
	    return userService.isValidUser(username, password);
	}
	public boolean existsUser(String username) 
	{
	    return userService.existsUser(username);
	}
	public Integer createUser(RegistroBean registroBean){
		return userService.createUser(registroBean);
	}
}
