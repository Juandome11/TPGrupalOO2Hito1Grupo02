package negocio;

import java.util.List;

import dao.DetallePedidoDao;
import datos.DetallePedido;
import datos.Plato;

public class DetallePedidoABM {

	DetallePedidoDao dao = new DetallePedidoDao();

	public DetallePedido traer(long idDetallePedido) {
		return dao.traer(idDetallePedido);
	}

	public int agregar(DetallePedido d) {
		// Pendiente implementar lógica de negocio
		return dao.agregar(d);
	}

	public void modificar(DetallePedido d) {
		// Pendiente implementar lógica de negocio
		dao.actualizar(d);
	}

	public void eliminar(long idDetallePedido) {
		// Pendiente implementar lógica de negocio
		DetallePedido d = dao.traer(idDetallePedido);
		dao.eliminar(d);
	}

	public List<DetallePedido> traer() {
		return dao.traer();
	}

	public List<DetallePedido> traer(Plato plato) {
		return dao.traer(plato);
	}
}
