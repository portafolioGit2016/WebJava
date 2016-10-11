package cl.duoc.hf.service.impl;

import cl.duoc.hf.service.UserService;

public class UserServiceImpl implements UserService{

	@Override
	public boolean isValidUser(String username, String password) {
		return true;
	}
	
}
