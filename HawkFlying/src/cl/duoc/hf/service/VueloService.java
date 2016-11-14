package cl.duoc.hf.service;

import java.util.ArrayList;

import cl.duoc.hf.viewBean.VueloBean;
import cl.duoc.hf.vo.AerodromoVO;
import cl.duoc.hf.vo.VueloVO;

/**
 * @author Jocelyn Poblete
 *	Interfaz de metodos que se implementan en Delegate Vuelo
 */
public  interface VueloService 
{

	public ArrayList<VueloVO> getVuelos();
	public boolean createVuelo(VueloBean vueloBean);
	public void deleteVuelo(int id);
	public boolean updateVuelo(VueloBean vueloBean);
	public ArrayList<AerodromoVO> getAerodromos();
	
}
