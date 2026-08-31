package datos;

public class FoodTrack extends UnidadVenta {

	private String patente;

	public FoodTrack() {}

	

	public FoodTrack(String nombre, String lugar, long superficie, Staff encargado, String codigo, Festival festival,String patente) {
		
		super(nombre, lugar, superficie, encargado, codigo, festival);
		this.patente = patente;
	}



	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}
	
	
	@Override
	public String toString() {
		return "FoodTrack [" + super.toString() + ", patente=" + patente + "]";
	}
}
