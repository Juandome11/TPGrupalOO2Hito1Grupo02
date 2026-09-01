package negocio;

import java.time.LocalDate;
import java.util.List;

import dao.FestivalDao;
import datos.Festival;
import datos.Plato;

public class FestivalABM {

	FestivalDao dao = new FestivalDao();

	public Festival traer(long idFestival) {
		return dao.traer(idFestival);
	}

	public int agregar(Festival f) {
		/*
		if(f.getFechaInicio().isBefore(LocalDate.now())) {
			throw new UnsupportedOperationException("La fecha ingresada es posterior a la actual. No es una maquina del tiempo mi loko :C");
		}else {
			if(f.getFechaFin().isBefore(f.getFechaInicio()) || f.getFechaFin().isBefore(LocalDate.now())) {
				throw new UnsupportedOperationException("La fiesta no puede acabar antes de comenzar");
			}
		}
		*/
		return dao.agregar(f);
	}

	public void modificar(Festival f) {
		if(dao.traer(f.getIdFestival())== null) {
			throw new UnsupportedOperationException("El Festival no existe en la base");
		}
		dao.actualizar(f);
	}

	public void eliminar(long idFestival) {
		if(dao.traer(idFestival)== null) {
			throw new UnsupportedOperationException("El Festival no existe en la base");
		}
		Festival f = dao.traer(idFestival);
		dao.eliminar(f);
	}

	public List<Festival> traer() {
		return dao.traer();
	}

	public Festival traerFestivalYUnidadesVenta(long idFestival) {
		if(dao.traer(idFestival)== null) {
			throw new UnsupportedOperationException("El Festival no existe en la base");
		}
		return dao.traerFestivalYUnidadesVenta(idFestival);
	}
	public List<Plato> traerPlatosDeFestival(long idFestival){
		return dao.traerPlatosDeFestival(idFestival);
	}
}
