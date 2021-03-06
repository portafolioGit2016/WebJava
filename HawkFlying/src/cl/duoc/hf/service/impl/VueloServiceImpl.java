package cl.duoc.hf.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;

import cl.duoc.hf.service.VueloService;
import cl.duoc.hf.viewBean.PlanVueloBean;
import cl.duoc.hf.viewBean.TripulacionBean;
import cl.duoc.hf.viewBean.VueloBean;
import cl.duoc.hf.vo.AerodromoResponse;
import cl.duoc.hf.vo.AerodromoVO;
import cl.duoc.hf.vo.AeronaveResponse;
import cl.duoc.hf.vo.AeronaveVO;
import cl.duoc.hf.vo.HrsVueloVO;
import cl.duoc.hf.vo.PlanMantenimientoResponse;
import cl.duoc.hf.vo.PlanMantenimientoVO;
import cl.duoc.hf.vo.PlanVueloResponse;
import cl.duoc.hf.vo.PlanVueloVO;
import cl.duoc.hf.vo.ResultadoInsertVO;
import cl.duoc.hf.vo.TipoVueloResponse;
import cl.duoc.hf.vo.TipoVueloVO;
import cl.duoc.hf.vo.UsuarioVO;
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

	public Integer createVuelo(VueloBean vueloBean) {
		String uri="https://database-clportafoliootrial.db.us2.oraclecloudapps.com/apex/hawkflying/vuelos/";
	    try{
		RestTemplate restTemplate = new RestTemplate();
	    ResultadoInsertVO result = restTemplate.postForObject(uri,vueloBean, ResultadoInsertVO.class);
    
	    System.out.println(result);
	    return Integer.valueOf(result.getID());
	    }catch(HttpServerErrorException e){
	    	System.out.println(e.getResponseHeaders());
	    	return null;
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
	public ArrayList<AeronaveVO> getAeronavesDisponibles(String tipoBusqueda) {
		Map<String, String> params = new HashMap<String, String>();
	    params.put("tipo", tipoBusqueda.toString());
		String uri="https://database-clportafoliootrial.db.us2.oraclecloudapps.com/apex/hawkflying/aeronaveDisponible/{tipo}";
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate.getForObject(uri, AeronaveResponse.class,params).getAeronaves();
	}
	@Override
	public ArrayList<PlanVueloVO> getPlanesDeVuelo() {
		String uri="https://database-clportafoliootrial.db.us2.oraclecloudapps.com/apex/hawkflying/plan_vuelo/";
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate.getForObject(uri, PlanVueloResponse.class).getPlanesDeVuelo();
	}
	@Override
	public ArrayList<TipoVueloVO> getTiposDeVuelo(){
		String uri="https://database-clportafoliootrial.db.us2.oraclecloudapps.com/apex/hawkflying/tipovuelo";
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate.getForObject(uri, TipoVueloResponse.class).getTiposDeVuelo();
	}
	@Override
	public boolean createPlandeVuelo(PlanVueloBean planDevueloBean){
		String uri="https://database-clportafoliootrial.db.us2.oraclecloudapps.com/apex/hawkflying/plan_vuelo/";
	    try{
		RestTemplate restTemplate = new RestTemplate();
	    ResultadoInsertVO result = restTemplate.postForObject(uri,planDevueloBean, ResultadoInsertVO.class);
    
	    System.out.println(result);
	    return result.getID()!=null;
	    }catch(HttpServerErrorException e){
	    	System.out.println(e.getResponseHeaders());
	    	return false;
	    }
	}

	@Override
	public boolean createTripulacion(TripulacionBean tripulacionBean) {
		String uri="https://database-clportafoliootrial.db.us2.oraclecloudapps.com/apex/hawkflying/tripulacion/";
	    try{
		RestTemplate restTemplate = new RestTemplate();
	    ResultadoInsertVO result = restTemplate.postForObject(uri,tripulacionBean, ResultadoInsertVO.class);
    
	    System.out.println(result);
	    return result.getID()!=null;
	    }catch(HttpServerErrorException e){
	    	System.out.println(e.getResponseHeaders());
	    	return false;
	    }
	}
	public ArrayList<PlanMantenimientoVO> getPlanesMantenimiento(Integer tipoBusqueda){
		String uri="https://database-clportafoliootrial.db.us2.oraclecloudapps.com/apex/hawkflying/planMantenimiento/{tipo}";
	     
	    Map<String, String> params = new HashMap<String, String>();
	    params.put("tipo", tipoBusqueda.toString());
	     
	    RestTemplate restTemplate = new RestTemplate();
	    PlanMantenimientoResponse result = restTemplate.getForObject(uri, PlanMantenimientoResponse.class, params);
    
		return result.getPlanes();		
	}

	@Override
	public HrsVueloVO consultaHrsVuelo(String idLicencia, String idusuario) {
		String uri="https://database-clportafoliootrial.db.us2.oraclecloudapps.com/apex/hawkflying/reporteHrsVuelo/{idLicencia}/{idusuario}";
	     
	    Map<String, String> params = new HashMap<String, String>();
	    params.put("idLicencia", idLicencia);
	    params.put("idusuario", idusuario);
	     
	    RestTemplate restTemplate = new RestTemplate();
	    HrsVueloVO result = restTemplate.getForObject(uri, HrsVueloVO.class, params);
    
		return result;	
	}
}
