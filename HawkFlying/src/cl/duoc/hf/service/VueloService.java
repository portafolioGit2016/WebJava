package cl.duoc.hf.service;

import java.util.ArrayList;

import cl.duoc.hf.viewBean.PlanVueloBean;
import cl.duoc.hf.viewBean.TripulacionBean;
import cl.duoc.hf.viewBean.VueloBean;
import cl.duoc.hf.vo.AerodromoVO;
import cl.duoc.hf.vo.AeronaveVO;
import cl.duoc.hf.vo.PlanMantenimientoVO;
import cl.duoc.hf.vo.PlanVueloVO;
import cl.duoc.hf.vo.TipoVueloVO;
import cl.duoc.hf.vo.VueloVO;

/**
 * @author Jocelyn Poblete
 *	Interfaz de metodos que se implementan en Delegate Vuelo
 */
public  interface VueloService 
{

	public ArrayList<VueloVO> getVuelos();
	public Integer createVuelo(VueloBean vueloBean);
	public void deleteVuelo(int id);
	public boolean updateVuelo(VueloBean vueloBean);
	public ArrayList<AerodromoVO> getAerodromos();
	public ArrayList<AeronaveVO> getAeronaves();
	public ArrayList<AeronaveVO> getAeronavesDisponibles(String tipoBusqueda);
	public ArrayList<PlanVueloVO> getPlanesDeVuelo();
	public ArrayList<TipoVueloVO> getTiposDeVuelo();
	public boolean createPlandeVuelo(PlanVueloBean planDevueloBean);
	public boolean createTripulacion(TripulacionBean tripulacionBean);
	public ArrayList<PlanMantenimientoVO> getPlanesMantenimiento(Integer tipoBusqueda);
}
