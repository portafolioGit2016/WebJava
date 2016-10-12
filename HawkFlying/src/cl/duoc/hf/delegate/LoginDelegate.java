package cl.duoc.hf.delegate;

import java.sql.SQLException;

import cl.duoc.hf.service.UserService;
import cl.duoc.hf.viewBean.RegistroBean;

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

	public boolean isValidUser(String username, String password) throws SQLException
	{
	    return userService.isValidUser(username, password);
	}
	public boolean createUser(RegistroBean registroBean){
		return userService.createUser(registroBean);
	}
}
