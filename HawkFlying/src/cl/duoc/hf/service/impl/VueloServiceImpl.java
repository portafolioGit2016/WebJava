package cl.duoc.hf.service.impl;

import java.util.ArrayList;

import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;

import cl.duoc.hf.service.VueloService;
import cl.duoc.hf.viewBean.VueloBean;
import cl.duoc.hf.vo.AerodromoResponse;
import cl.duoc.hf.vo.AerodromoVO;
import cl.duoc.hf.vo.AeronaveResponse;
import cl.duoc.hf.vo.AeronaveVO;
import cl.duoc.hf.vo.PlanVueloResponse;
import cl.duoc.hf.vo.PlanVueloVO;
import cl.duoc.hf.vo.ResultadoInsertVO;
import cl.duoc.hf.vo.VueloResponse;
import cl.duoc.hf.vo.VueloVO;


public class VueloServiceImpl implements VueloService{

	public ArrayList<VueloVO> getVuelos() {
		String uri="https://database-clportafoliootrial.db.us2.oraclecloudapps.com/apex/hawkflying/vuelos/";
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate.getForObject(uri, VueloResponse.class).getVuelos();
	}

	public void deleteVuelo(int id) {
		// TODO Auto-generated method stub
		
	}

	public boolean updateVuelo(VueloBean vueloBean) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean createVuelo(VueloBean vueloBean) {
		String uri="https://database-clportafoliootrial.db.us2.oraclecloudapps.com/apex/hawkflying/vuelos/";
	    try{
		RestTemplate restTemplate = new RestTemplate();
	    ResultadoInsertVO result = restTemplate.postForObject(uri,vueloBean, ResultadoInsertVO.class);
    
	    System.out.println(result);
	    return result.getID()!=null;
	    }catch(HttpServerErrorException e){
	    	System.out.println(e.getResponseHeaders());
	    	return false;
	    }
	}
	public VueloServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public ArrayList<AerodromoVO> getAerodromos() {
		String uri="https://database-clportafoliootrial.db.us2.oraclecloudapps.com/apex/hawkflying/aerodromo";
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate.getForObject(uri, AerodromoResponse.class).getAerodromos();
	}
	@Override
	public ArrayList<AeronaveVO> getAeronaves() {
		String uri="https://database-clportafoliootrial.db.us2.oraclecloudapps.com/apex/hawkflying/aeronave/";
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate.getForObject(uri, AeronaveResponse.class).getAeronaves();
	}
	@Override
	public ArrayList<PlanVueloVO> getPlanesDeVuelo() {
		String uri="https://database-clportafoliootrial.db.us2.oraclecloudapps.com/apex/hawkflying/plan_vuelo/";
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate.getForObject(uri, PlanVueloResponse.class).getPlanesDeVuelo();
	}
}
