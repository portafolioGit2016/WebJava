package cl.duoc.hf.delegate;

import java.util.ArrayList;

import cl.duoc.hf.service.VueloService;
import cl.duoc.hf.viewBean.PlanVueloBean;
import cl.duoc.hf.viewBean.TripulacionBean;
import cl.duoc.hf.viewBean.VueloBean;
import cl.duoc.hf.vo.AerodromoVO;
import cl.duoc.hf.vo.AeronaveVO;
import cl.duoc.hf.vo.PlanVueloVO;
import cl.duoc.hf.vo.TipoVueloVO;
import cl.duoc.hf.vo.VueloVO;
/**
 * @author Jocelyn Poblete
 *	Metodos de los objetos que se implementan UserService.y de aca se pasa al Controller
 */
public class VueloDelegate {

	private VueloService vueloService;
	public VueloService getVueloService()
	{
		return this.vueloService;
	}
	public void setVueloService(VueloService vueloService)
	{
		this.vueloService = vueloService;
	}
	public ArrayList<VueloVO> getVuelos()
	{
		return vueloService.getVuelos();
	}
	public ArrayList<AerodromoVO> getAerodromos()
	{
		return vueloService.getAerodromos();
	}
	public void deleteVuelo(int id)
	{
		vueloService.deleteVuelo(id);
	}
	public boolean updateVuelo(VueloBean vueloBean)
	{
		return vueloService.updateVuelo(vueloBean);
	}
	
	public Integer createVuelo(VueloBean vueloBean){
		return vueloService.createVuelo(vueloBean);
	}
	
	public boolean createTripulacion(TripulacionBean tripulacionBean){
		return vueloService.createTripulacion(tripulacionBean);
	}
	public ArrayList<AeronaveVO> getAeronaves()
	{
		return vueloService.getAeronaves();
	}
	public ArrayList<PlanVueloVO> getPlanesDeVuelo()
	{
		return vueloService.getPlanesDeVuelo();
	}
	public ArrayList<TipoVueloVO> getTiposDeVuelo()
	{
		return vueloService.getTiposDeVuelo();
	}
	public boolean createPlanVuelo(PlanVueloBean planVueloBean){
		return vueloService.createPlandeVuelo(planVueloBean);
	}
}
