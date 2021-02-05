/**
 * 
 */
package ec.edu.ups.ExamenProveedor2JEE.on;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.Query;

import ec.edu.ups.ExamenProveedor2JEE.dao.ProductoDAO;
import ec.edu.ups.ExamenProveedor2JEE.dao.ProveedorDAO;
import ec.edu.ups.ExamenProveedor2JEE.modelo.Producto;
import ec.edu.ups.ExamenProveedor2JEE.modelo.Proveedor;




/**
 * @author Gabriel Leonardo Chu
 *
 */

@Stateless
public class GestionON implements GestionONLocal {
	
	@Inject
	private ProveedorDAO proveedorDAO;
	
	@Inject
	private ProductoDAO productoDAO;
	
	public void guardarProdu(Producto prod) {
		try {
			productoDAO.guardarProd(prod);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void guardarProve(Proveedor prov) {
		try {
			proveedorDAO.guardarProv(prov);;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public String hacerpedidos(Long id, int numRequeridos) {
		Producto pr = productoDAO.read(id);
		if (numRequeridos < pr.getStock()){
			pr.setStock(pr.getStock() - numRequeridos);
			actualizarProducto(pr);
			return "PEDIDO EXITOSO";
		}else {
			System.out.println("STOCK INSUFICIENTE");
			return "error";
		}
	}
	
	public void actualizarProducto(Producto prod) {
		productoDAO.update(prod);
	}
	
	public List<Producto> listaPro() {
		List<Producto> prod = productoDAO.obtenerProductos();
		return prod;
	}
	
	

}
