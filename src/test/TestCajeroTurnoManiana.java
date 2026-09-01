package test;

import java.util.List;

import datos.Cajero;
import negocio.StaffABM;

public class TestCajeroTurnoManiana {

	public static void main(String[] args) {
		StaffABM abm = new StaffABM();

		List<Cajero> lista = abm.traerCajerosTurnoManiana("mañana");

		System.out.println("Cantidad de cajeros de turno mañana: " + lista.size());
		for (Cajero c : lista) {
			System.out.println(c);
		}
	}
}