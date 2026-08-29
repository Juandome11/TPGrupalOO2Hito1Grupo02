package test;
import java.time.LocalDate;
import negocio.StaffABM;
import datos.Cajero;
public class TestG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaffABM abms = new StaffABM();
		
		System.out.print(abms.traer(10));
	}

}
