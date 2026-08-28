package negocio;

import java.util.List;

import dao.PlatoDao;
import datos.Plato;

public class PlatoABM {

	PlatoDao dao = new PlatoDao();

	public Plato traer(long idPlato) {
		return dao.traer(idPlato);
	}

	public int agregar(Plato p) {
		// Pendiente implementar lógica de negocio
		return dao.agregar(p);
	}

	public void modificar(Plato p) {
		// Pendiente implementar lógica de negocio
		dao.actualizar(p);
	}

	public void eliminar(long idPlato) {
		// Pendiente implementar lógica de negocio
		Plato p = dao.traer(idPlato);
		dao.eliminar(p);
	}

	public List<Plato> traer() {
		return dao.traer();
	}
}
