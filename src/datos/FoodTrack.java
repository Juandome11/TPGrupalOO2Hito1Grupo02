package datos;

public class FoodTrack extends UnidadVenta {

	private String patente;

	public FoodTrack() {}

	public FoodTrack(String nombre, String lugar, Staff responsableCargo, long superficie, String codigo,
			String patente) {
		super(nombre, lugar, responsableCargo, superficie, codigo);
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
