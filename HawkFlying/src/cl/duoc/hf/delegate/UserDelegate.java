package cl.duoc.hf.delegate;

import cl.duoc.hf.service.UserService;

public class UserDelegate
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

}
