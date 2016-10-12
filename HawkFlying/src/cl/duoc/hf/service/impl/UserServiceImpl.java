package cl.duoc.hf.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.client.RestTemplate;

import cl.duoc.hf.vo.LoginVO;
import cl.duoc.hf.service.UserService;
import cl.duoc.hf.viewBean.RegistroBean;

public class UserServiceImpl implements UserService{

	@Override
	public boolean isValidUser(String username, String password) {
		String uri="https://database-clportafoliotrial.db.us2.oraclecloudapps.com/apex/hawkflying/usuario/login/{user}/{pwd}";
	     
	    Map<String, String> params = new HashMap<String, String>();
	    params.put("user", username);
	    params.put("pwd", password);
	     
	    RestTemplate restTemplate = new RestTemplate();
	    LoginVO result = restTemplate.getForObject(uri, LoginVO.class, params);
    
	    System.out.println(result);
		return result.getCantidad()>0;
	}

	@Override
	public boolean createUser(RegistroBean registroBean) {
		String uri="https://database-clportafoliotrial.db.us2.oraclecloudapps.com/apex/hawkflying/usuario/create/{user}/{pwd}/{nombre}/{apellido}/{email}/{rut}/{fecha}";
	     
	    RestTemplate restTemplate = new RestTemplate();
	    ResultadoInsertVO result = restTemplate.postForObject(uri,registroBean, ResultadoInsertVO.class);
    
	    System.out.println(result);
		return result.getCantidad()>0;
	}
}
