package negocio;

import java.util.List;

import dao.StaffDao;
import datos.Staff;

public class StaffABM {

	StaffDao dao = new StaffDao();

	public Staff traer(long idStaff) {
		return dao.traer(idStaff);
	}

	public Staff traer(String dni) {
		return dao.traer(dni);
	}

	public int agregar(Staff s) {
		// Pendiente implementar lógica de negocio (validarEdad antes de guardar)
		return dao.agregar(s);
	}

	public void modificar(Staff s) {
		// Pendiente implementar lógica de negocio
		dao.actualizar(s);
	}

	public void eliminar(long idStaff) {
		// Pendiente implementar lógica de negocio
		Staff s = dao.traer(idStaff);
		dao.eliminar(s);
	}

	public List<Staff> traer() {
		return dao.traer();
	}
}
