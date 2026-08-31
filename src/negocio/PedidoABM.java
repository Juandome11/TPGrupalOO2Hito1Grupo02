package negocio;

import java.util.List;

import dao.PedidoDao;
import datos.Pedido;

public class PedidoABM {

	PedidoDao dao = new PedidoDao();

	public Pedido traer(long idPedido) {
		return dao.traer(idPedido);
	}

	public int agregar(Pedido p) {
		// Pendiente implementar lógica de negocio
		return dao.agregar(p);
	}

	public void modificar(Pedido p) {
		// Pendiente implementar lógica de negocio
		dao.actualizar(p);
	}

	public void eliminar(long idPedido) {
		// Pendiente implementar lógica de negocio
		Pedido p = dao.traer(idPedido);
		dao.eliminar(p);
	}

	public List<Pedido> traer() {
		return dao.traer();
	}

	public Pedido traerPedidoYDetalles(long idPedido) {
		return dao.traerPedidoYPlatos(idPedido);
	}
}
