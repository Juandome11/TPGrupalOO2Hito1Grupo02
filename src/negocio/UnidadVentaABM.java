package negocio;

import java.util.List;

import dao.UnidadVentaDao;
import datos.UnidadVenta;

public class UnidadVentaABM {

	UnidadVentaDao dao = new UnidadVentaDao();

	public UnidadVenta traer(long idUnidadVenta) {
		return dao.traer(idUnidadVenta);
	}

	public int agregar(UnidadVenta u) {
		// Pendiente implementar lógica de negocio (validarCodigo antes de guardar)
		return dao.agregar(u);
	}

	public void modificar(UnidadVenta u) {
		// Pendiente implementar lógica de negocio
		dao.actualizar(u);
	}

	public void eliminar(long idUnidadVenta) {
		// Pendiente implementar lógica de negocio
		UnidadVenta u = dao.traer(idUnidadVenta);
		dao.eliminar(u);
	}

	public List<UnidadVenta> traer() {
		return dao.traer();
	}
}
