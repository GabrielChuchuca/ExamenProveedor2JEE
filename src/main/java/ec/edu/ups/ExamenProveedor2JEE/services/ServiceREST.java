/**
 * 
 */
package ec.edu.ups.ExamenProveedor2JEE.services;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import ec.edu.ups.ExamenProveedor2JEE.modelo.Producto;
import ec.edu.ups.ExamenProveedor2JEE.on.GestionONLocal;

/**
 * @author Gabriel Leonardo Chu
 *
 */

@Path("producto")
public class ServiceREST {
	
	@Inject
	private GestionONLocal on;
	
	@POST
	@Path("hacerpedido")
	@Produces("application/json")
	@Consumes("application/json")
	public String hacerP(@QueryParam("id") Long id, @QueryParam("numRequeridos") int numRequeridos){
		try {
			on.hacerpedidos(id, numRequeridos);
			return "OK";
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return "ERROR";
		}
		
	}
	
	@GET
	@Produces("application/json")
	@Path("listarproductos")
	@Consumes("application/json")
	public List<Producto> listarC() {
		return on.listaPro();
	}
	
	

}
