package test;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Set;

import datos.Festival;
import negocio.FestivalABM;
import datos.Cajero;
import datos.Cocinero;
import datos.Desarmable;
import negocio.StaffABM;
import datos.FoodTrack;
import datos.Staff;
import datos.UnidadVenta;
import negocio.UnidadVentaABM;
import negocio.PlatoABM;
import datos.Plato;
import datos.Pedido;
import negocio.PedidoABM;
public class Cargas {

	public static void main(String[] args) {
		
		FestivalABM abmf = new FestivalABM();
		StaffABM abms = new StaffABM();
		UnidadVentaABM abmu = new UnidadVentaABM();
		PlatoABM abmp = new PlatoABM();
		PedidoABM abmpe= new PedidoABM();
		
		
		Festival f1 = new Festival("Inicio de otoño","Otoño",LocalDate.of(2026, 03, 10),LocalDate.of(2026, 03, 16));
		Festival f2 = new Festival("Revolucion Fest","Otoño",LocalDate.of(2026, 05, 23),LocalDate.of(2026, 05, 28));
		Festival f3 = new Festival("Solsticio de invierno","Invierno",LocalDate.of(2026, 07, 10),LocalDate.of(2026, 07, 16));
		Festival f4 = new Festival("Vacaciones de invierno","Invierno",LocalDate.of(2026, 07, 20),LocalDate.of(2026, 07, 30));
		Festival f5 = new Festival("Dia de la Primavera","Primavera",LocalDate.of(2026, 9 ,21),LocalDate.of(2026, 9, 30));
		Festival f6 = new Festival("Musica folklorica","Primavera",LocalDate.of(2026, 10, 10),LocalDate.of(2026, 10, 15));
		Festival f7 = new Festival("Sabores autoctonos","Verano",LocalDate.of(2026, 11, 10),LocalDate.of(2026, 11, 17));
		Festival f8 = new Festival("Vacaciones","Verano",LocalDate.of(2026, 12, 10),LocalDate.of(2026, 12, 28));
		Festival f9 = new Festival("Año nuevo","Verano",LocalDate.of(2027, 01, 05),LocalDate.of(2026, 01, 15));
		Festival f10 = new Festival("Marzo fest","Verano",LocalDate.of(2026, 03, 8),LocalDate.of(2026, 03, 18));
		
		abmf.agregar(f1);
		abmf.agregar(f2);
		abmf.agregar(f3);
		abmf.agregar(f4);
		abmf.agregar(f5);
		abmf.agregar(f6);
		abmf.agregar(f7);
		abmf.agregar(f8);
		abmf.agregar(f9);
		abmf.agregar(f10);
		
		
		Cajero c1 = new Cajero("Hernan", "fernandez", "4667892" ,LocalDate.of(1990, 5, 15), LocalDate.of(2020, 8, 30), 900000, "tarde", 1);
		Cajero c2 = new Cajero("lucia", "fernandez", "2345678", LocalDate.of(1988, 11, 22), LocalDate.of(2019, 3, 10), 850000, "mañana", 2);
		Cajero c3 = new Cajero("martin", "gomez", "3456789", LocalDate.of(1995, 2, 8), LocalDate.of(2021, 6, 15), 920000, "noche", 3);
		Cajero c4 = new Cajero("sofia", "rodriguez", "4567890", LocalDate.of(1992, 7, 30), LocalDate.of(2022, 1, 20), 880000, "tarde", 4);
		Cajero c5 = new Cajero("juan", "martinez", "5678901", LocalDate.of(1985, 9, 12), LocalDate.of(2018, 11, 5), 980000, "mañana", 5);
		Cajero c6 = new Cajero("valentina", "lopez", "6789012", LocalDate.of(1998, 4, 25), LocalDate.of(2023, 7, 1), 820000, "tarde", 6);
		Cajero c7 = new Cajero("facundo", "sanchez", "7890123", LocalDate.of(1991, 12, 3), LocalDate.of(2020, 2, 17), 950000, "noche", 7);
		Cajero c8 = new Cajero("camila", "diaz", "8901234", LocalDate.of(1997, 6, 18), LocalDate.of(2024, 4, 8), 800000, "mañana", 8);
		Cajero c9 = new Cajero("agustin", "pereyra", "9012345", LocalDate.of(1989, 10, 27), LocalDate.of(2021, 9, 13), 930000, "noche", 9);
		
		
		abms.agregar(c1);
		
		abms.agregar(c2);
		abms.agregar(c3);
		abms.agregar(c4);
		abms.agregar(c5);
		abms.agregar(c6);
		abms.agregar(c7);
		abms.agregar(c8);
		abms.agregar(c9);
		
		
		Festival fe1 = abmf.traer(1);
		//System.out.print(fe1.toString());
		Staff co2 = abms.traer(1);
		System.out.print(c1.toString());
		FoodTrack ft1 = new FoodTrack("El gordo mario", "d1", 200, co2, "Fkaeh123", fe1,"aeh123");
		Desarmable d1 = new Desarmable("Lo de carlitos","d2",300,co2,"DES3120",fe1,3,120);
		abmu.agregar(d1);
		abmu.agregar(ft1);
		
		
		Cocinero co1 = new Cocinero("agustin", "pereyra", "9112345", LocalDate.of(1989, 10, 27), LocalDate.of(2021, 9, 13), 930000, "comida italiana", "italian academy", 300000);
		abms.agregar(co1);
		
		UnidadVenta uni = abmu.traer(1);
		//System.out.print(u.toString());
		Plato p1 = new Plato("Pizza mozzarella", 20000, 5000,uni);
		abmp.agregar(p1);
		abmf.traer(1);
		Pedido nPedido = new Pedido(abmu.traer(1), "fk0824", abmf.traer(1), LocalTime.now());
		nPedido.agregar(abmp.traer(1));
		nPedido.agregar(abmp.traer(1));
		nPedido.agregar(abmp.traer(1));
		nPedido.agregar(abmp.traer(1));
		nPedido.agregar(abmp.traer(1));
		abmpe.agregar(nPedido);
	}
	
}
