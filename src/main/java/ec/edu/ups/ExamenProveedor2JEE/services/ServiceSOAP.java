package ec.edu.ups.ExamenProveedor2JEE.services;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.ws.rs.QueryParam;

import ec.edu.ups.ExamenProveedor2JEE.on.GestionONLocal;

@WebService
public class ServiceSOAP {
	
	@Inject
	private GestionONLocal on;
	
	@WebMethod
	public String hacerP(Long id, int numRequeridos){
		try {
			on.hacerpedidos(id, numRequeridos);
			return "OK";
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return "ERROR";
		}
		
	}

}
