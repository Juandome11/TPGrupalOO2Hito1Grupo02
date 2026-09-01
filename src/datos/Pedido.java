package datos;

import java.time.LocalTime;
import java.util.Set;

public class Pedido {

	private long idPedido;
	private UnidadVenta unidadVentaEntrega;
	private Festival festivalPaso;
	private LocalTime fechaTransaccion;
	private Set<DetallePedido> detalles;

	public Pedido() {}

	public Pedido(UnidadVenta unidadVentaEntrega, Festival festivalPaso, LocalTime fechaTransaccion) {
		this.unidadVentaEntrega = unidadVentaEntrega;
		this.festivalPaso = festivalPaso;
		this.fechaTransaccion = fechaTransaccion;
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

	

	public Set<DetallePedido> getDetalles() {
		return detalles;
	}

	public void setDetalles(Set<DetallePedido> detalles) {
		this.detalles = detalles;
	}

	// Pendiente implementar lógica de negocio
	public long precioTotalPedido() {
		throw new UnsupportedOperationException("Pendiente de implementar");
	}

	@Override
	public String toString() {
		return "Pedido [idPedido=" + idPedido + ", fechaTransaccion=" + fechaTransaccion + "]";
	}
}
