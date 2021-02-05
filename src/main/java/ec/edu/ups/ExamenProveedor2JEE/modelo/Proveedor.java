/**
 * 
 */
package ec.edu.ups.ExamenProveedor2JEE.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Gabriel Leonardo Chu
 *
 */

@Entity(name = "proveedor")
public class Proveedor implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_proveedor")
	private Long id;
	@Column
	private String nombre;
	
	@Column
	private String direccion;
	
	/**
	 * @param id
	 * @param nombre
	 * @param direccion
	 */
	public Proveedor(Long id, String nombre, String direccion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.direccion = direccion;
	}
	
	/**
	 * 
	 */
	public Proveedor() {
		//super();
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Proveedor [id=" + id + ", nombre=" + nombre + ", direccion=" + direccion + "]";
	}
}
