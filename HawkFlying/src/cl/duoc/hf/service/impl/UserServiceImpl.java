package cl.duoc.hf.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;

import cl.duoc.hf.service.UserService;
import cl.duoc.hf.viewBean.RegistroBean;
import cl.duoc.hf.vo.LoginVO;
import cl.duoc.hf.vo.ResultadoInsertVO;
import cl.duoc.hf.vo.UsuarioVO;
import cl.duoc.hf.vo.UsuariosResponse;

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
				
		String uri="https://database-clportafoliotrial.db.us2.oraclecloudapps.com/apex/hawkflying/usuarios/";
	    try{
		RestTemplate restTemplate = new RestTemplate();
	    ResultadoInsertVO result = restTemplate.postForObject(uri,registroBean, ResultadoInsertVO.class);
    
	    System.out.println(result);
	    return result.getID()!=null;
	    }catch(HttpServerErrorException e){
	    	System.out.println(e.getResponseBodyAsString());
	    	return false;
	    }
	}
	
	@Override
	public ArrayList<UsuarioVO> getUsuarios(){
		String uri="https://database-clportafoliotrial.db.us2.oraclecloudapps.com/apex/hawkflying/usuarios/";
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate.getForObject(uri, UsuariosResponse.class).getUsuarios();
	}
	
	@Override
	public void deleteUser(int id){
		String uri="https://database-clportafoliotrial.db.us2.oraclecloudapps.com/apex/hawkflying/usuarios/{id}";
		java.util.Map<String,String> params = new HashMap<String, String>();
        params.put("id", String.valueOf(id));
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.delete ( uri,  params );
	}
}
