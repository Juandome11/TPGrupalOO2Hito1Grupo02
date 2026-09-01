package test;

import java.time.LocalDate;

import datos.Cajero;
import negocio.StaffABM;

public class TestCajero {

	public static void main(String[] args) {
		StaffABM staffABM = new StaffABM();

		Cajero cajero = new Cajero("Fernández", "Marcos", "11111111", LocalDate.of(2001, 2, 20),
				LocalDate.of(2025, 5, 10), 500000, "mañana", 3);
		Cajero cajero1 = new Cajero("Perez", "Juan", "22222222", LocalDate.of(1997, 5, 14),
				LocalDate.of(2025, 7, 9), 500000, "tarde", 5);

		int idCajero = staffABM.agregar(cajero);
		System.out.println("Cajero creado, id=" + idCajero);
		
		int idCajero1 = staffABM.agregar(cajero1);
		System.out.println("Cajero creado, id=" + idCajero1);
	}
}