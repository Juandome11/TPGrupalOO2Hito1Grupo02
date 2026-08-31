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
import negocio.DetallePedidoABM;
import datos.DetallePedido;
public class Cargas {

	public static void main(String[] args) {
		
		FestivalABM abmf = new FestivalABM();
		StaffABM abms = new StaffABM();
		UnidadVentaABM abmu = new UnidadVentaABM();
		PlatoABM abmp = new PlatoABM();
		PedidoABM abmpe= new PedidoABM();
		DetallePedidoABM abmdp = new DetallePedidoABM();
		
		
		// Creo y agrego los festivales
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
		
		//Creo y agrego los cajeros
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
		// Creo y agrego los cocineros
		Cocinero co1 = new Cocinero("Carlos", "Gómez", "30124567", LocalDate.of(1985, 3, 15), LocalDate.of(2018, 5, 10), 850000, "Pastas", "Chef Profesional", 80000);
		Cocinero co2 = new Cocinero("María", "Fernández", "32256891", LocalDate.of(1988, 7, 22), LocalDate.of(2020, 2, 3), 780000, "Repostería", "Pastelería Profesional", 60000);
		Cocinero co3 = new Cocinero("Julián", "Rodríguez", "28987453", LocalDate.of(1982, 11, 8), LocalDate.of(2015, 9, 17), 920000, "Carnes", "Chef Profesional", 100000);
		Cocinero co4 = new Cocinero("Sofía", "Martínez", "35123698", LocalDate.of(1991, 1, 30), LocalDate.of(2021, 6, 14), 750000, "Cocina Italiana", "Gastronomía Internacional", 55000);
		Cocinero co5 = new Cocinero("Diego", "López", "27456832", LocalDate.of(1979, 9, 12), LocalDate.of(2012, 3, 5), 980000, "Parrilla", "Especialista en Parrilla", 120000);
		Cocinero co6 = new Cocinero("Valentina", "Sánchez", "36984521", LocalDate.of(1994, 5, 19), LocalDate.of(2022, 8, 1), 720000, "Cocina Vegana", "Cocina Saludable", 50000);
		Cocinero co7 = new Cocinero("Martín", "Díaz", "31254789", LocalDate.of(1986, 12, 3), LocalDate.of(2017, 4, 20), 870000, "Pescados y Mariscos", "Chef Profesional", 75000);
		Cocinero co8 = new Cocinero("Lucía", "Romero", "33478912", LocalDate.of(1990, 6, 27), LocalDate.of(2019, 10, 7), 810000, "Cocina Mexicana", "Gastronomía Internacional", 65000);
		Cocinero co9 = new Cocinero("Federico", "Torres", "29654178", LocalDate.of(1984, 2, 14), LocalDate.of(2016, 11, 11), 900000, "Sushi", "Especialista en Cocina Japonesa", 95000);
		Cocinero co10 = new Cocinero("Camila", "Vega", "37891245", LocalDate.of(1996, 10, 5), LocalDate.of(2023, 1, 16), 700000, "Comida Rápida", null, 0);
		abms.agregar(co1);
		abms.agregar(co2);
		abms.agregar(co3);
		abms.agregar(co4);
		abms.agregar(co5);
		abms.agregar(co6);
		abms.agregar(co7);
		abms.agregar(co8);
		abms.agregar(co9);
		abms.agregar(co10);
		
		Festival fe1 = abmf.traer(1);
		//System.out.print(fe1.toString());
		
		FoodTrack ft1 = new FoodTrack("El gordo mario", "d1", 200, abms.traer(1), "Fkaeh123", fe1,"aeh123");
		Desarmable d1 = new Desarmable("Lo de carlitos","d2",300,abms.traer(1),"DES3120",fe1,3,120);
		abmu.agregar(d1);
		abmu.agregar(ft1);
		
		/*
		Cocinero co1 = new Cocinero("agustin", "pereyra", "9112345", LocalDate.of(1989, 10, 27), LocalDate.of(2021, 9, 13), 930000, "comida italiana", "italian academy", 300000);
		abms.agregar(co1);
		*/
		
		UnidadVenta uni = abmu.traer(1);
		//System.out.print(u.toString());
		Plato p1 = new Plato("Pizza mozzarella", 20000, 5000,uni);
		abmp.agregar(p1);
		abmf.traer(1);
				
		Pedido nPedido = new Pedido(abmu.traer(1), abmf.traer(1), LocalTime.now());
			
		abmpe.agregar(nPedido);
				
		DetallePedido dp = new DetallePedido(abmpe.traer(1),abmp.traer(1),3);
		abmdp.agregar(dp);
		
		
		
	}
	
}
