/**
 * 
 */
package ec.edu.ups.ExamenProveedor2JEE.dao;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ec.edu.ups.ExamenProveedor2JEE.modelo.Proveedor;

/**
 * @author Gabriel Leonardo Chu
 *
 */

@Stateless
public class ProveedorDAO {
	
	@PersistenceContext(name = "ExamenProveedor1JEEPersistenceUnit") 
	private EntityManager em;
	
	public void guardarProv(Proveedor proveedor) {
		em.persist(proveedor);
	}
	
	public Proveedor read(Long id) {
		return em.find(Proveedor.class, id);
	} 
	
	// obtener todos los cliente
	public List<Proveedor> obtenerClientes() {
		List<Proveedor> listaClientes = new ArrayList<>();
		Query q = em.createQuery("SELECT pr FROM proveedor pr");
		listaClientes = q.getResultList();
		return listaClientes;
	}
	
	

}
