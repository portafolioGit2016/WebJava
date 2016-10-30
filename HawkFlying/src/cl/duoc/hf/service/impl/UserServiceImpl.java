package cl.duoc.hf.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;

import cl.duoc.hf.service.UserService;
import cl.duoc.hf.viewBean.RegistroBean;
import cl.duoc.hf.vo.LoginVO;
import cl.duoc.hf.vo.PerfilVO;
import cl.duoc.hf.vo.PerfilesResponse;
import cl.duoc.hf.vo.PilotoVO;
import cl.duoc.hf.vo.PilotosResponse;
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
	    	System.out.println(e.getResponseHeaders());
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
	@Override
	public ArrayList<PerfilVO> getPerfiles(){
		String uri="https://database-clportafoliotrial.db.us2.oraclecloudapps.com/apex/hawkflying/perfilusuario/";
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate.getForObject(uri, PerfilesResponse.class).getPerfiles();
	}
	public ArrayList<PilotoVO> getPilotos(){
		String uri="https://database-clportafoliotrial.db.us2.oraclecloudapps.com/apex/hawkflying/piloto/";
		RestTemplate restTemplate = new RestTemplate();
		ArrayList<PilotoVO> pilotos=restTemplate.getForObject(uri, PilotosResponse.class).getPilotos();
		for (Iterator iterator = pilotos.iterator(); iterator.hasNext();) {
			PilotoVO pilotoVO = (PilotoVO) iterator.next();
			pilotoVO.setUsuarioVO(getUsuario(pilotoVO.getIdUsuario().toString()));
		}
		return pilotos;
	}
	public UsuarioVO getUsuario(String id) {
		String uri="https://database-clportafoliotrial.db.us2.oraclecloudapps.com/apex/hawkflying/usuarios/{id}";
	     
	    Map<String, String> params = new HashMap<String, String>();
	    params.put("id", id);
	     
	    RestTemplate restTemplate = new RestTemplate();
	    UsuarioVO result = restTemplate.getForObject(uri, UsuarioVO.class, params);
    
		return result;
	}
	@Override
	public boolean updateUser(RegistroBean registroBean) {
				
		String uri="https://database-clportafoliotrial.db.us2.oraclecloudapps.com/apex/hawkflying/usuarios/{id}";
	    try{
		RestTemplate restTemplate = new RestTemplate();
		Map<String, String> param = new HashMap<String, String>();
	    param.put("id",registroBean.getId().toString());
	    HttpEntity<RegistroBean> requestEntity = new HttpEntity<RegistroBean>(registroBean);
	    ResponseEntity<String> response = restTemplate.exchange(uri, HttpMethod.PUT, requestEntity, String.class,param);
    
	    System.out.println(response.getStatusCode());
	    return response.getStatusCode().value()==200;
	    }catch(HttpServerErrorException e){
	    	System.out.println(e.getResponseHeaders());
	    	return false;
	    }
	}
//	public static void main(String args[]){
//		System.setProperty("https.proxyHost", "10.181.124.230");
//		System.setProperty("https.proxyPort", "8080");
//		UserService usr=new UserServiceImpl();
//		ArrayList<PilotoVO> pilotos=usr.getPilotos();
//		//UsuarioVO usuario=usr.getUsuario("2711");
//		System.out.println("" + pilotos);
//	}
}
