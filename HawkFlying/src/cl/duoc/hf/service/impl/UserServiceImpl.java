package cl.duoc.hf.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import cl.duoc.hf.LoginVO;
import cl.duoc.hf.service.UserService;

public class UserServiceImpl implements UserService{

	@Override
	public boolean isValidUser(String username, String password) {
		String uri="https://database-clportafoliotrial.db.us2.oraclecloudapps.com/apex/hawkflying/usuario/login/{user}/{pwd}";
	     
	    Map<String, String> params = new HashMap<String, String>();
	    params.put("user", username);
	    params.put("pwd", password);
	     
	    RestTemplate restTemplate = new RestTemplate();
	    restTemplate.setMessageConverters(getMessageConverters());
	    HttpHeaders headers = new HttpHeaders();
	    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	    HttpEntity<String> entity = new HttpEntity<String>(headers);
	    //LoginVO result = restTemplate.getForObject(uri, LoginVO.class, params);
	    ResponseEntity<LoginVO> response = restTemplate.exchange(uri, HttpMethod.GET, entity, LoginVO.class, params);
	    LoginVO resource = response.getBody();	     
	    System.out.println(resource);
		return resource.getCantidad()>0;
	}
	private List<HttpMessageConverter<?>> getMessageConverters() {
		List<HttpMessageConverter<?>> converters = new ArrayList<HttpMessageConverter<?>>();
		converters.add(new MappingJackson2HttpMessageConverter());
		return converters;
	}
}
