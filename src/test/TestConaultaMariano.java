package test;

import negocio.DetallePedidoABM;
import negocio.FestivalABM;
import negocio.PedidoABM;
import negocio.PlatoABM;
import negocio.StaffABM;
import negocio.UnidadVentaABM;

public class TestConaultaMariano {

	public static void main(String[] args) {
		FestivalABM abmf = new FestivalABM();
		StaffABM abms = new StaffABM();
		UnidadVentaABM abmu = new UnidadVentaABM();
		PlatoABM abmp = new PlatoABM();
		PedidoABM abmpe= new PedidoABM();
		DetallePedidoABM abmdp = new DetallePedidoABM();
		System.out.print(abmf.traerPlatosDeFestival(5));

	}

}
