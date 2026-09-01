package test;

import java.util.List;

import datos.Cajero;
import negocio.StaffABM;

public class TestCajeroPorTurno {

	public static void main(String[] args) {
		StaffABM abm = new StaffABM();

		System.out.println("CASO DE USO: TRAER CAJEROS POR TURNO MAÑANA");
		List<Cajero> lista = abm.traerCajerosPorTurno("mañana");

		System.out.println("Cantidad de cajeros de turno mañana: " + lista.size());
		for (Cajero c : lista) {
			System.out.println(c);
		}
	}
}