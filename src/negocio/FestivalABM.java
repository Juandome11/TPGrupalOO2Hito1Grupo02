package negocio;

import java.util.List;

import dao.FestivalDao;
import datos.Festival;

public class FestivalABM {

	FestivalDao dao = new FestivalDao();

	public Festival traer(long idFestival) {
		return dao.traer(idFestival);
	}

	public int agregar(Festival f) {
		// Pendiente implementar lógica de negocio
		return dao.agregar(f);
	}

	public void modificar(Festival f) {
		// Pendiente implementar lógica de negocio
		dao.actualizar(f);
	}

	public void eliminar(long idFestival) {
		// Pendiente implementar lógica de negocio
		Festival f = dao.traer(idFestival);
		dao.eliminar(f);
	}

	public List<Festival> traer() {
		return dao.traer();
	}

	public Festival traerFestivalYUnidadesVenta(long idFestival) {
		return dao.traerFestivalYUnidadesVenta(idFestival);
	}
}
