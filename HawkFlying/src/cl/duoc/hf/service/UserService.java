package cl.duoc.hf.service;

import cl.duoc.hf.viewBean.RegistroBean;

/**
 * @author CENTAUR
 *
 */
public interface UserService
{
	public boolean isValidUser(String username, String password);
	public boolean createUser(RegistroBean registroBean);
}
