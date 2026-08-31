package test;
import java.time.LocalDate;
import negocio.StaffABM;
import datos.Cajero;
import datos.FoodTrack;
import datos.Staff;
public class TestG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cajero c1 = new Cajero("Hernan", "fernandez", "4667892" ,LocalDate.of(1990, 5, 15), LocalDate.of(2020, 8, 30), 900000, "tarde", 1);
		FoodTrack f2 = new FoodTrack();
		//FoodTrack f1 = new FoodTrack("La kombi", "D1", 100, "ake185");
	//System.out.println(f1.toString());

}
}