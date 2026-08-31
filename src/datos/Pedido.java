package datos;

import java.time.LocalTime;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
public class Pedido {

	private long idPedido;
	private UnidadVenta unidadVentaEntrega;
	private String codigoPedido;
	private Festival festivalPaso;
	private LocalTime fechaTransaccion;
	private Set<Plato> platos;




	public Pedido() {
		super();
	}




	public Pedido(UnidadVenta unidadVentaEntrega, String codigoPedido, Festival festivalPaso,
			LocalTime fechaTransaccion) {
		super();
		this.unidadVentaEntrega = unidadVentaEntrega;
		this.codigoPedido = codigoPedido;
		this.festivalPaso = festivalPaso;
		this.fechaTransaccion = fechaTransaccion;
		this.platos= new HashSet<>();
	}




	public long getIdPedido() {
		return idPedido;
	}

	protected void setIdPedido(long idPedido) {
		this.idPedido = idPedido;
	}

	public UnidadVenta getUnidadVentaEntrega() {
		return unidadVentaEntrega;
	}

	public void setUnidadVentaEntrega(UnidadVenta unidadVentaEntrega) {
		this.unidadVentaEntrega = unidadVentaEntrega;
	}

	public Festival getFestivalPaso() {
		return festivalPaso;
	}

	public void setFestivalPaso(Festival festivalPaso) {
		this.festivalPaso = festivalPaso;
	}

	public LocalTime getFechaTransaccion() {
		return fechaTransaccion;
	}

	public void setFechaTransaccion(LocalTime fechaTransaccion) {
		this.fechaTransaccion = fechaTransaccion;
	}
	
	

	public String getCodigoPedido() {
		return codigoPedido;
	}

	public void setCodigoPedido(String codigoPedido) {
		this.codigoPedido = codigoPedido;
	}

	public Set<Plato> getPlatos() {
		return platos;
	}

	public void setPlatos(Set<Plato> platos) {
		this.platos = platos;
	}

	// Pendiente implementar lógica de negocio
	public long precioTotalPedido() {
		throw new UnsupportedOperationException("Pendiente de implementar");
	}
	
	public boolean agregar(Plato plato){
		boolean agregar=false;
		if (! (platos.contains(plato))) {
		agregar=platos.add(plato);
		}
		return agregar;
		}
	
	public boolean eliminar(Plato plato){
		Plato borrar=null;
		boolean eliminar=false;
		Iterator<Plato> it = platos.iterator();
		while ((it.hasNext()) && (borrar==null)){
		Plato p=it.next();
		if (p.equals(plato) ) borrar=p;
		}
		eliminar=platos.remove(borrar);
		return eliminar;
		}

	@Override
	public String toString() {
		return "Pedido [idPedido=" + idPedido + ", fechaTransaccion=" + fechaTransaccion + "]";
	}
}
