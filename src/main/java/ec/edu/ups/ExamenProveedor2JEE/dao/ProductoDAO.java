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

import ec.edu.ups.ExamenProveedor2JEE.modelo.Producto;



/**
 * @author Gabriel Leonardo Chu
 *
 */

@Stateless
public class ProductoDAO {
	
	@PersistenceContext(name = "ExamenProveedor1JEEPersistenceUnit") 
	private EntityManager em;
	
	public void guardarProd(Producto producto) {
		em.persist(producto);
	}
	
	public Producto read(Long id) {
		return em.find(Producto.class, id);
	} 
	
	// obtener todos los cliente
	public List<Producto> obtenerProductos() {
		List<Producto> listaClientes = new ArrayList<>();
		Query q = em.createQuery("SELECT p FROM producto p");
		listaClientes = q.getResultList();
		return listaClientes;
	}

	public void update(Producto prod) {
		em.merge(prod);
	} 
	
	

}
