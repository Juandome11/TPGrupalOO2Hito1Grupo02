package datos;

import java.util.List;

public class Plato {

	private long idPlato;
	private String nombre;
	private long precio;
	private long costoProd;
	private List<DetallePedido> detalles;

	public Plato() {}

	public Plato(String nombre, long precio, long costoProd) {
		this.nombre = nombre;
		this.precio = precio;
		this.costoProd = costoProd;
	}

	public long getIdPlato() {
		return idPlato;
	}

	protected void setIdPlato(long idPlato) {
		this.idPlato = idPlato;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public long getPrecio() {
		return precio;
	}

	public void setPrecio(long precio) {
		this.precio = precio;
	}

	public long getCostoProd() {
		return costoProd;
	}

	public void setCostoProd(long costoProd) {
		this.costoProd = costoProd;
	}

	public List<DetallePedido> getDetalles() {
		return detalles;
	}

	public void setDetalles(List<DetallePedido> detalles) {
		this.detalles = detalles;
	}

	@Override
	public String toString() {
		return "Plato [idPlato=" + idPlato + ", nombre=" + nombre + ", precio=" + precio + ", costoProd=" + costoProd
				+ "]";
	}
}
